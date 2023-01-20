package assignment;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Studentdetails {

	public static List<Student> getAll1() {
		return Stream.of(new Student(11, "rushi", 18), new Student(12, "vardhan", 19), new Student(13, "jay", 20),
				new Student(18, "ani", 18), new Student(15, "kino", 19)).collect(Collectors.toList());

	}

}
