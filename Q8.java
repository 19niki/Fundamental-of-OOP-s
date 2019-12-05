/* Q8. what is non-static intlizer?
-> non static intlizer gets executed each and evary time object is created.
    there are two types of non-static intlizers.
	1.non-static declare and intlize statment.
	2.non-static block.

	1.non static declare and intlize
	    syntax: datatype indentifer=value;

*/

class Q8 
{
	int a=10;
	public static void main(String[] args) 
	{
		Q8 obj1=new Q8();
		Q8 obj2=new Q8();
		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}
}
