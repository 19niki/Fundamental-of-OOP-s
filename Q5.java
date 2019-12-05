/* Q5. What is non-static varible?
  -> Any global varible which is not pre-fixed with the static keyword is known as non-static varible.
  -> non-static varible gets the memory allocation in the every object created.
  -> non-static member cannot be used directly or with help of the class name.
 */


class Q5
{
	int a=10;

	public static void main(String[] args) 
	{
	 Q5 obj=new Q5();
	 System.out.println(obj.a);
	}
}
