/*
 Q2. what is static varible?
   -> if any global varible prefixed with static keyword is called as the static varible.
      rules
	  1.static varible gets the memory allocation in the class static area.
	  2.static varible will be assigned with the default values.
	  3.static varible can be used in the same class using its are by using class name.
	  4.static varible can be used in the diffrent class using class name.
	  */

class  Q2
{
	static int a=10;
	public static void main(String[] args) 
	{
		
		System.out.println(a); // calling directly
		System.out.println(Q2.a); // calling with help of calss name
	}
}
