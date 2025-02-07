import java.util.Scanner;
public class pizza {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String item;
        double price ;
        int quantity;
        char currency = '$';
        double total  ;

        System.out.println("What item would you like to buy ?: ");
        item = scanner.nextLine();
       
        
        System.out.println("  what is the Cost of each "+item +"?");
        price = scanner.nextDouble();
        

        System.out.println("How many "+item+ " would you like ?");
        quantity = scanner.nextInt();
        
        total = price * quantity ;
        System.out.println("you have bought "+quantity+" "+item );
        System.out.println(" Your total is " + total +" "+ currency);
        scanner.close();
    }
    
}
