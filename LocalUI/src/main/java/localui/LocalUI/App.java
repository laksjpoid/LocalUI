package localui.LocalUI;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder builder = factory.newDocumentBuilder();
    	Document doc = builder.parse("html/test.html");// get a direct document.
    	Element e = doc.getDocumentElement();
    	System.out.println(e);
    	
        Display display = new Display();
        Shell shell = new Shell(display, SWT.RESIZE);
        shell.setText("Hello World");
        shell.setBounds(100,100,200,50);
        shell.setLayout(new FillLayout());
        Label label = new Label(shell, SWT.CENTER);
        label.setText("Hello World");
        Color red = new Color(display, 255, 0, 0);
        label.setForeground(red);
        shell.open();
        while(!shell.isDisposed()){
        	if(!display.readAndDispatch())
        		display.sleep();
        }
    }
}
