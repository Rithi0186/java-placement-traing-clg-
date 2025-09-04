// for each loop
 import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int i,j;
Scanner sc=new Scanner(System.in);
int start=sc.nextInt();
int end=sc.nextInt();

for(i=start;i<=end;i++){
    for(j=1;j<=end;j++){
         System.out.printf("%d x %d = %d\t ",i,j,i*j);
         
    }
    System.out.println();
   
}
}
}
