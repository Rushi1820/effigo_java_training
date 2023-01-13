package secondprogram;

public class faculty {
	int id;
	String name;
	String course;
	String gender;
	int age;
	
	faculty(int id,String name,String course,String gender,int age){
		this.id=id;
		this.name=name;
		this.course=course;
		this.gender=gender;
		this.age=age;
	}
  void displayinfo() {
	  System.out.println(id+" "+name+" "+course+" "+gender+" "+age);
  }
}
