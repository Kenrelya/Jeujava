/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jeujava;

import java.util.ArrayList;

/**
 *
 * @author Kenrelya
 */
public class Potion extends Item{

    public Potion() {
        this.name = "potion";
    }

    
    @Override
    public  String getName(){
		
		return this.name;
	}
    public void usePotion(Playable player){
        player.hp +=20;
    }
    
    public void throwPotion(ArrayList<Item> bag){
        bag.remove(this);
    }
}
