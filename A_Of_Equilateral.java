import java.util.Scanner;

public class A_Of_Equilateral {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side of the traingle:");
        double a = s.nextDouble();
        double area = (Math.sqrt(3)/4)*(a*a);
        System.out.println("Area of Trianlge is: " + area);
    }
}
