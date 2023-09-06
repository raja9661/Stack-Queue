public class ImplementationOfQueueUsingStack {
    int top;
    int size;
    int arr[];
    int front,rear;
    int queue[];
    ImplementationOfQueueUsingStack(int s)
    {
        front=rear=-1;
        top=-1;
        size=s;
        arr=new int[s];
        queue=new int[s];
    }
    public void QueueImpStack()
    {
        int count=0;
        for(int i=top;i>=0;i--)
        {
            queue[count++]=arr[i];
            if(front==-1)
            {
                front=0;
            }
            rear=rear+1;
        }
    }
    void enqueue(int val)
    {
        if(rear==size-1)
        {
            System.out.println("sorry :( Stack is full cannot perform push operation");
            return;
        }
        rear=rear+1;
        queue[rear]=val;
    }
     void dequeue()
    {
        if(front==-1)
        {
            System.out.println("Sorry :( Stack is Empty cannot perform pop operation");
            return;  
        }
        for(int i=front;i<rear;i++)
        {
            queue[i]=queue[i+1];
        }
        rear=rear-1;
    }
    void displayQueue()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.print(queue[i]+"-");
        }
        System.out.println("");
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Sorry :( Stack is Empty cannot perform pop operation");
            return ;   
        }
        int val=arr[top];
        top=top-1;
        // return val;
    }
    void push(int val)
    {
        if(top==size-1)
        {
            System.out.println("sorry :( Stack is full cannot perform push operation");
            return;
        }
        top=top+1;
        arr[top]=val;
    }
    void disply()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+"-");
        }
        System.out.println("");
    }
    public static void main(String args[])
    {
        ImplementationOfQueueUsingStack lq=new ImplementationOfQueueUsingStack(5);
        lq.push(2);
        lq.push(4);
        lq.push(6);
        lq.push(8);
        lq.disply();
        lq.QueueImpStack();
        lq.enqueue(16);
        lq.displayQueue();
        lq.dequeue();
        lq.displayQueue();        
    }
}
