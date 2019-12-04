class 1_stack_queue{
    int[] arr;
    int top;

    1_stack_queue(){
        this.arr = new int[10];
        this.top = -1;
    }

    1_stack_queue(int capacity)
    {
        this.arr= new int[capacity];
        this.top=-1;
    }

    public void push(int item) throws Exception{
        if(ifFull())
        {
            throw new Exception("Stack is full");
        }
        this.top++;
        arr[top]=item;
    }
    
    public int pop() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Stack is Empty");
        }
        int value=this.arr[this.top];
        this.arr[this.top]=0;
        this.top--;
        return value;


    }
    public int size()
    {
        return this.top+1;
    }
    public boolean isEmpty()
    {
        return this.size()==0;
    }
    public boolean isFull()
    {
        return this.size()==this.arr.length;
    }
    public int peek() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack is Empty");
        }
        return this.arr[this.top];
    }
    public void display()
    {
        for(int i=this.top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
class Queue{
    int[] arr;
    int front;
    int end;
    Queue()
    {
        this.arr=new int[10];
        this.front=-1;
        this.end=-1;

    }
    Queue(int capacity)
    {
        this.arr=new int[capacity];
        this.front=-1;
        this.end=-1;

    }
    
}