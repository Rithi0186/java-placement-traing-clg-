// to primt even no with in range
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
int i;
Scanner sc=new Scanner(System.in);
int start =sc.nextInt();
int end=sc.nextInt();
System.out.println("odd or even");
String choice =sc.next();
switch(choice){
    case "odd":
        if(start%2==0){
    start=start+1;
}
for(i=start;i<=end;i=i+2) {
    System.out.println(i);
} 
        
        break;
        case "even":
            if(start%2 !=0){
    start=start+1;
}
for(i=start;i<=end;i=i+2) {
    System.out.println(i);
} 
            break;
            default:
            System.out.println("invalid");
}

        
    }
}
