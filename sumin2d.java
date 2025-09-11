import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m =sc.nextInt();
        int arr[][]=new int[n][m];
        int sum=0;
        
        for(int i=0;i<n;i++){
            System.out.println("row" +i);
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<n;i++){
             sum=0;
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            
            }
              System.out.println("sum" +sum);
         }

    }
}
