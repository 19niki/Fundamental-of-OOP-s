/*Q12. Static members of a class can be inherited on justify with the program?

--> Static members of a class can be inherited.
loading process of a class wrt to inheritance.
->in the loading process the parent class loaded first
->after that child class loaded
->sub class static area has a refrece to super class static area
  so we can use the members of super class directly from sub class.
  with the help of sub class name, we can use static members of sub class as well as super class.

  */
class A1 
{ 
	static int a=10;
	static void parent()
	{
		System.out.println("from parent");
	}
}
class B1 extends A1
{
	static void child()
	{
		System.out.println("from child");
	}

	public static void main(String[] args)
	{
        System.out.println(a);
		parent();
		child();
}
}
