
package gamee;

public class Gamee {

    
    public static void main(String[] args) {
        //buat objek
        Player hero = new Player();
        Player villain = new Player();
       
        
        hero.name = "koi";
        hero.Speed = 70;
        hero.healthPoint = 90;
        hero.damage = 40;
        hero.armor = 55;

        hero.run();
        hero.attack();
        hero.defense();
        hero.tack();
//        villain.runn();
//        villain.serang();
//        villain.tahan();

       
        if(hero.isDead()){
            System.out.println("Game over :p ");
        }
        
            
        if (hero.point()){
            System.out.println("warning your defense is low");
            System.out.println("you buyed gold weapons");
        }
        if (hero.trying()){
            System.out.println("Keep going");
        }
        if (hero.tack()){
            System.out.println("Warning, your attack is low. Buy some weapons");
            System.out.println("You buyed purple sword");
            
        }
        
        System.out.println("New Enemy is coming ...  ");
         villain.nama = "Alice";
        villain.speed = 70;
        villain.damage = 90;
        villain.armor = 80;
        villain.healthvillainpoin = 90;
        
        villain.runn();
        villain.serang();
        villain.tahan();
        
       
        if(villain.poin()){
            System.out.println("Enemy's dead");
            System.out.println("Victory");
        }
        if(villain.hidup()){
            System.out.println("Enemy's alive");
            System.out.println("TIme out");
            System.out.println("Defeat");
        }
        
        }
        
}
