package jeujava;

import java.io.Console;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public void intro(){
		
	}
	
	public static void main(String[] args) throws IOException {
		Map map = new Map();
		Playable player = createCharacter();
		Enemy enemy = new Enemy("Monster");
		enemy.setHp(100);
		enemy.setAttack(10);
		enemy.setDefense(10);
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		map.initMap(); //CRÉER UNE BOUCLE POUR RAFRAICHIR LA MAP A CHAQUE MOUVEMENT
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\t\t\t\t QUEST OF "+player.getName()+"™\n\n\n\n\n\n");
		map.createMap();
		System.out.println("Health : " +player.getHp()+ "/" +player.getHpMax());
		System.out.println("Life : " +player.getLife());
		
		combat(player, enemy);
	}
	
	public static Playable createCharacter(){
		
		Scanner sc = new Scanner (System.in);
		Playable player;
		int hp;
		String str;
		do {
				System.out.println("Choose your hero between Warrior, Mage and Hunter : (type warrior mage or hunter)");
				str = sc.next();
		}while(!str.equals("warrior") && !str.equals("mage") && !str.equals("hunter"));
		
		System.out.println("Choose your name character");
		String nameCharacter = sc.next();
		if (str.equals("warrior"))
		{
			player = new Warrior(nameCharacter); 
			player.setHpMax(75);
			player.setAttack(20);
			player.setDefense(10);
			
		}
		
		else if  (str.equals("mage"))
		{
			 player = new Mage(nameCharacter);
			 player.setHpMax(50);
			 player.setAttack(30);
			 player.setDefense(5);
		}
		
		else 
		{
			 player = new Hunter(nameCharacter);
			 player.setHpMax(60);
			 player.setAttack(20);
			 player.setDefense(7);
		}
		
		 player.setLevel(1);
		 player.setLife(5);
		 player.setBag(new ArrayList<Item>());
		 player.resetHP();
		 
		 System.out.println("Hello " +str+ " " +nameCharacter+" your quest is about to begin, press enter to continue" );
		 return player;
	}

	public static void combat(Playable player, Enemy enemy){
		//A FAIRE 
		String str;
		
		System.out.println("A fight is about to begin");
		do{
			do{
				Scanner sc = new Scanner(System.in);
				System.out.println("Do you want to attack, defend youself (defense) or flee ?");
				str = sc.next();
			}while(!str.equals("attack") && !str.equals("defense") && !str.equals("flee"));
		
			if(str.equals("attack")){
				player.attack(enemy);
	
				
			}
			
			else if(str.equals("defense")){
				player.defense();
				
			}
			//clear
			System.out.println("HP enemy : "+enemy.getHp());
			System.out.println("HP hero : "+player.getHp()+"/"+player.getHpMax());
			if (enemy.hp >0){
				enemy.action(player);
			}
		}while(enemy.hp > 0 && player.hp > 0 && !str.equals("flee"));
		
		if(enemy.hp <= 0){
			System.out.println("The fight is over, you win");
		}
		
		else if(player.hp <= 0){
			System.out.println("You've lost this fight. You will respawn");
		}
		
		else 
			System.out.println("Run coward");
		
	}
}