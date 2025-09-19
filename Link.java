package CS210;

public class Link{
	
	public int data; //holds the value stored in the node
	public Link next; //Link next Holds the reference to the next node in the link
	public Link previous;
	
	public Link(int datain)
	{
		
		data=datain; //Initialices the node with the given data
	}
	
	
	public void displayLink() {
        System.out.print(data + " ");
    }
	
}
//The next reference is simplicitly set to null by java, as no link is assigned during construction