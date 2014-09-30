public class Faculty extends Employee{

	private String officeHours;
	private String rank;
	
	public Faculty(String name, String address, String phone_number, String email, String office, double salary, MyDate date_hired, String officeHours, String rank){
		super(name,address,phone_number,email,office,salary,date_hired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	
}