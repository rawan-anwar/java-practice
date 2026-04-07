import java.util.Scanner;

public class Main {

    public static void main() {
        System.out.println("please enter two integers (num1, num2)");
        Scanner sc = new Scanner(System.in);

        int num1= sc.nextInt();
        int num2 = sc.nextInt();

        arithmetic(num1,num2);
        System.out.println("==========================");

        max_min(num1,num2);
        System.out.println("==========================");

        logical(num1,num2);
        System.out.println("==========================");

        ternary(num1,num2);


    }

    public static void arithmetic(int num1 , int num2){
        System.out.println("the sum of the two numbers is : "+ (num1 + num2));
        System.out.println("the difference of the two numbers is : "+ (num1 - num2));
        System.out.println("the product of the two numbers is : "+ (num1 * num2));
        System.out.println("the remainder of the two numbers is : "+ (num1 % num2));
    }

    public static void max_min(int num1 , int num2) {
        if (num1 > num2){
            System.out.println("the first number : "+num1+" is the greatest");
        } else if (num1 < num2) {
            System.out.println("the second number : "+num2+" is the greatest");
        }
        else{
            System.out.println("the two numbers are equal");
        }
    }

    public static void logical( int num1 , int num2){
        if (num1 >0 && num2 > 0){
            System.out.println("Both numbers are positive");
        }
        else if (num1 >0 || num2 > 0) {
            System.out.println("one number is positive");
        }
        else {
            System.out.println("no positive numbers");
        }
    }

    public static void ternary(int num1 , int num2){
        int max= (num1 > num2) ? num1 : num2;
        System.out.println("using ternary operators , the greatest number is " + max);
    }
}