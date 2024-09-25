public class QueueList {
    private Nodo front;
    private Nodo back;

    public QueueList(){
        front = null;
        back = null;
    }

    // Ingresar un valor a la cola
    public void enqueue(int x){
        Nodo new_Nodo = new Nodo(x);
        if(isEmpty()){   
            back=new_Nodo;
            front=back;
        }else{
            back.next = new_Nodo;  // Aquí apuntas el siguiente nodo de 'back' al nuevo nodo
            back = new_Nodo;  // Luego, actualizas el 'back' al nuevo nodo
        }
    }

    // Eleminar y mostrar el valor eliminado 
    public int dequeue(){
        if(isEmpty()){
            throw new UnderflowException("Empty queue");
        }else{
            int aux = front.element;
            front = front.next;
            return aux;
        }
    }

    // Obtener el frente (primer valor ingresado) de la lista
    public int getFront() {
        if(isEmpty()){
            throw new UnderflowException("Empty queue");
        }else{
            return front.element;
        }  
    }

    // Preguntar si la cola esta vacia
    public boolean isEmpty(){
        return front == null && back == null;
    }

    // Hacer vacia la cola
    public void makeEmpty(){
        front = null;
        back = null;
    }

    // Mostrar la cola completa
    public void mostrarCola(){
        Nodo aux_Nodo = front;
        if(isEmpty()){
            throw new UnderflowException("Empty queue");
        }else{
            while (aux_Nodo != null) {
                System.out.println(aux_Nodo.element);
                aux_Nodo = aux_Nodo.next;
            }
        }
    }
}