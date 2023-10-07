package Project;

interface A{
	abstract void display();
}
interface B{
	abstract void display();
}
class C implements B,A
{
	public void display() {
		System.out.println("Successfully implemented");
	}
}
public class GrandFather{
	public static void main(String args[])
	{
		C obj=new C();
		obj.display();
	}
}
//here i archieved Multiply inheritance using interface