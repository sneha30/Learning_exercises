public class Variables {
	/* instance variable */
	int c =10; /* declared inside the class but outside the method*/
	String name ;
	/* static variable - memory is allocated only once */
	static int b = 20;
	int x;
	
	/* constructor --> initializing it , name has to be same as the class name
	                    does not return anything 
						default constructor */
						
		Variables(){
			x = 30;
			b = 40;
		}
	/* parameterized constructor */
	Variables (String Str ,int p) {
		name = Str;
		x = p;
		
	}
	static int hello() {
		return 10;
	}
	
	/*public - can be anywhere in the package ,private , protected, default - Access modifiers  
      Static - variables and methods can accessed directly without creating a class (direct access)
	  void - return type 
	  main - like a method , writing it inside the class
	  String args[] - java accepts command line arguments



	*/
	public static void main (String args[]) {
		
		/* local variable declared inside the method and can be accessed directly */
		int a =20;
		
		System.out.println (a);
		System.out.println (b);
		Variables pr = new Variables ();
		Variables pr2 = new Variables ("Hello",55); /* instance variables can only be accessed by creating a object */
		
		System.out.println(pr.c);
		System.out.println(pr.b);
		System.out.println(pr.x);
		System.out.println("fghfhg"+ pr2.name.length());
		System.out.println(pr2.x);
		 int q = hello();	
		 System.out.println(q);
		 
		 System.out.println("index" +' ' + pr2.name.indexOf('e'));
		 System.out.println("string replace" + ' ' + pr2.name.replace('e','p'));
		 
		
	}
}