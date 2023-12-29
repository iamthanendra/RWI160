//In this program we are not creating default constructor but compiler will automatic create default constructor 
//and compiler will provide default value of varriable according these data type
class Student 
{
	int id;              //Didn't Initialize
	String name;            //Didn't Initialize
	void display()       //Method to display id & name
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		s1.display();
		s2.display();
	}
}
