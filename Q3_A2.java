/*q3.how to use getter and setter?
 1.getter() method: it is used read the private data member from diffrent class, it must return a
                    value.
 2.setter() method: it is used modify the privte data member from diffrent class, it must accept some arguments.
*/

class A 
{
	private int a;
   A(int a)
	{
	  this.a=a;
	}
	int getvalue()
	{
		return a;
	}

void setvalue(int a)
{
	this.a=a;
}
}
