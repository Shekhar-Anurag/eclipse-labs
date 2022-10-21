
public class ShapeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1= new Circle();
		 c1.setRadius(2.0);
		 System.out.println("Area of c1 " +c1.getArea());
		 Circle c2= new Circle();
		 c2.setRadius(4.0);
		 System.out.println("Area of c2 " +c2.getArea()); 
		 
		 Rectangle r1= new Rectangle();
		 r1.setHeight(2.0);
		 r1.setWidth(4.0);
		 System.out.println("Area of r1 " +r1.getArea());
		 Rectangle r2= new Rectangle();
		 r2.setHeight(3.0);
		 r2.setWidth(6.0);
		 System.out.println("Area of r2 " +r2.getArea());
		 Shape shapes[]={c1,c2,r1,r2};
		 // We are using the "totalArea" method here
		 System.out.println("Total Area is: " + totalArea(shapes)); 
		// System.out.printf("Total Area is: %5.2f" + totalArea(shapes));

	}
	
	static double totalArea(Shape[] s)
	{
		double sum = 0;
		for(int i =0; i<s.length;i++ )
		
			sum=sum+s[i].getArea();
		return sum;
	}

}
