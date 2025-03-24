import java.util.*;

class CPU
{
   int price;
   
   public CPU(int price)
   {
     this.price=price;
   }
   class processor
   {
      int cores;
      String manufacturer;
      processor(int cores,String manufacturer)
      {
        this.cores=cores;
        this.manufacturer=manufacturer;
       }
       void displayProcessorInfo()
       {
          System.out.println("processor core:"+cores);
          System.out.println("processor manufacturer:"+manufacturer);
        }
     }
     static class RAM
     {
        int memory;
        String manufacturer;
        RAM(int memory,String manufacturer)
        {
           this.memory=memory;
           this.manufacturer=manufacturer;
        }
        void displayRamInfo()
        {
           System.out.println("Memory:"+memory+"GB");
           System.out.println("Memory manufacturer:"+manufacturer);
         }
      }
      public static void main(String args[])
      {
          CPU cpu=new CPU(25000);
          CPU.processor p=cpu.new processor(7,"intel");
          CPU.RAM ram=new CPU.RAM(16,"abc");
          
         System.out.println("CPU price="+cpu.price);
         p.displayProcessorInfo();
         ram.displayRamInfo();
       }
  }
       
       
        
      
   
     
