package jeujava;

public abstract class CellContent{
	
	private Boolean isDropable;
	private Boolean isObstacle;
	private Boolean isTrap;
	private Boolean isExit;
	private Boolean isEntrance;
        private Boolean isPlayable;

	public abstract String getRaw();
	
	
	public Boolean getIsDropable(){
		
		return this.isDropable;
	}
	
	public void setIsDropable(Boolean isDropable){
		
		this.isDropable = isDropable;
	}
	
	public Boolean getIsObstacle(){
		
		return this.isObstacle;
	}
	
	public void setIsObstacle(Boolean isObstacle){
		
		this.isObstacle = isObstacle;
	}
	
	public Boolean getIsTrap(){
		
		return this.isTrap;
	}
	
	public void setIsTrap(Boolean isTrap){
		
		this.isTrap = isTrap;
	}
	
	public Boolean getIsExit(){
		
		return this.isExit;
	}
	
	public void setIsExit(Boolean isExit){
		
		this.isExit = isExit;
	}
	
	public Boolean getIsEntrance(){
		
		return this.isEntrance;
	}
	
	public void setIsEntrance(Boolean isEntrance){
		
		this.isEntrance = isEntrance;
	}

}
