//3 ZIP 5 ZAP BOTH ZOOM
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num%3==0 && num%5==0){//first check this condition because once if condition satisfied else if block wont be checked
             System.out.println("Zoom");
        }
        else if(num%3==0){
            System.out.println("Zip");
            
        }
       else if(num%5==0){
           System.out.println("Zap");
       }
    }
}
