package lib;

public class GeometryIO {

	public static double areaOfTriangle (double base, double height) {
		
		if ( base <= 0 || height <= 0) {
			throw new IllegalArgumentException("Base or Height cannot be equal to or less than 0.");
		}
		
		return .5 * base * height;
		
	}
	
	public static double areaOfRectangle (double length, double width) {
		
		if ( length <= 0 || width <= 0) {
			throw new IllegalArgumentException("Length or Width cannot be equal to or less than 0.");
		}

		
		return length * width;
		
	}
	
	public static double areaOfTrapezoid (double base1, double base2, double height) {
		if ( base1 <= 0 || height <= 0 || base2 <= 0) {
			throw new IllegalArgumentException("Base or Height cannot be equal to or less than 0.");
		}
		
		double solution = 0;
		
		solution = base1 * base2;
		solution = .5 * solution * height;
		
		return solution;
		
	}
	
	public static double areaOfParallelogram (double base, double height) {
		
		if ( base <= 0 || height <= 0) {
			throw new IllegalArgumentException("Base or Height cannot be equal to or less than 0.");
		}
		
		return base * height;
		
	}
	
	public static double areaOfCircle(double radius) {
		
		if ( radius <= 0) {
			throw new IllegalArgumentException("Radius cannot be equal to or less than 0.");
		}

		
		return  Math.PI * Math.pow(radius, 2);
		
	}
	
	public static double circumferenceOfCircle(double radius) {
		
		if ( radius <= 0) {
			throw new IllegalArgumentException("Radius cannot be equal to or less than 0.");
		}
		
		return 2 * Math.PI * radius;
		
	}
	
	public static double volumeOfRectangularPrism(double height, double length, double width) {
		
		if ( length <= 0 || width <= 0 || height <= 0) {
			throw new IllegalArgumentException("Length or Width cannot be equal to or less than 0.");
		}
		
		return length * width * height;
		
	}
	
	public static double surfaceAreaOfRectangularPrism(double height, double length, double width) {
		
		if ( length <= 0 || width <= 0 || height <= 0) {
			throw new IllegalArgumentException("Length or Width cannot be equal to or less than 0.");
		}
		
		double solution = 0;
		double p1 = 2 * length * width;
		double p2 = 2 * height * width;
		double p3 = 2 * length * height;
		
		solution = p1 + p2 + p3;
		return solution;
	}
	
	public static double volumeOfGeneralPrism(double base, double height) {
		
		if ( base <= 0 || height <= 0) {
			throw new IllegalArgumentException("Base or Height cannot be equal to or less than 0.");
		}
		
		return base * height;
		
	}
	
	public static double surfaceAreaOfGeneralPrism(double areaFace1, double areaFace2, double areaFace3, double areaFace4, double areaFace5, double areaFace6) {
		
		if (areaFace1 <= 0 || areaFace2 <= 0 || areaFace3 <= 0 || areaFace4 <= 0 ||areaFace5<= 0 ||areaFace6<= 0 ) {
			throw new IllegalArgumentException("Areas cannot be equal to or less than 0.");
		}

		return areaFace1 + areaFace2 + areaFace3 + areaFace4 + areaFace5 + areaFace6;
		
	}
	
	public static double volumeOfRightCircularPrism(double base, double height) {
		
		if ( base <= 0 || height <= 0) {
			throw new IllegalArgumentException("Base or Height cannot be equal to or less than 0.");
		}
		
		return base * height;
		
	}
	
	public static double surfaceAreaOfRightCircularPrism(double base, double height, double radius, double circumference) {
		double solution = 0;
		
		if ( base <= 0 || height <= 0 || radius <= 0 && circumference <=0) {
			throw new IllegalArgumentException("Base or Height cannot be equal to or less than 0. Also radius and circumference cannot both be zero");
		}
		
		if( circumference == 0) {
			circumference = circumferenceOfCircle(radius);
			solution = 2 * base + (circumference * height);
		}else {
			solution = 2 * base + (circumference * height);
		}
		
		return solution;
		
	}
	
	public static double volumeOfsquarePyramid(double base, double height) {
		if ( base <= 0 || height <= 0) {
			throw new IllegalArgumentException("Base or Height cannot be equal to or less than 0.");
		}
		
		
		return (1 / 3) * Math.pow(base, 2) * height;
		
	}
	
	public static double surfaceAreaOfsquarePyramid(double base, double height, double slantHeight) {
		if ( base <= 0 || height <= 0 || slantHeight <=0) {
			throw new IllegalArgumentException("Base or Height cannot be equal to or less than 0. Also slant height cannot equal zero");
		}
		
		
		return base + (.5 * (base * 4)* slantHeight);
		
	}
	public static double volumeOfRightCircularCone(double areaOfBase, double height, double radius) {
		
		if(height <= 0 || areaOfBase <= 0 && radius <=0) {
			throw new IllegalArgumentException("Height cannot be zero and you must either give me a radius or a area for the base greater than zero.");
		}
		
		if(areaOfBase == 0) {
			
			areaOfBase = areaOfCircle(radius);
			
		}
		
		return (1 / 3) * areaOfBase * height;
		
	}
	
	public static double surfaceAreaOfRightCircularCone(double areaOfBase, double radius, double slantHeight, double circumference) {
		if(slantHeight <= 0 || areaOfBase <= 0 && radius <=0) {
			throw new IllegalArgumentException("Slant height cannot be zero and you must either give me a radius or a area for the base greater than zero.");
		}
		
		if(areaOfBase == 0) {
			
			areaOfBase = areaOfCircle(radius);
			
		}
		
		if(circumference == 0) {
			circumference = circumferenceOfCircle(radius);
		}
		
		
		return areaOfBase + (.5 * circumference * slantHeight );
		
	}
	public static double volumeOfSphere(double radius) {
		
		if ( radius <= 0) {
			throw new IllegalArgumentException("Radius cannot be equal to or less than 0.");
		}
		
		return (4 / 3) * Math.PI * Math.pow(radius, 3);
		
	}
	
	public static double surfaceAreaOfSphere(double radius) {
		if ( radius <= 0) {
			throw new IllegalArgumentException("Radius cannot be equal to or less than 0.");
		}
		
		
		return 4 * Math.PI * Math.pow(radius, 2);
		
	}
	
	public static double coordinateDistanceFormula(double x1, double x2, double y1, double y2) {
		if(x2 == x1) {
			throw new IllegalArgumentException("Both x's cannot be equal.");
		}
		
		
		return Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
		
	}
	
	public static double coordinateSlopeFormula (double x1, double x2, double y1, double y2) {
		if(x2 == x1) {
			throw new IllegalArgumentException("Both x's cannot be equal.");
		}
		
		
		return (y2 - y1) / (x2 - x1);	}
	
	public static String coordinateMidpointFormula (double x1, double x2, double y1, double y2) {
	
		double a1 = (x1 + x2) / 2;
		double a2 = (y1 + y2) / 2;
		String coordinate = "( "+a1+" , "+a2+" )";
		return coordinate ;
	}
	
	public static double distanceTraveled(double rate, double time) {
		if ( rate <= 0 || time <= 0 ) {
			throw new IllegalArgumentException("Rate or Time cannot be equal to or less than zero.");
		}
		
		
		return rate * time;
		
	}
	
	public static int polygonAngleFormulas(int numOfSides) {
		if ( numOfSides <= 0) {
			throw new IllegalArgumentException ("Number of sides cannot be zero or negative.");
		}
		
		
		return 180 * (numOfSides - 2);
		
	}
}
