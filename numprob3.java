
class Main {
    public static void main(String[] args) {
        int row,col;
        int count=1;
        for(row=1;row<=5;row++){
            for(col=1;col<=5;col++){
                if(col==1){
                System.out.print(row);
                }
                else{
                  System.out.print(row+1);   
                }
            }
            System.out.println();
        }
    }
}
