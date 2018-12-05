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

public class Panel_Editar extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panel_Editar() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_opciones = new JPanel();
		panel_opciones.setBackground(Color.WHITE);
		add(panel_opciones, BorderLayout.NORTH);
		
		JPanel panel_guardar = new JPanel();
		panel_guardar.setBorder(new LineBorder(new Color(0, 0, 0)));
		GroupLayout gl_panel_opciones = new GroupLayout(panel_opciones);
		gl_panel_opciones.setHorizontalGroup(
			gl_panel_opciones.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_opciones.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_guardar, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(269, Short.MAX_VALUE))
		);
		gl_panel_opciones.setVerticalGroup(
			gl_panel_opciones.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_opciones.createSequentialGroup()
					.addComponent(panel_guardar, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon(Panel_Editar.class.getResource("/Icons/diskette.png")));
		
		JButton btnGuardarComo = new JButton("Guardar Como");
		btnGuardarComo.setIcon(new ImageIcon(Panel_Editar.class.getResource("/Icons/export-file.png")));
		
		JLabel lblGuardar = new JLabel("GUARDAR");
		lblGuardar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JSeparator separator = new JSeparator();
		GroupLayout gl_panel_guardar = new GroupLayout(panel_guardar);
		gl_panel_guardar.setHorizontalGroup(
			gl_panel_guardar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_guardar.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_guardar.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_guardar.createSequentialGroup()
							.addComponent(btnGuardar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnGuardarComo))
						.addGroup(gl_panel_guardar.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel_guardar.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblGuardar)
								.addPreferredGap(ComponentPlacement.RELATED, 168, GroupLayout.PREFERRED_SIZE))
							.addComponent(separator, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_panel_guardar.setVerticalGroup(
			gl_panel_guardar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_guardar.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblGuardar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 7, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_guardar.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnGuardarComo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
					.addGap(56))
		);
		panel_guardar.setLayout(gl_panel_guardar);
		panel_opciones.setLayout(gl_panel_opciones);

	}
}
