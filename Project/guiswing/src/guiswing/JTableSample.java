package guiswing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

public class JTableSample extends JFrame {
	JTableSample() {
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setSize(500,300);
		setTitle("Contoh JLabel");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GenerateUI(this);
	}
	
	public static void main(String[] args) {
		new JTableSample();
	}
	
	private void GenerateUI(JTableSample frame) {
		String data[][]={ 
			{"212310018","FATHURAHMAN ALFARIDZI","B"},
			{"212310019","MUHAMMAD RAFI ZUHAIR ARTA","C"},
			{"212310020","MUHAMAD SUBHAN RIZKI AFIA","A"}
		};
		String column[]={"Student ID","Name","Score"};
		
		JTable jt = new JTable(data,column);
		jt.setBounds(30,40,200,300);
		
		JScrollPane sp=new JScrollPane(jt);
		frame.add(sp);
	}
}
