// 1345
// 5
// 54
// 543
// 5431
// 1345%10=5
// 0*10+5=5
// 1345/10=134

// 134%10=4
// 5*10+4=54
// 134/10=13

// 13%10=3
// 54*10+3
// 13/10=1

// 1%10=1
// 543*10+1=5431
// 1/10=0
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(),digit,rev=0;
        while(num!=0){
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println(rev);
    }
}
