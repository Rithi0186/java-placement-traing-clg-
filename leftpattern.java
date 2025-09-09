import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    int col,row;
    Scanner sc=new Scanner(System.in);
    int nrow=sc.nextInt();
    for(row=nrow;row>=1;row--){
        for(col=1;col<=nrow;col++){
            if(col<row){
            System.out.print(" ");}
            else{
                System.out.print("*");
            }
           
          }
       System.out.println();
    }
    }
}
