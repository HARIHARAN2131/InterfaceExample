package Interface;


abstract class TwoD implements Recolorable, Shape {
	protected ShapeColor sc;
	protected int a;
	protected int b;
	protected int c;
	protected int d;
	public TwoD() {
		super();
	}
	public TwoD(ShapeColor sc, int a) {
		super();
		this.sc = sc;
		this.a = a;
	}
	public TwoD(ShapeColor sc, int a, int b) {
		super();
		this.sc = sc;
		this.a = a;
		this.b = b;
	}
	public TwoD(ShapeColor sc, int a, int b, int c) {
		super();
		this.sc = sc;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public TwoD(ShapeColor sc, int a, int b, int c, int d) {
		super();
		this.sc = sc;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public int getD() {
		return d;
	}
	public ShapeColor getSc() {
		return sc;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setC(int c) {
		this.c = c;
	}
	public void setD(int d) {
		this.d = d;
	}
	public void setSc(ShapeColor sc) {
		this.sc = sc;
	}
	public void reColor(ShapeColor sc)
	{
		this.sc=sc;
		
	}
	public String toString()

	{

	if (b == 0 && c == 0 && d ==0)

	{

	return String.format("%s (2D, %s, %d)", getClass().getName(), sc, getA());

	}

	else if ( c == 0 && d ==0)

	{

	return String.format("%s (2D, %s, %d, %d)", getClass().getName(), sc, getA(), getB());

	}

	else if( d == 0)

	{

	return String.format("%s (2D, %s, %d, %d, %d)",getClass().getName(), sc, getA(), getB(), getC());

	}

	else {

	return String.format("%s (2D, %s , %d, %d, %d, %d)", getClass().getName(), sc, getA(), getB(), getC(), getD());

	}

	}
}

class Trapezoid extends TwoD {
	private int h;

	public Trapezoid()

	{

	}

	public Trapezoid(ShapeColor sc, int a, int b, int c, int d, int h)

	{

		super(sc, a, b, c, d);

		this.h = h;

	}

	public int getA()

	{

		return a;

	}

	public int getB()

	{

		return b;

	}

	public int getC()

	{

		return c;

	}

	public int getD()

	{

		return d;

	}

	public int getHeight()

	{

		return h;

	}

	public void set(ShapeColor sc, int a, int b, int c, int d)

	{

		this.sc = sc;

		this.a = a;

		this.b = b;

		this.c = c;

		this.d = d;

	}
	@Override

	public double area()

	{

		return (((a + b) / 2.0)) * h;

	}

	@Override

	public String toString()

	{

		return String.format("%s, %d)", super.toString(), h);

	}

	@Override
	public void recolor(ShapeColor sc) {
		// TODO Auto-generated method stub
		
	}
}

class Triangle extends TwoD {
	public Triangle() {

	}

	public Triangle(ShapeColor sc, int a, int b, int c) {
		super(sc, a, b, c);

	}
   public int getA(){

		return a;

	}

	public int getB()

	{

		return b;

	}

	public int getC()

	{

		return c;

	}

	public void set(ShapeColor sc, int a, int b, int c)

	{

		this.sc = sc;

		this.a = a;

		this.b = b;

		this.c = c;

	}
	@Override
	public double area() {
		double ta = (a + b + c) / 2.0;
		return Math.sqrt(ta * (ta - a) * (ta - b) * (ta - c));

	}

	@Override

	public String toString()

	{

		return super.toString();

	}

	@Override
	public void recolor(ShapeColor sc) {
		// TODO Auto-generated method stub
		
	}

}

class Rectangle extends TwoD {
	public Rectangle()
    {

	}
    public Rectangle(ShapeColor sc, int length, int width)

	{

	super(sc, length, width);

	}

	public Rectangle(Rectangle r)

	{

	this(r.sc, r.a, r.b);

	}

	@Override

	public double area()

	{

	return a * b;

	}

	public int getLength()

	{

	return getA();

	}

	public int getWidth()

	{

	return getB();

	}

	public void set(ShapeColor sc, int length, int width)

	{

	this.sc = sc;

	this.a = length;

	this.b = width;

	}

	@Override

	public String toString()

	{

	return super.toString();

	}
	@Override
	public void recolor(ShapeColor sc) {
		// TODO Auto-generated method stub
		
	}
}

class Circle extends TwoD {
	public Circle()
    {
    	
    }
    public Circle(ShapeColor sc,int a)
    {
    	super(sc,a);
    }

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double circle;
		circle=Math.PI*a*a;//PI*R*R
		return circle;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public void recolor(ShapeColor sc) {
		// TODO Auto-generated method stub
		
	}
}