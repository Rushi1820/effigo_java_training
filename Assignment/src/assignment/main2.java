package assignment;

import java.util.List;
import java.util.stream.Collectors;

public class main2 {
	public static void main(String[] args) {
		List<Student> details = Studentdetails.getAll1();
		List<String> name = details.stream().map(student -> student.getName()).map(String::toUpperCase).distinct()
				.collect(Collectors.toList());
		System.out.println("names of the students:" + name);

		List<Student> age = details.stream().filter(student -> student.getAge() > 18).collect(Collectors.toList());
		System.out.println("students above 18 are:" + age);

		Double agee = details.stream().collect(Collectors.averagingInt(student -> student.getAge()));
		System.out.println("average age:" + agee);
	}
}
