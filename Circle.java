
public class Circle extends Shape {

	private double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return this.radius*this.radius*3.14;
	}

}
