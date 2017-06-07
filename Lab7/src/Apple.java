
public class Apple implements GameThing, Edible {
	public String getName(){
		return "A Macintosh apple.";
	}
	public String getDescription(){
		return "The apple is red and glossy, as if it were picked recently.";
	}
	public void eat(){
		System.out.println("The apple is crisp and juicy.");
		AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theApple);
	}

}
