
import java.util.Scanner;
public class scanner {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Enter your name ");
       String name = scanner.nextLine();
       System.out.println("ENTER YOUR AGE ");
       int age = scanner.nextInt();
       System.out.println("WHATS YOUR GPA");
       double gpa = scanner.nextDouble();
       System.out.println("are you a student?(true/ false)");
       boolean isStudent = scanner.nextBoolean();

    
       System.out.println("hello" + name);
       System.out.println("you are " +age+ "years old");
       System.out.println("your GPA is "+gpa);
       if(isStudent){
        System.out.println("youre enrolled as a student ");
       }
      else {
        System.out.println("youre not a student ");
      }
      
      double length = 0;
      double height = 0;
      double width = 0;
      double area = 0;
      
       
      System.out.println("enter length");
       length = scanner.nextDouble();

      System.out.println("enter height");
      height = scanner.nextDouble();

      System.out.println("enter width");
       width = scanner.nextDouble();

      area = length*height*width;
      System.out.println("the area of the rectangle is "+area+"cm sq.");*/

      String Adjective1;
      String noun1;
      String Adjective2;
      String Verb1;
      String Adjective3;
       
      System.out.print("Enter an adjective\n"); 
      Adjective1 = scanner.nextLine(); 

      System.out.println("Enter a noun");
      noun1 = scanner.nextLine(); 
      
      System.out.println("Enter another adjective");
      Adjective2 = scanner.nextLine(); 
      
      System.out.println("enter a verb");
      Verb1 = scanner.nextLine(); 
      
      System.out.println("enter an adjective");  
      Adjective3 = scanner.nextLine(); 




      System.out.println("today i went to a " + Adjective1+"zoo");
      System.out.println("in an exhibit i saw a "+ noun1);
      System.out.println(noun1 +"was "+ Adjective2+ "and "+Verb1);
      System.out.println("I was "+Adjective3+"!");

        scanner.close();
        
    }
}
