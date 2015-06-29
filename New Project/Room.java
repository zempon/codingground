import java.util.*;
public class Room{ 
	public boolean hasCharacter;
	private boolean infested = false;
	private boolean hasItem = false;
	public boolean inhabited;
	private Item heldItem;
	Scanner input = new Scanner(System.in); // Scanner lets you take in data
	/** All of these 
	 * All of these are placed to check what directions the character can move in.
	 */
	private boolean wWall = false;
	private boolean eWall = false;
	private boolean nWall = false;
	private boolean sWall = false;
	private monster Monster;
	
	
	public Room(boolean n, boolean e, boolean w, boolean s){
		nWall = n;
		wWall = w;
		sWall = s;
		eWall = e;
	}
	
	public void addMonster(){
		System.out.println("What monster do you want to add: [G]oblin");
		String mon = input.nextLine();
		if (mon.equals("g")){
			Monster = new Goblin();
		}
	}
	
	public void setMonster(monster type){
		Monster =  type;
	}
	
	public void setItem(Item item){
		item = heldItem;		
	}
	
	public void canMove(){
		System.out.print("You can move: ");
		if (nWall = (true)){
			System.out.print("north ");
		}
		if (eWall = (true)){
			System.out.print("east ");
		}
		if (sWall = (true)){
			System.out.print("south ");
		}
		if (wWall = (true)){
			System.out.print("west");
		}
		System.out.println(".");
	}
	
	public boolean northWall(){
		return nWall;
	}
	
	public boolean eastWall(){
		return eWall;
	}
	
	public boolean southWall(){
		return sWall;
	}
	
	public boolean werWall(){
		return wWall;
	}
	
	public boolean has(){
		return hasItem;
	}
	
	
	public boolean inhabited(){
		return inhabited;
	}
	
	public void changeInhabited(boolean change){
		inhabited = change;
	}
}
