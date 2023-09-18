

public class linkedlist {
    public static class Node{
        int data;
        Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
    }

    public static Node head;
    public static Node tail;
    public static int size;;
    public void addfirst(int data){
        size++;
        // Create a new node
        Node newnode = new Node(data);

        // if this node is the first element then it acts as both head and tail
        if (head==null){
            head = tail = newnode;
            return;
        }

        //point the first element of the node
        newnode.next = head;
        
        // make the new node as the forst element
        head = newnode; 

    }

    public void addlast(int data){
        size++;
        // Create a new node
        Node newnode = new Node(data);

        if (head==null){
            head = tail = newnode;
        }

        // next of tail points to newnode
        tail.next = newnode;

        //newnode is the new tail
        tail = newnode;

    }

    public void addmid(int index,int data){
        if (index == 0 ){
            addfirst(data);
            return;
        }
        else if (index == size){
            addlast(data);
            return;
        }
        size++;
        int i = 0;
        Node temp = head;
        while(i<index-1){

            //traversing
            i++;
            temp=temp.next;
        }
            //creating new Node
            Node newnode = new Node(data);

            //newnode points the next element
            newnode.next= temp.next;

            // previous element points to the newnode;
            temp.next= newnode;
            
        
    }
    public void removefirst(){
        if (size==0){
            System.out.println("Nothing to remove, Linked list is empty ");
            return;
        }
        else if (size==1){
            size--;
            System.out.println(head.data+"Removed, Linked list is now empty");
            head= tail =null;
            return;
        }
        size--;
        System.out.println(head.data+" Removed");
        head = head.next;
    }
    public void removelast(){
         if (size==0){
            System.out.println("Nothing to remove, Linked list is empty ");
            return;
         }
         else if (size==1){
            size--;
            System.out.println(head.data+"Removed, Linked list is now empty");
            head= tail =null;
            return;
        }
        Node ptr=head;
        while(ptr.next!=tail){
            ptr=ptr.next;
        }
        System.out.println(tail.data+" removed");
        tail = ptr; 
        ptr.next=null;
        size--;
        
    }
    public int search(int data){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if (temp.data==data)
            return i;
            i++;
            temp=temp.next;
        }
        return -1;
    }
    public void print(){
        if (head==null){
            System.out.println("Null");
            return;
        }

        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]){
        linkedlist ll = new linkedlist();
        ll.print();
        ll.removefirst();
        ll.removelast();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.print();
        ll.removefirst();
        ll.addlast(4);
        ll.addlast(5);
        ll.print();
        ll.removelast();
        ll.print();
        int search = ll.search(1);
        System.out.println("Element found at "+search);
        ll.addmid(2, 9);
        ll.print();
        ll.addmid(0, 0);
        ll.print();
        ll.removelast();
        ll.print();
        System.out.println(ll.size);
        int search2 = ll.search(10);
        System.out.println("Element found at "+search2);
    }

}
