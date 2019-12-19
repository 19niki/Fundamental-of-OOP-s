/*multiple inheritance
multiple inheritance has a ambugity problem which causes the diamond problem so it cannot be achived in
   java.
 */
class  A
{
	void msg()
	{
		System.out.println("from a");
	}
}
class B
{
	void msg()
	{
		System.out.println("from b");
	}
}
class C extends A,B
{
	public static void main(String[] args)
	{
       C obj=new obj();
	   obj.msg();
	   obj.msg();
	}
}
