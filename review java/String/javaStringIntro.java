import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner cake = new Scanner(System.in);
    String a = cake.nextLine();
    String b = cake.nextLine();
    cake.close();

    System.out.println(a.length() + b.length());


    if(a.compareTo(b) > b.compareTo(a)){
        System.out.println("Yes");
    }else{
    System.out.println("No");
    }

    String yummyMe = a.substring(0,1).toUpperCase() + a.substring(1);
    String frozenYogurt = b.substring (0,1).toUpperCase() + b.substring(1);
    System.out.println(yummyMe + " " + frozenYogurt);
    }
}