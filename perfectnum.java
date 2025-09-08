import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int i,sum=0;
        for(i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(num==sum){
        System.out.println("perfect number");}
        else{
            System.out.println("not a perfect number");
        }
    }
}
