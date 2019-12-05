/* Q15.What are the different ways to invoke non-static method inside static context of same class ?
-> we can use the non-static method in the static contxt by using object.
*/

class Q15  
{
	void one()
	{
		System.out.println("this is a non-static method");
	}

	public static void main(String[] args) 
	{
	  Q15 obj1=new Q15();
	  obj1.one();
	}
}
