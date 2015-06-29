import java.util.*;
public class Combat {
	Random rando = new Random();
	private int attack;
	private int evade;
	
	public Combat(int x, int y){
		attack = x;
		evade = y;
	}
	
	public boolean attack(){
		int total = rando.nextInt(attack);
		return total > 4;
	}
	
	public boolean dodge(){
		int total = rando.nextInt(evade);
		return total > 4;
	}
	/**
	 * Sets up a constructer to hurt a being.
	 */
	public void attacked(int damage){
		
	}
	
	public void setAttack(int change){
		this.attack = change;
	}
	
	public void setEvade(int change){
		this.evade = change;
	}
	
}
