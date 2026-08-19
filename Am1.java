class A40 extends Thread
{
  public void run()
{
   int i=10;
int j=11;
int k=i+j;
System.out.println("Addition is"+k);
}
}
class A41 extends Thread
{
  public void run()
{
   int i=10;
int j=11;
int k=i-j;
System.out.println("Sub is"+k);
}
}
class A42 extends Thread
{
  public void run()
{
   int i=10;
int j=11;
int k=i*j;
System.out.println("Multiply is"+k);
}
}
class Am1
{
  public static void main(String[] args)
{
   A40 o1=new A40();
o1.start();
   A41 o2=new A41();
o2.start();
   A42 o3=new A42();
o3.start();
}
}