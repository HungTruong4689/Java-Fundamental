import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /*
         *
         *
        
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        int  n, d,   ip,  q , x, y, n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            d =  sc.ne x tInt ( ); ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                ip = sc.nextInt();
                temp.add(ip);
            }
            al.add(temp);
}
 
// System.out.println(al);

        q =  sc.ne x tInt ( ); for (int i = 0; i < q; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            try {
                ele = al.get(x   - 1).get ( y - 1);
                System.out.println(ele);
            } catch  (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}