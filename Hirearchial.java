/*
Multi-leval inheritance:
Inheritance of more than one leval is called as multi-inheritance.
*/
class Institute 
{
      String inst_name="Qspiders";
	  void inst()
	{
		  System.out.println("name of the institute:" +inst_name);
	}
}

class Course extends Institute
{
	String course_name="SQL";
	void course()
	{
		System.out.println("name of the course:"+course_name);
	}
}
class Course2 extends Institute
{
	String course_name="JAVA";
	void course2()
	{
		System.out.println("name of the course:"+course_name);
}
		public static void main(String[] args)
	{
         Course2 C=new Course2();
		 C.course2();
		 C.inst();
	}
}