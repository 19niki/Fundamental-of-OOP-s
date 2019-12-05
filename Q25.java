/* Q25. what is constructor chaining?
  -> if a constructor calling another constructor then it is called as constructor chaining.
  -> it can be achived by using:
      1.this() call statment.
	  2.super() call statment.
this() can be used only inside the constructor.
this() must b first statment in the constructor body.
this() cannot be used recursevly.
if their are n constructor then we use n-1 this() call statment in the constructor.
*/
class Q25
{
	Q25()
	{
		System.out.println("con chaining");
	}
	Q25(int i)
	{
		this();
		System.out.println("calling Q25");
	}
	public static void main(String[] args) 
	{
		Q25 a=new Q25(20);
	}
}
