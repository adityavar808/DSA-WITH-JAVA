package OOPS;

public class Student {
		String Name;
		int Age;
		
		public void Intro() {
			System.out.println("My Name is " + Name + " and My Age is " + Age);
		}
		
		public void sayhi(String name) {
			System.out.println(this.Name + " Say Hi to " + name);
		}
		
		static {
			System.out.println("I am a static block");
		}
}
