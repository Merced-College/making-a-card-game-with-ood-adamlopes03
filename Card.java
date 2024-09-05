// Andres Garcia
// Adam Lopes
// Samantha Castillo
// 5 September 2024

public class Card {
    private String suit;
    private String rank;
    private int value;

    // Constructors for Card class
    public Card(int value, String suit, String rank) {
        this.value = value;
        this.suit = suit;
        this.rank = rank;
    }
    // returns suit of the card
    public String getSuit() {
        return suit;
    }
    // returns the rank of the card
    public String getRank(){ 
        return rank; 
    }
    //returns the cards value
    public int getValue(){
        
        return value;
    }

    public int getValue(int playerTotal){
        if (playerTotal >= 11 && value == 11) {
            value = 1;
        }
        return value;
    }

    //toString or print
    public String toString(){
        return "Card value: " + value + ", card suit: " + suit + ", card rank: " + rank;
    }

    // sets the suit of the card
    public void setSuit(String suit){
        this.suit = suit;
    }

    // sets the rank of the card
    public void setRank(String rank){
        this.rank = rank;
    }

    // sets the value of the card
    public void setValue(int value){
        this.value = value;
    }

}