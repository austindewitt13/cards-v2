package edu.cnm.deepdive.blackjack;

public class Dealer extends BlackjackPlayer {

  @Override
  public boolean canAccept() {
    return super.canAccept()
    && (getHand().getValue() <= 16
        || (getHand().getValue() == 17
            && getHand().isSoft()));
  }

}
