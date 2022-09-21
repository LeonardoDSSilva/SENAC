public class Exe_03b {
    public static void main(String[] args) {
        System.out.println();
        for(int i = 0; i <= 10; i++ ){
            for(int x = 2; x<= 9; x++){
                System.out.printf("%d * %d = %d \t", x, i, (x * i));
            }
            System.out.println();
        }
    }
}
