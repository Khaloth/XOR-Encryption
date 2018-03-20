import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window extends JFrame {
	
	private JLabel label;
	private JTextField text;
	private JButton btn;
	
	public Window(){
		super();
		this.setTitle("Okno");
		this.setSize(100,100);
		this.setLayout(new FlowLayout());
		label = new JLabel("Zadej èíslo");
		this.add(label);
		text = new JTextField("Ahoj");
		this.add(text);
		btn = new JButton("OK");
		this.add(btn);
		
		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent args0){
			int x = Integer.valueOf(text.getText());
			x++;
			text.setText(x+"");
			}
			
		}); setVisible(true);
			
		
		
	}
	

	
}
