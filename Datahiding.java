/*Q2. What is data-hiding?
     Restrict direct access of the object and providing the controlld access through the
	 behaviour of the class is know is data-hiding.
	 data-hiding will be achived with the help of making a data member private.
*/
class College 
{
   private int cid;
   private String cname;
   College()
	{
	}
   College(int cid,String cname )
	{
	   this.cid=cid;
	   this.cname=cname;
	}
	void collegedetails()
	{
	   System.out.println("college id:"+cid);
	   System.out.println("college name:"+cname);
	}
	void studentadd(String name)
	{
		this.collegedetails();
		System.out.println(name+ ":student addmission done");
	}
}
class  Datahiding
{
	public static void main(String[] args)
	{
      College c=new College(1,"aba");
	  c.studentadd("niki");
}
}