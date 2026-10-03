import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        long r = sc.nextInt();
        int pi = 3;
        long Area = pi*r*r;
        long Perimeter = 2*pi*r;
        System.out.println((Area)+"\n"+(Perimeter));
        // System.out.println(Area);
        // System.out.println(Perimeter);
    }
}
