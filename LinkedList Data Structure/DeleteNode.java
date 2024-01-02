
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

public class DeleteNode {
    static class LL{
      int size=0;
      Node deleteNthNode(Node head,int n){ //1st way
       Node temp=head;
       while(temp!=null){
        size++;
        temp=temp.next;
       }
       int m=size-n+1;
       temp=head;
       for(int i=1;i<=m-1;i++){
        temp=temp.next;
       }
       return temp;
     }

      Node delete(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
     }

     void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
    }
}
    public static void main(String[] args) {

        LL list=new LL();
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //Node temp=list.deleteNthNode(a, 3);
        Node temp=list.delete(a, 2);
        list.display(temp);
    }
}
