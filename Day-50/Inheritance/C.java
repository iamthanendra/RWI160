//Try Multiple Inheritance
class A
{
	void msg()
	{
		System.out.println("Hello A : ");
	}
}

class B
{
	void msg()
	{
		System.out.println("Hello B : ");
	}
}

class C extends A,B // Compilation Error
{
	public static void main(String args)
	{
		C ob = new C();
		ob.msg();
	}
}

//Q) Why multiple inheritance is not supported in java?
//To reduce the complexity and simplify the language, multiple inheritance is not supported in java. 
//Consider a scenario where A, B, and C are three classes. 
//The C class inherits A and B classes. 
//If A and B classes have the same method and you call it from child class object, 
//there will be ambiguity to call the method of A or B class.
//Since compile-time errors are better than runtime errors, 
//Java renders compile-time error if you inherit 2 classes. 
//So whether you have same method or different, there will be compile time error.