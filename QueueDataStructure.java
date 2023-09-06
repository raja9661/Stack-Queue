public class QueueDataStructure {
    int size;
    int top;
    int bottom;
    int arr[];
    QueueDataStructure(int s)
    {
        top=-1;
        bottom=-1;
        size=s;
        arr=new int[size];
    }
    public void push(int val)
    {
        if(bottom==size-1)
        {
            System.out.println("Queue is full you cannot perform push operation");
            return;
        }
        if(bottom==0)
        {
            top=0;
        }
        bottom=bottom+1;
        arr[bottom]=val;
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Queue is empty you cannot perform pop operation");
            return;
        }
        // int val=arr[top];
        // top=top+1;
        // return val;
        for(int i=0;i<size-1;i++)
        {
            arr[i]=arr[i+1];
        }
        bottom--;
    }
    public void disply()
    {
        for(int i=top;i<=bottom;i++)
        {
            System.out.print(arr[i]+"->");
        }
        System.out.println("");
    }
    public static void main(String args[])
    {
        QueueDataStructure qd=new QueueDataStructure(5);
        qd.push(2);
        qd.push(4);
        qd.push(6);
        qd.push(8);
        qd.push(10);
        qd.disply();
        qd.pop();
        qd.disply();
        qd.push(12);
        qd.disply();
    }
}
