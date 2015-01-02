package jeujava;

public class Dropable extends CellContent {

	boolean isDropable;
	
	
	@Override
	public String getRaw() {
		if(isDropable == true){
		return "d";
		}
		return " ";
	}

}
