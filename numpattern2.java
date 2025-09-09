import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nrow=sc.nextInt();
        int row,col,count=0;
        for(row=1;row<=nrow;row++){
            for(col=1;col<=row;col++){
                count++;
                System.out.print(count*2  + " "); // for odd either(count+2)or count*2-1
            }
            System.out.println();
        }
      
    }
}
