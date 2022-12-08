package Ex6_1Inventory;

public class EmptyInventory implements Inventory {

		//@Override
		public String toString() {
			return " ";
		}
		/**
		 * This is method contains(String toyName) of EmptyIventory
		 */
		public boolean contains(String toyName) {
			return false;
		}
		/**
		 * This is method isBelow(double threshold) of EmptyIventory
		 * =>TRUE
		 */
		public boolean isBelow(double threshold) {
			return true;
		}
		/**
		 * This is method howMany() of EmptyIventory
		 */
		public int howMany() {
			return 0;
		}
		/**
		 * This is method raisePrice(double rate) of EmptyInventory
		 */
		public Inventory raisePrice(double rate) {
			return new EmptyInventory();
		}
			//@Override
			public boolean equals(Object obj) {
				if (obj == null || !(obj instanceof EmptyInventory)) 
					return false;
				else return true;
			}
		/**
		 * This is method raisePriceMutable(double rate) of EmptyInventory
		 */
		public void raisePriceMutable(double rate) {
			}
		/**
		 * This is method totalPrice() of EmptyInventory
		 */
		public double totalPrice() {
			// TODO Auto-generated method stub
			return 0;
		}
		/**
		 * This is method averagePrice() of EmptyInventory
		 */
		public double averagePrice() {
			return 0;
		}
		/**
		 * This is method replaceName(String findName, String replaceName) of EmptyInventory
		 */
		public void replaceName(String findName, String replaceName) { }
		/**
		 * This is method eliminate(String toyOfName) of EmptyInventory
		 */
		public Inventory eliminate(String toyOfName) {
			return new EmptyInventory();
		}	
		
		

}
