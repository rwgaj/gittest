package test;

public class Person {

	//FIELDS
	private String fname, lname;
	private int age, day, month, year;
	
	//CONSTRUCT
	public Person() {}
	public Person(String fname, String lname, int age) {
		setFname(fname);
		setLname(lname);
		setAge(age);
	}
	
	//GETTER AND SETTER
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setBD(int d, int m, int y) {
		setDay(d);
		setMonth(m);
		setYear(y);
	}
	
}
