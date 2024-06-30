package Project;

public class Encapsulation {
private 	String name;
	public void set(String name){
		this.name=name;
	}
	public String get() {
		return name;
	}
	public static void main(String args[])
	{
		Encapsulation ec=new Encapsulation();
		ec.set("Sudhipth!");
		System.out.println(ec.get());
	}
}
//here i archieved Encapsulation
