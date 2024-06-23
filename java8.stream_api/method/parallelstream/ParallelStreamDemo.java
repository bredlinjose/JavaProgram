package method.parallelstream;

import java.util.Arrays;
import java.util.List;

class Student {
	String name;
	int score;
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}
	
}


public class ParallelStreamDemo {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("David", 82),
				new Student("Bob", 90),
				new Student("John", 65),
				new Student("Canedy", 55),
				new Student("Eric", 85),
				new Student("Smith", 88),
				new Student("Scott", 50));
		
		// stream() --> sequential
		studentList.stream().filter(std -> std.getScore()>=80)
		.limit(3)
		.forEach(st -> System.out.println(st.getName() +" "+st.getScore()));
		
		// parallelStream()
		studentList.parallelStream().filter(std -> std.getScore()>=80)
		.limit(3)
		.forEach(st -> System.out.println(st.getName() +" "+st.getScore()));
		
		// convert stream() to parallelStream()
		studentList.stream().parallel().filter(std -> std.getScore()>=80)
		.limit(3)
		.forEach(st -> System.out.println(st.getName() +" "+st.getScore()));

	}

}
