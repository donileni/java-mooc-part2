
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand; 
    
    public Hand(){
        this.hand = new ArrayList<>(); 
    }
    
    public void add(Card card){
        this.hand.add(card); 
    }
    
    public void print(){
        for (Card card : hand){
            System.out.println(card);
        }
    } 
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
//    public void sortBySuitInValueOrder(){
//        Collections.sort(hand, new BySuitInValueOrder());
//    }
    
    public void sortBySuit(){
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
    
    public int compareTo(Hand otherHand){
        int thisHandValue = this.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, ((a,b) -> a + b));
        int otherHandValue = otherHand.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, ((a,b) -> a + b));
        
        return thisHandValue - otherHandValue; 
    }
}
