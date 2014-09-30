import java.util.Scanner;

public class Student extends Person {
	
	private String student_status;
	
	public Student(String name, String address, String phone_number, String email){
		super(name,address,phone_number,email);
		this.student_status = get_student_status();
		
	}
	
	
	public static String get_student_status(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter what year of college you are in (1,2,3,4): ");
		int year = input.nextInt();
		
		String status= "null";
		
		switch(year){
		case 1: status = "Freshman";
				break;
		case 2: status = "Sophomore";
				break;
		case 3: status = "Junior";
				break;
		case 4: status = "Senior";
				break;
				
		}
		return status;
		
	}
		
	
	

}
