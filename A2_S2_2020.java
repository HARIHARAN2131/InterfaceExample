package Interface;

import java.util.ArrayList;

public class A2_S2_2020 {
	private static int getInt()

	{

	int rnum = (int)(Math.random() * 10) + 1;

	return rnum;

	}

	private static double getDouble()

	{

	double rnum2 = (Math.random() * 10) + 1;

	return rnum2;

	}

	private static ShapeColor getColor()

	{

	int clrlist = (int)(Math.random() * 4);

	switch(clrlist)

	{

	case(0): return ShapeColor.White;

	case(1): return ShapeColor.Blue;

	case(2): return ShapeColor.Red;

	case(3): return ShapeColor.Green;

	default: return ShapeColor.White;

	}

	}

	private static boolean isTriangle(int a,int b,int c)

	{

	if((a > 0 && b > 0 && c > 0) && ((a+b) > c && (b+c) > a && (a+c) > b))

	{

	return true;

	}

	else {

	return false;

	}

	}

	private static TwoD getTwoD()

	{

	TwoD Shape = null;

	int a = getInt();

	int b = getInt();

	int c = getInt();

	int d = getInt();

	int h = getInt();

	int tdlist = (int)(Math.random() * 4);

	switch(tdlist)

	{

	case(0): Shape = new Circle(getColor(),a);

	break;

	case(1): Shape = new Rectangle(getColor(),a,b);

	break;

	case(2): if(isTriangle(a,b,c))

	{

	return  new Triangle(getColor(), a,b,c);

	}

	else {

	while(!isTriangle(a,b,c))

	{

	a = getInt();

	b = getInt();

	c = getInt();

	}

	Shape = new Triangle(getColor(),a,b,c);

	}

	break;

	default: Shape = new Trapezoid(getColor(),a,b,c,d,h);

	break;

	}

	return Shape;

	}

	private static ThreeD getThreeD()

	{

	ThreeD Shape = null;

	double a = getDouble();

	int trlist =(int)(Math.random() * 3);

	switch(trlist)

	{

	case(0): Shape = new Cube(getColor(),a);

	break;

	case(1): Shape = new Sphere(getColor(),a);

	break;

	default: Shape = new Tetrahedron(getColor(),a);

	break;

	}

	return Shape;

	}

	private static void displayList(ArrayList<Shape> alist)

	{

	int uno = 1;

	int dos = 1;

	for(Shape s:alist)

	{

	if( s instanceof ThreeD)

	{

	ThreeD threed = (ThreeD)s;

	System.out.println("");

	System.out.printf("Shape %d: %s\n",uno,threed);

	System.out.printf("Surface Area = %.3f\n", threed.area());

	System.out.printf("Volume = %.3f\n", threed.volume());

	double percentage = getDouble();

	threed.reSize(percentage);

	System.out.printf("Size reduced by %.1f%%: %s\n", percentage, threed );

	System.out.printf("Updated Surface Area = %.3f\n", threed.area());

	System.out.printf("Updated Volume = %.3f\n", threed.volume());

	System.out.printf("I am a %s Shape\n", threed.getClass().getName());

	}

	uno ++;

	if(s instanceof TwoD)

	{

	TwoD tudee =(TwoD)s;

	System.out.println("");

	System.out.printf("Shape %d: %s\n",dos,tudee);

	ShapeColor preclr = tudee.getSc();

	ShapeColor rplclr = getColor();

	while(preclr == rplclr)

	{

	rplclr = getColor();

	if(rplclr != preclr)

	{

	tudee.recolor(rplclr);

	}

	else {

	rplclr = getColor();

	}

	}

	if(preclr != rplclr)

	{

	tudee.recolor(rplclr);

	}

	System.out.printf("Updated Color: %s\n", tudee.getSc());

	System.out.printf("Area: %.3f\n", tudee.area());

	System.out.printf("I am a %s Shape with color changed to %s\n", tudee.getClass().getName(), tudee.getSc());

	}

	dos ++;

	System.out.println("==============================================");

	}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Shape> alist = new ArrayList<Shape>();
		int rnum3 = (int)(Math.random() * 3);
			

			do

			{

			if(rnum3 == 1 )

			{

			TwoD td= getTwoD();

			alist.add(td);

			}

			else if (rnum3 == 2)

			{

			ThreeD threed=getThreeD();

			alist.add(threed);

			}

			rnum3 = (int)(Math.random() * 3);

			}

			while(rnum3 != 0);
		    displayList(alist);
}
}
