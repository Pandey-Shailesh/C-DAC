package Basic;

class CallTheMethods {
public double AreaOfRect(double length,double breath) {
	double area =length*breath;
	return area;
}
public double AreaOfCircle(double radius) {
	double area =Math.PI*radius*radius;
	return area;
}
public  double AreaOfTriangle(double height,double base) {
	double area =0.5*height*base;
	return area;
}
}
public class Methods{
	public static void main(String[] args) {
		CallTheMethods obj = new CallTheMethods();
		System.out.println(obj.AreaOfCircle(25.64));
		System.out.println(obj.AreaOfRect(86,845));
		double area = obj.AreaOfTriangle(845.35, 84569.21);
		System.out.println(area);
		
	}
}
