// 1345=5+4+3+1
//9+3
//12+1
//13
//1345%10=5
//5+0=5
//1345/10=134
//134%10=4
//5+4=9
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt(),digit,sum=0;
        // while(num!=0){
        //     digit=num%10;
        //     sum+=digit;
        //     num=num/10;
        // }
        for(num=num;num!=0;num=num/10){
            digit=num%10;
        sum+=digit;
        }
        System.out.println(sum);
    }
}
