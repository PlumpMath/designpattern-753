package strategy;

public class Hand {

	// グー
	public static final int HANDVALUE_GUU = 0;
	// チョキ
	public static final int HANDVALUE_CHO = 1;
	// パー
	public static final int HANDVALUE_PAA = 2;
	
	public static final Hand[] hand = {
		new Hand(HANDVALUE_GUU),
		new Hand(HANDVALUE_CHO),
		new Hand(HANDVALUE_PAA),
	};
	private static final String[] name = {
		"グー", "チョキ", "パー",
	};
	private int handvalue;
	private Hand(int handvalue) {
		this.handvalue = handvalue;
	}
	public static Hand getHand(int handvalue) {
		return hand[handvalue];
	}
	public boolean isStrongerThan(Hand h) {
		return fight(h) == 1;
	}
	public boolean isWeakerThan(Hand h) {
		return fight(h) == -1;
	}
	private int fight(Hand h) {
		if (this == h) {
			return 0;
		} else if ((this.handvalue + 1) % 3 == h.handvalue) {
			return 1;
		} else {
			return -1;
		}
	}
	@Override
	public String toString() {
		return name[handvalue];
	}
}
