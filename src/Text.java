
public class Text implements Drawable{
	String string;

	public Text(String string) {
		this.string = string;
	}

	public void draw() {
		System.out.println(string);
	}
}
//60171627 김유빈
//Drawable을 구현하며 string을 받아 출력한다.