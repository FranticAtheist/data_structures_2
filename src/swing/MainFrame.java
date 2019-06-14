package swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	private TextPanel textPanel;
	private Toolbar toolbar;
	
	public MainFrame(){
		
		super("hello world");
		setLayout(new BorderLayout());
		
		toolbar = new Toolbar();
		textPanel = new TextPanel();
		
		toolbar.setStringListener(new StringListener() {
			
			public void textEmitted(String text) {
				textPanel.appendText(text);
				
			}
		});		

		
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
