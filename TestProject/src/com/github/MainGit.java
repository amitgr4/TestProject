package com.github;

import java.util.ArrayList;
import java.util.List;

public class MainGit {
	public static void main(String[] args) {

		Student student = new Student(101, "34", "amit");
		Student student1 = new Student(102, "67", "raj");
		Student student2 = new Student(103, "68", "rohit");
		
		List<Student> list = new ArrayList<>();

		list.add(student);
		list.add(student1);
		list.add(student2);

		System.out.println(student);
		System.out.println(student1);
	}
}
