
public abstract class Shape implements Drawable {
	double x,y;

    public Shape(double x, double y) {
    this.x = x;
    this.y = y;
    }

	public double getArea() {
		return x;
	}

	public double getLength() {
		return y;
	}
}
//60171627 김유빈
//Drawable을 구현하며, 좌표를 가지고 넓이와 둘레를 계산할 수 있다.