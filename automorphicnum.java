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
        int sqrt=(int)Math.pow(num,2);
         System.out.println(sqrt);
         int mod=(int)Math.pow(10,count);
            digit=sqrt% mod;
            if(digit==temp){
                System.out.println("automorphic number ");
            }
            else{
                System.out.println("not automorphic number ");
            }
           
    }
}
