import java.util.Scanner;
public class BTThucHanhIfElse {

    public static boolean checkEven(int a){
        if(a % 2 == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(checkEven(a)){
            System.out.println("YES");
        }
        else System.out.println("NO");
        sc.close();
    }
}
