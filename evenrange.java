// to primt even no with in range
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
int i;
Scanner sc=new Scanner(System.in);
int start =sc.nextInt();
int end=sc.nextInt();
if(start%2 !=0){
    start=start+1;
}
for(i=start;i<=end;i=i+2) {
    System.out.println(i);
} 
        
    }
}
