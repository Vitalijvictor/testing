package ru.vital;

import java.util.Scanner;

public class Test1 {
    int num1;
    int num2;
    int ans;
    char op;

//    public Test1(int num1, int num2, int ans, char op) {
//        this.num1 = num1;
//        this.num2 = num2;
//        this.ans = ans;
//        this.op = op;
//    }

    public Test1() {

    }

    public static int calc(int num1, int num2, int ans, char op) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = reader.nextInt();
        num2 = reader.nextInt();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch (op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.printf("Error! Enter correct operator");

        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
        return ans;
    }

    public static void main(String[] args) {
        Test1.calc(1, 1, args.length, ' ');
    }
}
