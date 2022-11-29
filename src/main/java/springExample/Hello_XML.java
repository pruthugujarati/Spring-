package springExample;

public class Hello_XML {

	//loading bean & XML definitions from given XML file
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo() {
		System.out.println("Hello Spring using XML "+ name);
	}
}
