package OOPS;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		Student s = new Student();
		System.out.println(s.Name);
		System.out.println(s.Age);
		s.Name = "Aditya";
		s.Age = 19;
		s.Intro();
		
		Student s1 = new Student();
		System.out.println(s1.Name);
		System.out.println(s1.Age);
		s1.Name = "Aniket";
		s1.Age = 18;
		s1.Intro();
		s1.sayhi("aditya");
	}
	static {
		System.out.println("I am a static block in main");
	}

}
