package jeujava;

import java.util.ArrayList;
import java.util.Scanner;

public class Playable extends Individual{
	
	
	public Playable(String name) {
		super(name);
		this.name = name;
                this.setLevel(1);
		this.setLife(5);
	}
        
        @Override
	public String getRaw() {
		return "p";
	}
        public void respawn(){
            if(hp <= 0){
                map.initMap(this);
                map.showMap();
                this.life--;
            }
        }
	public void interact(CellContent content){
		
		if (content.getIsDropable() == true){
			if (content instanceof Item){ //On s'assure que content est bien un item 
				bag.add((Item)content); // cast safe
			}
		}
		
		if (content.getIsExit() == true){
			map.UpLevel();
			map.showMap();
		}
		
		if (content.getIsTrap() == true){
			System.out.println("It's a trap !"); 
		}
		
		if (content.getIsObstacle() == true){
			System.out.println("I can't walk through this");
		}
		
		
	}
}
