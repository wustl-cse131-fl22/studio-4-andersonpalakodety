package studio4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		double[] triangleX = {0.15, 0.5, 0.15};  
		double[] triangleY = {0.5, 0.3, 0.3}; 
		double[] triangleX2 = {0.85, 0.5, 0.85};  
		double[] triangleY2 = {0.5, 0.7, 0.7}; 
		
		StdDraw.setPenColor(1,50,32);
		StdDraw.filledRectangle(0.5, 0.5, 0.35, 0.2);
		
		StdDraw.setPenColor(0,0,128);
		StdDraw.filledPolygon(triangleX, triangleY);
		StdDraw.filledPolygon(triangleX2, triangleY2);
		
		StdDraw.setPenColor(0,0,128);
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(0,0,0);
		StdDraw.rectangle(0.5, 0.5, 0.35, 0.2);
		
	}
}