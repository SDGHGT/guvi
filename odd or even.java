 import java.util.Scanner;
     
    class OddOrEven
    {
       public static void main(String args[])
       {
          int x;
          System.out.println("invalid");
          Scanner in = new Scanner(System.in);
          x = in.nextInt();
         
          if (x % 2 == 0)
             System.out.println("even");
          else
             System.out.println("odd");
       }
    }
