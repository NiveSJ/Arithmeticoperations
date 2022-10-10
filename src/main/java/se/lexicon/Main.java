package se.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int a,b,c=0,option;
        System.out.println("Enter two Numbers to perform arithmetic operation");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Please Enter your options 1.Sum 2.Subtraction 3. Division 4.Multiply");
        option= sc.nextInt();
        switch(option){
            case 1 :
                c=a+b;
                break;
            case 2 :
                c=a-b;
                break;
            case 3 :
                c=a/b;
                break;
            case 4:
                c=a*b;
                break;
            default :
                System.out.println("Please Enter Valid Option");
        }
        System.out.println("Result:"+ c);
    }
}