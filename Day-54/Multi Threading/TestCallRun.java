/*Here we calling run() method directly instead of start() therefore run() method act as normal function  */
class TestCallRun extends Thread
{  
        public void run()
        {  
               for(int i=1;i<5;i++)
              {  
                     try{ Thread.sleep(500); }
                     catch(InterruptedException e)
                     { System.out.println(e); }  

                     System.out.println(i);  
              }  
        }  
        public static void main(String args[ ])
        {  
              TestCallRun t1=new TestCallRun();  
              TestCallRun t2=new TestCallRun();  

             System.out.println("First Time run method call:");
              t1.run();  
              t2.run();

             
             System.out.println("Second Time run method call:");  
              t1.run();
              t2.run();

             System.out.println("First Time start method call:");  
              t1.start();
              t2.start();


        }  
}
