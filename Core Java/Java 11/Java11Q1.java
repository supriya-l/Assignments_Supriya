import java.util.*;
public class Java11Q1 {
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Principle");
        int p=s.nextInt();
        System.out.println("Enter your rate");
        int r=s.nextInt();
        System.out.println("Enter your time");
        int t= s.nextInt();
        //double simpleInterest=(p*r*t)/100;
       // System.out.println(simpleInterest);
       calculate simpleinterest = (a,b,c) -> System.out.println("The simple interest: in Rupees "+ (a*b*c)/100);
        simpleinterest.Interest(p,r,t);
    }
}
interface calculate{
   public void Interest(int p,int r,int t);
}