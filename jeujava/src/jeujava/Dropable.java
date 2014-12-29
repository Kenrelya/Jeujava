package jeujava;

public class Dropable extends CellContent {

	boolean isDropable;
	
	Dropable(boolean isDropable){
		this.isDropable = isDropable;
	}
	
	public String getRaw() {
		if(isDropable == true){
		return "d";
		}
		return " ";
	}

}
