package Project;
class A
{
	void display() {
		System.out.println("A's Diaplay method !");
	}
}
class B extends A
{
	void displayb() {
		System.out.println("B's Diaplay method !");
	}
}
public class Runner extends A {
	void displayc (){
		System.out.println("C's Diaplay method !");
	}
	public static void main(String args[]) {
	
		Runner obj=new Runner();
//		B obj =new B();
		obj.display();
		obj.displayc();
		
		B obj1=new B() ;
		obj1.display();
		obj1.displayb();
		
	}
}
// here i achieved Inheritance inJava 07/10/2023