package jeujava;

public class River extends Obstacle {

	boolean isRiver;
	
	River(boolean isRiver){
		this.isRiver = isRiver;
	}
	public String getRaw() {
		if (isRiver == true){
			return "r";
		}
		return " ";
	}

}
