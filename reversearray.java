import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
        for(int i=0;i<n;i++){
          System.out.println(arr[i] + " " );
       }
       System.out.println("Reversed array");
    //   int i=0,temp;
    //   int j=n-1;
    //   while(j>i){
    //           temp=arr[i];
    //           arr[i]=arr[j];
    //           arr[j]=temp;
    //           i++;
    //           j--;
            
    //   }
    int temp;
    for(int i=0,j=n-1;i<j;i++,j--){
        temp=arr[i];          
        arr[i]=arr[j];
        arr[j]=temp;
    }
       System.out.println(Arrays.toString(arr));
    }
}
