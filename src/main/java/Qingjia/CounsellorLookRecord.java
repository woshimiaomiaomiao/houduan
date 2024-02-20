package Qingjia;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
/**
 *辅导员管理请假信息系统
 */
public class CounsellorLookRecord extends JFrame implements ActionListener{



    JButton jb1=new JButton("审核请假信息");
    JButton jb2=new JButton("审核销假信息");
    JButton jb3=new JButton("学生请假记录");
    JButton jb4=new JButton("退出");
    JButton jb5=new JButton("查询");
    JTextField jt=new JTextField();
    JLabel jl=new JLabel("学号");
    String[] columnNames={"姓名","学号","方向","联系","开始日期","结束日期","请假状态","请假事由"};//定义表格列名数
    String[][] tableValues={{"haha","182017331","java","15119747306","2099-9-23-17:55","2099-9-23-19:14","通过","因为想呆在宿舍2222222222222222222222"},{"21","22","23","24","25","26","27","28"},{"","","","","","","",""},
            {"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""},
            {"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""},
            {"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""},{"","","","","","","",""}};//定义表格数据数组

    JTable table=new JTable(tableValues,columnNames);//创建指定列名和数据的表格

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CounsellorLookRecord clr=new CounsellorLookRecord();
    }

    public CounsellorLookRecord(){
        this.setTitle("管理员查看请假信息系统");
        this.setLocation(550,200);
        this.setSize(700,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        //JTable table=new JTable(tableValues,columnNames);//创建指定列名和数据的表格
        JScrollPane scrollpane=new JScrollPane(table);//创建显示表格的滚动面板
        //FitTableColumns(table);
        table.setRowHeight(40);
        table.setDefaultRenderer(Object.class, new TableCellTextAreaRenderer());




        //JTableAUTO_RESIZE_ALL_COLUMNS;
        //table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        //JTable.AUTO_RESIZE_OFF
        //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);




        //jb1.setBorder(null);
        jb1.setOpaque(false);
        jb1.setFont(new Font("微软雅黑",Font.PLAIN,18));
        //jb2.setBorder(null);
        jb2.setOpaque(false);
        jb2.setFont(new Font("微软雅黑",Font.PLAIN,18));
        //jb3.setBorder(null);
        jb3.setOpaque(false);
        jb3.setFont(new Font("微软雅黑",Font.PLAIN,18));
        //jb4.setBorder(null);
        jb4.setOpaque(false);
        jb4.setFont(new Font("微软雅黑",Font.PLAIN,18));
        //jb5.setBorder(null);
        jb5.setOpaque(false);
        jb5.setFont(new Font("微软雅黑",Font.PLAIN,18));
        jl.setFont(new Font("微软雅黑",Font.PLAIN,18));
        //jl.setBorder(null);
        jl.setOpaque(false);
        scrollpane.setOpaque(false);

        jl.setFont(new Font("微软雅黑",Font.PLAIN,18));
        jb1.setBackground(new Color(233,240,247));
        jb2.setBackground(new Color(233,240,247));
        jb3.setBackground(new Color(233,240,247));
        jb4.setBackground(new Color(233,240,247));
        jb5.setBackground(new Color(233,240,247));
        jl.setBackground(new Color(233,240,247));
        scrollpane.setBackground(new Color(233,240,247));


        jb1.setBounds(5, 0, 233, 50);
        jb2.setBounds(236, 0, 223, 50);
        jb3.setBounds(457, 0, 223, 50);
        jb4.setBounds(457, 400, 223, 50);
        jb5.setBounds(5, 55, 123, 25);
        jl.setBounds(150, 55, 123, 25);
        jt.setBounds(220, 55, 123, 25);
        scrollpane.setBounds(5, 92, 675, 300);


        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        this.add(jb4);
        this.add(jb5);
        this.add(jl);
        this.add(jt);
        this.add(scrollpane);
        this.setVisible(true);

    }

    public static void FitTableColumns(JTable myTable) {
        JTableHeader header = myTable.getTableHeader();
        int rowCount = myTable.getRowCount();

        Enumeration columns = myTable.getColumnModel().getColumns();
        while (columns.hasMoreElements()) {
            TableColumn column = (TableColumn) columns.nextElement();
            int col = header.getColumnModel().getColumnIndex(column.getIdentifier());
            int width = (int) myTable.getTableHeader().getDefaultRenderer()
                    .getTableCellRendererComponent(myTable, column.getIdentifier(), false, false, -1, col)
                    .getPreferredSize().getWidth();
            for (int row = 0; row < rowCount; row++) {
                int preferedWidth = (int) myTable.getCellRenderer(row, col)
                        .getTableCellRendererComponent(myTable, myTable.getValueAt(row, col), false, false, row, col)
                        .getPreferredSize().getWidth();
                width = Math.max(width, preferedWidth);
            }
            header.setResizingColumn(column);
            column.setWidth(width + myTable.getIntercellSpacing().width + 10);
        }
    }

    public boolean isCellEditable(int rowlndex ,int columlndex){
        return false;
    }
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource().equals(jb4)){
            this.dispose();
        }

        if(e.getSource().equals(jb3)){
            JOptionPane.showMessageDialog(null, "你已处于当前界面");
        }
        if(e.getSource().equals(jb2)){
            JOptionPane.showMessageDialog(null, "对不起，该功能未开通");
        }
        if(e.getSource().equals(jb1)){
            //JOptionPane.showMessageDialog(null, "你已处于当前界面");
            Set s1=new Set();
            this.dispose();
        }

    }


}




