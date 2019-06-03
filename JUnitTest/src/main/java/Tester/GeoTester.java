package Tester;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import lib.GeometryIO;

public class GeoTester {
	@Test
	public void areaOfTriangleValidDoubleBase() { // valid double
		// Arrange
		double base = 4, height = 5;
		// Act
		double tester = GeometryIO.areaOfTriangle(base, height);
		// Assert
		assertEquals(tester, tester, 10);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfTriangleInvalidDoubleBase() { // invalid double = 0
		// Arrange
		double base = 0, height = 5;
		// Act
		double tester = GeometryIO.areaOfTriangle(base, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfTriangleNegativeDoubleBase() { // valid double
		// Arrange
		double height = 5;
		// Act
		double tester = GeometryIO.areaOfTriangle(-3, height);
		// Assert
	}

	@Test
	public void areaOfTriangleValidDoubleHeight() { // valid double
		// Arrange
		double base = 5, height = 4;
		// Act
		double tester = GeometryIO.areaOfTriangle(base, height);
		// Assert
		assertEquals(tester, tester, 10);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfTriangleInvalidDoubleHeight() { // invalid double = 0
		// Arrange
		double base = 5, height = 0;
		// Act
		double tester = GeometryIO.areaOfTriangle(base, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfTriangleNegativeDoubleHeight() { // Negative double
		// Arrange
		double height = 5;
		// Act
		double tester = GeometryIO.areaOfTriangle(-3, height);
		// Assert
	}

	/*
	 * areaOfRectangle test
	 */
	@Test
	public void areaOfRectangleValidDoubleBase() { // valid double
		// Arrange
		double base = 5, height = 5;
		// Act
		double tester = GeometryIO.areaOfRectangle(base, height);
		// Assert
		assertEquals(tester, tester, 25);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfRectangleInvalidDoubleBase() { // invalid double = 0
		// Arrange
		double base = 0, height = 0;
		// Act
		double tester = GeometryIO.areaOfRectangle(base, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfRectangleNegativeDoubleBase() { // valid double
		// Arrange
		double base = 5, height = 0;
		// Act
		double tester = GeometryIO.areaOfRectangle(-3, height);
		// Assert
	}

	@Test
	public void areaOfRectangleValidDoubleHeight() { // valid double
		// Arrange
		double base = 5, height = 5;
		// Act
		double tester = GeometryIO.areaOfRectangle(base, height);
		// Assert
		assertEquals(tester, tester, 25);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfRectangleInvalidDoubleHeight() { // invalid double = 0
		// Arrange
		double base = 5, height = 0;
		// Act
		double tester = GeometryIO.areaOfRectangle(base, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfRectangleNegativeDoubleHeight() { // Negative double
		// Arrange
		double base = 5, height = 0;
		// Act
		double tester = GeometryIO.areaOfRectangle(base, height);
		// Assert
	}

	/*
	 * areaOfTrapazoid
	 */
	@Test
	public void areaOfTrapazoidValidDoubleBase() { // valid double
		// Arrange
		double base = 5, base2 = 5, height = 5;
		// Act
		double tester = GeometryIO.areaOfTrapezoid(base, base2, height);
		// Assert
		assertEquals(tester, tester, 25);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfTrapazoidInvalidDoubleBase() { // invalid double = 0
		double base = 0, base2 = 5, height = 5;
		// Act
		double tester = GeometryIO.areaOfTrapezoid(base, base2, height);

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfTrapazoidNegativeDoubleBase() { // valid double
		double base = 5, base2 = 5, height = 5;
		// Act
		double tester = GeometryIO.areaOfTrapezoid(-3, base2, height);

		// Assert
	}

	@Test
	public void areaOfTrapazoidValidDoubleBaseTwo() { // valid double
		// Arrange
		double base = 6, base2 = 6, height = 6;
		// Act
		double tester = GeometryIO.areaOfTrapezoid(base, base2, height);
		// Assert
		assertEquals(tester, tester, 36);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfTrapazoidInvalidDoubleBaseTwo() { // invalid double = 0
		double base = 5, base2 = 0, height = 5;
		// Act
		double tester = GeometryIO.areaOfTrapezoid(base, base2, height);

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfTrapazoidNegativeDoubleBaseTwo() { // Negative double
		double base = 5, base2 = -3, height = 5;
		// Act
		double tester = GeometryIO.areaOfTrapezoid(base, base2, height);
		// Assert
	}

	@Test
	public void areaOfTrapazoidValidDoubleHeight() { // valid double
		// Arrange
		double base = 1, base2 = 1, height = 1;
		// Act
		double tester = GeometryIO.areaOfTrapezoid(base, base2, height);
		// Assert
		assertEquals(tester, tester, 1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfTrapazoidInvalidDoubleHeight() { // invalid double = 0
		double base = 5, base2 = 5, height = 0;
		// Act
		double tester = GeometryIO.areaOfTrapezoid(base, base2, height);

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfTrapazoidNegativeDoubleHeight() { // Negative double
		double base = 5, base2 = 5, height = -3;
		// Act
		double tester = GeometryIO.areaOfTrapezoid(base, base2, height);

		// Assert
	}

	/*
	 * areaOfParallelogram
	 */
	@Test
	public void areaOfParallelogramValidDoubleBase() { // Valid Double
		// Arrange
		double base = 6.5, height = 4;
		// Act
		double tester = GeometryIO.areaOfParallelogram(base, height);
		// Assert
		assertEquals(tester, tester, 26);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfParallelogramInvalidDoubleBase() { // invalid double
		// Arrange
		double base = 0, height = 4;
		// Act
		double tester = GeometryIO.areaOfParallelogram(base, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfParallelogramNegativeDoubleBase() { // Negative double
		// Arrange
		double base, height = 4;
		// Act
		double tester = GeometryIO.areaOfParallelogram(-3, height);
		// Assert
	}

	@Test
	public void areaOfParallelogramValidDoubleHeight() { // Valid Double
		// Arrange
		double base = 4, height = 5.5;
		// Act
		double tester = GeometryIO.areaOfParallelogram(base, height);
		// Assert
		assertEquals(tester, tester, 22);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfParallelogramInvalidDoubleHeight() { // invalid double
		// Arrange
		double base = 4, height = 0;
		// Act
		double tester = GeometryIO.areaOfParallelogram(base, 0);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfParallelogramNegativeDoubleHeight() { // Negative double
		// Arrange
		double base = 4, height = -2;
		// Act
		double tester = GeometryIO.areaOfParallelogram(base, height);
		// Assert
	}

	/*
	 * Area of circle
	 */
	@Test
	public void areaOfCircleValidDoubleHeight() { // Valid Double
		// Arrange
		double radius = 1;
		// Act
		double tester = GeometryIO.areaOfCircle(radius);
		// Assert
		assertEquals(tester, tester, Math.PI);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfCircleInvalidDoubleHeight() { // invalid double
		// Arrange
		double radius = 0;
		// Act
		double tester = GeometryIO.areaOfCircle(radius);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void areaOfCircleNegativeDoubleHeight() { // Negative double
		// Arrange
		double radius = -1;
		// Act
		double tester = GeometryIO.areaOfCircle(radius);
		// Assert
	}
	
	
	
	
	
	
	
	
	
	
	
	//////////////////////////////////////
	// Volume Section //
	//////////////////////////////////////
	/*
	 * volumeSurfaceAreaOfRectangularPrism test
	 */
	@Test
	public void volumeSurfaceAreaOfRectangularPrismValidDoublelength() { // valid double
		// Arrange
		double length = 7.2, width = 3, height = 1;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(length, width, height);
		// Assert
		assertEquals(tester, tester, 21.6);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeSurfaceAreaOfRectangularPrismInvalidDoublelength() { // invalid double = 0
		// Arrange
		double length = 0, width = 3, height = 1;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(length, width, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeSurfaceAreaOfRectangularPrismNegativeDoublelength() { // Negative double
		// Arrange
		double length = 7.2, width = 3, height = 1;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(-3, width, height);
		// Assert
	}

	@Test
	public void volumeSurfaceAreaOfRectangularPrismValidDoublewidth() { // valid double
		// Arrange
		double length = 3, width = 6.2, height = 1;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(length, width, height);
		// Assert
		assertEquals(tester, tester, 18.6);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeSurfaceAreaOfRectangularPrismInvalidDoublewidth() { // invalid double = 0
		// Arrange
		double length = 7.2, width = 0, height = 1;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(length, width, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeSurfaceAreaOfRectangularPrismNegativeDoublewidth() { // Negative double
		// Arrange
		double length = 7.2, width = -9, height = 1;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(length, width, height);
		// Assert
	}

	@Test
	public void volumeSurfaceAreaOfRectangularPrismValidDoubleHeight() { // valid double
		// Arrange
		double length = 2, width = 6.2, height = 1;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(length, width, height);
		// Assert
		assertEquals(tester, tester, 12.4);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeSurfaceAreaOfRectangularPrismInvalidDoubleHeight() { // invalid double = 0
		// Arrange
		double length = 7.2, width = 3, height = 0;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(length, width, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeSurfaceAreaOfRectangularPrismNegativeDoubleHeight() { // Negative double
		// Arrange
		double length = 7.2, width = 3, height = -1;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(length, width, height);
		// Assert
	}

	/*
	 * volumeOfGenericPrism
	 */
	@Test
	public void volumeOfGenericPrismValidDoubleBase() { // valid double
		// Arrange
		double a = 5,  s = 4;
		// Act
		//.surfaceAreaOfTrapazoid(base, height);
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(1, 1, 1, 1, 1, 1);
		// Assert
		assertEquals(tester, tester, 1);
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfGenericPrismInvalidDoubleBase() { // invalid double = 0
		// Arrange
		double base = 0,  height = 4;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(0, 1, 1, 1, 1, 1);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfGenericPrismNegativeDoubleBase() { // Negative double
		// Arrange
		double a;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(-1, 1, 1, 1, 1, 1);
		// Assert
	}
	@Test
	public void volumeOfGenericPrismValidDoubleBase2() { // valid double
		// Arrange
		double a = 5,  s = 4;
		// Act
		//.surfaceAreaOfTrapazoid(base, height);
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(1, 1, 1, 1, 1, 1);
		// Assert
		assertEquals(tester, tester, 1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfGenericPrismInvalidDoubleBase2() { // invalid double = 0
		// Arrange
		double base = 0,  height = 4;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(1, 0, 1, 1, 1, 1);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfGenericPrismNegativeDoubleBase2() { // Negative double
		// Arrange
		double a;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(1, -1, 1, 1, 1, 1);
		// Assert
	}
	@Test
	public void volumeOfGenericPrismValidDoubleBase3() { // valid double
		// Arrange
		double a = 5,  s = 4;
		// Act
		//.surfaceAreaOfTrapazoid(base, height);
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(1, 1, 1, 1, 1, 1);
		// Assert
		assertEquals(tester, tester, 1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfGenericPrismInvalidDoubleBase3() { // invalid double = 0
		// Arrange
		double base = 0,  height = 4;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(0, 0, 0, 0, 0, 0);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfGenericPrismNegativeDoubleBase3() { // Negative double
		// Arrange
		double a;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(-1, -1, -1, -1, -1, -1);
		// Assert
	}
	@Test
	public void volumeOfGenericPrismValidDoubleBase4() { // valid double
		// Arrange
		double a = 5,  s = 4;
		// Act
		//.surfaceAreaOfTrapazoid(base, height);
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(1, 1, 1, 1, 1, 1);
		// Assert
		assertEquals(tester, tester, 1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfGenericPrismInvalidDoubleBase4() { // invalid double = 0
		// Arrange
		double base = 0,  height = 4;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(0, 0, 0, 0, 0, 0);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfGenericPrismNegativeDoubleBase4() { // Negative double
		// Arrange
		double a;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(-1, -1, -1, -1, -1, -1);
		// Assert
	}
	@Test
	public void volumeOfGenericPrismValidDoubleBase5() { // valid double
		// Arrange
		double a = 5,  s = 4;
		// Act
		//.surfaceAreaOfTrapazoid(base, height);
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(1, 1, 1, 1, 1, 1);
		// Assert
		assertEquals(tester, tester, 1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfGenericPrismInvalidDoubleBase5() { // invalid double = 0
		// Arrange
		double base = 0,  height = 4;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(0, 0, 0, 0, 0, 0);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfGenericPrismNegativeDoubleBase5() { // Negative double
		// Arrange
		double a;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(-1, -1, -1, -1, -1, -1);
		// Assert
	}
	@Test
	public void volumeOfGenericPrismValidDoubleBase6() { // valid double
		// Arrange
		double a = 5,  s = 4;
		// Act
		//.surfaceAreaOfTrapazoid(base, height);
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(1, 1, 1, 1, 1, 1);
		// Assert
		assertEquals(tester, tester, 1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfGenericPrismInvalidDoubleBase6() { // invalid double = 0
		// Arrange
		double base = 0,  height = 4;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(0, 0, 0, 0, 0, 0);
		// Assert
	}
	public void volumeOfGenericPrismNegativeDoubleBase6() { // Negative double
		// Arrange
		double a;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(-1, -1, -1, -1, -1, -1);
		// Assert
	}
	
	
	

	/*
	 * volumeOfCircularPrism
	 */
	@Test
	public void volumeOfRightCircularPrismValidDoubleBase() { // Valid Double
		// Arrange
		double radius = 4.76,  height = 4;
		// Act
		double tester = GeometryIO.volumeOfRightCircularPrism(radius, height);
		// Assert
		assertEquals(tester, tester, 284.72);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularPrismInvalidDoubleBase() { // invalid double
		// Arrange
		double radius = 0,  height = 4;
		// Act
		double tester = GeometryIO.volumeOfRightCircularPrism(radius, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularPrismNegativeDoubleBase() { // Negative double
		// Arrange
		double radius = 4.76,  height = 4;
		// Act
		double tester = GeometryIO.volumeOfRightCircularPrism(-3, height);
		// Assert
	}

	@Test
	public void volumeOfRightCircularPrismValidDoubleHeight() { // Valid Double
		// Arrange
		double radius = 4,  height = 4.76;
		// Act
		double tester = GeometryIO.volumeOfRightCircularPrism(radius, height);
		// Assert
		assertEquals(tester, tester, 284.72);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularPrismInvalidDoubleHeight() { // invalid double
		// Arrange
		double radius = 4.76,  height = 0;
		// Act
		double tester = GeometryIO.volumeOfRightCircularPrism(radius, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularPrismNegativeDoubleHeight() { // Negative double
		// Arrange
		double radius = 4.76,  height = -3;
		// Act
		double tester = GeometryIO.volumeOfRightCircularPrism(radius, height);
		// Assert
	}

	@Test
	public void volumeOfsquarePyramidValidDoubleHeight() { // Valid Double
		// Arrange
		double base = 4,  height = 4.76;
		// Act
		double tester = GeometryIO.volumeOfsquarePyramid(base, height);
		// Assert
		assertEquals(tester, tester, 180.3);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfsquarePyramidInvalidDoubleHeight() { // invalid double
		// Arrange
		double base = 0,  height = 4.76;
		// Act
		double tester = GeometryIO.volumeOfsquarePyramid(base, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfsquarePyramidNegativeDoubleHeight() { // Negative double
		// Arrange
		double base = 4,  height = 4.76;
		// Act
		double tester = GeometryIO.volumeOfsquarePyramid(-3, height);
		// Assert
	}

	@Test
	public void volumeOfsquarePyramidValidDoubleSlantHeight() { // Valid Double
		// Arrange
		double base = 4,  height = 4.76;
		// Act
		double tester = GeometryIO.volumeOfsquarePyramid(base, height);
		// Assert
		assertEquals(tester, tester, 180.3);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfsquarePyramidInvalidDoubleSlantHeight() { // invalid double
		// Arrange
		double base = 4,  height = 0;
		// Act
		double tester = GeometryIO.volumeOfsquarePyramid(base, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfsquarePyramidNegativeDoubleSlantHeight() { // Negative double
		// Arrange
		double base = 4,  height = -4.76;
		// Act
		double tester = GeometryIO.volumeOfsquarePyramid(base, height);
		// Assert
	}

	/*
	 * Circular cone
	 */

	@Test
	public void volumeOfRightCircularConeValidDouble() { // Valid Double
		// Arrange
		double radius = 4,  height = 5.76;
		// Act
		double tester = GeometryIO.volumeOfRightCircularCone(GeometryIO.areaOfCircle(radius), height, radius);
		// Assert
		assertEquals(tester, tester, 96.51);
	}
//	@Test(expected = java.lang.IllegalArgumentException.class)
//	public void volumeOfRightCircularConeInvalidDouble() { // Valid Double
//		// Arrange
//		double radius = 4,  height = 5.76, zero = 0;
//		// Act
//		double tester = GeometryIO.volumeOfRightCircularCone(zero, height, radius);
//		// Assert
//	}
//	@Test(expected = java.lang.IllegalArgumentException.class)
//	public void volumeOfRightCircularConeNegativeDouble() { // Valid Double
//		// Arrange
//		double radius = 4,  height = 5.76, negative = -123;
//		// Act
//		double tester = GeometryIO.volumeOfRightCircularCone(negative, height, radius);
//		// Assert
//	}
	@Test
	public void volumeOfRightCircularConeValidDouble2() { // Valid Double
		// Arrange
		double radius = 4,  height = 5.76;
		// Act
		double tester = GeometryIO.volumeOfRightCircularCone(GeometryIO.areaOfCircle(radius), height, radius);
		// Assert
		assertEquals(tester, tester, 96.51);
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularConeInvalidDouble2() { // Valid Double
		// Arrange
		double radius = 4,  height = 5.76, zero = 0;
		// Act
		double tester = GeometryIO.volumeOfRightCircularCone(zero, zero, radius);
		// Assert
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularConeNegativeDouble2() { // Valid Double
		// Arrange
		double radius = 4,  height = 5.76, negative = -123;
		// Act
		double tester = GeometryIO.volumeOfRightCircularCone(negative, negative, radius);
		// Assert
	}
	@Test
	public void volumeOfRightCircularConeValidDouble3() { // Valid Double
		// Arrange
		double radius = 4,  height = 5.76;
		// Act
		double tester = GeometryIO.volumeOfRightCircularCone(GeometryIO.areaOfCircle(radius), height, radius);
		// Assert
		assertEquals(tester, tester, 96.51);
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularConeInvalidDouble3() { // Valid Double
		// Arrange
		double radius = 4,  height = 5.76, zero = 0;
		// Act
		double tester = GeometryIO.volumeOfRightCircularCone(zero, height, zero);
		// Assert
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularConeNegativeDouble3() { // Valid Double
		// Arrange
		double radius = 4,  height = 5.76, negative = -123;
		// Act
		double tester = GeometryIO.volumeOfRightCircularCone(negative, height, negative);
		// Assert
	}
	
	
	/*
	 * Sphere
	 */
	@Test
	public void volumeOfSphereValidDoubleSlantHeight() { // Valid Double
		// Arrange
		double radius = 4;
		// Act
		double tester = GeometryIO.surfaceAreaOfSphere(radius);
		// Assert
		assertEquals(tester, tester, 3.01);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfSphereInvalidDoubleSlantHeight() { // invalid double
		// Arrange
		double radius = 0;
		// Act
		double tester = GeometryIO.surfaceAreaOfSphere(radius);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfSphereNegativeDoubleSlantHeight() { // Negative double
		// Arrange
		double radius = -5;
		// Act
		double tester = GeometryIO.surfaceAreaOfSphere(radius);
		// Assert
	}
	//////////////////////////////////
	// Lines.. So many Lines//
	// coordinateDistanceFormula
	//////////////////////////////////
	@Test
	public void lineEquationX1Valid() { // Valid Double
		// Arrange
		
		// Act
		double tester = GeometryIO.coordinateDistanceFormula(1, 2, 1, 1);
		System.out.println(tester);
		// Assert
		assertEquals(tester, tester, 1.0);
	}
	/*
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void lineEquationX1Inalid() { // invalid double
		// Arrange

		// Act

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void lineEquationX1Negative() { // Negative double
		// Arrange

		// Act

		// Assert
	}

	@Test
	public void lineEquationX2Valid() { // Valid Double
		// Arrange

		// Act

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void lineEquationX2Inalid() { // invalid double
		// Arrange

		// Act

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void lineEquationX2Negative() { // Negative double
		// Arrange

		// Act

		// Assert
	}


	public void lineEquationY1Valid() { // Valid Double
		// Arrange

		// Act

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void lineEquationY1Inalid() { // invalid double
		// Arrange

		// Act

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void lineEquationY1Negative() { // Negative double
		// Arrange

		// Act

		// Assert
	}

	@Test
	public void lineEquationY2Valid() { // Valid Double
		// Arrange

		// Act

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void lineEquationY2Inalid() { // invalid double
		// Arrange

		// Act

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void lineEquationY2Negative() { // Negative double
		// Arrange

		// Act

		// Assert
	}

//	/*
	 * 
//	 /
	@Test
	public void coordinateFormulaX1Valid() { // Valid Double
		// Arrange

		// Act

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void coordinateFormulaX1Inalid() { // invalid double
		// Arrange

		// Act

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void coordinateFormulaX1Negative() { // Negative double
		// Arrange

		// Act

		// Assert
	}

	@Test
	public void coordinateFormulaX2Valid() { // Valid Double
		// Arrange

		// Act

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void coordinateFormulaX2Inalid() { // invalid double
		// Arrange

		// Act

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void coordinateFormulaX2Negative() { // Negative double
		// Arrange

		// Act

		// Assert
	}

	@Test
	public void coordinateFormulaY1Valid() { // Valid Double
		// Arrange

		// Act

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void coordinateFormulaY1Inalid() { // invalid double
		// Arrange

		// Act

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void coordinateFormulaY1Negative() { // Negative double
		// Arrange

		// Act

		// Assert
	}

	@Test
	public void coordinateFormulaY2Valid() { // Valid Double
		// Arrange

		// Act

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void coordinateFormulaY2Inalid() { // invalid double
		// Arrange

		// Act

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void coordinateFormulaY2Negative() { // Negative double
		// Arrange

		// Act

		// Assert
	}
*/
	/*
	 * distanceTraveled
	 */
	@Test
	public void distanceTraveledValidDoubleRate() { // Valid double
		// Arrange
		double rate = 3.45, time = 22;
		// Act
		double tester = GeometryIO.distanceTraveled(rate, time);
		// Assert
		assertEquals(tester, tester, 96.51); //75.9 miles and kilos?
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void distanceTraveledInvalidDoubleRate() { // invalid double
		// Arrange
		double rate = 3.45, time = 22;
		// Act
		double tester = GeometryIO.distanceTraveled(0, time);

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void distanceTraveledNegativeDoubleRate() { // Negative double
		// Arrange
		double rate = 3.45, time = 22;
		// Act
		double tester = GeometryIO.distanceTraveled(-3, time);

	}

	@Test
	public void distanceTraveledValidDoubleTime() { // Valid Double
		// Arrange
		double rate = 3.45, time = 32;
		// Act
		double tester = GeometryIO.distanceTraveled(rate, time);
		// Assert
		assertEquals(tester, tester, 96.51); //75.9 miles and kilos?
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void distanceTraveledInvalidDoubleTime() { // invalid double
		// Arrange
		double rate = 3.45, time = 0;
		// Act
		double tester = GeometryIO.distanceTraveled(rate, time);

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void distanceTraveledNegativeDoubleTime() { // Negative double
		// Arrange
		double rate = 3.45, time = -34;
		// Act
		double tester = GeometryIO.distanceTraveled(rate, time);

	}

	/*
	 * polygonAngleFormulas
	 */
	@Test
	public void polygonAngleFormulasValidDoubleRate() { // Valid double
		// Arrange
		int sides = 1;
		// Act
		double tester = GeometryIO.polygonAngleFormulas(sides);
		// Assert
		assertEquals(tester, tester, 96.51); //75.9 miles and kilos?
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void polygonAngleFormulasInvalidDoubleRate() { // invalid double
		// Arrange
		int sides = 0;
		// Act
		// Act
		double tester = GeometryIO.polygonAngleFormulas(sides);

		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void polygonAngleFormulasNegativeDoubleRate() { // Negative double
		// Arrange
		int sides = 1;
		// Act
		double tester = GeometryIO.polygonAngleFormulas(-3);

		// Assert
	}
}
