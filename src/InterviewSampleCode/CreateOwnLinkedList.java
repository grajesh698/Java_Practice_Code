package InterviewSampleCode;

public class CreateOwnLinkedList {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
	}

	public void PrintData() {
		Node current = head;
		if (head == null) {
			System.out.println("Linked List is empty");
			return;
		}
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		CreateOwnLinkedList createOwnLinkedList = new CreateOwnLinkedList();
		createOwnLinkedList.addNode(0);
		createOwnLinkedList.addNode(2);
		createOwnLinkedList.addNode(3);
		createOwnLinkedList.addNode(1);
		createOwnLinkedList.addNode(4);
		
		createOwnLinkedList.PrintData();
	}
}