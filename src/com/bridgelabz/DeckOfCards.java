package com.bridgelabz;

import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards {
    Random rn = new Random();
    ArrayList<Cards> cards = new ArrayList<>();
    String[] suit = {"Club", "Diamond", "Heart", "Spade"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public DeckOfCards() {
        int d = 0;
        while (d < 9) {
            int su = rn.nextInt(suit.length);
            int ra = rn.nextInt(rank.length);
            cards.add(new Cards(suit[su], rank[ra]));
            d++;
        }
    }

    public ArrayList<Cards> getDeck() {
        return cards;
    }
    public static void main(String[] args) {
        DeckOfCards player1 = new DeckOfCards();
        System.out.println(player1.getDeck());

        DeckOfCards player2 = new DeckOfCards();
        System.out.println(player2.getDeck());

        DeckOfCards player3 = new DeckOfCards();
        System.out.println(player3.getDeck());

        DeckOfCards player4 = new DeckOfCards();
        System.out.println(player4.getDeck());
    }
}

class Cards {
    String suit;
    String rank;

    public Cards(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}