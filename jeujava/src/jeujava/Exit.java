package jeujava;

/**
 *
 * @author Kenrelya
 */
public class Exit extends CellContent{
    
    boolean isExit;
    
    Exit(boolean isExit){
		this.isExit = isExit;
	}
	
	public String getRaw() {
		if(isExit == true){
		return "E";
		}
		return " ";
	}
    
}