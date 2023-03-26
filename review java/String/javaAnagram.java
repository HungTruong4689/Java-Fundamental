import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
       b = b.toLowerCase();
       int al = a.length(), bl = b.length(),contador =0;
       int contador1[] = new int[al],contador2[] = new int[bl];
       if(al != bl){
           return false;
       }
       else{
           
           for(int i = 0; i <al; i++){
              
               for(int y = 0; y<bl; y++){
                    if(a.charAt(i)==a.charAt(y)){
                        contador1[i]++;
                    }
                    
                  if(a.charAt(i)==b.charAt(y)){
                      contador2[i]++;
                  }         
               }
               
               if(contador1[i] == contador2[i]){
                   contador++;
               }              
           }
                   
           if(contador == al){
               return true;
           }
           else{
               return false;    
           }
          
       }
    }
}