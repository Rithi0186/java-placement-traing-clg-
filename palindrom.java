import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(),digit,rev=0;
        int orgnum=num;
        while(orgnum!=0){
            digit=orgnum%10;
            rev=rev*10+digit;
            orgnum=orgnum/10;
        }
        System.out.println(rev);
        
        if(rev==num){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not a palindrom");
        }
    }
}
