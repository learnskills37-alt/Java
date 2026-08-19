class A extends Thread
{

  public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("I value is"+i+" "+Thread.currentThread().getName());
}
}
}
class A8
{
  public static void main(String[] args)
{
A o1=new A();
A o2=new A();
A o3=new A();
o1.start();
o2.start();
o3.start();
}
}
   