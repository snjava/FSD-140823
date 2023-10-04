package admin;

import java.lang.*;
import java.util.Scanner;
/*import student.StudentInfo;
import student.StudentReport;
import student.StudentAttendence;*/
import student.*;

public class AdminInfo {
	
	public static void main(String[] args) {
		student.StudentInfo stud = new student.StudentInfo();
		StudentInfo stud1 = new StudentInfo();
		StudentReport report = new StudentReport();
		StudentAttendence attendence = new StudentAttendence();
		Scanner scan = new Scanner(System.in);
		String str = new String();
	}
}

class AdminAccessControl {
	StudentInfo stud = new StudentInfo();
}
