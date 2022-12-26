package App;

import javax.persistence.*;

@Entity (name="users")
@Table(name="users")
public class Users {
	
	@Id
	@Column(name="user_id")
	int userId;
	
	@Column(name="name")
	String name;

	@Column(name="email")
	String email;
	
	public Users() {
		
	}
	
	public Users(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", name=" + name + ", email=" + email + "]";
	}
}
