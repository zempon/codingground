import java.util.*;
import java.util.Scanner;
public class Arena {
	Scanner input = new Scanner(System.in); // Scanner lets you take in data
	Character person;
	monster enemy;
	public Arena(Character bob, monster evil){
		person = bob;
		enemy = evil;
	}
	
	public void setFight(){
		int count = 0;
		while (person.getHealth() >0 && enemy.getHealth()>0){
			System.out.println(person);
			System.out.println(enemy);
			System.out.println("Round " + count);
			if (person.attack()){
				enemy.attacked(1);
			}
			if (enemy.attack()){
				person.attacked(1);
			}
			
			if (person.getHealth() > 0){
				System.out.println("Person wins");
			}else if (enemy.getHealth() > 0){
				System.out.println(enemy.getName() + "wins");
			}else{
				System.out.println("Both died in a tragic accident");
			}
		}
		
		
		
	}
}
