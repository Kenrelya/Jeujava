package jeujava;

import java.util.ArrayList;
import java.util.Scanner;

public class Playable extends Individual{
	
        
	public Playable(String name) {
		super(name);
		this.name = name;
                this.setLevel(1);
		this.setLife(5);
                this.position = new Location(3,3);
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
        
        public void goLeft(){
            int currentX = this.position.getX();
            int nextX = this.position.getX()-1;
            int currentY = this.position.getY();
            
            if(this.map.cell[nextX][currentY].getContent() instanceof Floor){
                if(nextX > 0){
                    this.position.setX(nextX);
                }

                CellContent floor = this.map.cell[nextX][currentY].getContent();
                this.map.cell[nextX][currentY].setContent(this);
                this.map.cell[currentX][currentY].setContent(floor);
            }
        }
        
        public void goRight(){
            int currentX = this.position.getX();
            int nextX = this.position.getX() +1;
            int currentY = this.position.getY();
            
            if(this.map.cell[nextX][currentY].getContent() instanceof Floor){
                if(nextX < 100){
                    this.position.setX(nextX);
                }
                
                CellContent floor = this.map.cell[nextX][currentY].getContent();
                this.map.cell[nextX][currentY].setContent(this);
                this.map.cell[currentX][currentY].setContent(floor);
            }
        }
        
        public void goUp(){
            int currentX = this.position.getX();
            int nextY = this.position.getY() -1;
            int currentY = this.position.getY();
            
            if(this.map.cell[currentX][nextY].getContent() instanceof Floor){
                if(currentY > 0){
                    this.position.setY(nextY);
                }
                
                CellContent floor = this.map.cell[currentX][nextY].getContent();
                this.map.cell[currentX][nextY].setContent(this);
                this.map.cell[currentX][currentY].setContent(floor);
            }
        }
        
        public void goDown(){
            int currentX = this.position.getX();
            int nextY = this.position.getY() +1;
            int currentY = this.position.getY();
            
            if(this.map.cell[currentX][nextY].getContent() instanceof Floor){
                if(currentY < 30){
                    this.position.setY(nextY);
                }
                
                CellContent floor = this.map.cell[currentX][nextY].getContent();
                this.map.cell[currentX][nextY].setContent(this);
                this.map.cell[currentX][currentY].setContent(floor);
            }
        }
        
        public void setMap(Map map){
            this.map = map;
        }
}