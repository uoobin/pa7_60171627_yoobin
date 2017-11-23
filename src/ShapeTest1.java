
public class ShapeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20, 30, 40);
		shapes[1] = new Rectangle(30, 30, 10, 10);
		shapes[2] = new Circle(50, 20, 30);
		
		for (Shape s : shapes) {
			System.out.println("Area: " + s.getArea());
			System.out.println("Length: " + s.getLength());
		}
		
		Drawable[] drawables = new Drawable[4];
		for(int i = 0; i < shapes.length; i++) {
			drawables[i] = (Drawable) shapes[i];
		}
		drawables[3] = new Text("Sample Text");
		for(Drawable d : drawables) {
			d.draw();
		}
	}
}
//60171627 ������
//������ ��ǥ�� ����, �ѷ��� ������ָ� ���������� Text�� string�� ����Ѵ�.