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
          System.out.println(arr[i]);
       }
       System.out.println(arr);
        System.out.println(arr.length);
         System.out.println("Array elements"+ Arrays.toString(arr));
    }
}
