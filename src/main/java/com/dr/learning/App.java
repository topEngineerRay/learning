package com.dr.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.dr.learning.model.Card;

/**
 * Hello world!
 *
 */
public  class App {
    public enum Face {
        ONE, TWO, THREE, FOUR, FIVE, SIX
    };

    public enum Suit {
        CLUB, DIAMOND, HEART, SPADE
    }

    public enum Rank {
        ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }


    public static void main(String[] args) {
        App a = new App();
        methdoA();
        // methodB();
    }

    private static void methodB() {
        Collection<Suit> suits = Arrays.asList(Suit.values());
        Collection<Rank> ranks = Arrays.asList(Rank.values());
        List<Card> deck = new ArrayList<Card>();
        for (Iterator<Suit> i = suits.iterator(); i.hasNext();)
            for (Iterator<Rank> j = ranks.iterator(); j.hasNext();)
                deck.add(new Card(i.next(), j.next()));
    }

    private static void methdoA() {
        Collection<Face> faces = Arrays.asList(Face.values());
        for (Iterator<Face> i = faces.iterator(); i.hasNext();)
            for (Iterator<Face> j = faces.iterator(); j.hasNext();)
                System.out.println(i.next() + " " + j.next());
    }
}
