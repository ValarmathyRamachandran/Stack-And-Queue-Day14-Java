package bridgeLabz.Java.Practice;
public class StackAndQueueList {
	
	Node head;
    Node tail;
    Node top;

    public Node push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node tempNode = head;
            this.head = newNode;
            newNode.next = tempNode;
        }
        top=head;
        return newNode;
    }

    public int peek(){
        System.out.println("Top element is "+this.top.data);
        return top.data;
    }

    public void pop() {
        Node temp =top;
        while (temp != null){
            Node tempNode = this.head;
            this.head = tempNode.next;
            temp=temp.next;
        }

    }

    public void queue(int data) {
        Node newNode=new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            top=head;
        } else {
            Node tempNode=tail;
            this.tail=newNode;
            tempNode.next=tail;
        }
    }

    public void display(){
        if (head == null) {
            System.out.println("Linked list is Empty");
            return;
        } else {
            System.out.print("\n The stack elements are ");
            Node tempNode = head;
            while (tempNode != null) {
                if(tempNode.next !=null) {
                    System.out.print(tempNode.data + " -> ");
                    tempNode = tempNode.next;
                }
                else {
                    System.out.print(tempNode.data);
                    tempNode=tempNode.next;
                }
            }
        }
    }
}
