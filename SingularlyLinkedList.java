package dsa12;

public class SingularlyLinkedList<E>{
	private static class Node<E>{
		private E element;
		private Node<E> next;
		public Node(E e, Node<E> n){
			element = e;
			next = n;
		}
		public E getelement(){return element;}
		public Node<E> getNext(){return next;}
		public void setNext(Node<E> n ){next = n;}
	}


	public class SinglyLinkedList<E>{
		private Node<E> head = null;
		private Node<E> tail = null;
		private int size = 0;
		public SinglyLinkedList(){}
		//access method
		//----R-3.9
		public int size(){return size;}
		public boolean isEmpty(){return size==0;}
		public E first(){
			if (isEmpty()) return null;
			return head.getelement();
		}
		public E last(){
			if (isEmpty()) return null;
			return tail.getelement();
		}
		//update methods
		public void addfirst(E e) {
			head = new Node<>(e,head);
			if(size == 0)
				tail = head;
			size++;
		}
		public void addLast(E e){
			Node<E> newest = new Node<>(e,null);
			if(isEmpty())
				head = newest;
			else
				tail.setNext(newest);
			tail = newest;
			size++;
			System.out.println(newest);
		}
		public E removeFirst(){
			if(isEmpty()) return null;
			E answer=head.getelement();
			head = head.getNext();
			size--;
			if(size==0){
				tail = null;
			}
			return answer;
		}
	}


	public String size() {
		// TODO Auto-generated method stub
		return null;
	}


	public void addLast(String string) {
		// TODO Auto-generated method stub
		
	}

}
