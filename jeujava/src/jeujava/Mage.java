package jeujava;

public class Mage extends Playable {
	
	public Mage(String name) {
		super(name);
		this.name = name;
                this.setAttack(30);
                this.setDefense(5);
                this.setHp(30);
                this.setHpMax(30);
                this.setLife(5);
	}

}