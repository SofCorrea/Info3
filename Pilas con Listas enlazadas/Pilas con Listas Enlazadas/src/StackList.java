public class EjemploPila{
    private Nodo topOfStack;

    public EjemploPila(){
        topOfStack = null;
    }

    public void push(int x){
        topOfStack = new Nodo(x);
    }

    public boolean isEmpty(){
        return topOfStack == null;
    }

    public void pop(){
        if(isEmpty()){
            throw new UnderflowException("Stack empty");
        }else{
            topOfStack=topOfStack.next;
        }
    }

    public int top(){

    }

    public int topAndPop(){

    }

    public void makeEmpty(){
        topOfStack=null;
    }
}