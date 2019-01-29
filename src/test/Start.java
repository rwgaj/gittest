package test;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World :)");
		Person p = new Person("Joshua", "Gauss", 24);
		p.setBD(25, 1, 1995);
		System.out.printf("%s %s, Alter: %d, Geburtstag: %d.%d.%d", 
				p.getFname(), p.getLname(), p.getAge(), p.getDay(), p.getMonth(), p.getYear());
	}

}
