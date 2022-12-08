package Ex4_4Shape;

public class Rectangle extends AShape{
	private int width;
	private int height;
	
   public Rectangle(CartPt loc, int width, int height) { 
      super(loc);
      this.width = width; this.height = height;
   }
   /**
    * 
    * @return
    */
   public double area() {
      return this.width * this.height;
   }
   /**
    * 
    */
   public boolean contains(CartPt point) {
      int thisX = this.loc.getX();
      int thisY = this.loc.getY();
      return ShapeUtils.between(point.getX(), thisX, thisX + this.width) && 
    		  ShapeUtils.between(point.getY(), thisY, thisY + this.height);
   }
 
   /**
    * 
    * @return Rectangle
    */
   public Rectangle boundingBox() {
      return new Rectangle(this.loc, width, height);
   }
      	//
		public boolean equals(Object obj) {
		   if (null==obj || !(obj instanceof Square))
		      return false;
		   else {
			   Rectangle that = (Rectangle) obj;
		      return (this.loc.equals(that.loc)
		    		  && (this.width == that.width)
		           && this.height == that.height);
		   }  
		}

   /*
    * 
    */
   public double perimeter() {
	   return (this.width + this.height) * 2;
	}

}

