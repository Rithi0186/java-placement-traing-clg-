//combined switch case
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char ch = sc.next().charAt(0);

    switch(ch){
        case 'a':
      case 'e':
      case 'o':
      case 'i':
     case 'u':
    System.out.println("Vowel");
    break;
        default:
        System.out.println("consonant");
    }
    }
}
