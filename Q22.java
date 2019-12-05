/* Q22. what is this?
 -> this is a keyword which gives the address of the object which is currently under execution.
*/
class Q22
{
	Q22()
	{
		System.out.println(this);
	}
	void main()
	{
		System.out.println(this);
	}
	public static void main(String[] args) 
	{
		Q22 obj=new Q22();
		obj.main();
	}
}
