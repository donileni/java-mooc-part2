package asteroids;

import java.util.Random;
import javafx.scene.shape.Polygon;

public class Asteroid extends Character {
    
    private double rotationalMovement; 
    
    public Asteroid(int x, int y) {
        super(new PolygonFactory().createPolygon(), x, y);
        
        Random rnd = new Random(); 
        
        super.getCharacter().setRotate(rnd.nextInt(360));
        
        int accelerationAmmount = 1 + rnd.nextInt(10); 
        for (int i = 0; i < accelerationAmmount; i++){
            accelerate(); 
        }
        
        this.rotationalMovement = 0.5 - rnd.nextDouble();  
    }
    
    public void move(){
        super.move();
        super.getCharacter().setRotate(super.getCharacter().getRotate() + rotationalMovement);
    }
}
