public class Staff extends Employee{

	private String title;
	
	public Staff(String name, String address, String phone_number, String email, String office, double salary, MyDate date_hired, String title){
		super(name,address,phone_number,email,office,salary,date_hired);
		this.title = title;
	}
}