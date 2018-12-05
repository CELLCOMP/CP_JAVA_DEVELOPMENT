import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Panel_Editar extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panel_Editar() {
		Panel_Table panel_Table = new Panel_Table();
		
		JPanel panel_opciones = new JPanel();
		panel_opciones.setBackground(new Color(100, 149, 237));
		
		
		JPanel panel_guardar = new JPanel();
		panel_guardar.setBackground(new Color(100, 149, 237));
		panel_guardar.setBorder(new LineBorder(new Color(0, 0, 0)));
		GroupLayout gl_panel_opciones = new GroupLayout(panel_opciones);
		gl_panel_opciones.setHorizontalGroup(
			gl_panel_opciones.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_opciones.createSequentialGroup()
					.addGap(16)
					.addComponent(panel_guardar, GroupLayout.PREFERRED_SIZE, 463, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(105, Short.MAX_VALUE))
		);
		gl_panel_opciones.setVerticalGroup(
			gl_panel_opciones.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_opciones.createSequentialGroup()
					.addContainerGap(77, Short.MAX_VALUE)
					.addComponent(panel_guardar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(75))
		);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon(Panel_Editar.class.getResource("/Icons/diskette.png")));
		
		
		JButton btnGuardarComo = new JButton("Guardar Como");
		btnGuardarComo.setIcon(new ImageIcon(Panel_Editar.class.getResource("/Icons/export-file.png")));
		
		JLabel lblEditar = new JLabel("GUARDAR");
		lblEditar.setForeground(new Color(255, 255, 255));
		lblEditar.setBackground(new Color(248, 248, 255));
		lblEditar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 255, 255));
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(Panel_Editar.class.getResource("/Icons/printer.png")));
		GroupLayout gl_panel_guardar = new GroupLayout(panel_guardar);
		gl_panel_guardar.setHorizontalGroup(
			gl_panel_guardar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_guardar.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_guardar.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(separator, Alignment.LEADING)
						.addGroup(Alignment.LEADING, gl_panel_guardar.createSequentialGroup()
							.addComponent(btnGuardar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnGuardarComo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnImprimir))
						.addGroup(Alignment.LEADING, gl_panel_guardar.createSequentialGroup()
							.addGap(171)
							.addComponent(lblEditar)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addContainerGap(87, Short.MAX_VALUE))
		);
		gl_panel_guardar.setVerticalGroup(
			gl_panel_guardar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_guardar.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEditar)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_guardar.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnGuardarComo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnImprimir, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
					.addGap(56))
		);
		panel_guardar.setLayout(gl_panel_guardar);
		panel_opciones.setLayout(gl_panel_opciones);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_opciones, GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_Table, GroupLayout.PREFERRED_SIZE, 712, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_opciones, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_Table, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
					.addGap(0))
		);
		setLayout(groupLayout);

	}
}
