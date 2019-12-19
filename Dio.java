/* What is extends? what are the diffrent types of inheritance in java explain with example?
 --> extends is a keyword which is used to achive inheritance in java.
     types of inheritance
	1.single-leval inheritance
	2.multi-leval inhertance
	3.hirearchial inheritance
	4. hybrid inherutance
	5. multiple inheritance
*/
//Single inheritance
class Bike
{
  String name;
  double price;
  int speed;
  void running()
	{
      System.out.println("running at the speed of:"+speed);
	}
}

class Dio extends Bike
{
	int gears;
	public static void main(String[] args)
	{
		Dio d=new Dio();
		d.running();
		System.out.println(d.name);
		System.out.println(d.price);
		System.out.println(d.speed);
		System.out.println(d.gears);
	}
}

