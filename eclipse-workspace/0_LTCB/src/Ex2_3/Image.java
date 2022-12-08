package Ex2_3;

	public class Image {
			int width; // in pixels
			int height; // in pixels
			String source; // file name
			String quality; // informal
	  Image(int height,int width,String source, String quality) {
			this.width = width;
			this.height = height;
			this.source = source; //Nguon
			this.quality = quality; //Chat Luong
	 }
	 /**which determines whether the image’sheight is larger than its width;	  * 
	  * @return boolean
	  * Examples: new Image(5,10,"small.fif","low").isPortrait,false;
	  */
	  boolean isPortrait() {
	   double caorong = this.height - this.width;
		  if(caorong > 0) return true ;
		  else return false;}
	  /**which computes how many pixels the imagecontains;
	   * 
	   * @return double
	   * Examples: new Image(5,10,"small.fif","low").size,50;
	   */
	  double size() {
		  return this.height * this.width;}
	  /**which determines whether one image contains more pixels than some other image;
	   * @param other
	   * @return boolean
	   * Examples: new Image(5,10,"small.fif","low").isLarger,true;
	   */
	  boolean isLarger(Image other) {
		 return this.size() > other.size();}
	  /**which determines whether this image is the same as a given one.
	   * 
	   * @param other
	   * @return boolean
	   * Ex:new Image(5,10, "small.fif","low").same(new Image(10,5,"med.gif","loe")),true;
	   */
	  boolean same(Image other) {
		  return this.size() == other.size();}
	  /**produces one of three strings, dependingon the number of pixels in the image:
	   * "small" for images with 10,000 pixels or fewer;
         "medium" for images with between 10,001 and 1,000,000 pixels;
         "large" for images that are even larger than that.
	   * @return String
	   * Ex:new Image(5,10, "small.fif","low").sizeString(),"small"
	   */
	  String sizeString() {
		  if (this.size() <=10000) return "small";
		  else {
				  if (10001 < this.size() && this.size()<= 1000000) return "medium";
		          else return "large";}
		  
	  }
	}
	  
		 
	
