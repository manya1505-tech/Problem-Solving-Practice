import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        if(a%2!=0 && b%2!=0){
            System.out.println("we are odd");
        } else{
            System.out.println("we are simple");
        }
        
    }
}
