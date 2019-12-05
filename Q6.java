/* Q6. what is non-static method?
 -> Any method which is defined in the global area without static keyword is known as non-static method.
 -> non-static method belongs to the non-static context.
 -> the refrence of the non-static block is created in the object area
 -> we can't use non-static method in the static context directly.

*/

class Q6 
{
	void one()
	{
		System.out.println("non-static method one is created");
	}
	void two()
	{
		one();
		System.out.println("method two calling method one");
	}
	public static void main(String[] args) 
	{
		Q6 ob1=new Q6();
		ob1.two();                            
		ob1.one();
	}
}
