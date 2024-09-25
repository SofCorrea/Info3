public class ColasArreglos{
    public class Queue<AnyType> {
        private Integer front; 
        private Integer back; 
        private AnyType array[];
        private Integer size;
        private Integer count; 
        
        public Queue (Integer size){
            this.array = (AnyType []) new Object [size];
            this.front = this.back = 0;
            this.size = size;
            this.count = 0; 
        }
        
        public void enqueue (AnyType element){
            if(isFull()){
                System.out.println("\nLa cola está llena");
            }else{
                this.array [this.back] = element;
                this.back = moove(this.back);
                this.count++;   
            }
            
        }
        
        public void dequeue (){
            if(isEmpty()){
                System.out.println("\nLa cola está vacía");
            }else{
                this.front = moove(this.front);
                this.count--;
            }
        }
        
        public AnyType top(){
            return this.array[front];
        }
        
        public Boolean isFull(){
            return this.count == this.size;
        }
        
        public Boolean isEmpty(){
            return this.count == 0;
        }
        
        private Integer moove(Integer element){
            element++; 
            if(element > size - 1){
                element = 0;
            }
            return element;
        }
    }
}