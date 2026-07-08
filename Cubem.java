class Cube
{
  int l=2,b=3,w=4;
  void Volume()
{
int v=(l*b*w);
  System.out.println("Length:"+l+"Breadth:"+b+"Width:"+w+"Volume is"+v);
}
}
class Cubem
{
    public static void main(String[] args)
{
   Cube o1=new Cube();
o1.Volume();
}
}