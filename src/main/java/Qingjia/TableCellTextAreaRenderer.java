package Qingjia;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;
/*
 *
 * 表格高度设置
 */
public class TableCellTextAreaRenderer  extends JTextArea implements TableCellRenderer {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public TableCellTextAreaRenderer() {


        setLineWrap(true);
        setWrapStyleWord(true);

    }
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus, int row, int column) {
        // 计算当下行的最佳高度
        int maxPreferredHeight = 30;

        for (int i = 0; i < table.getColumnCount(); i++) {
            setText("" + table.getValueAt(row, i));
            setSize(table.getColumnModel().getColumn(column).getWidth(), 0);
            maxPreferredHeight = Math.max(maxPreferredHeight, getPreferredSize().height);
        }

        if (table.getRowHeight(row) != maxPreferredHeight) {
            table.setRowHeight(row, maxPreferredHeight); }
        if(isSelected)
        {
            this.setBackground(table.getSelectionBackground());
        }
        else
        {
            this.setBackground(table.getBackground());
        }

        setText(value == null ? "" : value.toString());

        return this;
    }
}