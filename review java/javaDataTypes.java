import java.io.*;
import java.util.*;

public class Solution {
    
    public static void checkNum(long i){
        if(Math.abs(i)<128){
            System.out.println(i + " can be fitted in:");
            System.out.println("* byte");
            System.out.println("* short");
            System.out.println("* int");
            System.out.println("* long");
        }else if(Math.abs(i)< 32768){
            System.out.println(i + " can be fitted in:");
            System.out.println("* short");
            System.out.println("* int");
            System.out.println("* long");
        }else if(Math.abs(i)< Math.pow(2,31) -1){
            System.out.println(i + " can be fitted in:");
            System.out.println("* int");
            System.out.println("* long");
        }else if(Math.abs(i)< Math.pow(2,63) -1){
            System.out.println(i + " can be fitted in:");
            System.out.println("* long");
        }else{
            System.out.println(i + " can't be fitted anywhere.");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                if(x > Long.MAX_VALUE || x < Long.MIN_VALUE){
                    System.out.println(x+" can't be fitted anywhere.");
                }
                else{
                    System.out.println(x+" can be fitted in:");
                
                    if(x>=-128 && x<=127){
                        System.out.println("* byte");
                    }
                    if (x>= -32768 && x <= 32767){
                        System.out.println("* short");
                    }
                    if(x>=-2147483648 && x<=2147483647){
                        System.out.println("* int");
                    }
                    if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){
                        System.out.println("* long");
                    }
                }
            
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
            
    }
}