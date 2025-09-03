//to check postive neg 0
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num>0){ 

          System.out.println("Entered number is postive");   
        }
        else if(num==0){
             System.out.println("Entered number is zero");   
        }
        else{
             System.out.println("Entered number is negative");   
        }
       
    }
}
//loe for postive number 4,5,6,7,8,9,10,11,18,19,20
//loe for 04,5,6,7,8,12,13,14,18,19,20,21
//loe for negative 4,5,6,7,8,15,16,17,18,19,20
