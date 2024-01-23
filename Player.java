
package gamee;


public class Player {
    
    //atribut
    String name, nama;
    int Speed, healthPoint, damage, armor, villain, speed, healthvillainpoin;
    
    //method
    void run(){
        System.out.println(name + " is running ... ");
        System.out.println("Speed " + Speed);
        
    }
    void runn(){
        System.out.println(nama + " is running ... ");
        System.out.println("Speed " + speed);
        
    }
    void attack(){
        System.out.println(name + " is attacking ... ");
        System.out.println("damage " + damage);
    }
    void serang(){
        System.out.println(nama + " is attacking ... ");
        System.out.println("damage " + damage);
    }
    void defense(){
        System.out.println(name + " is defending ... ");
        System.out.println("armor " + armor);
    }
    void tahan(){
        System.out.println(nama + " is defending ... ");
        System.out.println("armor " + armor);
    }
    
    boolean isDead(){
       if(healthPoint<=0) return true;
       return false;
    
    }
    boolean point(){
        if(armor<50) return true;
        return false;
    }
    
    boolean trying(){
        if(healthPoint>70) return true;
        return false;
    }
    
    boolean tack(){
        if(damage<50) return true;
        return false;
    }
    boolean poin(){
        if(healthvillainpoin<=0) return true;
        return false;
    }
    boolean hidup(){
        if(healthvillainpoin>0) return true;
        return false;
    }
    
}
