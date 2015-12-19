/**
 *    // Class Card
 */

/**
 * @author Laxmikant
 *
 */

              
public class Card {
	
		Color c;
		Shape sh;
		Shading sd;
		Number n;
		
	
		public enum Color{
			RED, GREEN, PURPLE
		}
		
		public enum Shape{
			DIAMOND, SQUIGGLE, OVAL
		}
		
		public enum Shading{
			SOLID, EMPTY, STRIPED
		}
		
		
		public enum Number{
			ONE, TWO, THREE
		}
	
		
		public Card (Color c,Shape sh,Shading sd,Number n )
		{
			this.c=c;
			this.sh=sh;
			this.sd=sd;
			this.n=n;
		}
	
		/*
	//------------Test Code-------------//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Card c= new Card(Color.GREEN,Shape.DIAMOND,Shading.EMPTY,Number.ONE);
		System.out.println(c.c);
	
	}
	//------------Test Code-------------//
 */
}
