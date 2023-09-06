public class LinkedListImptnOfQueue {
    node front;
    node rear;
    class node
    {
        int data;
        node next;
        node(int val)
        {
            data=val;
            next=null;
        }

    }
    LinkedListImptnOfQueue()
    {
        front=rear=null;
    }
    public void push(int val)
    {
        node newNode=new node(val);
        if(front==null && rear==null)
        {
            front=new node(val);
            rear=front;
            return;
        }
        
          rear.next=newNode;
          rear=newNode;
    }
    public void pop()
    {
        // node temp=front;
        if(front==null)
        {
            System.out.println("queue is empty you cannot perform pop operation");
        }
        if(front==rear)
        {
            front=rear=null;
        }
        front=front.next;
    }
    public void disply()
    {
        node temp=front;
        while(temp!=null)
        {
            System.out.print(temp.data+"-");
            temp=temp.next;
        }
        System.out.println("");
    }
    public static void main(String args[])
    {
        LinkedListImptnOfQueue lq=new LinkedListImptnOfQueue();
        lq.push(2);
        lq.push(4);
        lq.push(6);
        lq.push(8);
        lq.push(10);
        lq.disply();
        lq.pop();
        lq.pop();
        lq.pop();
        lq.disply();
        lq.push(12);
        lq.disply();
    }
}
