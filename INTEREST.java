import java.util.Scanner;
import java.lang.Math;
class INTEREST
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double p,t,r,si,ci;
        System.out.println("Enter the Principle, Time and Rate");
        p=sc.nextDouble();
        t=sc.nextDouble();
        r=sc.nextDouble();
        si=(p*r*t)/100;
        ci=(p*Math.pow((1+r/100),t))-p;
        System.out.println("The simple interest is "+si);
        System.out.println("The compound interest is "+ci);
    }
}