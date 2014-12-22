package jeujava;

import java.util.*;

public class Map {
	
	private int width;
	private int height;
	private ArrayList<Cell> cell;
	private int difficulty;
	public int level;
	
	public int getWidth(){
		
		return this.width;
	}
	
	public void setWidth(int width){
		
		this.width = width;
	}
	
	public int getHeight(){
		
		return this.height;
	}
	
	public void setHeight(int height){
		
		this.height = height;
	}
	
	public ArrayList<Cell> getCell(){
		
		return this.cell;
	}
	
	public void setCell(ArrayList<Cell> cell){
		
		this.cell = cell;
	}
	
	public int getDifficulty(){
		
		return this.difficulty;
	}
	
	public void setDifficulty(int difficulty){
		
		this.difficulty = difficulty;
	}
	
	public int getLevel(){
		
		return this.level;
	}
	
	public void setLevel(int level){
		
		this.level = level;
	}
	
}
