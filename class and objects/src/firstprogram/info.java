package firstprogram;

public class info {

	public static void main(String[] args) {
		student s1=new student();
		s1.id= 25;
		s1.name="Rushi";
		s1.course="Btech";
		s1.gender="male";
		s1.age=20;
		
		student s2=new student();
		s2.id= 29;
		s2.name="Ri";
		s2.course="Btech";
		s2.gender="male";
		s2.age=19;
		
		s1.displayinfo();
		s2.displayinfo();
	}

}
