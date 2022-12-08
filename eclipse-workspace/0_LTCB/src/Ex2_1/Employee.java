package Ex2_1;

public class Employee {
	String name;
	int hours;
    Employee(String name, int hours) {
	  this.name = name ;
	  this.hours = hours;
}
/**Xac dinh muc luong cua mot nhan vien tu so gio lam viec
 * 
 * @return int
 * Examples: new Employee = Employee (aEmplyee1.wage(),360);
 */
    int wage() {
    	return this.hours * 12;}
/**Xac dinh muc thue phai nop
 * 
 * @return double
 * Examples: new Employee = Employee(aEmployee1.tax(), 54.0, 0.001);
 */
    double tax() {
        return this.wage() * 0.15;}
/**Xac dinh muc luong rong cua nhan vien
 *    
 * @return double
 * Examples: new Employee = Employee(aEmployee1.netpay, 306.0, 0.01);
 */
    double netpay() {
    	return this.wage() - this.tax();}
/**Xac dinh muc luong khi cho them 14$
 * 
 * @return int
 * Examples: new Employee = Employee(aEmployee1.raisedWage, 374.0, 0.001);
 */
    int raisedWage() {
    	return this.wage() + 14;}
/**Kiem tra so gio lam viec 
 * 
 * @return boolean
 * Examples: new Employee = Employee(aEmployee1.checkOverTime);
 */
    boolean checkOverTime() {
    	return this.hours > 100;}
/**2_1_1 Thue theo tuy thu nhap
  * 
  * @return double
  * Examples: new Employee = Employee(aEmployee1.taxWithRate, 54.0, 0.001);
  */
    double taxWithRate() {
    	double grossPay = this.wage();
    	if (grossPay <= 240)
    	return 0.0;
    	if (grossPay <= 480)
    	return grossPay * 0.15;
    	else return grossPay * 0.28;}
/**2_1_1 Xac dinh muc luong rong
 * 
 * @return double
 * Examples: new Employee = Employee(aEmployee1.netpayWithRate,306.0, 0.001);
 */
    double netpayWithRate() {
    	return this.wage() - this.taxWithRate();
    	
    	}
}
