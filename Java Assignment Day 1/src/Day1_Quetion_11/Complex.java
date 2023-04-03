package Day1_Quetion_11;

public class Complex {
	 
	    private double real;
	    private double imag;

	    public Complex() {
	        this.real = 0.0;
	        this.imag = 0.0;
	    }

	    public Complex(double real, double imag) {
	        this.real = real;
	        this.imag = imag;
	    }

	    public double getReal() {
	        return real;
	    }

	    public void setReal(double real) {
	        this.real = real;
	    }

	    public double getImag() {
	        return imag;
	    }

	    public void setImag(double imag) {
	        this.imag = imag;
	    }

	    // Addition of two complex numbers
	    public Complex add(Complex c) {
	        double r = this.real + c.real;
	        double i = this.imag + c.imag;
	        return new Complex(r, i);
	    }

	    // Subtraction of two complex numbers
	    public Complex subtract(Complex c) {
	        double r = this.real - c.real;
	        double i = this.imag - c.imag;
	        return new Complex(r, i);
	    }

	    public void display() {
	        System.out.println(this.real + " + " + this.imag + "i");
	    }

}
