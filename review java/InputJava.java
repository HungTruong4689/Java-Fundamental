import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner myObj = new Scanner(System.in);
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();
        myObj.nextLine();
        String name = myObj.nextLine();
        System.out.println("String: "+name);
        System.out.println("Double: "+salary);
        System.out.println("Int: "+age);
    }
}