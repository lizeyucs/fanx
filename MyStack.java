import java.util.Scanner;

public class MyStack<T>{
    private static class Node<N>{//构造节点类泛型
        private N item;//形成泛型变量
        private Node<N> next;//类似于链表的next
        public Node(){}
        public Node(N item,Node<N> next){
            this.item=item;
            this.next=next;
        }//写构造器
        public boolean end(){
            return item==null&&next==null;
        }//判断这个节点是不是末尾
    }
    private Node<T>  top=new Node<>();//建一个泛型节点
    public void push(T item){
        top=new Node<>(item,top);

    }
    public T pop(){
        T result=top.item;
        if(!top.end()){
            top=top.next;
        }
return result;
    }
    public T top(){
        T result=top.item;
        return result;

    }
    public static void main(String[] args){
        MyStack<Integer> objectMyStack = new MyStack<>();
        System.out.println("输入你想进行操作的序号");
        System.out.println("1:入栈");
        System.out.println("2:出栈");
        System.out.println("3:返回栈顶元素");
        int num,s;
        Scanner scanner= new Scanner(System.in);

        //num=scanner.nextInt();
        while(scanner.hasNext()){
        num= scanner.nextInt();
        if(num==1){
           int num1=scanner.nextInt();
           objectMyStack.push(num1);

        }
        if(num==2){
            s=objectMyStack.pop();

                System.out.println(s);
        }
        if(num==3){
            System.out.println(objectMyStack.top());
        }

        }
        scanner.close();
    }
}
