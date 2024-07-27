public class Main {
    public static void main(String[] args) {
        for(int banana = 1; banana <=256; banana*=2){
            System.out.println(banana);
        }

        for(int apple = 1; apple <= 8; apple++){
            System.out.println(Math.pow(2, apple));
            // 2^4 -> Math.pow(2,4)
        }


    }
}