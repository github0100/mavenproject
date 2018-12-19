package whyJavalearn;



abstract class Humen{
	
public  void eat() {
		
		System.out.println("Humen eat!");
	}
	public void work() {
		
	}
	
}


class Man extends Humen{

	public void eat() {
	
		System.out.println("Man Eat");
	}
}







public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Humen obj = new Man();
	obj.eat();
	
	Man obj1= new Man();
	obj1.eat();
		
		
	}

}
