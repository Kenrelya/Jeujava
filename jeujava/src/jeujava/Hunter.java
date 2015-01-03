package jeujava;

public class Hunter extends Playable {
	
	public Hunter(String name) {
		super(name);
		this.name = name;
                this.setAttack(20);
                this.setDefense(7);
                this.setHp(40);
                this.setHpMax(40);
                this.setLife(5);
	}

}