/*Q7. what is IS-A relationship?
     It is similar to parent-child relationship, where child acquries all the proprties of the parent.
*/

class Clg
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
 
 class Course extends Clg
 {
      String coname;
	  Course(String name,String coname)
	 {
		  super(name);
        this.coname=coname;
	 }
     void codetails()
	 {
		 System.out.println("course name:"+coname);
	 }
 } 



class codrive
{
	public static void main(String[] args)
	{
		Course c1=new Course("ait","mca");
		c1.codetails();
	}
}