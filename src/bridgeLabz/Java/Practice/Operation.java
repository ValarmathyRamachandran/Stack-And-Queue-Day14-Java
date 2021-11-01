package bridgeLabz.Java.Practice;

public class Operation {
    public StackAndQueueList addElement() {
        StackAndQueueList stackList =new StackAndQueueList();
        stackList.push(70);
        stackList.push(30);
        stackList.push(56);

        stackList.display();
        return stackList;
    }

    public void peek(){
    	StackAndQueueList stackList =new StackAndQueueList();
        stackList.push(70);
        stackList.push(30);
        stackList.push(56);
        stackList.peek();
    }

    public void pop(){
        System.out.println("Before Pop:");
        StackAndQueueList stackList =addElement();
        stackList.pop();
        System.out.println("");
        System.out.println("After Pop:");
        stackList.display();
    }

    public void queueElement() {
    	StackAndQueueList stackList =new StackAndQueueList();
        stackList.queue(56);
        stackList.queue(30);
        stackList.queue(70);
        stackList.display();
        System.out.println("");
        stackList.peek();
    }

    public void dequeueElement(){
        queueElement();
        pop();
    }
}