import java.io.*;
import java.util.*;

public class Solution {
    
    static String[] getSmallestAndLargest(int k, String str){
    int s= 0 ,e = k ;
    String[] container = new String[str.length()-(k-1)];
    for(int i = 0;e<=str.length();s++,e++){
        container[i++] = str.substring(s,e);   
    }
    Arrays.sort(container);
    return container;
}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in = new Scanner(System.in);
    String input = in.next();
    int div = in.nextInt();
    String[] output = getSmallestAndLargest(div,input);
    System.out.println(output[0]+"\n"+output[output.length-1]);
    }
}