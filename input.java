import java.io.*;
import java.util.*;
public class input{
  public static void main(String args[]){
    //Challenge 1
    //negative number
    Scanner negNumber = new Scanner(System.in);
    System.out.println("Input a negative number");
    int negativeNumber = negNumber.nextInt();
    
    //positive number
    Scanner posNumber = new Scanner(System.in);
    System.out.println("Input postive number greater than 5");
    int positiveNumber = posNumber.nextInt();
  
    //randomizer
    int startPoint = negativeNumber;
    int endPoint = positiveNumber;
    int randomNumber2 = (int)(Math.random() * endPoint - startPoint);
    int randomNumber = (int)(Math.random() * startPoint - endPoint);
    System.out.println("Your two numbers are " + randomNumber + " and " + randomNumber2);
    //Challenge 2
    Scanner name = new Scanner(System.in);
    System.out.println("What is your name?");
    String fullName = name.nextLine();
    Scanner adjective = new Scanner(System.in);
    System.out.println("Adjective?");
    String adjective1 = adjective.nextLine();
    Scanner number = new Scanner(System.in);
    System.out.println("Give me a number between 1 and 10.");
    int number1 = number.nextInt();
    Scanner noun = new Scanner(System.in);
    System.out.println("Noun?");
    String noun1 = noun.nextLine();
    System.out.println("The story of " + fullName + ":" + " It was a " + adjective1 + " night. " + number1 + " " + noun1 + " sat strangely atop your roof. The end.");
    
  }
}