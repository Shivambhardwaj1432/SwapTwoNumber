import java.util.Scanner;
public class Swap {
public static void main(String...a1) {
    int a,b,t;
    System.out.println("Enter two numbers");
    Scanner r=new Scanner(System.in);
    a=r.nextInt();
    b=r.nextInt();
    System.out.println("Before Swapping"+ a+" "+b);
    t=a;
    a=b;
    b=t;
    System.out.println("Before Swapping"+ a+" "+b);
    
}
}
