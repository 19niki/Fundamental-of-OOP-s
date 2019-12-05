/*Q4. What is non-static?
  -> Any member of calss block whic is not pre-fixed with static keyword is called non-static.
  -> non static member of class gets memory in the instac of class or object area.
  -> so we can non-static members in the static context only using address of the object.
 */

class Q4 
{
	int a;
	void first()
	{
		System.out.println("understanding non-static");
	}
	public static void main(String[] args) 
	{
	   Q4 obj1=new Q4();
	   System.out.println(obj1.a);
	   obj1.first();
	}
}
