package Oops;

class Schooldetails {
	static String department = "English";
	final String schoolname = "Luminar";
}

public class Static_Final {
	public static void main(String[] args) {
		// static:
		System.out.println(Schooldetails.department);
		System.out.println(Schooldetails.department = "mathematics");
		System.out.println(Schooldetails.department);
		// final:
		Schooldetails s = new Schooldetails();
		System.out.println(s.schoolname);
		// System.out.println(s.schoolname="oxford"); this is not possible

	}

}
