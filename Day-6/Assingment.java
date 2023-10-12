/*
* You Problem:
* 1. Create an abstract class Bank with an abstract method
* abstract int getRateOfInterest();
* 2. create 3 concreate child classes of this Bank class SBI
  PNB, ICIC override the getRateOfInterest() method and return the values as follows:
 SBI : rateOfInterest = 7;
 PNB : rateOfInterest = 8;
 ICICI : rateOfInterest = 9;
    3. create a BankDemo class with the main method and call this rateOfInterest() method on all three SBI, PNB, ICICI objects with Bank class reference.
*/


abstract class Bank
{
    abstract int getRateOfInterest();
}

class SBI extends Bank
{
    @Override
    int getRateOfInterest()
    {
        int rateOfInterest = 7;
        return rateOfInterest;
    }
}

class PNB extends Bank
{
    @Override
    int getRateOfInterest()
    {
        int rateOfInterest = 8;
        return rateOfInterest;
    }
}


class ICIC extends Bank
{
    @Override
    int getRateOfInterest()
    {
        int rateOfInterest = 9;
        return rateOfInterest;
    }
}

class Test
{
    public static void main(String[] args)
    {
        Bank bank;
        bank = new SBI(); //Dynamic Method Dispatch
        System.out.println("Rate of Interest of SBI is: "+bank.getRateOfInterest()+" %");
        
        bank = new PNB(); //Dynamic Method Dispatch
        System.out.println("Rate of Interest of PNB is: "+bank.getRateOfInterest()+" %");
        
        bank = new ICIC(); //Dynamic Method Dispatch
        System.out.println("Rate of Interest of ICIC is: "+bank.getRateOfInterest()+" %");
    }
}