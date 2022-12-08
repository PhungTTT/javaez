package Cau3a;

public class PTbac2Model {
	public String result(double a,double b,double c) {
		if(a==0) {
			return "X= "+(-c/b);
		}else {
			double denta = Math.pow(b, 2)-4*a*c;
			if(denta > 0) {
				double x1 = (-b+Math.sqrt(denta))/(2*a);
				double x2 = (-b-Math.sqrt(denta))/(2*a);
				return "X1= "+x1 + "X2= "+x2;
			}else if(denta == 0) {
				return "X1=X2= "+(-b/(2*a));
			}else {
				return "PT Vo Nghiem";
			}
		}
		
	}
}
