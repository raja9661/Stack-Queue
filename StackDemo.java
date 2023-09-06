public class StackDemo {
    // int top=-1;
    // int size=5;
    // int arr[]=new int[size];
    int top;
    int size;
    int arr[];
    StackDemo(int s)
    {
        top=-1;
        size=s;
        arr=new int[s];
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Sorry :( Stack is Empty cannot perform pop operation");
            return ;   
        }
        top=top-1;
        // return arr[top];
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
            System.out.print(arr[i]+"->");
        }
        System.out.println("");
    }
    public static void main(String args[])
    {
        StackDemo sd=new StackDemo(5);
        sd.push(2);
        sd.push(4);
        sd.push(6);
        sd.push(8);
        sd.push(10);
        sd.disply();
        sd.pop();
        sd.disply();
        sd.push(12);
        sd.disply();
        sd.push(14);
        sd.disply();
    }
}
