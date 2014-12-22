package jeujava;

import java.util.*;

public class Individual {
	
	public Individual(String name) {
		//super();
		this.name = name;
	}


	private String name;
	private int hp;
	private int level;
	private ArrayList <Item> bag;
	private int attack;
	private int defense;
	private int life;
	
	
	public String getName() {
		
		
		return this.name;
	}
	
	
	public int getHp(){
		
		return this.hp;
	}
	
	public void setHp(int hp){
		
		this.hp = hp;
	}
	
	public int getLevel(){
		
		return this.level;
	}
	
	public void setLevel(int level){
		
		this.level = level;
	}
	
	public int getAttack(){
		
		return this.attack;
	}
	
	public void setAttack(int attack){
		
		this.attack = attack;
	}
	public int getDefense(){
		
		return this.defense;
	}
	
	public void setDefense(int defense){
		
		this.defense = defense;
	}
	public int getLife(){
		
		return this.life;
	}
	
	public void setLife(int life){
		
		this.life = life;
	}
	public ArrayList<Item> getBag(){
		
		return this.bag;
	}
	
	public void setBag(ArrayList<Item> bag){
		
		this.bag = bag;
	}
	
	
	public void respawn(Location position){
		
	}
	
	public void walk(Cell cell){
		
	}
	
	public void interact(CellContent content){
		
	}
	
	
	
	public void run(){}
	public void fly(){}
	public void swim(){}
	
	
	public void main(){
		
		
		
	}
	
	
}

 