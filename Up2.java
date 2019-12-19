class A 
{
	void first(A obj)
	{
		System.out.println("hello");
	}
}
class B extends A
{
	void second(A obj)
	{
		System.out.println("from child class");
	}
}

class Up2
{
	public static void main(String[] args)
	{
		second(new B()); 
}
}