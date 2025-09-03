// to check username and password
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String storedEmail="abc@company.com";
        String storedPassword ="1234";
        
        System.out.println("Please enter your Mail:");
        String userMail=sc.next();
        if(storedEmail.equals(userMail)){
            System.out.println("Please enter your password:");
             String userPassword =sc.next();
            if(storedPassword.equals(userPassword)){
                 System.out.println("verified");
            }
            else{
                System.out.println("Invalid !");
            }
        }
        else{
            System.out.println("Invalid Email!");
        }
    }
}
