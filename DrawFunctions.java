package mainpackage;

import static java.lang.Math.atan;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.toDegrees;
import static java.lang.Math.toRadians;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.LinkedList;

public class DrawFunctions {
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Functions Used Below //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public double[] shiftAroundPoint(double xIsShiftedInput, double yIsShiftedInput, double xShiftAroundInput, double yShiftAroundInput, int degreeInput){
		double[] output = {xIsShiftedInput, yIsShiftedInput};
		double s = sin(toRadians(degreeInput)), c = cos(toRadians(degreeInput));
		output[0] -= xShiftAroundInput;
		output[1] -= yShiftAroundInput;
		// rotate point
		double xnew = output[0] * c - output[1] * s;
		double ynew = output[0] * s + output[1] * c;
		// translate point back:
		output[0] = xnew + xShiftAroundInput;
		output[1] = ynew + yShiftAroundInput;
		return output;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Four Base Shapes And N Sided Shape ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// (These have been briefly tested)   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void drawAndFillTriangle(int xOneInput, int yOneInput, int xTwoInput, int yTwoInput, int xThreeInput, int yThreeInput, Color outlineInput,
			Color fillInput, Graphics2D graphicsTwoDInput){
		double points[][] = {{xOneInput, yOneInput},
				{xTwoInput, yTwoInput},
				{xThreeInput, yThreeInput}
				};
		GeneralPath triangle = new GeneralPath();
		triangle.moveTo(points[0][0], points[0][1]);
        for (int k = 1; k < points.length; k++)
        	triangle.lineTo(points[k][0], points[k][1]);
        triangle.closePath();
        if(fillInput != null){
        graphicsTwoDInput.setColor(fillInput);
        graphicsTwoDInput.fill(triangle);
        }
        if(outlineInput != null){
        	graphicsTwoDInput.setColor(outlineInput);
        	graphicsTwoDInput.draw(triangle);
        }
	}
	public void drawAndFillQuadrilateral(int xOneInput, int yOneInput, int xTwoInput, int yTwoInput, int xThreeInput, int yThreeInput, int xFourInput, int yFourInput,
			Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		double points[][] = {{xOneInput, yOneInput},
				{xTwoInput, yTwoInput},
				{xThreeInput, yThreeInput},
				{xFourInput, yFourInput}
				};
		GeneralPath quadrilateral = new GeneralPath();
		quadrilateral.moveTo(points[0][0], points[0][1]);
        for (int k = 1; k < points.length; k++)
        	quadrilateral.lineTo(points[k][0], points[k][1]);
        quadrilateral.closePath();
        if(fillInput != null){
        graphicsTwoDInput.setColor(fillInput);
        graphicsTwoDInput.fill(quadrilateral);
        }
        if(outlineInput != null){
        	graphicsTwoDInput.setColor(outlineInput);
        	graphicsTwoDInput.draw(quadrilateral);
        }
	}
	public void drawAndFillPentagon(int xOneInput, int yOneInput, int xTwoInput, int yTwoInput, int xThreeInput, int yThreeInput, int xFourInput, int yFourInput,
			int xFiveInput, int yFiveInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		double points[][] = {{xOneInput, yOneInput},
				{xTwoInput, yTwoInput},
				{xThreeInput, yThreeInput},
				{xFourInput, yFourInput},
				{xFiveInput, yFiveInput}
				};
		GeneralPath pentagon = new GeneralPath();
		pentagon.moveTo(points[0][0], points[0][1]);
        for (int k = 1; k < points.length; k++)
        	pentagon.lineTo(points[k][0], points[k][1]);
        pentagon.closePath();
        if(fillInput != null){
        graphicsTwoDInput.setColor(fillInput);
        graphicsTwoDInput.fill(pentagon);
        }
        if(outlineInput != null){
        	graphicsTwoDInput.setColor(outlineInput);
        	graphicsTwoDInput.draw(pentagon);
        }
	}
	public void drawAndFillHexagon(int xOneInput, int yOneInput, int xTwoInput, int yTwoInput, int xThreeInput, int yThreeInput, int xFourInput, int yFourInput,
			int xFiveInput, int yFiveInput, int xSixInput, int ySixInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		double points[][] = {{xOneInput, yOneInput},
				{xTwoInput, yTwoInput},
				{xThreeInput, yThreeInput},
				{xFourInput, yFourInput},
				{xFiveInput, yFiveInput},
				{xSixInput, ySixInput}
				};
		GeneralPath hexagon = new GeneralPath();
		hexagon.moveTo(points[0][0], points[0][1]);
        for (int k = 1; k < points.length; k++)
        	hexagon.lineTo(points[k][0], points[k][1]);
        hexagon.closePath();
        if(fillInput != null){
        graphicsTwoDInput.setColor(fillInput);
        graphicsTwoDInput.fill(hexagon);
        }
        if(outlineInput != null){
        	graphicsTwoDInput.setColor(outlineInput);
        	graphicsTwoDInput.draw(hexagon);
        }
	}
	public void drawAndFillNSidedShape(double[][] pointsInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		GeneralPath shape = new GeneralPath();
		shape.moveTo(pointsInput[0][0], pointsInput[0][1]);
        for (int k = 1; k < pointsInput.length; k++)
        	shape.lineTo(pointsInput[k][0], pointsInput[k][1]);
        shape.closePath();
        if(fillInput != null){
        	graphicsTwoDInput.setColor(fillInput);
        	graphicsTwoDInput.fill(shape);
        }
        if(outlineInput != null){
        	graphicsTwoDInput.setColor(outlineInput);
        	graphicsTwoDInput.draw(shape);
        }
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Four Base Shapes And N Sided Shape, Rotated ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// (These have been briefly tested)            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void drawAndFillTriangleRotated(int angleInput, int xOneInput, int yOneInput, int xTwoInput, int yTwoInput, int xThreeInput, int yThreeInput,
			Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		double points[][] = {{xOneInput, yOneInput},
				{xTwoInput, yTwoInput},
				{xThreeInput, yThreeInput}
				};
		double xRot = 0, yRot = 0, over = 0;
        for (int k = 0; k < points.length; k++){
        	xRot += points[k][0];
        	yRot += points[k][1]; 
        	over++;
        }
        xRot = xRot / over;
        yRot = yRot / over;
        for (int k = 0; k < points.length; k++){
        	points[k] = shiftAroundPoint(points[k][0], points[k][1], xRot, yRot, angleInput);
        }
		GeneralPath triangle = new GeneralPath();
		triangle.moveTo(points[0][0], points[0][1]);
        for (int k = 1; k < points.length; k++)
        	triangle.lineTo(points[k][0], points[k][1]);
        triangle.closePath();
        if(fillInput != null){
        	graphicsTwoDInput.setColor(fillInput);
        	graphicsTwoDInput.fill(triangle);
        }
        if(outlineInput != null){
        	graphicsTwoDInput.setColor(outlineInput);
        	graphicsTwoDInput.draw(triangle);
        }
	}
	public void drawAndFillQuadrilateralRotated(int angleInput, int xOneInput, int yOneInput, int xTwoInput, int yTwoInput, int xThreeInput, int yThreeInput, int xFourInput, int yFourInput,
			Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		double points[][] = {{xOneInput, yOneInput},
				{xTwoInput, yTwoInput},
				{xThreeInput, yThreeInput},
				{xFourInput, yFourInput}
				};
		double xRot = 0, yRot = 0, over = 0;
        for (int k = 0; k < points.length; k++){
        	xRot += points[k][0];
        	yRot += points[k][1]; 
        	over++;
        }
        xRot = xRot / over;
        yRot = yRot / over;
        for (int k = 0; k < points.length; k++){
        	points[k] = shiftAroundPoint(points[k][0], points[k][1], xRot, yRot, angleInput);
        }
		GeneralPath quadrilateral = new GeneralPath();
		quadrilateral.moveTo(points[0][0], points[0][1]);
        for (int k = 1; k < points.length; k++)
        	quadrilateral.lineTo(points[k][0], points[k][1]);
        quadrilateral.closePath();
        if(fillInput != null){
        graphicsTwoDInput.setColor(fillInput);
        graphicsTwoDInput.fill(quadrilateral);
        }
        if(outlineInput != null){
        	graphicsTwoDInput.setColor(outlineInput);
        	graphicsTwoDInput.draw(quadrilateral);
        }
	}
	public void drawAndFillPentagonRotated(int angleInput, int xOneInput, int yOneInput, int xTwoInput, int yTwoInput, int xThreeInput, int yThreeInput, int xFourInput, int yFourInput,
			int xFiveInput, int yFiveInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		double points[][] = {{xOneInput, yOneInput},
				{xTwoInput, yTwoInput},
				{xThreeInput, yThreeInput},
				{xFourInput, yFourInput},
				{xFiveInput, yFiveInput}
				};
        for (int k = 0; k < points.length; k++){
        	points[k] = shiftAroundPoint(points[k][0], points[k][1], points[0][0], points[0][1], angleInput);
        }
		GeneralPath pentagon = new GeneralPath();
		pentagon.moveTo(points[0][0], points[0][1]);
        for (int k = 1; k < points.length; k++)
        	pentagon.lineTo(points[k][0], points[k][1]);
        pentagon.closePath();
        if(fillInput != null){
        graphicsTwoDInput.setColor(fillInput);
        graphicsTwoDInput.fill(pentagon);
        }
        if(outlineInput != null){
        	graphicsTwoDInput.setColor(outlineInput);
        	graphicsTwoDInput.draw(pentagon);
        }
	}
	public void drawAndFillHexagonRotated(int angleInput, int xOneInput, int yOneInput, int xTwoInput, int yTwoInput, int xThreeInput, int yThreeInput, int xFourInput, int yFourInput,
			int xFiveInput, int yFiveInput, int xSixInput, int ySixInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		double points[][] = {{xOneInput, yOneInput},
				{xTwoInput, yTwoInput},
				{xThreeInput, yThreeInput},
				{xFourInput, yFourInput},
				{xFiveInput, yFiveInput},
				{xSixInput, ySixInput}
				};
        for (int k = 0; k < points.length; k++){
        	points[k] = shiftAroundPoint(points[k][0], points[k][1], points[0][0], points[0][1], angleInput);
        }
		GeneralPath hexagon = new GeneralPath();
		hexagon.moveTo(points[0][0], points[0][1]);
        for (int k = 1; k < points.length; k++)
        	hexagon.lineTo(points[k][0], points[k][1]);
        hexagon.closePath();
        if(fillInput != null){
        graphicsTwoDInput.setColor(fillInput);
        graphicsTwoDInput.fill(hexagon);
        }
        if(outlineInput != null){
        	graphicsTwoDInput.setColor(outlineInput);
        	graphicsTwoDInput.draw(hexagon);
        }
	}
	public void drawAndFillNSidedShapeRotated(int angleInput, double[][] pointsInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
        double[][] points = new double[pointsInput.length][2];
		for (int k = 0; k < points.length; k++){
        	points[k] = shiftAroundPoint(pointsInput[k][0], pointsInput[k][1], pointsInput[0][0], pointsInput[0][1], angleInput);
        }
		GeneralPath shape = new GeneralPath();
		shape.moveTo(points[0][0], points[0][1]);
        for (int k = 1; k < points.length; k++)
        	shape.lineTo(points[k][0], points[k][1]);
        shape.closePath();
        if(fillInput != null){
        	graphicsTwoDInput.setColor(fillInput);
        	graphicsTwoDInput.fill(shape);
        }
        if(outlineInput != null){
        	graphicsTwoDInput.setColor(outlineInput);
        	graphicsTwoDInput.draw(shape);
        }
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Simple Shapes                               ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// (These have been briefly tested)            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void drawAndFillEllipse(int xInput, int yInput, int widthInput, int heightInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		int xMid = (int) (xInput + ( widthInput / 2.0)),
				yMid = (int) (yInput + (heightInput / 2.0));
		double points[][] = new double[360][2];
		for(int count = 0; count < 360; count++){
			points[count][0] = xMid + (widthInput * cos(toRadians(count)));
			points[count][1] = yMid + (heightInput * sin(toRadians(count)));
		}
		drawAndFillNSidedShape(points, outlineInput, fillInput, graphicsTwoDInput);
	}
	public void drawAndFillCircle(int xInput, int yInput, int radiusInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		drawAndFillEllipse(xInput, yInput, radiusInput, radiusInput, outlineInput, fillInput, graphicsTwoDInput);
	}
	public void drawAndFillRectangle(int xInput, int yInput, int widthInput, int heightInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		drawAndFillQuadrilateral(xInput, yInput, xInput + widthInput, yInput, xInput + widthInput, yInput + heightInput, xInput, yInput + heightInput, fillInput,
				fillInput, graphicsTwoDInput);
	}
	public void drawAndFillSquare(int xInput, int yInput, int sideInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		drawAndFillRectangle(xInput, yInput, sideInput, sideInput, outlineInput, fillInput, graphicsTwoDInput);
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Simple Shapes, Rotated                       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// (These have been briefly tested)            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void drawAndFillEllipseRotated(int angleInput, int xInput, int yInput, int widthInput, int heightInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		int xMid = (int) (xInput + ( widthInput / 2.0)),
				yMid = (int) (yInput + (heightInput / 2.0));
		double points[][] = new double[360][2];
		for(int count = 0; count < 360; count++){
			points[count][0] = xMid + (widthInput * cos(toRadians(count)));
			points[count][1] = yMid + (heightInput * sin(toRadians(count)));
		}
		drawAndFillNSidedShapeRotated(angleInput, points, outlineInput, fillInput, graphicsTwoDInput);
	}
	public void drawAndFillCircleRotated(int angleInput, int xInput, int yInput, int radiusInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		drawAndFillEllipseRotated(angleInput, xInput, yInput, radiusInput, radiusInput, outlineInput, fillInput, graphicsTwoDInput);
	}
	public void drawAndFillRectangleRotated(int angleInput, int xInput, int yInput, int widthInput, int heightInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		drawAndFillQuadrilateralRotated(angleInput, xInput, yInput, xInput + widthInput, yInput, xInput + widthInput, yInput + heightInput, xInput, yInput + heightInput, fillInput,
				fillInput, graphicsTwoDInput);
	}
	public void drawAndFillSquareRotated(int angleInput, int xInput, int yInput, int sideInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		drawAndFillRectangleRotated(angleInput, xInput, yInput, sideInput, sideInput, outlineInput, fillInput, graphicsTwoDInput);
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Draw Solid ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void drawLine(int xStartInput, int yStartInput, int xEndInput, int yEndInput, Color colorInput, Graphics2D graphicsTwoDInput){
		double points[][] = {{xStartInput, yStartInput}, {xEndInput, yEndInput}};
		GeneralPath line = new GeneralPath();
		line.moveTo(points[0][0], points[0][1]);
        line.lineTo(points[1][0], points[1][1]);
        line.closePath();
        if(colorInput != null){
	        graphicsTwoDInput.setColor(colorInput);
	        graphicsTwoDInput.draw(line);
        }
	}
	public int[] drawVector(int startX, int startY, double magnitude, int direction, Color colorInput, Graphics2D graphicsTwoDInput){
		double radianOfDirection = toRadians(direction);
		int[] endXAndY = {(int) (startX + (magnitude * cos(radianOfDirection))),
				(int) (startY + (magnitude * sin(radianOfDirection)))};
		drawLine(startX, startY, endXAndY[0], endXAndY[1], colorInput, graphicsTwoDInput);
		return endXAndY;
	}
	public void drawArrowAngle(int xStartInput, int yStartInput, int magnitude, int direction, int arrowArmLength, int arrowTipAngles,Color colorInput, Graphics2D graphicsTwoDInput){
		int[] endXAndY = drawVector(xStartInput, yStartInput, magnitude, direction, colorInput, graphicsTwoDInput);
		int extraRotation = 180 - direction;
		drawVector(endXAndY[0], endXAndY[1], arrowArmLength, -arrowTipAngles - extraRotation, colorInput, graphicsTwoDInput);
		drawVector(endXAndY[0], endXAndY[1], arrowArmLength, arrowTipAngles - extraRotation, colorInput, graphicsTwoDInput);
	}
	// VERY POSSIBLY FINISHED
	public void drawArrowPoints(int xStartInput, int yStartInput, int xEndInput, int yEndInput, int arrowArmLength, int arrowTipAngles,Color colorInput, Graphics2D graphicsTwoDInput){
		int direction, magnitude;
		double changeX = xEndInput - xStartInput, changeY = yEndInput - yStartInput;
		magnitude = (int) sqrt((changeX * changeX) + (changeY * changeY));
		if(changeX != 0){
			if(changeX > 0){
				direction = (int) toDegrees(atan(changeY / changeX));
			} else {
				direction = (int) (180 + toDegrees(atan(changeY / changeX)));
			}
		} else {
			if(changeY > 0){
				direction = 90;
			} else {
				direction = 270;
			}
		}
		drawArrowAngle(xStartInput, yStartInput, magnitude, direction, arrowArmLength, arrowTipAngles, colorInput, graphicsTwoDInput);
	}
	public void drawGrid(int xInput, int yInput, int xStepInput, int yStepInput, int xStepCountInput, int yStepCountInput, Color colorInput, Graphics2D graphicsTwoDInput){
		for(int count = 0; count <= xStepCountInput; count++){
			drawLine(xInput + (count * xStepInput), yInput, xInput + (count * xStepInput), yInput + (yStepInput * yStepCountInput), colorInput, graphicsTwoDInput);
		}
		for(int count = 0; count <= yStepCountInput; count++){
			drawLine(xInput, yInput + (count * yStepInput), xInput + (xStepInput * xStepCountInput), yInput + (count * yStepInput), colorInput, graphicsTwoDInput);
		}
	}
	public void drawTickedAxis(int xInput, int yInput, int xStepInput, int yStepInput, int xStepCountInput, int yStepCountInput, int tickLengthInput, Color colorInput, Graphics2D graphicsTwoDInput){
		drawLine(xInput, yInput, xInput, yInput + (yStepInput * yStepCountInput), colorInput, graphicsTwoDInput);
		drawLine(xInput, yInput + (yStepInput * yStepCountInput), xInput + (xStepInput * xStepCountInput), yInput + (yStepInput * yStepCountInput), colorInput, graphicsTwoDInput);
		for(int count = 0; count <= yStepCountInput; count++){
			drawLine(xInput, yInput + (count * yStepInput), xInput + tickLengthInput, yInput + (count * yStepInput), colorInput, graphicsTwoDInput);
		}
		for(int count = 0; count <= xStepCountInput; count++){
			drawLine(xInput + (count * xStepInput), yInput + (yStepInput * yStepCountInput), xInput + (count * xStepInput), yInput + (yStepInput * yStepCountInput) - tickLengthInput, colorInput, graphicsTwoDInput);
		}
	}
	public void printParagraph(LinkedList<String> input, int inputStartX, int inputStartY, Color colorInput, Graphics2D graphicsTwoDInput){
		graphicsTwoDInput.setColor(colorInput);
		for(int index = 0, inputSize = input.size(), incrementingY = inputStartY; index < inputSize; index++, incrementingY += 20)
			graphicsTwoDInput.drawString(input.get(index), inputStartX, incrementingY);
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Draw Dotted ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// THIS HAS NOT BEEN TESTED
	public void drawDottedEllipse(int xInput, int yInput, double widthInput, double heightInput, double lineLengthInput, Color colorInput, Graphics2D graphicsTwoDInput){
		int xMid = (int) (xInput + ( widthInput / 2.0)),
				yMid = (int) (yInput + (heightInput / 2.0));
		for(int i = 0; i < 360; i += (2 * lineLengthInput)){
			for(int count = 0; count < lineLengthInput; count++){
				int xStartInput = (int) (xMid + (widthInput * cos(toRadians(i + count)))),
						yStartInput = (int) (yMid + (heightInput * sin(toRadians(i + count)))),
						xEndInput = (int) (xMid + (widthInput * cos(toRadians(i + count + 1)))),
						yEndInput = (int) (yMid + (heightInput * sin(toRadians(i + count + 1))));
				drawLine(xStartInput, yStartInput, xEndInput, yEndInput, colorInput, graphicsTwoDInput);
			}
		}
	}
	public void drawDottedCircle(int xInput, int yInput, double radiusInput, double lineLengthInput, Color colorInput, Graphics2D graphicsTwoDInput){
		drawDottedEllipse(xInput, yInput, radiusInput, radiusInput, lineLengthInput, colorInput, graphicsTwoDInput);
	}
	// THIS HAS NOT BEEN TESTED
	public void drawDottedEllipse(int angleInput, int xInput, int yInput, double widthInput, double heightInput, double lineLengthInput, Color colorInput, Graphics2D graphicsTwoDInput){
		int xMid = (int) (xInput + ( widthInput / 2.0)),
				yMid = (int) (yInput + (heightInput / 2.0));
		for(int i = angleInput; i < (360 + angleInput); i += (2 * lineLengthInput)){
			for(int count = 0; count < lineLengthInput; count++){
				int xStartInput = (int) (xMid + (widthInput * cos(toRadians(i + count)))),
						yStartInput = (int) (yMid + (heightInput * sin(toRadians(i + count)))),
						xEndInput = (int) (xMid + (widthInput * cos(toRadians(i + count + 1)))),
						yEndInput = (int) (yMid + (heightInput * sin(toRadians(i + count + 1))));
				drawLine(xStartInput, yStartInput, xEndInput, yEndInput, colorInput, graphicsTwoDInput);
			}
		}
	}
	public void drawDottedCircle(int angleInput, int xInput, int yInput, double radiusInput, double lineLengthInput, Color colorInput, Graphics2D graphicsTwoDInput){
		drawDottedEllipse(angleInput, xInput, yInput, radiusInput, radiusInput, lineLengthInput, colorInput, graphicsTwoDInput);
	}
	public void drawDottedLine(int xStartInput, int yStartInput, int xEndInput, int yEndInput, int solidPartsInput, Color colorInput, Graphics2D graphicsTwoDInput){
		int parts = (2 * solidPartsInput) - 1;
		int changeX = xEndInput - xStartInput, changeY = yEndInput - yStartInput;
		double xPart = changeX / parts, yPart = changeY / parts;
		for(int count = 0; count < solidPartsInput; count++){
			int xStart = (int) (xStartInput + ((2 * count) * xPart)),
					yStart = (int) (yStartInput + ((2 * count) * yPart)),
					xEnd = (int) (xStartInput + (((2 * count) + 1) * xPart)),
					yEnd = (int) (yStartInput + (((2 * count) + 1) * yPart));
			drawLine(xStart, yStart, xEnd, yEnd, colorInput, graphicsTwoDInput);
		}
		int xStart = (int) (xEndInput - xPart),
				yStart = (int) (yEndInput - yPart);
		drawLine(xStart, yStart, xEndInput, yEndInput, colorInput, graphicsTwoDInput);
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Draw Circuit Stuff ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// THIS HAS NOT BEEN TESTED
	public void drawCapacitorAngle(int xStartInput, int yStartInput, int magnitudeInput, int directionInput, int gapInput, int armLengthInput, Color colorInput, Graphics2D graphicsTwoDInput){
		int end[] = drawVector(xStartInput, yStartInput, magnitudeInput, directionInput, null, graphicsTwoDInput);
		int length = (int) ((magnitudeInput - gapInput) / 2.0);
		drawArrowAngle(xStartInput, yStartInput, length, directionInput, armLengthInput, 90, colorInput, graphicsTwoDInput);
		drawArrowAngle(end[0], end[1], length, directionInput, armLengthInput, 90, colorInput, graphicsTwoDInput);
	}
	// THIS HAS NOT BEEN TESTED
	public void drawCapacitorPoints(int xStartInput, int yStartInput, int xEndInput, int yEndInput, int gapInput, int armLengthInput, Color colorInput, Graphics2D graphicsTwoDInput){
		int direction, magnitude;
		double changeX = xEndInput - xStartInput, changeY = yEndInput - yStartInput;
		magnitude = (int) sqrt((changeX * changeX) + (changeY * changeY));
		if(changeX != 0){
			if(changeX > 0){
				direction = (int) toDegrees(atan(changeY / changeX));
			} else {
				direction = (int) (180 + toDegrees(atan(changeY / changeX)));
			}
		} else {
			if(changeY > 0){
				direction = 90;
			} else {
				direction = 270;
			}
		}
		drawCapacitorAngle(xStartInput, yStartInput, magnitude, direction, gapInput, armLengthInput, colorInput, graphicsTwoDInput);
	}
	// HAS BASE LINES DOES NOT HAVE SPIKIES
	public void drawResistorAngle(int xStartInput, int yStartInput, int magnitudeInput, int directionInput, int spikyAreaInput, int spikyLengthInput, Color colorInput, Graphics2D graphicsTwoDInput){
		int end[] = drawVector(xStartInput, yStartInput, magnitudeInput, directionInput, null, graphicsTwoDInput);
		int length = (int) ((magnitudeInput - spikyAreaInput) / 2.0);
		drawVector(xStartInput, yStartInput, length, directionInput, colorInput, graphicsTwoDInput);
		drawVector(end[0], end[1], length, directionInput, colorInput, graphicsTwoDInput);
	}
	
	public void drawBatteryAngle(int xStartInput, int yStartInput, int magnitudeInput, int directionInput, int gapInput, int armLengthInput, Color colorInput, Graphics2D graphicsTwoDInput){
		// int end[] = drawVector(xStartInput, yStartInput, magnitudeInput, directionInput, null, graphicsTwoDInput);
		int length = (int) ((magnitudeInput - gapInput) / 2.0);
		drawArrowAngle(xStartInput, yStartInput, length, directionInput, armLengthInput, 90, colorInput, graphicsTwoDInput);
		// int dataForSquare[] = drawVector(end[0], end[1], length, directionInput, colorInput, graphicsTwoDInput);
	}	
}