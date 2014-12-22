package jeujava;

public class Cell extends Map{
	
	private Location position;
	private CellContent content;
	
	public Location getPosition(){
		
		return this.position;
	}
	
	public void setPosition(Location position){
		
		this.position = position;
	}
	
	public CellContent getContent(){
		
		return this.content;
	}
	
	public void setContent(CellContent content){
		
		this.content = content;
	}

}
