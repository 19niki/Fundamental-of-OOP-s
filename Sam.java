/* What is this call statment?
--> it used to achive the constructor chainng i.e used to call the constuctor of the same class.
*/
class Sam 
{
	 Sam(int i)
	{
		System.out.println(i);
	}
	 Sam()
	{
		this(10);
		System.out.println("using this call statment");
	}
	public static void main(String[] args)
	{ 
		Sam obj=new Sam();
		
	}
}
