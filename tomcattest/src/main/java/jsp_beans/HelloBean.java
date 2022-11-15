package jsp_beans;

import java.io.Serializable; //SUPER IMPORTANTE IMPLEMENTS SERIALIZABLE
public class HelloBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	
	public HelloBean() {
		this.firstName = "Jhon";
		this.lastName = "Doe";
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

