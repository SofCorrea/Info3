public class Ej2{
    public static void main(String[] args) {
        int n = 10;
        recursividad(n);
    }

    static void recursividad(int n){
        if(n == 1){
        System.out.println(n);
        }else{
            if(n%2 != 0){
                System.out.println(n);
            }
            recursividad(n-1);
        }
    }
}