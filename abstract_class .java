package Project;

abstract class A{
	
	abstract void display();
	void disp() {
		System.out.println("this is the display method in the abstract class !");
	}
}
class B extends A{
	void display() {
		System.out.println("Lets print the abstract class ");
	}
}
public class Father_Family extends B{
	
	public static void main(String args[])
	{
		B obj=new B();
		obj.display();
		obj.disp();
	}
	
}
//archieve  abstract class 