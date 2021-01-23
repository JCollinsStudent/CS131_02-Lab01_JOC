
public class Rectangle {
	int length;
	int width;
	
	public Rectangle() {
		this.length = 1;
		this.width = 1;
	}
	
	public Rectangle(int l, int w) {
		this.length = l;
		this.width = w;
	}
	
	public int calculateArea() {
		return this.length * this.width;
	}
	
	public int calculatePerimeter() {
		return (this.length * 2) + (this.width * 2);
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int getWidth() {
		return this.width;
	}
}
