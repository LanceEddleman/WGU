import java.util.ArrayList;
public class ArrayListExampleRoster {

	static String[] students = {"1,Doohickey,10,12",
			"2,Thingamajig,20,17",
			"3,Whirlygig,5,9"
	};

	static ArrayList<WidgetStudent> mywidgets = new ArrayList<WidgetStudent>();

	public static void main(String[] args) {
		new ArrayListExampleRoster();
	}
	public ArrayListExampleRoster() {

		for (int i = 0; i < students.length; i++) {
			String s = students[i];
			String[] parts = s.split(",");

			String id = parts[0];
			String name = parts[1];
			int num = Integer.parseInt(parts[2]);
			int age = Integer.parseInt(parts[3]);

			WidgetStudent w = new WidgetStudent(id, name, num, age);
			mywidgets.add(w);
		}
		for (WidgetStudent w : mywidgets) {
			System.out.println(w);
		}
		remove("2");
		System.out.println("After removing 2");
		for (WidgetStudent w : mywidgets) {
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
