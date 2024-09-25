public class Ej2P21{
    public static void main(String[] args) {
        char [] a = {'h','o','l','a','s'};
        
        System.out.println(recursividad(a, 0));
    }

    static int recursividad(char [] a, int index){ //index: posicion del arreglo

        if(index == a.length){ // Si el arreglo llega al final
            return 0;
        }else{
            if(a[index] == 'a' || a[index] == 'e' || a[index] == 'i' || a[index] == 'o' || a[index] == 'u'){
                return 1 + recursividad(a, index + 1);
            }else{
                return recursividad(a, index +1);
            }
        }
    }

}