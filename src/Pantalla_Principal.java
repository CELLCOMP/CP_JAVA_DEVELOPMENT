import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import java.awt.Font;

public class Pantalla_Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				 for(UIManager.LookAndFeelInfo laf:UIManager.getInstalledLookAndFeels()){
			            if("Nimbus".equals(laf.getName()))
			                try {
			                UIManager.setLookAndFeel(laf.getClassName());
			            } catch (Exception ex) {
			            }
			        }
				try {
					Pantalla_Principal frame = new Pantalla_Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pantalla_Principal() {
		setTitle("Sistema Contable");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("SansSerif", Font.PLAIN, 14));
		
			Panel_Configuracion panel_Configuracion = new Panel_Configuracion();
			
			tabbedPane.add("Configuracion", panel_Configuracion);

		
		Panel_Editar panel_editar = new Panel_Editar();
		tabbedPane.add("Editar",panel_editar);
		
		
		
		contentPane.add(tabbedPane, BorderLayout.NORTH);
	

		
	}

}
