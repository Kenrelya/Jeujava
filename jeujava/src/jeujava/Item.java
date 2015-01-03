package jeujava;

public abstract class Item extends Dropable{
	
	
	protected String name;
	private String color;
	private Individual owner;

  
	
	public String getRaw(){
            return Printer.getStringColored("I", Color.PURPLE);
	}
	
	public String getName(){
		
		return this.name;
	}
	
	public void setName(String name){
		
		this.name = name;
	}
	
	public String getColor(){
		
		return this.color;
	}
	
	public void setColor(String color){
		
		this.color = color;
	}
	
	public Individual getOwner(){
		
		return this.owner;
	}
	
	public void setOwner(Individual owner){
		
		this.owner = owner;
			
	}
}