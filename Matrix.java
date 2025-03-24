import java.util.*;
class Matrix
{
    public static void main(String args[])
    {
        int i,j,k,r1,c1,r2,c2;
        int a[][]=new int[5][5];
        int b[][]=new int[5][5];
        int res[][]=new int[5][5];
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and column matrix 1:");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("enter matrix1 elements:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
             }
         }
         System.out.println("enter rows and column matrix 2:");
        r2=sc.nextInt();
        c2=sc.nextInt();
        
         
         System.out.println("enter matrix2 elements:");
         for(i=0;i<r2;i++)
         {
             for(j=0;j<c2;j++)
             {
                 b[i][j]=sc.nextInt();
              }
         }
         System.out.println("Matrix 1:");
         for(i=0;i<r1;i++)
         {
            for(j=0;j<c1;j++)
            {
                System.out.print(a[i][j]+"  ");
           }
            System.out.println("\n");
  
         }
         System.out.println("Matrix 2:");
         for(i=0;i<r2;i++)
         {
            for(j=0;j<c2;j++)
            {
                System.out.print(b[i][j]+" ");
             }
          System.out.println("\n");
         }
         if(r1==r2 && c1==c2){
         System.out.println("Sum of two matrices:");
         for(i=0;i<r1;i++)
         {
             for(j=0;j<c1;j++)
             {
                 res[i][j]=a[i][j]+b[i][j];
             }
    
      }
      for(i=0;i<r1;i++)
         {
            for(j=0;j<c1;j++)
            {
                System.out.print(res[i][j]+" ");
             }
          System.out.println("\n");
         }
         }
       if (c1==r2)
      {
      System.out.println("Product of two matrices:");
      for(i=0;i<r1;i++)
      {
         for(j=0;j<c2;j++)
         {
            res[i][j]=0;
            for(k=0;k<c1;k++)
            {
                res[i][j]=res[i][j]+a[i][k]*b[k][j];
             
        
             }
          
         }
          
     }
        for(i=0;i<r1;i++)
         {
            for(j=0;j<c1;j++)
            {
                System.out.print(res[i][j]+"  ");
             }
          System.out.println("\n");
         }
       }
     
  
  
    }
 }
         
         
        
              
           
    
