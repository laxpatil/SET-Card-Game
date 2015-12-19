import java.util.ArrayList;
import java.util.List;

/**
 *   // Run this main method t start playing SET game.
 */

/**
 * @author Laxmikant
 *
 */

public class startGAME {

	/**
	 * @param args
	 */

	//-----------------------------------------------------------------------------------------------------------//
		// ------------Test Code-------------//
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SetMethods st= new SetMethods();
			
			
			//Generate Full Deck & PLAY--
			System.out.println("Now Generating whole Deck.......");
			st.generateCards();
			System.out.println("\n Total SETs found: " + st.countSET);
			
			// Check individual card
			// ----------SET--------------//
			List<Card> deck = new ArrayList<Card>();
			Card c1 = new Card(Card.Color.GREEN, Card.Shape.DIAMOND,
					Card.Shading.EMPTY, Card.Number.ONE);
			Card c2 = new Card(Card.Color.PURPLE, Card.Shape.DIAMOND,
					Card.Shading.EMPTY, Card.Number.ONE);
			Card c3 = new Card(Card.Color.RED, Card.Shape.DIAMOND,
					Card.Shading.EMPTY, Card.Number.ONE);

			// System.out.println(st.isSET(c1, c2, c3)); // SET
			// ----------SET--------------//

			// ----------NOT SET--------------//

			Card c4 = new Card(Card.Color.GREEN, Card.Shape.DIAMOND,
					Card.Shading.EMPTY, Card.Number.ONE);
			Card c5 = new Card(Card.Color.PURPLE, Card.Shape.DIAMOND,
					Card.Shading.EMPTY, Card.Number.ONE);
			Card c6 = new Card(Card.Color.GREEN, Card.Shape.DIAMOND,
					Card.Shading.EMPTY, Card.Number.ONE);

			// System.out.println(st.isSET(c4, c5, c6)); // NOT SET
			// ----------SET--------------//

		}
		// ------------Test Code-------------//

}
