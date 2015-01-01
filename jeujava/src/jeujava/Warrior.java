package jeujava;

public class Warrior extends Playable {
	
	public Warrior(String name) {
		super(name);
		this.name = name;
                this.setAttack(20);
                this.setDefense(10);
                this.setHp(35);
                this.setHpMax(35);
                this.setLife(5);
	}
}
