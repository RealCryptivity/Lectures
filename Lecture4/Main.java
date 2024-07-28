public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            foo(i);
        }


        //Signature is the name of the method and its the lsit of parameter
        // - name
        // - Params
    }


    private static void foo(int a, int b){
        System.out.println("1");

    }

    private static void foo(int param){
        System.out.println(param);

    }
}