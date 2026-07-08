
class Add
{
   int x,y,z;
void add1(int x1,int y1)
{
  z=x1+y1;
}
void d()
{
  System.out.println("Z value is"+z);
}
}
class Addm
{
  public static void main(String[] args)
{
   Add o1=new Add();
o1.add1(5,6);
o1.d();
   Add o2=new Add();
o2.add1(8,9);
o2.d();
Add o3=o2;
o3.d();
Add o4=o1;
o4.d();
}
}
/* Output




*/

