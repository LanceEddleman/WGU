import java.util.ArrayList;
public class ArrayListExample {

	static String[] students = {"1,Doohickey,10,12",
			"2,Thingamajig,20,17",
			"3,Whirlygig,5,9"
	};

	static ArrayList<Widget> mywidgets = new ArrayList<Widget>();

	public static void main(String[] args) {
		new ArrayListExample();
	}
	
	public ArrayListExample() {

		for (int i = 0; i < students.length; i++) {
			String s = students[i];
			String[] parts = s.split(",");

			String id = parts[0];
			String name = parts[1];
			int num = Integer.parseInt(parts[2]);
			int age = Integer.parseInt(parts[3]);

			Widget w = new Widget(id, name, num, age);
			mywidgets.add(w);
		}
		for (Widget w : mywidgets) {
			System.out.println(w);
		}
		
		remove("2");
		
		System.out.println("After removing 2");
		
		for (Widget w : mywidgets) {
			System.out.println(w);
		}
	}

	public static void remove(String id) {
		for (int i = 0; i < students.length; i++) {
			if (mywidgets.get(i).getId().equals(id)) {
				mywidgets.remove(i);
				return;
			}
		}
		System.out.println("Bad Things happened");
	}


}
