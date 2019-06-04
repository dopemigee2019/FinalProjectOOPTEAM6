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
		// 1.0 5.0 13
		assertEquals(10, tester, 0);
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
		assertEquals(10, tester, 00);
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
		assertEquals(25, tester, 0);
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
		assertEquals(25, tester, 0);
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
		assertEquals(25, tester, 0);
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
		assertEquals(36, tester, 0);
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
		assertEquals(1, tester, 0);
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
		assertEquals(26, tester, 0);
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
		assertEquals(22, tester, 0);
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
		assertEquals(Math.PI, tester, 0.1);
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
	 * surfaceAreaOfRectangularPrism test
	 */

	/*
	 * volumeOfCircularPrism
	 */
	@Test
	public void volumeOfRightCircularPrismValidDoubleBase() { // Valid Double
		// Arrange
		double radius = 4.76, height = 4;
		// Act
		double tester = GeometryIO.volumeOfRightCircularPrism(radius, height);
		// Assert
		assertEquals(284.72, tester, .1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularPrismInvalidDoubleBase() { // invalid double
		// Arrange
		double radius = 0, height = 4;
		// Act
		double tester = GeometryIO.volumeOfRightCircularPrism(radius, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularPrismNegativeDoubleBase() { // Negative double
		// Arrange
		double radius = 4.76, height = 4;
		// Act
		double tester = GeometryIO.volumeOfRightCircularPrism(-3, height);
		// Assert
	}

	@Test
	public void volumeOfRightCircularPrismValidDoubleHeight() { // Valid Double
		// Arrange
		double radius = 4, height = 4.76;
		// Act
		double tester = GeometryIO.volumeOfRightCircularPrism(radius, height);
		// Assert
		assertEquals(284.72, tester, .1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularPrismInvalidDoubleHeight() { // invalid double
		// Arrange
		double radius = 4.76, height = 0;
		// Act
		double tester = GeometryIO.volumeOfRightCircularPrism(radius, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularPrismNegativeDoubleHeight() { // Negative double
		// Arrange
		double radius = 4.76, height = -3;
		// Act
		double tester = GeometryIO.volumeOfRightCircularPrism(radius, height);
		// Assert
	}

	@Test
	public void volumeOfsquarePyramidValidDoubleHeight() { // Valid Double
		// Arrange
		double base = 4, height = 4.76;
		// Act
		double tester = GeometryIO.volumeOfsquarePyramid(base, height);
		// Assert
		assertEquals(25.39, tester, .1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfsquarePyramidInvalidDoubleHeight() { // invalid double
		// Arrange
		double base = 0, height = 4.76;
		// Act
		double tester = GeometryIO.volumeOfsquarePyramid(base, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfsquarePyramidNegativeDoubleHeight() { // Negative double
		// Arrange
		double base = 4, height = 4.76;
		// Act
		double tester = GeometryIO.volumeOfsquarePyramid(-3, height);
		// Assert
	}

	@Test
	public void volumeOfsquarePyramidValidDoubleSlantHeight() { // Valid Double
		// Arrange
		double base = 4, height = 4.76;
		// Act
		double tester = GeometryIO.volumeOfsquarePyramid(base, height);
		// Assert
		assertEquals(180.3, tester, .1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfsquarePyramidInvalidDoubleSlantHeight() { // invalid double
		// Arrange
		double base = 4, height = 0;
		// Act
		double tester = GeometryIO.volumeOfsquarePyramid(base, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfsquarePyramidNegativeDoubleSlantHeight() { // Negative double
		// Arrange
		double base = 4, height = -4.76;
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
		double radius = 4, height = 5.76;
		// Act
		double tester = GeometryIO.volumeOfRightCircularCone(GeometryIO.areaOfCircle(radius), height, radius);
		// Assert
		assertEquals(96.51, tester, .1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularConeInvalidDouble() { // Valid Double
		// Arrange
		double radius = 4, height = 5.76, zero = 0;
		// Act
		double tester = GeometryIO.volumeOfRightCircularCone(zero, height, radius);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularConeNegativeDouble() { // Valid Double
		// Arrange
		double radius = 4, height = 5.76, negative = -123;
		// Act
		double tester = GeometryIO.volumeOfRightCircularCone(negative, height, radius);
		// Assert
	}

	@Test
	public void volumeOfRightCircularConeValidDouble2() { // Valid Double
		// Arrange
		double radius = 4, height = 5.76;
		// Act
		double tester = GeometryIO.volumeOfRightCircularCone(GeometryIO.areaOfCircle(radius), height, radius);
		// Assert
		assertEquals(tester, tester, 96.51);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularConeInvalidDouble2() { // Valid Double
		// Arrange
		double radius = 4, height = 5.76, zero = 0;
		// Act
		double tester = GeometryIO.volumeOfRightCircularCone(zero, zero, radius);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularConeNegativeDouble2() { // Valid Double
		// Arrange
		double radius = 4, height = 5.76, negative = -123;
		// Act
		double tester = GeometryIO.volumeOfRightCircularCone(negative, negative, radius);
		// Assert
	}

	@Test
	public void volumeOfRightCircularConeValidDouble3() { // Valid Double
		// Arrange
		double radius = 4, height = 5.76;
		// Act
		double tester = GeometryIO.volumeOfRightCircularCone(GeometryIO.areaOfCircle(radius), height, radius);
		// Assert
		assertEquals(96.51, tester, .1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularConeInvalidDouble3() { // Valid Double
		// Arrange
		double radius = 4, height = 5.76, zero = 0;
		// Act
		double tester = GeometryIO.volumeOfRightCircularCone(zero, height, zero);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRightCircularConeNegativeDouble3() { // Valid Double
		// Arrange
		double radius = 4, height = 5.76, negative = -123;
		// Act
		double tester = GeometryIO.volumeOfRightCircularCone(negative, height, negative);
		// Assert
	}

	//////////////////////////////////
	// Lines.. So many Lines//
	// coordinateDistanceFormula
	//////////////////////////////////
	@Test
	public void lineEquationX1Valid() { // Valid Double
		// Arrange
		double x1 = 1, x2 = 2, y1 = 1, y2 = 1;
		// Act
		double tester = GeometryIO.coordinateDistanceFormula(x1, x2, y1, y2);
		// Assert
		assertEquals(1, tester, 0);
	}

	@Test
	public void lineEquationX1Inalid() { // Negitive double
		// Arrange
		double x1 = -1, x2 = -2, y1 = -1, y2 = -1;
		// Act
		double tester = GeometryIO.coordinateDistanceFormula(x1, x2, y1, y2);
		// Assert
		assertEquals(1, tester, 0);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void lineEquationX1Negative() { // Same x's double
		// Arrange
		double x1 = 1, x2 = 1, y1 = 1, y2 = 1;
		// Act
		double tester = GeometryIO.coordinateDistanceFormula(x1, x2, y1, y2);
		// Assert
	}

	@Test
	public void lineEquationX2Valid() { // all zero
		// Arrange
		double x1 = 0, x2 = -1, y1 = 0, y2 = 0;
		// Act
		double tester = GeometryIO.coordinateDistanceFormula(x1, x2, y1, y2);
		// Assert
		assertEquals(1.0, tester, 0);
	}

	@Test
	public void lineEquationX2ValidP2() { // all zero
		// Arrange
		double x1 = 1, x2 = 0, y1 = 0, y2 = 0;
		// Act
		double tester = GeometryIO.coordinateDistanceFormula(x1, x2, y1, y2);
		// Assert
		assertEquals(1.0, tester, 0);
	}

	@Test
	public void midpointX1Valid() { // Valid Double
		// Arrange
		double x1 = 1, x2 = 2, y1 = 1, y2 = 1;
		// Act
		String tester = GeometryIO.coordinateMidpointFormula(x1, x2, y1, y2);

		// Assert
		assertEquals(tester, "( 1.5 , 1.0 )");
	}

	@Test
	public void midpointX1Inalid() { // Negitive double
		// Arrange
		double x1 = -1, x2 = -2, y1 = -1, y2 = -1;
		// Act
		String tester = GeometryIO.coordinateMidpointFormula(x1, x2, y1, y2);
		// Assert
		assertEquals(tester, "( -1.5 , -1.0 )");
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void midpointX1Negative() { // Same x's double
		// Arrange
		double x1 = 1, x2 = 1, y1 = 1, y2 = 1;
		// Act
		String tester = GeometryIO.coordinateMidpointFormula(x1, x2, y1, y2);
		// Assert
	}

	@Test
	public void midpointX2Valid() { // all zero
		// Arrange
		double x1 = 0, x2 = -1, y1 = 0, y2 = 0;
		// Act
		String tester = GeometryIO.coordinateMidpointFormula(x1, x2, y1, y2);
		// Assert
		assertEquals(tester, "( -0.5 , 0.0 )");
	}

	@Test
	public void midpointX2ValidP2() { // all zero
		// Arrange
		double x1 = 1, x2 = 0, y1 = 0, y2 = 0;
		// Act
		String tester = GeometryIO.coordinateMidpointFormula(x1, x2, y1, y2);
		// Assert
		assertEquals(tester, "( 0.5 , 0.0 )");
	}

	// SlopeFormula
	@Test
	public void slopeFormulaX1Valid() { // Valid Double Slope 0
		// Arrange
		double x1 = 1, x2 = 2, y1 = 1, y2 = 1;
		// Act
		double tester = GeometryIO.coordinateSlopeFormula(x1, x2, y1, y2);
		// Assert
		assertEquals(0, tester, 0);
	}

	@Test
	public void slopeFormulaX1Inalid() { // Negitive double slope 0
		// Arrange
		double x1 = -1, x2 = -2, y1 = -1, y2 = -1;
		// Act
		double tester = GeometryIO.coordinateSlopeFormula(x1, x2, y1, y2);
		// Assert
		assertEquals(0, tester, 0);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void slopeFormulaX1Negative() { // Same x's double
		// Arrange
		double x1 = 1, x2 = 1, y1 = 1, y2 = 1;
		// Act
		double tester = GeometryIO.coordinateSlopeFormula(x1, x2, y1, y2);
		// Assert
	}

	@Test
	public void slopeFormulaX2Valid() { // Negitive Slope
		// Arrange
		double x1 = 0, x2 = 1, y1 = 1, y2 = 0;
		// Act
		double tester = GeometryIO.coordinateSlopeFormula(x1, x2, y1, y2);
		// Assert
		assertEquals(-1, tester, -1);
	}

	@Test
	public void slopeFormulaX2ValidP2() { // all zero
		// Arrange
		double x1 = 2, x2 = 4, y1 = 0, y2 = 1;
		// Act
		double tester = GeometryIO.coordinateSlopeFormula(x1, x2, y1, y2);
		// Assert
		assertEquals(2, tester, 2);
	}

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
		assertEquals(75.9, tester, .1); // 75.9 miles and kilos?
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
		assertEquals(110.4, tester, .1); // 75.9 miles and kilos?
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
		assertEquals(96.51, tester, .1); // 75.9 miles and kilos?
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
	/*
	 * Surface area
	 */

	@Test
	public void surfaceAreaOfRectangularPrismValidDoublelength() { // valid double
		// Arrange
		double length = 7.2, width = 3, height = 1;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(length, width, height);
		// Assert
		assertEquals(21.6, tester, .1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRectangularPrismInvalidDoublelength() { // invalid double = 0
		// Arrange
		double length = 0, width = 3, height = 1;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(length, width, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRectangularPrismNegativeDoublelength() { // Negative double
		// Arrange
		double length = 7.2, width = 3, height = 1;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(-3, width, height);
		// Assert
	}

	@Test
	public void surfaceAreaOfRectangularPrismValidDoublewidth() { // valid double
		// Arrange
		double length = 3, width = 6.2, height = 1;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(length, width, height);
		// Assert
		assertEquals(18.6, tester, .1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRectangularPrismInvalidDoublewidth() { // invalid double = 0
		// Arrange
		double length = 7.2, width = 0, height = 1;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(length, width, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRectangularPrismNegativeDoublewidth() { // Negative double
		// Arrange
		double length = 7.2, width = -9, height = 1;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(length, width, height);
		// Assert
	}

	@Test
	public void surfaceAreaOfRectangularPrismValidDoubleHeight() { // valid double
		// Arrange
		double length = 2, width = 6.2, height = 1;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(length, width, height);
		// Assert

		assertEquals(41.2, tester, .1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRectangularPrismInvalidDoubleHeight() { // invalid double = 0
		// Arrange
		double length = 7.2, width = 3, height = 0;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(length, width, height);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRectangularPrismNegativeDoubleHeight() { // Negative double
		// Arrange
		double length = 7.2, width = 3, height = -1;
		// Act
		double tester = GeometryIO.surfaceAreaOfRectangularPrism(length, width, height);
		// Assert
	}

	/*
	 * surfaceAreaOfGeneralPrism
	 */
	@Test
	public void surfaceAreaOfGeneralPrismValidDoubleBase() { // valid double
		// Arrange
		double a = 5, s = 4;
		// Act
		// .surfaceAreaOfTrapazoid(base, height);
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(1, 1, 1, 1, 1, 1);

		// Assert
		assertEquals(6, tester, 0);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfGeneralPrismInvalidDoubleBase() { // invalid double = 0
		// Arrange
		double base = 0, height = 4;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(0, 1, 1, 1, 1, 1);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfGeneralPrismNegativeDoubleBase() { // Negative double
		// Arrange
		double a;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(-1, 1, 1, 1, 1, 1);
		// Assert
	}

	@Test
	public void surfaceAreaOfGeneralPrismValidDoubleBase2() { // valid double
		// Arrange
		double a = 5, s = 4;
		// Act
		// .surfaceAreaOfTrapazoid(base, height);
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(1, 1, 1, 1, 1, 1);
		// Assert
		assertEquals(6, tester, 0);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfGeneralPrismInvalidDoubleBase2() { // invalid double = 0
		// Arrange
		double base = 0, height = 4;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(1, 0, 1, 1, 1, 1);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfGeneralPrismNegativeDoubleBase2() { // Negative double
		// Arrange
		double a;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(1, -1, 1, 1, 1, 1);
		// Assert
	}

	@Test
	public void surfaceAreaOfGeneralPrismValidDoubleBase3() { // valid double
		// Arrange
		double a = 5, s = 4;
		// Act
		// .surfaceAreaOfTrapazoid(base, height);
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(1, 1, 1, 1, 1, 1);
		// Assert
		assertEquals(6, tester, 0);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfGeneralPrismInvalidDoubleBase3() { // invalid double = 0
		// Arrange
		double base = 0, height = 4;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(0, 0, 0, 0, 0, 0);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfGeneralPrismNegativeDoubleBase3() { // Negative double
		// Arrange
		double a;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(-1, -1, -1, -1, -1, -1);
		// Assert
	}

	@Test
	public void surfaceAreaOfGeneralPrismValidDoubleBase4() { // valid double
		// Arrange
		double a = 5, s = 4;
		// Act
		// .surfaceAreaOfTrapazoid(base, height);
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(1, 1, 1, 1, 1, 1);

		// Assert
		assertEquals(6, tester, 0);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfGeneralPrismInvalidDoubleBase4() { // invalid double = 0
		// Arrange
		double base = 0, height = 4;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(0, 0, 0, 0, 0, 0);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfGeneralPrismNegativeDoubleBase4() { // Negative double
		// Arrange
		double a;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(-1, -1, -1, -1, -1, -1);
		// Assert
	}

	@Test
	public void surfaceAreaOfGeneralPrismValidDoubleBase5() { // valid double
		// Arrange
		double a = 5, s = 4;
		// Act
		// .surfaceAreaOfTrapazoid(base, height);
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(1, 1, 1, 1, 1, 1);
		// Assert
		assertEquals(6, tester, 0);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfGeneralPrismInvalidDoubleBase5() { // invalid double = 0
		// Arrange
		double base = 0, height = 4;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(0, 0, 0, 0, 0, 0);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfGeneralPrismNegativeDoubleBase5() { // Negative double
		// Arrange
		double a;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(-1, -1, -1, -1, -1, -1);
		// Assert
	}

	@Test
	public void surfaceAreaOfGeneralPrismValidDoubleBase6() { // valid double
		// Arrange
		double a = 5, s = 4;
		// Act
		// .surfaceAreaOfTrapazoid(base, height);
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(1, 1, 1, 1, 1, 1);
		// Assert
		assertEquals(6, tester, 0);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfGeneralPrismInvalidDoubleBase6() { // invalid double = 0
		// Arrange
		double base = 0, height = 4;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(0, 0, 0, 0, 0, 0);
		// Assert
	}

	public void surfaceAreaOfGeneralPrismNegativeDoubleBase6() { // Negative double
		// Arrange
		double a;
		// Act
		double tester = GeometryIO.surfaceAreaOfGeneralPrism(-1, -1, -1, -1, -1, -1);
		// Assert
	}

	/*
	 * Sphere
	 */
	@Test
	public void surfaceAreaOfSphereValidDoubleSlantHeight() { // Valid Double
		// Arrange
		double radius = 4;
		// Act
		double tester = GeometryIO.surfaceAreaOfSphere(radius);
		// Assert

		assertEquals(201.06, tester, .1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfSphereInvalidDoubleSlantHeight() { // invalid double
		// Arrange
		double radius = 0;
		// Act
		double tester = GeometryIO.surfaceAreaOfSphere(radius);
		// Assert
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfSphereNegativeDoubleSlantHeight() { // Negative double
		// Arrange
		double radius = -5;
		// Act
		double tester = GeometryIO.surfaceAreaOfSphere(radius);
		// Assert
	}

	@Test
	public void volumeOfGeneralPrismValid() { // Negative double
		// Arrange
		double base = 1, height = 1;
		// Act
		double tester = GeometryIO.volumeOfGeneralPrism(base, height);
		// Assert
		assertEquals(1, tester, .1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfGeneralPrismValidNegative() { // Negative double
		// Arrange
		double base = -1, height = 1;
		// Act
		double tester = GeometryIO.volumeOfGeneralPrism(base, height);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfGeneralPrismValidZero() { // Negative double
		// Arrange
		double base = 0, height = 1;
		// Act
		double tester = GeometryIO.volumeOfGeneralPrism(base, height);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfGeneralPrismValidNegative2() { // Negative double
		// Arrange
		double base = 1, height = -1;
		// Act
		double tester = GeometryIO.volumeOfGeneralPrism(base, height);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfGeneralPrismValidZero2() { // Negative double
		// Arrange
		double base = 1, height = 0;
		// Act
		double tester = GeometryIO.volumeOfGeneralPrism(base, height);
		// Assert

	}

	@Test
	public void volumeOfRectangularPrismValid() { // Negative double
		// Arrange
		double length = 1, height = 1, width = 1;
		// Act
		double tester = GeometryIO.volumeOfRectangularPrism(height, length, width);
		// Assert
		assertEquals(1, tester, .1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRectangularPrismValidNegative() { // Negative double
		// Arrange
		double length = -1, height = 1, width = 1;
		// Act
		double tester = GeometryIO.volumeOfRectangularPrism(height, length, width);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRectangularPrismValidZero() { // Negative double
		// Arrange
		double length = 0, height = 1, width = 1;
		// Act
		double tester = GeometryIO.volumeOfRectangularPrism(height, length, width);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRectangularPrismValidNegative2() { // Negative double
		// Arrange
		double length = 1, height = -1, width = 1;
		// Act
		double tester = GeometryIO.volumeOfRectangularPrism(height, length, width);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRectangularPrismValidZero2() { // Negative double
		// Arrange
		double length = 1, height = 0, width = 1;
		// Act
		double tester = GeometryIO.volumeOfRectangularPrism(height, length, width);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRectangularPrismValidNegative3() { // Negative double
		// Arrange
		double length = 1, height = 1, width = -1;
		// Act
		double tester = GeometryIO.volumeOfRectangularPrism(height, length, width);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfRectangularPrismValidZero3() { // Negative double
		// Arrange
		double length = 1, height = 1, width = 0;
		// Act
		double tester = GeometryIO.volumeOfRectangularPrism(height, length, width);
		// Assert

	}

	@Test
	public void volumeOfSphereValid() { // Negative double
		// Arrange
		double radius = 1;
		// Act
		double tester = GeometryIO.volumeOfSphere(radius);
		// Assert
		assertEquals(4.19, tester, .1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfSphereValidNegative() { // Negative double
		// Arrange
		double radius = -1;
		// Act
		double tester = GeometryIO.volumeOfSphere(radius);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void volumeOfSphereValidZero() { // Negative double
		// Arrange
		double radius = 0;
		// Act
		double tester = GeometryIO.volumeOfSphere(radius);
		// Assert

	}

	@Test
	public void circumferenceOfCircleValid() { // Negative double
		// Arrange
		double radius = 1;
		// Act
		double tester = GeometryIO.circumferenceOfCircle(radius);
		// Assert
		assertEquals(4.19, tester, .1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void circumferenceOfCircleValidNegative() { // Negative double
		// Arrange
		double radius = -1;
		// Act
		double tester = GeometryIO.circumferenceOfCircle(radius);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void circumferenceOfCircleValidZero() { // Negative double
		// Arrange
		double radius = 0;
		// Act
		double tester = GeometryIO.circumferenceOfCircle(radius);
		// Assert

	}


	public void surfaceAreaOfRightCircularConeValid() { // Negative double
		// Arrange
		double areaOfBase = 3.14, radius = 1, slantHeight = 1.41, circumference = 6.28;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularCone(areaOfBase, radius, slantHeight, circumference);
		// Assert
		assertEquals(7.58, tester, .1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRightCircularConeValidNegative() { // Negative double
		// Arrange
		double areaOfBase = -3.14, radius = 1, slantHeight = 1.41, circumference = 6.28;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularCone(areaOfBase, radius, slantHeight, circumference);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRightCircularConeValidZero() { // Negative double
		// Arrange
		double areaOfBase = 0, radius = 1, slantHeight = 1.41, circumference = 6.28;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularCone(areaOfBase, radius, slantHeight, circumference);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRightCircularConeValidNegative2() { // Negative double
		// Arrange
		double areaOfBase = 3.14, radius = -1, slantHeight = 1.41, circumference = 6.28;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularCone(areaOfBase, radius, slantHeight, circumference);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRightCircularConeValidZero2() { // Negative double
		// Arrange
		double areaOfBase = 3.14, radius = 0, slantHeight = 1.41, circumference = 6.28;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularCone(areaOfBase, radius, slantHeight, circumference);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRightCircularConeValidNegative3() { // Negative double
		// Arrange
		double areaOfBase = 3.14, radius = 1, slantHeight = -1.41, circumference = 6.28;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularCone(areaOfBase, radius, slantHeight, circumference);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRightCircularConeValidZero3() { // Negative double
		// Arrange
		double areaOfBase = 3.14, radius = 1, slantHeight = 0, circumference = 6.28;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularCone(areaOfBase, radius, slantHeight, circumference);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRightCircularConeValidNegative4() { // Negative double
		// Arrange
		double areaOfBase = 3.14, radius = 1, slantHeight = 1.41, circumference = -6.28;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularCone(areaOfBase, radius, slantHeight, circumference);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRightCircularConeValidZero4() { // Negative double
		// Arrange
		double areaOfBase = 3.14, radius = 1, slantHeight = 1.41, circumference = 0;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularCone(areaOfBase, radius, slantHeight, circumference);
		// Assert

	}

	@Test
	public void surfaceAreaOfRightCircularPrismValid() { // Negative double
		// Arrange
		double base = 3.14, radius = 1, height = 1, circumference = 6.28;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularPrism(base, height, radius, circumference);
		// Assert
		assertEquals(12.52, tester, .1);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRightCircularPrismValidNegative() { // Negative double
		// Arrange
		double base = -3.14, radius = 1, height = 1, circumference = 6.28;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularPrism(base, height, radius, circumference);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRightCircularPrismValidZero() { // Negative double
		// Arrange
		double base = 0, radius = 1, height = 1, circumference = 6.28;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularPrism(base, height, radius, circumference);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRightCircularPrismValidNegative2() { // Negative double
		// Arrange
		double base = 3.14, radius = -1, height = 1, circumference = 6.28;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularPrism(base, height, radius, circumference);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRightCircularPrismValidZero2() { // Negative double
		// Arrange
		double base = 3.14, radius = 0, height = 1, circumference = 6.28;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularPrism(base, height, radius, circumference);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRightCircularPrismValidNegative3() { // Negative double
		// Arrange
		double base = 3.14, radius = 1, height = -1, circumference = 6.28;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularPrism(base, height, radius, circumference);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRightCircularPrismValidZero3() { // Negative double
		// Arrange
		double base = 3.14, radius = 1, height = 0, circumference = 6.28;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularPrism(base, height, radius, circumference);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRightCircularPrismValidNegative4() { // Negative double
		// Arrange
		double base = 3.14, radius = 1, height = 1, circumference = -6.28;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularPrism(base, height, radius, circumference);
		// Assert

	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void surfaceAreaOfRightCircularPrismValidZero4() { // Negative double
		// Arrange
		double base = 3.14, radius = 1, height = 1, circumference = 0;
		// Act
		double tester = GeometryIO.surfaceAreaOfRightCircularPrism(base, height, radius, circumference);
		// Assert

	}
}
