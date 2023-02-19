import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner myObj = new Scanner(System.in);
        int N = myObj.nextInt();
        for(int i =0;i<N ;i++){
            int a = myObj.nextInt();
            int b = myObj.nextInt();
            int n = myObj.nextInt();
            int temp=a;
            for(int j =0;j<n;j++){
                temp = temp + (int)Math.pow(2, j) *b;
                System.out.print(temp+ " ");
            }
            System.out.println("");
        }
        
        
    }
}