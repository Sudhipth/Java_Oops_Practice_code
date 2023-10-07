package Project;
class head{
	void disp() {
		System.out.println("Hello from head!");
	}
}
class Sub extends head{
	void disp() {
		System.out.println("Hello from Sub!");
	}
}
public class Polymorphism extends Sub {
	public static void main(String args[])
	{
		head py = new head();
		py.disp();
	}
}
// here archieved overridding simply and also implement upcasting

