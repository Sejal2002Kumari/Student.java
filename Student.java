/* Creating a Student class */
public class Student{
	String studentName;
	int addmissionNumber;
	String branch;
	int rollNumber;
	char classSection;
	long mobileNumber;
	String address;
	char gender;
	boolean isHosteller;
	byte semester;
	String collegeName;
	byte year;
	String emailId;
	float semesterFee;
	
	public String displayStudentName() {
		String studentName = "Sejal Kumari.";
		return studentName;
	}
	
	public static void main(String ar[]) {
		Student student = new Student();
		String name = student.displayStudentName();
		System.out.println("Student name is " + name);
	}
}
	