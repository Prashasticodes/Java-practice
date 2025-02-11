
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
      System.out.println("the area of the rectangle is "+area+"cm sq.");

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

        scanner.close();*/
        /*int x = 3;
        int y =10;
        int z;

         z = x + y;
        z = x - y;
        z = x * y;
        z = x /y;
        z = x % y;*/

       /*   x = x+y; below line does the same thing known as augmented assignment operator
        x += y;
        x -=y;
        x = x*y;
        x*=y;
        x/=y;
        x%=y;
         x++;
         x--;
        order of operation PEMDAS
        double result = 7+4 -6*(5-4)+7*6/ 8;

        System.out.println(result);*/
        String name ; 
        int age ;
        boolean isStudent;

        System.out.println("Enter your name ?");
        name = scanner.nextLine();


        System.out.println("Enter your age ?");
        age = scanner.nextInt();

        System.out.println("are you a student? (true/false) ");
        isStudent = scanner.nextBoolean();

        if (name.isEmpty()){
          System.out.println("you didn't enter your name");
        }
        else {
          System.out.println("hello"+ name);
        }

       if (age> 60){
       System.out.println("Youre a senior.");
       }
       
        else if (age >= 18){
          System.out.println("Youre an adult .");
        }

      
        else if (age < 0){
          System.out.println("you haven't been born yet");
        }

        else if (age== 0){
          System.out.println("you are  baby");
        }

        else{
          System.out.println("youre not an adult  youre a child");
        }
         
   if (isStudent){
          System.out.println(" you're a student ");
        

        }
        else{
          System.out.println("you're not a student");
        }


        
        scanner.close();

    }
}
