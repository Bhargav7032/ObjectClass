package com.equals;

public class StudentTest {
	public static void main(String[] args) {

		Student s1 = new Student(1, "aa");
		Student s2 = new Student(1, "aa");
		Student s3=s2;
		

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());//true
		// it returns false because object class works as == operator (checks the
		// reference names)
		// rather than content. So we have to make tell JVM by writing some logic to
		// generate same hashcode
		// and return true when content is same
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s2));//true 
		
		
		

	}
}
