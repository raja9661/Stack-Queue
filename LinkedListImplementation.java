class LinkedListImplementation
{
    node top;
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
    LinkedListImplementation()
    {
        top=null;
    }
    public void push(int val)
    {
        node newNode=new node(val);
        if(top==null)
        {
            top=new node(val);
            return;
        }
        newNode.next=top;
        top=newNode;
    }
    public int pop()
    {
        if(top==null)
        {
            System.out.print("stack is empty");
            return 0;
        }
        int data=top.data;
        top=top.next;
        return data;
    }
    void disply()
    {
        node temp=top;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("");
    }
    public static void main(String args[])
    {
        LinkedListImplementation li=new LinkedListImplementation();
        li.push(5);
        li.push(20);
        li.push(30);
        li.disply();
        li.pop();
        li.disply();
    }
}