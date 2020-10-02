package com.manikarthi25.terminaloperation;

import java.util.stream.Collectors;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class StreamJoiningExample {

	public static String joining_1() {
		return StudentDataBase.getStudentDetails().stream() // Stream<Student>
				.map(Student::getName) // Stream<String>
				.collect(Collectors.joining()); // without argument
	}

	public static String joining_2() {
		return StudentDataBase.getStudentDetails().stream() // Stream<Student>
				.map(Student::getName) // Stream<String>
				.collect(Collectors.joining("-")); // with delimiter only
	}

	public static String joining_3() {
		return StudentDataBase.getStudentDetails().stream() // Stream<Student>
				.map(Student::getName) // Stream<String>
				.collect(Collectors.joining("-", "(", ")")); // with delimiter, prefix, suffix
	}

	public static void main(String[] args) {

		System.out.println("Joining_1 : " + joining_1());
		System.out.println("Joining_2 : " + joining_2());
		System.out.println("Joining_3 : " + joining_3());

	}

}
