package Day1_Quetion_4;

public class Rectangle {
	private double length;
    private double width;
    
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }
    
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) 
        {
            this.length = length;
        } 
        else 
        {
            System.out.println("You enter *invalid length*.");
        }
    }
    
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) 
        {
            this.width = width;
        } 
        else 
        {
            System.out.println("You enter *Invalid width*.");
        }
    }
    
    public double calculateArea() {
        return length*width;
    }
    
    public double calculatePerimeter() {
        return 2 *(length + width);
    }
    
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

}
