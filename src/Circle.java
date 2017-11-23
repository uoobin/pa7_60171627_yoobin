
public class Circle extends Shape{
	    double r;

	    public Circle(double x, double y, double r) {
	        super(x, y);
	        this.r = r;
	    }
	 
	    public double getArea() {
	    	return (double)Math.round(Math.PI*r*r*10)/10;
	    }
	    
	    public double getLength() {
	    	return (double)Math.round(2*Math.PI*r*10)/10;
	    }
	    
	    public void draw() {
	    	System.out.println("Circle center" + "(" +  x + "," + y + ")" + "-radius(" + r + ")");
	    }
}

//60171627 김유빈
//shape가 superclass이며 x와 y를 상속받고, r은 따로 받아준다.
//넓이와 둘레를 소수점 첫째자리까지 반올림해주고, 좌표들을 출력한다.