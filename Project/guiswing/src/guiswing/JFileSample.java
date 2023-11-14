package guiswing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class JFileSample extends JFrame {
	JFileSample(){
		setVisible(true); 
		setSize(500,200);
		setTitle("Contoh JMenu");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		GenerateUI(this);
	}
		
	public static void main(String[] args) { 
		new JFileSample();
	}
		
	private void GenerateUI(JFileSample frame) {
	JMenuBar menuBar = new JMenuBar();
	
	String lblMenu[] = {"File","Edit","Help"};
	String lblSubMenuFile[] = {"New File","Open File","Exit"};
	JMenu menus[] = new	JMenu[lblMenu.length]; 
	
	for (int i = 0; i < menus.length; i++) {
		menus[i] = new JMenu();
		menus[i].setText(lblMenu[i]);
		menuBar.add(menus[i]);
	}
	//add submenu for menu File
	JMenuItem subMenu[] = new JMenuItem[lblSubMenuFile.length]; 
		for (int i = 0; i <	subMenu.length; i++) {
		subMenu[i] = new JMenuItem();
		subMenu[i].setText(lblSubMenuFile[i]);
		menus[0].add(subMenu[i]);
	}
	
	//sub menu New File
	subMenu[0].addActionListener(new ActionListener(){
		JFileChooser fileChooser = new JFileChooser();
		public void actionPerformed(ActionEvent e) {
		    File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
		    if (file.exists()) {
		        System.out.println(file);
		    } else {
		        System.out.println("Tidak ada file yang dipilih");
		    }
		}
	});
	// Submenu Open File
	subMenu[1].addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        JFileChooser fileChooser = new JFileChooser();
	        fileChooser.setCurrentDirectory(new File("."));
	        
	        int isChoosen = fileChooser.showOpenDialog(null);

	        if (isChoosen == JFileChooser.APPROVE_OPTION) {
	            File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
	            if (file.exists()) {
	                System.out.println(file);
	            } else {
	                System.out.println("Tidak ada file yang dipilih");
	            }
	        }
	    }
	});
}
}