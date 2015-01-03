package jeujava;

import java.util.ArrayList;

public abstract class CellContent{
	
        private ArrayList<Item> bag;
        private Map map;
        protected Cell cell;
        

        
	public abstract String getRaw();
	
        public abstract void interact(Playable player);/*{
		
		
                else if (this.getIsTrap() == true){
			System.out.println("It's a trap !"); 
		}
		
                else if (this.getIsObstacle() == true){
			System.out.println("I can't walk through this");
		}
                
                else
                    System.out.println("nothing's here");
	}*/
        
        public Cell getCell(){
            return this.cell;
        }
        
        public void setCell(Cell cell){
            this.cell = cell;
        }
}