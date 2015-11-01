public class Widget {
	
	String id;
	String name;
	int numThingiesInWidget;
	int age;
	public Widget(String id, String name, int numThingiesInWidget, int age) {
		this.id = id;
		this.name = name;
		this.numThingiesInWidget = numThingiesInWidget;
		this.age = age;
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
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    
    public int getAge() {
    	return age;
    }
	public void setAge(int age) {
		this.age = age;
	}

	
	public String toString() {
		return id + " " + name + " " + numThingiesInWidget + " " + age;
	}
	
	

}
