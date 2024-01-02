

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}



class BasicOpration{
    public static class LL{
    static Node head=null;
    static Node tail=null;
    int size=0;

    void insertAtHead(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(temp==null){
           head=newNode;
           tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    void insertAtTail(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(temp==null){
           head=newNode;
           tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
       
    }

    void insertAtIndex(int index,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int s=size();
        if(index<0){
            System.out.println("Invalid input");
            return;
        }
        if(index>s){
            System.out.println("Invalid");
            return;
        }
        for(int i=0;i<index-1;i++){
          temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    int size(){
         Node temp=head;
         int count=0;
        while(temp!=null){
            count++;
            size++;
            temp=temp.next;
        }
        return count;
    }

    int getElement(int index){
        Node temp=head;
       for(int i=1;i<=index;i++){
        temp=temp.next;
       }
        return temp.data;
    }

    void deleteAtindex(int index){
        Node temp=head;
        for(int i=1;i<=index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        tail=temp; // if delete last node
        size--;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
    }
}
    public static void main(String[] args) {
        LL list=new LL();
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtIndex(1, 5);
        list.display();
        System.out.println();
       // System.out.println(list.getElement(1));
       list.deleteAtindex(1);
        System.out.println(list.size());
    }
}

