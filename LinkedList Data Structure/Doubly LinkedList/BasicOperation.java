public class BasicOperation {

   static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }

    static class DLL{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtHead(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                newNode.next=head;
                head.prev=newNode;
                head=newNode;
            }
        }

        void insertAtTail(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
            }
        }

        void insertAtIndex(int index,int data){
            Node newNode=new Node(data);
            Node temp=head;
            for(int i=1;i<=index-1;i++){
                temp=temp.next;
            }

            newNode.next=temp.next;
            temp.next=newNode;
        }

        int getElemnetAtIndex(int index){
         Node temp=head;
         if(index<0){
            System.out.println("invalid index");
         }
         if(index>size){
            System.out.println("Invalid index");
         }
         for(int i=1;i<=index;i++){
            temp=temp.next;
         }
         return temp.data;
        }

        void deleteAtIndex(int index){
            Node temp=head;
            for(int i=1;i<=index-1 && temp!=null;i++){
                temp=temp.next;
            }
            if(temp.next!=null && temp.prev!=null && temp!=null){
            temp.next=temp.next.next;
            temp.next.prev=temp;
            }
           
            //temp.next.prev=null;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                size++;
                System.out.print(" "+temp.data);
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        list.insertAtTail(6);
        list.insertAtTail(7);
        // list.insertAtIndex(2, 5);
         list.display();
        // System.out.println();
        //  System.out.println(list.getElemnetAtIndex(3));
        list.deleteAtIndex(3);
        System.out.println();
        list.display();
    
       
    }
}
