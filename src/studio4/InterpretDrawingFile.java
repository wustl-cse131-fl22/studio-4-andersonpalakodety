package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int redComp = in.nextInt();
		int greenComp = in.nextInt();
		int blueComp = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double xCoord = in.nextDouble();
		double yCoord = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
		
		StdDraw.setPenColor(redComp,greenComp,blueComp);
		StdDraw.filledRectangle(xCoord,yCoord,halfWidth,halfHeight);
	}
}
