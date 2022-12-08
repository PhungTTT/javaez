package lambda_expressions;

interface Shape{
	void draw();
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Rectangle class: draw()");
	}
	
}
//Test
public class Ex1 {
	public static void main(String[] args) {
	//normal
		//c1:
		Shape r0 = new Rectangle();
		r0.draw();
		//c2:
		Shape r1 =  new Shape() {
			
			@Override
			public void draw() {
				System.out.println("Line class: draw()");
			}
		};
		r1.draw();
	//lambda:
		Shape r2 = () -> System.out.println("Square class: draw()");
		r2.draw();
		Shape r3 = () -> System.out.println("Circle class: draw()");
		r3.draw();
	}
}
