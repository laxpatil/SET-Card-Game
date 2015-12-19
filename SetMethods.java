import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * // This class contains all the SET operations/ methods.
 */

/**
 * @author Laxmikant
 *
 */



public class SetMethods {
	static int countSET = 0;

	// Method to find whether three cards make a SET
	public static boolean isSET(Card c1, Card c2, Card c3) {
		int flag = 0;

		// Check Color
		if (((c1.c == c2.c) && (c2.c == c3.c)) ||

		((c1.c != c2.c) && (c2.c != c3.c) && (c1.c != c3.c))

		) {
			flag++;
		}

		// Check Shape
		if (((c1.sh == c2.sh) && (c2.sh == c3.sh)) ||

		((c1.sh != c2.sh) && (c2.sh != c3.sh) && (c1.sh != c3.sh))

		) {
			flag++;
		}

		// Check Shading
		if (((c1.sd == c2.sd) && (c2.sd == c3.sd)) ||

		((c1.sd != c2.sd) && (c2.sd != c3.sd) && (c1.sd != c3.sd))

		) {
			flag++;
		}

		// Check Number
		if (((c1.n == c2.n) && (c2.n == c3.n)) ||

		((c1.n != c2.n) && (c2.n != c3.n) && (c1.n != c3.n))

		) {
			flag++;
		}

		if (flag == 4) {
			return true;
		}

		return false;

	}

	// Method to check to find a SET from the cards on board
	public static List<Card> findSET(List<Card> board) {
		// System.out.println("Inside Findset");
		List<Card> found = new ArrayList<Card>();

		for (int i = 0; i < board.size(); i++) {
			for (int j = i + 1; j < board.size(); j++) {
				for (int k = j + 1; k < board.size(); k++) {
					// if SET found, then add to FOUND List.
					if (isSET(board.get(i), board.get(j), board.get(k))) {

						// Shout "SET"
						System.out.println("\n--     SET !!    --");
						countSET++;

						// add to FOUND list
						found.add(board.get(i));
						found.add(board.get(j));
						found.add(board.get(k));

						// Now remove the SET from List
						List<Card> temp_found = new ArrayList<Card>();
						temp_found.add(board.get(i));
						temp_found.add(board.get(j));
						temp_found.add(board.get(k));
						Iterator<Card> it = temp_found.iterator();
						System.out.println("....Printing SET...");
						while (it.hasNext()) {
							System.out.println(printCard(it.next()));
						}

						board.removeAll(temp_found);
					}
				}
			}
		}
		return found;

	}
	
	// Play the SET game
	public static List<Card> playSET(List<Card> deck) {
		List<Card> validSETs = new ArrayList<Card>();

		List<Card> board = new ArrayList<Card>();

		// Start the game with 12 cards on board & remove them from the DECK
		List<Card> toADD = deck.subList(0, 12);
		board.addAll(toADD);
		deck.removeAll(toADD);

		while (!deck.isEmpty()) {

		
			List<Card> foundList = new ArrayList<Card>();
			foundList = findSET(board);
			if (foundList.size() != 0) {
				validSETs.addAll(foundList);
			} else {
				board.addAll((List<Card>) deck.subList(0, 3));
				deck.removeAll(deck.subList(0, 3));
			}

		}

		return validSETs;
	}

	// Generating all possible combinations of cards for input
	public static void generateCards() {
		List<Card> deck = new ArrayList<Card>();

		for (Card.Color c : Card.Color.values()) {
			for (Card.Shape sh : Card.Shape.values()) {
				for (Card.Shading sd : Card.Shading.values()) {
					for (Card.Number n : Card.Number.values()) {
						Card card = new Card(c, sh, sd, n);
						// System.out.println("" + c + "," + sh + "," + sd + ","+ n);
						deck.add(card);
					}
				}
			}
		} // end for loop

		playSET(deck);

	}

	// print card attributes
	public static String printCard(Card c) {
		return ("" + c.c + "," + c.sh + "," + c.sd + "," + c.n);
	}

}
