package Qingjia;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
public class StudentLeaveRecord extends JFrame implements ActionListener{

    /**
     * 学生查询请假记录模块
     */

    JButton jb1=new JButton("学生申请请假");
    JButton jb2=new JButton("学生申请销假");
    JButton jb3=new JButton("查询请假记录");
    JButton jb4=new JButton("退出");
    JTextArea jt=new JTextArea();
    public static void main(String[] args) {
        // TODO Auto-generated method stub

//
//		FileReader fr=null;
//		//写入文件（输出流）
//		//FileWriter fw=null;
//
//		try {
//			//创建fir对象
//			fr = new FileReader("d:\\g1.txt");
//
//
//			int n=0;//实际读取的字符数
//			//读入到内存
//			char c[]=new char[10024];
//			while((n=fr.read(c))!=-1){
//				//System.out.println(c);
//				String s= new String(c,0,n);
//				System.out.println(s);
//			}
//
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		}	}
        StudentLeaveRecord SLR=new StudentLeaveRecord();
    }






    public StudentLeaveRecord(){
        this.setTitle("学生请假系统");
        this.setLocation(550,200);
        this.setSize(700,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        jt.setEditable(false);//设计文本框不能外部输入
        jt.setForeground(Color.BLACK);
        jt.setFont(new Font("微软雅黑",Font.PLAIN,18));
        jb1.setOpaque(false);
        jb1.setFont(new Font("微软雅黑",Font.PLAIN,18));
        jb2.setOpaque(false);
        jb2.setFont(new Font("微软雅黑",Font.PLAIN,18));
        jb3.setOpaque(false);
        jb3.setFont(new Font("微软雅黑",Font.PLAIN,18));
        jb4.setOpaque(false);
        jb4.setFont(new Font("微软雅黑",Font.PLAIN,18));
        jb1.setBackground(new Color(233,240,247));
        jb2.setBackground(new Color(233,240,247));
        jb3.setBackground(new Color(233,240,247));
        jb4.setBackground(new Color(233,240,247));


        jb1.setBounds(5, 0, 233, 50);
        jb2.setBounds(236, 0, 223, 50);
        jb3.setBounds(457, 0, 223, 50);
        jb4.setBounds(457, 400, 223, 50);
        jt.setBounds(30,80,620,300);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);

        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        this.add(jb4);
        this.add(jt);
        this.setVisible(true);

        FileReader fr=null;
        //写入文件（输出流）
        //FileWriter fw=null;

        try {
            //创建fir对象
            fr = new FileReader("d:\\student1.txt");


            int n=0;//实际读取的字符数
            //读入到内存
            char c[]=new char[10024];
            while((n=fr.read(c))!=-1){
                //System.out.println(c);
                String s= new String(c,0,n);

                jt.setText(s);
            }


        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

    }

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource().equals(jb4)){
            this.dispose();
        }
        //Object[] options={"好啊","去一边"};
        if(e.getSource().equals(jb1)){
            System a=new System();
            this.dispose();
        }
        if(e.getSource().equals(jb2)){
            JOptionPane.showMessageDialog(null, "对不起，该功能未开通");
        }
        if(e.getSource().equals(jb3)){
            JOptionPane.showMessageDialog(null, "你已处于当前界面");
        }

    }

}