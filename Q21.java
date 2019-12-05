/* Q21. what is constructor overloading?
->if a class has more than one consrtuctor then it is called as constructor overloading.
->here constructor name must b similar to class name.
->the fromal arguments must difer in lenght or type.
*/
class Q21
{
	static int count;
	int id;
	String name;
	int price;
	{
		count++;
		id=count;
	}
	Q21(String name, int price)
	{
		this.name=name;
		this.price=price;
	}
	void pendetails()
	{
		System.out.println("pen id:"+id);
		System.out.println("pen name:"+name);
		System.out.println("pen price:"+price);
	}
	public static void main(String[] args) 
	{
	     Q21 obj1=new Q21("cello",10);
		 obj1.pendetails();

	}
}
