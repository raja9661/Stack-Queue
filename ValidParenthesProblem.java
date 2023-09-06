public class ValidParenthesProblem {
    //creating stack
    int top;
    int size;
    char arr[];
    ValidParenthesProblem(int s)  //constructor
    {
        top=-1;
        size=s;
        arr=new char[s];
    }
    public boolean IsValidParenthis(String str)
    {
        char arr[]=str.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]== '['|| arr[i]== '{' || arr[i]=='(')
            {
                push(arr[i]);
                count++;

            }
            if(arr[i]== ']'|| arr[i]== '}' || arr[i]==')')
            {
                pop();
                count--;
            }
        }
        System.out.println(count);
        if(count==0)
        {
            return true;
        }
        return false;
    }
    void push(char c)
    {
        if(top==size-1)
        {
            return;
        }
        top=top+1;
        arr[top]=c;
    }
    void pop()
    {
        if(top==-1)
        {
            return;   
        }
        char val=arr[top];
        top=top-1;
        // return val;
    }
    public static void main(String args[])
    {
        ValidParenthesProblem vp=new ValidParenthesProblem(10);
        String s="{()}";
        System.out.print(vp.IsValidParenthis(s));
    }
}
