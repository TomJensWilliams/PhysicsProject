package mainpackage;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

public class Trash {
/*



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Draw And Fill 3D //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void drawAndFillCylinder(){}
public void drawAndFillCube(int xTopLeft, int yTopLeft, int width, int height, int back, int backAngle, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Draw And Fill Shape ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void classicDrawAndFillEllipse(int xInput, int yInput, int widthInput, int heightInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		Ellipse2D.Double theEllipse = new Ellipse2D.Double(xInput, yInput, widthInput, heightInput);
		if(fillInput != null){
			graphicsTwoDInput.setColor(fillInput);
			graphicsTwoDInput.fill(theEllipse);
		}
		if(outlineInput != null){
			graphicsTwoDInput.setColor(outlineInput);
			graphicsTwoDInput.draw(theEllipse);
		}
	}
	
	public void classicDrawAndFillCircle(int xInput, int yInput, int radiusInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		classicDrawAndFillEllipse(xInput, yInput, radiusInput, radiusInput, outlineInput, fillInput, graphicsTwoDInput);
	}
	
	public void classicDrawAndFillRectangle(int xInput, int yInput, int widthInput, int heightInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		Rectangle theRectangle = new Rectangle(xInput, yInput, widthInput, heightInput);
		if(outlineInput != null){
			graphicsTwoDInput.setColor(outlineInput);
			graphicsTwoDInput.draw(theRectangle);
		}
		if(fillInput != null){
			graphicsTwoDInput.setColor(fillInput);
			graphicsTwoDInput.fill(theRectangle);
		}
	}
	
	public void classicsDrawAndFillSquare(int xInput, int yInput, int sideInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		classicDrawAndFillRectangle(xInput, yInput, sideInput, sideInput, outlineInput, fillInput, graphicsTwoDInput);
	}
	
	public void classicDrawAndFillTriangle(int xOneInput, int yOneInput, int xTwoInput, int yTwoInput, int xThreeInput, int yThreeInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		double points[][] = {{xOneInput, yOneInput},
				{xTwoInput, yTwoInput},
				{xThreeInput, yThreeInput}
				};
		GeneralPath star = new GeneralPath();
        star.moveTo(points[0][0], points[0][1]);
        for (int k = 1; k < points.length; k++)
            star.lineTo(points[k][0], points[k][1]);
        star.closePath();
        if(fillInput != null){
        graphicsTwoDInput.setColor(fillInput);
        graphicsTwoDInput.fill(star);
        }
        if(outlineInput != null){
        	graphicsTwoDInput.setColor(outlineInput);
        	graphicsTwoDInput.draw(star);
        }
    }
	
	public void advancedDrawAndFillTriangle(int degreeInput, int xOneInput, int yOneInput, int xTwoInput, int yTwoInput, int xThreeInput, int yThreeInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		double[] newPointOne = shiftAroundPoint(xOneInput, yOneInput, xOneInput, yOneInput, degreeInput),
				newPointTwo = shiftAroundPoint(xTwoInput, yTwoInput, xOneInput, yOneInput, degreeInput),
				newPointThree = shiftAroundPoint(xThreeInput, yThreeInput, xOneInput, yOneInput, degreeInput);
		int[] points = {(int) newPointOne[0], (int) newPointOne[1], (int) newPointTwo[0], (int) newPointTwo[1], (int) newPointThree[0], (int) newPointThree[1]};
		classicDrawAndFillTriangle(points[0], points[1], points[2], points[3], points[4], points[5], outlineInput, fillInput, graphicsTwoDInput);
    }
	
	public void superDrawAndFillRectangle(int degreeTiltInput, int xInput, int yInput, int widthInput, int heightInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		double cx = xInput,
				cy = yInput + (heightInput / 2);
		int[] points = {xInput, yInput, xInput + widthInput, yInput, xInput, yInput + heightInput, xInput + widthInput, yInput + heightInput};
		double[] pointsShifted = superDrawRectangleToolOne(points, cx, cy);
		double[] pointsShiftedAndRotated = superDrawRectangleToolTwo(pointsShifted, degreeTiltInput);
		int[] pointsRotated = superDrawRectangleToolThree(pointsShiftedAndRotated, cx, cy);
		drawLinePoints(pointsRotated[0], pointsRotated[1], pointsRotated[2], pointsRotated[3], outlineInput, graphicsTwoDInput);
		drawLinePoints(pointsRotated[0], pointsRotated[1], pointsRotated[4], pointsRotated[5], outlineInput, graphicsTwoDInput);
		drawLinePoints(pointsRotated[6], pointsRotated[7], pointsRotated[2], pointsRotated[3], outlineInput, graphicsTwoDInput);
		drawLinePoints(pointsRotated[6], pointsRotated[7], pointsRotated[4], pointsRotated[5], outlineInput, graphicsTwoDInput);
	}
	
	public void superDrawAndFillEllipse(int degreeTiltInput, int xInput, int yInput, int widthInput, int heightInput, Color outlineInput, Color fillInput, Graphics2D graphicsTwoDInput){
		int xMid = (int) (xInput + ( widthInput / 2.0)),
				yMid = (int) (yInput + (heightInput / 2.0));
		for(int i = 0; i < 180; i++){
			int xOneInput = (int) (xMid + (widthInput * cos(toRadians(90 + i)) * cos(toRadians(degreeTiltInput))) - (heightInput * sin(toRadians(90 + i)) * sin(toRadians(degreeTiltInput)))),
					yOneInput = (int) (yMid + (heightInput * sin(toRadians(90 + i)) * cos(toRadians(degreeTiltInput))) + (widthInput * cos(toRadians(90 + i)) * sin(toRadians(degreeTiltInput)))),
					xTwoInput = (int) (xMid + (widthInput * cos(toRadians(90 - i)) * cos(toRadians(degreeTiltInput))) - (heightInput * sin(toRadians(90 - i)) * sin(toRadians(degreeTiltInput)))),
					yTwoInput = (int) (yMid + (heightInput * sin(toRadians(90 - i)) * cos(toRadians(degreeTiltInput))) + (widthInput * cos(toRadians(90 - i)) * sin(toRadians(degreeTiltInput))));
			drawLinePoints(xOneInput, yOneInput, xTwoInput, yTwoInput, fillInput, graphicsTwoDInput);
		}
		for(int i = degreeTiltInput; i < 360 + degreeTiltInput; i ++){
			int xOneInput = (int) (xMid + (widthInput * cos(toRadians(i)) * cos(toRadians(degreeTiltInput))) - (heightInput * sin(toRadians(i)) * sin(toRadians(degreeTiltInput)))),
					yOneInput = (int) (yMid + (heightInput * sin(toRadians(i)) * cos(toRadians(degreeTiltInput))) + (widthInput * cos(toRadians(i)) * sin(toRadians(degreeTiltInput)))),
					xTwoInput = (int) (xMid + (widthInput * cos(toRadians(i + 1)) * cos(toRadians(degreeTiltInput))) - (heightInput * sin(toRadians(i + 1)) * sin(toRadians(degreeTiltInput)))),
					yTwoInput = (int) (yMid + (heightInput * sin(toRadians(i + 1)) * cos(toRadians(degreeTiltInput))) + (widthInput * cos(toRadians(i + 1)) * sin(toRadians(degreeTiltInput))));
			drawLinePoints(xOneInput, yOneInput, xTwoInput, yTwoInput, outlineInput, graphicsTwoDInput);
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Draw Shape/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void handDrawEllipse(int xInput, int yInput, int widthInput, int heightInput, Color colorInput, Graphics2D graphicsTwoDInput){
		int xMid = (int) (xInput + ( widthInput / 2.0)),
				yMid = (int) (yInput + (heightInput / 2.0));
		for(int i = 0; i < 360; i ++){
			int xOneInput = (int) (xMid + (widthInput * cos(toRadians(i)))),
					yOneInput = (int) (yMid + (heightInput * sin(toRadians(i)))),
					xTwoInput = (int) (xMid + (widthInput * cos(toRadians(i + 1)))),
					yTwoInput = (int) (yMid + (heightInput * sin(toRadians(i + 1))));
			drawLinePoints(xOneInput, yOneInput, xTwoInput, yTwoInput, colorInput, graphicsTwoDInput);
		}
	}
	
	public void superHandDrawEllipse(int degreeTiltInput, int xInput, int yInput, int widthInput, int heightInput, Color colorInput, Graphics2D graphicsTwoDInput){
		int xMid = (int) (xInput + ( widthInput / 2.0)),
				yMid = (int) (yInput + (heightInput / 2.0));
		for(int i = degreeTiltInput; i < 360 + degreeTiltInput; i ++){
			int xOneInput = (int) (xMid + (widthInput * cos(toRadians(i)) * cos(toRadians(degreeTiltInput))) - (heightInput * sin(toRadians(i)) * sin(toRadians(degreeTiltInput)))),
					yOneInput = (int) (yMid + (heightInput * sin(toRadians(i)) * cos(toRadians(degreeTiltInput))) + (widthInput * cos(toRadians(i)) * sin(toRadians(degreeTiltInput)))),
					xTwoInput = (int) (xMid + (widthInput * cos(toRadians(i + 1)) * cos(toRadians(degreeTiltInput))) - (heightInput * sin(toRadians(i + 1)) * sin(toRadians(degreeTiltInput)))),
					yTwoInput = (int) (yMid + (heightInput * sin(toRadians(i + 1)) * cos(toRadians(degreeTiltInput))) + (widthInput * cos(toRadians(i + 1)) * sin(toRadians(degreeTiltInput))));
			drawLinePoints(xOneInput, yOneInput, xTwoInput, yTwoInput, colorInput, graphicsTwoDInput);
		}
	}
	
	public void superDrawRectangle(int degreeTiltInput, int xInput, int yInput, int widthInput, int heightInput, Color colorInput, Graphics2D graphicsTwoDInput){
		double cx = xInput,
				cy = yInput + (heightInput / 2);
		int[] points = {xInput, yInput, xInput + widthInput, yInput, xInput, yInput + heightInput, xInput + widthInput, yInput + heightInput};
		double[] pointsShifted = superDrawRectangleToolOne(points, cx, cy);
		double[] pointsShiftedAndRotated = superDrawRectangleToolTwo(pointsShifted, degreeTiltInput);
		int[] pointsRotated = superDrawRectangleToolThree(pointsShiftedAndRotated, cx, cy);
		drawLinePoints(pointsRotated[0], pointsRotated[1], pointsRotated[2], pointsRotated[3], colorInput, graphicsTwoDInput);
		drawLinePoints(pointsRotated[0], pointsRotated[1], pointsRotated[4], pointsRotated[5], colorInput, graphicsTwoDInput);
		drawLinePoints(pointsRotated[6], pointsRotated[7], pointsRotated[2], pointsRotated[3], colorInput, graphicsTwoDInput);
		drawLinePoints(pointsRotated[6], pointsRotated[7], pointsRotated[4], pointsRotated[5], colorInput, graphicsTwoDInput);
	}
	
	public double[] superDrawRectangleToolOne(int[] input,  double cx, double cy){
		double[] returnedArray = new double[8];
		for(int i = 0; i < 8; i++)
			if((i % 2) == 0)
				returnedArray[i] = input[i] - cx;
			else
				returnedArray[i] = input[i] - cy;
		return returnedArray;
	}
	
	public double[] superDrawRectangleToolTwo(double[] input, int degreeTiltInput){
		double[] returnedArray = new double[8];
		for(int i = 0; i < 8; i++)
			if((i % 2) == 0)
				returnedArray[i] = (input[i] * cos(toRadians(degreeTiltInput))) - (input[i + 1] * sin(toRadians(degreeTiltInput)));
			else
				returnedArray[i] = (input[i - 1] * sin(toRadians(degreeTiltInput))) + (input[i] * cos(toRadians(degreeTiltInput)));
		return returnedArray;
	}
	
	public int[] superDrawRectangleToolThree(double[] input,  double cx, double cy){
		int[] returnedArray = new int[8];
		for(int i = 0; i < 8; i++)
			if((i % 2) == 0)
				returnedArray[i] = (int) (input[i] + cx);
			else
				returnedArray[i] = (int) (input[i] + cy);
		return returnedArray;
	}
	
	
	
	
		public void drawIShape(int xStartInput, int yStartInput, int xEndInput, int yEndInput, int armsLength, Color colorInput, Graphics2D graphicsTwoDInput){
		drawLinePoints(xStartInput, yStartInput, xEndInput, yEndInput, colorInput, graphicsTwoDInput);
		drawLinePoints(xStartInput + (armsLength/2), yStartInput, xStartInput - (armsLength/2), yStartInput, colorInput, graphicsTwoDInput);
		drawLinePoints(xEndInput + (armsLength/2), yEndInput, xEndInput - (armsLength/2), yEndInput, colorInput, graphicsTwoDInput);
	}
	
	public void drawHShape(int xStartInput, int yStartInput, int xEndInput, int yEndInput, int armsLength,  Color colorInput, Graphics2D graphicsTwoDInput){
		drawLinePoints(xStartInput, yStartInput, xEndInput, yEndInput, colorInput, graphicsTwoDInput);
		drawLinePoints(xStartInput, yStartInput + (armsLength/2), xStartInput, yStartInput - (armsLength/2), colorInput, graphicsTwoDInput);
		drawLinePoints(xEndInput, yEndInput + (armsLength/2) , xEndInput, yEndInput - (armsLength/2), colorInput, graphicsTwoDInput);
	}
	
	
	
	
	
*/
}
