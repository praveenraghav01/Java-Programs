import java.util.*;
class A extends Thread{
    int a[],sum=0;
  A(int [] b){
    a=b;
  }
    public void run(){
      for (int j=0;j<10;j++){
        if(a[j]%2==0){
          sum=sum+a[j];
        }
      }
      System.out.println(sum);
    }

}
class B extends Thread{
    int c[],sum1=0;
  B(int [] d){

    c=d;
  }
  public void run(){
    for (int j=0;j<10;j++){
      if(c[j]%2!=0){
        sum1=sum1+c[j];
      }
    }
    System.out.println(sum1);
    }
  }

class ArrayThread{

  public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
    int a[]=new int[10];
    System.out.println("enter element in array");
    for(int i=0;i<10;i++){
      a[i]=s.nextInt();
    }


    A obj1=new A(a);
    B obj2=new B(a);
    obj1.start();
  obj2.start();
  }
}
