class DeckOfCards
{
    public static void main(String[] args) 
    {
        int deck[] = new int[52];
        System.out.println("in business");
        String[] suits = {"spades", "hearts", "diamonds", "clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) 
        {   
            //intialize the deck
            deck[i] = i;
            
        }
        for (int i = 0; i < deck.length; i++) 
        {
            int index = (int) (Math.random() * deck.length);
            //starts to shuffle
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        for (int i = 0; i < 5; i++) 
        {
            //uses the random shuffle to dinamically grab random cards for 
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("card number: " + deck[i] + ": " + rank + " of " + suit);

        }

        

    }
}