import java.util.Scanner;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();

        // code here
        a= a+b;
        b=a-b;
        a=a-b;
        

        System.out.println(a + " " + b);
    }
}
