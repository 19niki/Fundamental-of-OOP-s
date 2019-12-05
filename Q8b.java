/*Q8b. what is non-static block?
-> any block which is not pre-fixed with static keyword is called as non-static block.
-> non-static block is a non-static intlizer.
-> non-static block gets there refrence in the object.
-> non-static block is used to count number of objcts created.
*/


class Q8b 
{
	static int count;
	{
		count++;
		System.out.println("non static block one");
	}
	public static void main(String[] args) 
	{
		System.out.println(" form main");
		Q8b obj1=new Q8b();
		Q8b obj2=new Q8b();
		System.out.println(count);

	}
	{
	System.out.println("non static block two");
	}

}
