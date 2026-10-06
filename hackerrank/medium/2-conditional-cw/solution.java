import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(n>90){
        System.out.println("Excellent");
      } else if(n>80){
        System.out.println("Good");
      } else if(n>70){
        System.out.println("Fair");
      } else if(n>60){
        System.out.println("Meets Expectations");
      } else{
        System.out.println("Below Expectations");
      }
        
      
    }
}
