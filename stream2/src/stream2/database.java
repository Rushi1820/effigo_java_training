package stream2;

import java.util.List;

public class database {

	private int id;
	private String name;
	private String email;
	private List<String> phonenum;

	public database(int id, String name, String email, List<String> phonenum) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phonenum = phonenum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<String> getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(List<String> phonenum) {
		this.phonenum = phonenum;
	}

}
