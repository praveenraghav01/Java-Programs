class A extends Thread
{
    int a[],sum=0;
  A(int []b)
  {
    a=b;
  }
    public void run()
    {
      int temp=a[0];
      for (int j=0;j<10;j++)
      {
        if(temp<a[j]){
    			temp=a[j];
    		}
        }

      System.out.println("max"+temp);
    }

}
class B extends Thread
{
    int c[],sum1=0;
  B(int []d)
  {

    c=d;
  }
  public void run(){
    int temp1=c[0];
    for (int j=0;j<10;j++)
    {
      if(temp1>c[j])
      {
        temp1=c[j];
      }
    }
    System.out.println("min:"+temp1);
    }
  }

class ArrayMaxThread
{

  public static void main(String[] args) 
  {
        Scanner s= new Scanner(System.in);
    int a[]=new int[10];
    System.out.println("enter element in array");
    for(int i=0;i<10;i++)
    {
      a[i]=s.nextInt();
    }


    A obj1=new A(a);
    B obj2=new B(a);
    obj1.start();
  obj2.start();
  }
}
