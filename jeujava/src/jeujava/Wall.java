package jeujava;

public class Wall extends Obstacle{
	
	boolean isVertical;
	
	public Wall(boolean isVertical){
		this.isVertical = isVertical;
	}
	
	public String getRaw(){
		if (isVertical == true){
			
			return "|";
		}
		
		return "�";
	}
	

}
