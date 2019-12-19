/*
hirearchial inheritance
-->  if a super class has more than one class in the same leval then it is called as hierchial inheritance.
*/
class Vehicle
{
	void running()
	{
		System.out.println("vehicle is running");
	}
	}
	class Car extends Vehicle
	{
		int speed=100;
		void run()
        {
			System.out.println("car is running at the speed of"+speed);
		}
	}
	class Bike extends Vehicle
	{
		int speed=70;
		void run()
		{
			System.out.println("car is running at the speed of:"+speed);
		}
	}
	class Hire
	{
		public static void main(String[] args)
		{
           Car c1=new Car();
		   Bike b1=new Bike();
           b1.running();
		   c1.running();
		}
	}