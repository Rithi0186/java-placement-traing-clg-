import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nrow=sc.nextInt();
        int row,col;
        char ch='A';
        for(row=1;row<=nrow;row++){
            for(col=1;col<=row;col++){
             
                System.out.print(ch + " "); 
                   ch++;
            }
            System.out.println();
        }
      
    }
}
