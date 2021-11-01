package bridgeLabz.Java.Practice;
import java.util.Scanner;

public class StackAndQueueMenu {

	 public static void main(String[] args) {
	        System.out.println("Welcome to the stack and queue program");
	        Operation operation = new Operation();
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Press 1 to add element at the start \n" + 
	        					"Enter 2 to show the peek element\n" +
	        					"Enter 3 to show the pop \n" +"Enter 4 to queue the element \n" 
	        					+"Enter 5 to dequeue the element");
	            switch (scanner.nextInt()) {
	                case 1:
	                    operation.addElement();
	                    break;
	                case 2:
	                    operation.peek();
	                    break;
	                case 3:
	                    operation.pop();
	                    break;
	                case 4:
	                    operation.queueElement();
	                    break;
	                case 5:
	                    operation.dequeueElement();
	                    break;
	            }
	            scanner.close();
	   }
}