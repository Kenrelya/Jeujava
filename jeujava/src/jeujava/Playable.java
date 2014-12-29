package jeujava;

import java.util.ArrayList;
import java.util.Scanner;

public class Playable extends Individual{
	
	
	public Playable(String name) {
		super(name);
		this.name = name;
	}
	
	public void flee(){
		
	}
	public void interact(CellContent content){
		
		if (content.getIsDropable() == true){
			if (content instanceof Item){ //On s'assure que content est bien un item 
				bag.add((Item)content); // cast safe
			}
		}
		
		if (content.getIsExit() == true){
			map.UpLevel();
			map.createMap();
		}
		
		if (content.getIsTrap() == true){
			System.out.println("It's a trap !"); 
		}
		
		if (content.getIsObstacle() == true){
			System.out.println("I can't walk through this");
		}
		
		
	}
}
