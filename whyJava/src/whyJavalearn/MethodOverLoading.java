package whyJavalearn;


class ABS{
	
	public void Ab() {
		
		System.out.println("this is Abs");
	}
	
}

class Bs extends ABS{     // child method override parent method

	public void Ab() {
		super.Ab();
		System.out.println("this is Bs");
	}

}




public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ABS obj= new ABS();   
		obj.Ab();
		
		Bs obj2= new Bs();   
		obj2.Ab();

}}
