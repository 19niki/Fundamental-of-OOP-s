/* what is enacapsulation?
--> the process of binding state and behaviour of an obkect together is called as enacapsualtion.
state is nothing but attributes (ex car)
   -price
   -color
   -speed
 behaviour is nothing but method or action
 -running
 -stoped
 */
class  Car
{
	String name;
	int price;
	int speed;
	Car()
	{
	}
	Car(String name, int price, int speed)
	{
		this.name=name;
		this.price=price;
		this.speed=speed;
	}

	void running()
	{
		System.out.println(name +"car is running at the of:" + speed);
		
	}
	void stop()
	{
		System.out.println("car is stopped");
	}
}

