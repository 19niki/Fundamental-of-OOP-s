/*
Q1. What is static?
    
	static is a keyword.
	static is a modifer
	any class member which is prefixed with static modifer is called as static member.
	static member is also called as class member.
	memory of the static member is allocated in class static area.
	types of static members
	1.static methods
	2.static varibles

*/

class Q1  
{
	static void st()
	{
		System.out.println("hi");
	}
	public static void main(String[] args) 
	{
		System.out.println("main start");
		st();
		System.out.println("main end");
	}
}
