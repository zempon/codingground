/**
 * The entire point of this class is to make items that
 * the user can pick up during the dungeon and 
 * use.
 * @author Nick
 *
 */
public class Item {
	private String description;
	private String name;
	
	public void Describe(String title, String desc){
		name = title;
		description = desc;	
	}
	
	public String getName(){
		return name;
	}
	public String getDescription(){
		return description;
	}
	
	public String toString(){
		return "Name :" + name + "Description: " + description;
	}
	
	
}
