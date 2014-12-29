package jeujava;

import java.util.*;

public class Individual {
	
	public Individual(String name) {
		//super();
		this.name = name;
		
		
	}

	protected Map map;
	protected String name;
	protected int hp;
	protected int hpMax;
	protected int level;
	protected ArrayList <Item> bag;
	protected int attack;
	protected int defense;
	protected int life;
	
	
	public String getName() {
		
		
		return this.name;
	}
	
	public int getHpMax(){
		return this.hpMax;
	}
	
	public void setHpMax(int hpMax){
		
		this.hpMax = hpMax;
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
		
		if (hp == 0){
			position.setX(5);
			position.setY(5);
			hp = hpMax; 
		}
		
	}
	
	public void attack(Individual ind){
		
		ind.hp -= (this.attack - ind.defense);
	}
	
	public void defense(){
		this.defense = defense+5;
	}
	
	public void resetHP(){
		this.hp = this.hpMax;
	}
	
	
	
	
	
	
	
	public void run(){}
	public void fly(){}
	public void swim(){}
	
	
	public void main(){
		
		
		
	}
	
	
}

 