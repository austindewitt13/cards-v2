package edu.cnm.deepdive.blackjack;

import edu.cnm.deepdive.PitBoss;

public class BlackjackPitBoss extends PitBoss<BlackjackHand> {

  @Override
  public int compare(BlackjackHand hand1, BlackjackHand hand2) {
    //TODO Incorporate dealer blackjack logic.
   int comparison = Integer.compare(hand1.getValue(), hand2.getValue());
   if (comparison < 0) {
   // First hand has lower value than second.
     if(hand1.isBusted()){
        comparison = 0;
     }else if (hand2.isBusted()){
       comparison *= -1;
     }

   }else if (comparison > 0) {
     //First hand has higher value than second.
     if (hand2.isBusted()) {
       comparison = 0;
     }else if (hand1.isBusted()) {
       comparison *= -1;
     }

   } else {

     // First hand has value equal to second.
    if (hand1.isBlackjack()) {
      if (!hand2.isBlackjack()) {
        comparison = 1;
      }
    }else if (hand2.isBlackjack()){
     comparison = -1;
    }
   }
   return comparison;
  }
}
