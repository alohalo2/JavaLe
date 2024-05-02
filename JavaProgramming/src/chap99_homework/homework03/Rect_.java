package chap99_homework.homework03;

public class Rect_ {
	public int width;
	public int height;
	
	public Rect_() {
		
	}
	
	public Rect_(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int round() {
		return 2 * (width + height);
	}
	
	public int area() {
		return width * height;
	}
}
