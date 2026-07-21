import java.util.Scanner;
class Employee
{
String n,o;
int id;
   Employee(String n1,int id1,String o1)
{
n=n1;
id=id1;
o=o1;
}
void display()
{
System.out.println("Employee information");
System.out.println("Name"+n);
System.out.println("ID "+id);
System.out.println("Organization is "+o);
}
}
class Consultancy
{
  
Consultancy(Employee[] o)
{
  for(int i=0;i<o.length;i++)
{
   o[i].display();
}
}
}
 class Ec
{
   public static void main(String[] args)
{
   Scanner sc1=new Scanner(System.in);
System.out.println("Enter number of employee");
int n1=sc1.nextInt();
Employee e1[]=new Employee[n1];
String[] en=new String[n1];
String[] eo=new String[n1];
int[] eid=new int[n1];
//Read employee values
for(int i=0;i<e1.length;i++)
{
System.out.println("Enter Employee name");
 en[i]=sc1.next();
System.out.println("Enter Employee id");
eid[i]=sc1.nextInt();
System.out.println("Enter Employee organization");
 eo[i]=sc1.next();
   e1[i]=new Employee(en[i],eid[i],eo[i]);
}
Consultancy c1=new Consultancy(e1);
}
}
