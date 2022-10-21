
public class Rectangle extends Shape{
	
	private double height;
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	private double width;

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}

}
