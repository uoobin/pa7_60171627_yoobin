
public class Rectangle extends Shape {
   double a,l;
   
    public Rectangle(double x, double y, double a, double l) {
        super(x, y);
        this.a = a;
        this.l = l;
    }
    
    public double getArea() {
    	return a*l;
    }
    
    public double getLength() {
    	return 2*(a+l);
    }
    
    public void draw() {
    	System.out.println("Rectangle " + "(" + x + "," + y + ")" + "-" + "(" + (x+a) + ","+ (y+l) + ")");
    }

}
//60171627 김유빈
//shape가 superclass이며 x와 y를 상속받고, a와 l은 따로 받아준다.
//넓이와 둘레를 소수점 첫째자리까지 반올림해주고, 좌표들을 출력한다.