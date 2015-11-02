public class WidgetStudent {
	
	String id;
	String name;
	int numThingiesInWidget;
	int age;
	
	// constructor
	public WidgetStudent(String id, String name, int numThingiesInWidget, int age) {
		this.id = id;
		this.name = name;
		this.numThingiesInWidget = numThingiesInWidget;
		this.age = age;
	}

	// getter and setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

    public String getName() {
    	return name;
    }
	public void setName(String name) {
		this.name = name;
	}

	public int getNumThingiesInWidget() {
		return numThingiesInWidget;
	}
	public void setNumThingiesInWidget(int numThingiesInWidget) {
		this.numThingiesInWidget = numThingiesInWidget;
	}
	
    public int getAge() {
    	return age;
    }
	public void setAge(int age) {
		this.age = age;
	}

	// print array
	public String toString() {
		return id + " " + name + " " + numThingiesInWidget + " " + age;
	}
	
	

}
