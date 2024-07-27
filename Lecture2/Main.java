public class Main {
    public static void main(String[] args) {
        boolean b = false; // "true=1" , "false"=0

        int i = 0;

        i = i + 1;

        if(b){
            i = 9000;
        } else if (i<=0) {
            i = 6;
        } else{
            i = 2;
        }

        System.out.println(i);
        }
            
    }