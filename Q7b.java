/* Q7b. what is static block?
-> static block is a static intlizer.
-> static block doesnot have name.
-> static block doesnot have return type.
-> static block doesnot accept argument.
-> static block executed during the class loading process.

*/

class Q7b
{
	static int a;
static 
{
	System.out.println(a);
	System.out.println("static block one");
}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
