/* cases fro driver class
  case 1: we can make data member not readble, not modifiable by making data members private and not using 
          getter and setter method.
  case 2: we can make data member only readble, not modifable by making data members private and using only
          getter method not  using setter method.
  case 3: we can make data member only modifiable not readble by making data members private and using only setter
          method and not using getter method.
  case 4: we can make data member readable and modifiable by making data members private and using both 
          getter and setter method.
*/
           

class Driver1
{
	public static void main(String[] args)
	{
		A obj1=new A(45);
	    System.out.println(obj1.getvalue());
		obj1.setvalue(49);
		System.out.println(obj1.getvalue());
}
}