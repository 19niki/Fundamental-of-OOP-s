/*Q4. how to make data membr only readable?
-> we can make data mmber only redable by making data member private and only using getter method.
*/
class Car1
{
	private int price;
	Car1()
	{
	}
	Car1(int price)
	{
		this.price=price;
	}
	int getcarprice()
	{
		return price;
	}
	void setcarprice(int price)
	{
		this.price=price;
	}
}
