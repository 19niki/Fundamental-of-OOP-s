/*
 Q3. What is satic method?
     if any method prefixed with static keyword is called as the static method.
	 rules:
       1.static methods gets the memory allocation in the class static area.
	   2.static methods are called as class methods.
	   3.static method block are called static context.
	   4.static method can used in same class using method name.
	   5.static method can be used in diffrent class using class name.
*/
class Q3 
{
	static int add(int a, int b)
	{
		return a+b;
	}
	public static void main(String[] args) 
	{
		System.out.println("addition of two numbers");
		System.out.println(add(10,20));
		int res=add(50,60);
		System.out.println(res);
	}
}
