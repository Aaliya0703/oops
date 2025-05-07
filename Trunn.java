import java.util.*;

class Fibonacci implements Runnable{

   public void run(){
      int n1=0;
      int n2=1;
      int next;
     System.out.println("Fibonacci Numbers");
     for(int i=0;i<10;i++)
     {
       System.out.println(n1+" ");
       
       next=n1+n2;
       n1=n2;
       n2=next;
       }
    }
}

class Even implements Runnable{

   public void run(){
   
    System.out.println("Even numbers");
      for(int j=1;j<=10;j++)
      {
       if(j%2==0){
        System.out.println(j+"  ");
        }
     }
  }
}

class Trunn{
  public static void main(String args[]){
    Fibonacci fib=new Fibonacci();
    Even eve=new Even();
    
    Thread tfib=new Thread(fib);
    Thread teve=new Thread(eve);
    
    tfib.start();
    teve.start();
  }
}
    
