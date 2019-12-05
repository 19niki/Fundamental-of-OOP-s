/*Q20. what is constructor?
-> constructor is a non static member which is used in object creation.
-> constructor name must be same as class name.
-> construtor dosnot return any value.
-> every class must have atleast one constructor, if programmer fails to create the constructor then complier wil
    create a default no argument constructor.
	syntax:
	 [modifer] classname()
	 {
		 //statments;
	 }
*/
class Q20
{
	Q20()
	{
		System.out.println("constructor");
	}

	public static void main(String[] args) 
	{
		Q20 obj1=new Q20();

	}
}
