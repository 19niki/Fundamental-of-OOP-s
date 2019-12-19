/*Q7. what is IS-A relationship?
  --> It is similar to parent-child relationship, where child acquries all the proprties of the parent.

  Q8. how to achive IS-A relationship?
 -->  In java we can achive Is-A relationship through "inheritance".
      Inheritance: If one object state and behaviour of another object then it is called as inheritance.
*/

class Clg     //parent class
{
    String name;
	Clg()
	{
	}
	Clg(String name)
	{
		this.name=name;
	}
	void clgdetails()
	{
		System.out.println("college name:"+name);
	}
}
 
 class Course extends Clg      //child class
 {
      String coname;
	  Course(String name,String coname)
	 {
		  super(name);
        this.coname=coname;
	 }
     void codetails()
	 {      
         clgdetails();
		 System.out.println("course name:"+coname);
	 }
 } 



class Codrive
{
	public static void main(String[] args)
	{
		Course c1=new Course("ait","mca");
		c1.codetails();
	}
}