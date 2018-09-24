package dsa12;
import dsa12.SingularlyLinkedList;

public class SIZE {
	public static void main(String[]args) {
		
			  //create a Singly Linked List object name "boxers"
			  SingularlyLinkedList<String> ob =
					  new SingularlyLinkedList<String>();
			  
			  ob.addLast("Marlboro");
			  ob.addLast("Furtune");
			  ob.addLast("Dallas");
			  
			  System.out.println("Size: " + ob.size());
		  }
	
}
