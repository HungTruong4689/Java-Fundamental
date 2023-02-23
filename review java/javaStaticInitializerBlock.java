import java.io.*;
import java.util.*;

public class Solution {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        int y = input.nextInt();
        if ((x > 0) && (y > 0)){
            System.out.println(AreaP(x,y));
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    
    public static int AreaP(int b, int h){
        return b * h;
    }
}