package jeujava;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public void intro(){
		
	}
	
	public static void main(String[] args) throws IOException {
		Map map = new Map();
		Playable player = createCharacter(map);
                player.getBag().add(new Potion());
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		map.initMap(player); 
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\t\t\t\t QUEST OF "+player.getName()+"™\n\n\n\n\n\n");
		while(true){ //BOUCLE QUI RAFRAICHIS LA MAP
                    
                    sc.nextLine();
                    map.showMap();
                    System.out.println("Health : " +player.getHp()+ "/" +player.getHpMax());
                    System.out.println("Life : " +player.getLife());
                    String str = sc.next();
                    if(str.equals("i")){
                        showInventory(player);
                    }
                    else if(str.equals("z")){
                        player.goUp();
                    }
                    else if(str.equals("d")){
                        player.goRight();
                    }
                    else if(str.equals("s")){
                        player.goDown();
                    }
                    else if(str.equals("q")){
                        player.goLeft();
                    }
                     
                }
		//combat(map, player, enemy);
	}
	
	public static Playable createCharacter(Map map){
		
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
            
            if(str.equals("warrior")){
                player = new Warrior(nameCharacter);
            }
            else if(str.equals("mage")){
                player = new Mage(nameCharacter);
            }
            else 
                player = new Hunter(nameCharacter);
            

            player.setMap(map);
            player.resetHP();

            System.out.println("Hello " +str+ " " +nameCharacter+" your quest is about to begin, press enter to continue" );
            return player;
	}

	public static void combat(Map map, Playable player, Enemy enemy){
		String str;
		
		System.out.println("A fight is about to begin");
		do{
			do{
				Scanner sc = new Scanner(System.in);
                                System.out.println("HP Hero :"+player.getHp()+"/"+player.getHpMax());
				System.out.println("Do you want to attack, defend youself (defense) or flee ?");
				str = sc.next();
			}while(!str.equals("attack") && !str.equals("defense") && !str.equals("flee"));
		
                    switch (str) {
                        case "attack":
                            player.attack(enemy);
                            System.out.println("HP "+enemy.name+" "+enemy.getHp()+" /"+enemy.getHpMax());
                            break;
                        case "defense":
                            player.defense();
                            System.out.println("You defend youself");
                            break;
                    }
			//clear
			if (enemy.hp >0){
				enemy.action(player);
			}
		}while(enemy.hp > 0 && player.hp > 0 && !str.equals("flee"));
		
		if(enemy.hp <= 0){
			System.out.println("The fight is over, you win");
                        map.showMap();
                        
		}
		
		else if(player.hp <= 0){
			System.out.println("You've lost this fight. You will respawn");
                        player.respawn();
                        
		}
		
		else 
			System.out.println("Run coward");
                        map.showMap();
                        
                        
                                
		
	}
        
        public static void showInventory(Playable player){
            
            Scanner sc = new Scanner(System.in);
            
            for(Item elem: player.getBag()){
              System.out.println (elem.getName());
            }
        }
        
        public static void goUp(Playable player){
            
        }
}