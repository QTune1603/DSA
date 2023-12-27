import java.util.Scanner;

public class BTThucHanh5 {
    // Vẽ Hình Tam Giác

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
           *
          ***
         *****
        *******
       *********
         */

        // for(int i = 1 ; i <= n ; i++){
        // for(int j = 1 ; j <= n-i ; j++){
        // System.out.print(" ");
        // }
        // for(int j = 1 ; j <= 2*i-1 ; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // sc.close();

        /*
            *
            **
            ***
            ****
            *****
        */
        // for(int i = n ; i >= 0 ; i--){
        // for(int j = 1 ; j <= n-i ; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        /*
            *****
            ****
            ***
            **
            *

        */
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i + 1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*
             *
            **
           ***
          ****
         *****
         */

        // for(int i = 1 ; i <= n ; i++){
        //     for(int j = n ; j >= 0 ; j--){
        //         if(i <= j) System.out.print(" ");
        //         else System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*
         *****
          ****
           ***
            **
             *
         */
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(j < i){
                    System.out.print(" ");
                }
                else System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
