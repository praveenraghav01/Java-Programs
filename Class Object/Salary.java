public class Salary
{
double exp;
int basic;
int hra;
int da;
int salar;

Salary()
{
exp=4;
basic=20000;
hra=0;
da=0;
salar=0;
}
Salary(double exp)
{
if(exp<5)
{
basic=20000;
}
else
{
basic=40000;
}
hra=(10*basic)/100;
da=(20*basic)/100;
salar=hra+da+basic;
System.out.println("salary of employee"+salar);
}
public static void main(String args[])
{
Salary s1=new Salary(3);
Salary s2=new Salary(6);

}}



