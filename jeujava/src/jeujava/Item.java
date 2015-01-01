package jeujava;

public class Item extends Dropable{
	
	
	private String name;
	private String color;
	private Individual owner;

    public Item(boolean isDropable) {
        super(isDropable);
    }
	
	public String getRaw(){
		return "i";
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
