import java.util.Scanner;
class Main {
    public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
int nrow=sc.nextInt();
int row,col;
for(row=1;row<=nrow;row++){
    for(col=1;col<=nrow;col++){
        if(row==1||row==nrow || col==1 ||col ==nrow){
             System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
}

    }
}
