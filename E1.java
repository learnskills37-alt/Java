class E extends Thread
{
   public void run()
{
int i=2;
int j=3;
int k=i+j;
System.out.println("Addition"+k);
}
}

class E4 extends Thread
{
   public void run()
{
int i=2;
int j=3;
int k=i-j;
System.out.println("Substraction  "+k);
}
}
class E5 extends Thread
{
   public void run()
{
int i=2;
int j=3;
int k=i*j;
System.out.println("Multiplication  "+k);
}
}
class E1
{
  public static void main(String[] args)
{
   E o1=new E();
o1.start();
E4 o2=new E4();
o2.start();
E5 o3=new E5();
o3.start();
}
}