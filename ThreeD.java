package Interface;

public abstract class ThreeD implements Resizable, Shape {
	double a;
	ShapeColor sc;
	public ThreeD() {
		super();
	}
	public ThreeD(ShapeColor sc, double a) {
		super();
		this.sc = sc;
		this.a = a;
	}
	public ShapeColor getSc() {
		return sc;
	}
	public double getA() {
		return a;
	}
	public void setSc(ShapeColor sc) {
		this.sc = sc;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double volume()
	{
		return a*a*a;
	}
	public void reSize(double percentage)

	{

	double resize = a * (percentage / 100);

	a = a - resize;

	}
	public String toString()

	{

	return String.format("%s (3D (%s, %.3f))", getClass().getName(), sc, a);

	}
}

class Sphere extends ThreeD {
	public Sphere()

	{

	}

	public Sphere(ShapeColor sc, double a)

	{

	super(sc, a);

	}

	public Sphere(Sphere s)

	{

	this(s.sc, s.a);

	}

	@Override

	public double area()

	{

	return 4 * Math.PI * a * a;

	}

	@Override

	public double volume()

	{

	return (4.0 / 3) * Math.PI * super.volume();

	}

	public double getA()

	{

	return getA();

	}

	public void set(ShapeColor sc, double a)

	{

	this.sc = sc;

	this.a = a;

	}

	@Override

	public String toString()

	{

	return super.toString();

	}

	@Override
	public void resize(double percentage) {
		// TODO Auto-generated method stub
		
	}

}

class Cube extends ThreeD {
	
	public Cube()

	{

	}

	public Cube(ShapeColor sc, double a)

	{

	super(sc, a);

	}

	public Cube(Sphere c)

	{

	this( c.sc, c.a);

	}

	@Override

	public double area()

	{

	return 6 * a * a;

	}

	@Override

	public double volume()

	{

	return super.volume();

	}

	public double getA()

	{

	return a;

	}

	public void set(ShapeColor sc, double a)

	{

	this.sc = sc;

	this.a = a;

	}

	@Override

	public String toString()

	{

	return super.toString();

	}

	@Override
	public void resize(double percentage) {
		// TODO Auto-generated method stub
		
	}
}

class Tetrahedron extends ThreeD {
	public Tetrahedron()

	{

	}
	public double getA()

	{

	return getA();

	}

	public void set(ShapeColor sc, double a)

	{

	this.sc = sc;

	this.a = a;

	}

	public Tetrahedron(ShapeColor sc, double a)

	{

	super(sc, a);

	}

	public Tetrahedron(Tetrahedron t)

	{

	this(t.sc, t.a);

	}

	@Override

	public double area()

	{
        
		return Math.sqrt(3)*(a*a);

	}

	@Override

	public double volume()

	{

	return super.volume()/ (6 * Math.sqrt(2) );

	}

	
	@Override

	public String toString()

	{

	return super.toString();

	}
	@Override
	public void resize(double percentage) {
		// TODO Auto-generated method stub
		
	}
}