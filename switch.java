//switch case
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("1.Open the App\n 2. Place order\n 3. Add to card\n");
    Scanner sc=new Scanner(System.in);
    int ch = sc.nextInt();
    switch(ch){
        case 1:
     System.out.println("Your App has been opened");
        break;
        case 2:
        System.out.println("Your order has been placed");
        break;
        case 3:
        System.out.println("Product adedto cart");
         break;
        default:
        System.out.println("imnvalid coice");
    }
    }
}
