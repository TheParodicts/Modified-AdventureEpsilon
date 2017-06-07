
public class Book implements GameThing, Readable, Openable{
	 public boolean isOpen = false; 
	public String getName()

    {

          return "A dusty old book";

    }

    public String getDescription()

    {
    	if(isOpen){
    		System.out.print("The book is open and whispering. ");
    	}
    	else System.out.print("The book is closed. ");

          return "It appears to be old and dusty. It's also quite heavy.";

    }
    public void read(){
    	if(!isOpen){
    	System.out.println( "The cover reads 'Ohgma Infinium'.");
    	}
    	else System.out.println("The pages are scribbled with odd symbols.");
    }
    public void open(){
    	if(!isOpen){
    	System.out.println("The odd symbols on the pages seem to whisper something.");
    	isOpen=true;
    	}
    	else{
    		System.out.println("The book is already open and alive.");
    	}
    }
    public void close(){
    	if(isOpen){
    	System.out.println("The whispers are stifled by the thud of the book as it closes.");
    	isOpen=false;
    	}
    	else{
    		System.out.println("The book is already shut and quiet.");
    	}
    }
}
