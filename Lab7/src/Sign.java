public class Sign implements GameThing, Readable, Edible
{
	public String getName()
	{
		return "A chocolate sign";
	}
	public String getDescription()
	{
		return "This is a small sign made entirely out of milk chocolate. There seems to be some partially melted writing in it.";
	}
	public void read(){
		System.out.println("You can see the following message: \"Hershey was here!\"");
	}
	public void eat(){
		System.out.println("The sign melts in your mouth, with a creamy caramel center.");
		AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theSign);
	}
}
