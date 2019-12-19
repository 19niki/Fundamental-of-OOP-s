/*Q5. ho do we achive enacapsulation? explain with the example?
--> The process of binding state and behaviour of an object together is called as enacapsulation.
--> In  java we can achive enacpsulation with the use of data hiding.
*/
class College
{
	private String cname;
	College()
	{
	}
	College(String cname)
	{
		this.cname=cname;
	}
	void collegedetails()
	{
		System.out.println("college name:"+ cname);
	}
	String getcollegename()
	{
		return cname;
	}
	void setcollegename(String cname)
	{
		this.cname=cname;
	}
}
