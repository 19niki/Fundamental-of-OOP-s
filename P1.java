/*Q9. How to achive inheritance is java?
 --> in java we can achive inheritance using follwing keywords.
      1. extends
	  2. implements
 --> extends
     it is used to achive inheritance in java.
	 it must be used only in subclass.
*/
class P1
{
	int a=10;
	
}
class P2 extends P1
{
	int b=20;
	
}
class test
{
	public static void main(String[] args)
	{
	P2 obj=new P2();
	System.out.println(obj.a);
    System.out.println(obj.b);
}
}
