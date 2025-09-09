import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    int col,row,count=0;
    Scanner sc=new Scanner(System.in);
    int nrow=sc.nextInt();
    for(row=nrow;row>=1;row--){
        count++;
        for(col=1;col<=nrow;col++){
            if(col<row){
            System.out.print(" ");}
            else{
                System.out.print(count);
            }
           
        
         }
        System.out.println();
    }
    }
}
