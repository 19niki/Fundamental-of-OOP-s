/* Q14. What are the different ways to invoke static method inside non-static context of same class ? 

 -> we can use static members directly in the non-static context.
 -> we can use static members in the non-static context with the help of class name.
 */
class Q14  
{
	static void one()
	{
		System.out.println("static method");
	}
	 void two()
	{
		 System.out.println("non-static method");
		Q14.one();
	}

	public static void main(String[] args) 
	{
	      Q14 obj=new Q14();
		  obj.two();
	}
}
