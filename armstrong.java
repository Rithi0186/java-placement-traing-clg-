import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt(),digit,sum=0,count=0;
        int temp=num;
        
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println(count);
        num=temp;
        while(num!=0){
            digit=num%10;
            sum+= (int)Math.pow(digit,count);
            num=num/10;
            
        }
        if(temp==sum){
            System.out.println("Amstrong number");
        }
        else{
            System.out.println(" not Amstrong number");
        }
    }
}
