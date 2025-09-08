
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt(),digit,count=0;
        while(num!=0){
            num=num/10;
            count=count+1;
        }
          System.out.println(count);
        if(count%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
      
    }
}
