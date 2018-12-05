import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class Panel_Table extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panel_Table() {
		//headers for the table
        String[] columns = new String[] {
            "Garantia del Producto", "Descripcion", "Cantidad ", "Valor Unitario","Valor Total"
        };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
            {"1 año", "Camaras de seguridad", 40.0, 5.00,200.00 },
           
        };
         
        final Class[] columnClass = new Class[] {
            String.class, String.class, Double.class,Double.class, Double.class
        };
        //create table model with data
        DefaultTableModel model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return true;
            }
            @Override
            public Class<?> getColumnClass(int columnIndex)
            {
                return columnClass[columnIndex];
            }
        };
        setLayout(new BorderLayout(0, 0));
         
        JTable table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        table.setFillsViewportHeight(true);
        table.setSurrendersFocusOnKeystroke(true);
         
        //add the table to the frame
        JScrollPane jScrollPane = new JScrollPane(table);
        add(jScrollPane);
         
        
        this.setVisible(true);

	}

}
