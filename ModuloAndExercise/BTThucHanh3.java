public class BTThucHanh3 {

    //Tìm Số Nguyên Tố

    
    public static void main(String[] args) {
        for(int i = 2 ; i <= 100 ; i++){
            boolean ok = true;
            for(int j = 2 ; j <= Math.sqrt(i) ; j++){
                if(i % j == 0){
                    ok = false;
                    break;
                }
            }
            if(ok){
                System.out.print(i + " ");
            }
        }
    }
}
