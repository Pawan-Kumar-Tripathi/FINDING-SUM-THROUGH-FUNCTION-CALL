import java.io.*;
import java.util.*;
class sumbyfunction
    {
        public static void sum(int a , int b )
        {
            int sum1 = a+b;
            System.out.println(sum1);
            
        }
        public static void main()
        {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            sum(a,b);
            
        }
    }