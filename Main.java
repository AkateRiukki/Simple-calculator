/* 1. Create a simple program which (prompts user) to input their <name> and <zodiac sign> and
      (display it)*/
/* 2. Create an addition calculator (declare two numbers and result)*/
/* 3. Create a subtraction calculator (declare two numbers and result)*/
/* 4. Create a <multiplication> and <division> calculator (declare two numbers and result)*/
/* 5. Combine no.2 to no.4 in one program (declare two numbers and result)*/

//Made by Akate

import java.util.Scanner;

//if class name = Main, then file name = Main.java 
public class Main
{
    public static void main(String[] args)
    {
       //String = Line of words
       //char = abbr. Character (you cannot have spaces)
       //int = abbr. Integer (numbers)
       //float = decimals in integer inputs (1.5 or 10.3 etc.)
       //double = multiple number before floating point (23.12)
       
       // + : addition
       // - : subtraction
       // * : multiplication
       // / : division
       // % : To find the remainder
       
    /* //Question 1
       //Declaration
       String name = " ";
       String zodiac = " ";
       
       //Scanner
       Scanner input = new Scanner(System.in); 
       
       System.out.println("Please enter your name: ");
       name = input.next();
       
       System.out.println("Please enter your zodiac sign: ");
       zodiac = input.next();
       
       //Display
       System.out.println("Your name is: " + name);
       System.out.println("Your zodiac sign is: " + zodiac);
       
       //Question 2
       //Declaration
       double num1 = 0.00;
       double num2 = 0.00;
       double add;
       
       //Scanner input
       System.out.println("Enter your first number: ");
       num1 = input.nextDouble();
       
       System.out.println("Enter your second number: ");
       num2 = input.nextDouble();
       
       //Process
       add = num1 + num2;
       
       //Display
       System.out.println(num1 + " + " + num2 + " = " + add);
       
       //Question 3
       //Declaration
       double num3 = 0.00;
       double num4 = 0.00;
       double sub;
       
       //Scanner input
       System.out.println("Enter your first number: ");
       num3 = input.nextDouble();
       
       System.out.println("Enter your second number: ");
       num4 = input.nextDouble();
       
       //Process
       sub = num3 - num4;
       
       //Display
       System.out.println(num3 + " - " + num4 + " = " + sub);
       
       //Question 4
       //Multiplication
       //Declaration
       double num5 = 0.00;
       double num6 = 0.00;
       double multi;
       
       //Scanner input
       System.out.println("Enter your first number: ");
       num5 = input.nextDouble();
       
       System.out.println("Enter your second number: ");
       num6 = input.nextDouble();
       
       //Process
       multi = num5 * num6;
       
       //Display
       System.out.println(num5 + " * " + num6 + " = " + multi);
       
       //Division
       //Declaration
       double num7 = 0.00;
       double num8 = 0.00;
       double div;
       
       //Scanner input
       System.out.println("Enter your first number: ");
       num7 = input.nextDouble();
       
       System.out.println("Enter your second number: ");
       num8 = input.nextDouble();
       
       //Process
       div = num7 / num8;
       
       //Display
       System.out.println(num7 + " / " + num8 + " = " + div);
    */ 
       
       //Question 5
       //Declaration
       double x = 0.00;
       double y = 0.00;
       double result;
       
       char operation;
       
       //Scanner
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter your first number: ");
       x = input.nextDouble();
       
       System.out.println("Enter your second number: ");
       y = input.nextDouble();
       
       System.out.println("Choose your operation [+] [-] [*] [/] : ");
       operation = input.next().charAt(0);
       
       //switch case
       switch (operation)
       {
           case '+':
               //Addition Process
               result = x + y;
           break;
           
           case '-':
               //Subtraction Process
               result = x - y;
           break;
           
           case '*':
               //Multiplication Process
               result = x * y;
           break;
           
           case '/':
               //Division Process
               result = x / y;
           break;
           
           //For someone who typed other than the given operators
           default:
           System.out.println("Error! Operation does not exist!");
           return;
       }
       
       //Display
       System.out.println(x + " " + operation + " " + y + " = " + result);
    }
}
