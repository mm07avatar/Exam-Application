import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * QuestionForm.java
 *
 * Created on Jan 1, 2010, 1:39:16 AM
 */

/**
 *
 * @author vinay
 */
public class QuestionForm extends javax.swing.JFrame {

     //private PreparedStatement pst;/** Creates new form QuestionForm */
    public QuestionForm() {
        initComponents();

    }
void PhyQuestion(){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Select * from PHYSICS where QNO="+L3.getText()+";";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
T1.setText(rs.getString("QUESTION"));
R1.setText(rs.getString("OP1"));
R3.setText(rs.getString("OP2"));
R2.setText(rs.getString("OP3"));
R4.setText(rs.getString("OP4"));
byte[]imagedata=rs.getBytes("IMG");
ImageIcon img=new ImageIcon(new ImageIcon(imagedata).getImage().getScaledInstance(Img.getWidth(),Img.getHeight(),Image.SCALE_SMOOTH));
Img.setIcon(img);

}}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}
buttonGroup1.clearSelection();}

void ChemQuestion(){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Select * from Chemistry where QNO="+L3.getText()+";";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
T1.setText(rs.getString("QUESTION"));
R1.setText(rs.getString("OP1"));
R3.setText(rs.getString("OP2"));
R2.setText(rs.getString("OP3"));
R4.setText(rs.getString("OP4"));
byte[]imagedata=rs.getBytes("IMG");
ImageIcon img=new ImageIcon(new ImageIcon(imagedata).getImage().getScaledInstance(Img.getWidth(),Img.getHeight(),Image.SCALE_SMOOTH));
Img.setIcon(img);
}}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}
buttonGroup1.clearSelection();}

void MathsQuestion(){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Select * from Maths where QNO="+L3.getText()+";";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
T1.setText(rs.getString("QUESTION"));
R1.setText(rs.getString("OP1"));
R3.setText(rs.getString("OP2"));
R2.setText(rs.getString("OP3"));
R4.setText(rs.getString("OP4"));
byte[]imagedata=rs.getBytes("IMG");
ImageIcon img=new ImageIcon(new ImageIcon(imagedata).getImage().getScaledInstance(Img.getWidth(),Img.getHeight(),Image.SCALE_SMOOTH));
Img.setIcon(img);
}}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}
buttonGroup1.clearSelection();}

void QuestionSelection()
{String sub=Hlbl.getText();
if(sub.equals("Physics")){
PhyQuestion();}
else if(sub.equals("Chemistry")){
ChemQuestion();}
else{
MathsQuestion();}}





void NoResponse(){
    String sub=Hlbl.getText();
    String res="RED";
    if(sub.equals("Physics")){
    try{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Update PANSWER SET PRES='"+res+"' where QNO="+L3.getText()+";";
stmt.executeUpdate(sql);}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}}


    else if(sub.equals("Chemistry")){
    try{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Update CANSWER SET CRES='"+res+"' where QNO="+L3.getText()+";";
stmt.executeUpdate(sql);}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}}



    else{
    try{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Update MANSWER SET MRES='"+res+"' where QNO="+L3.getText()+";";
stmt.executeUpdate(sql);}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}}}



void Response(){
    String sub=Hlbl.getText();
    String res="GREEN";
    if(sub.equals("Physics")){
    try{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Update PANSWER SET PRES='"+res+"',ANS='"+L4.getText()+"' where QNO="+L3.getText()+";";
stmt.executeUpdate(sql);}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}}


    else if(sub.equals("Chemistry")){
    try{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Update CANSWER SET CRES='"+res+"',ANS='"+L4.getText()+"' where QNO="+L3.getText()+";";
stmt.executeUpdate(sql);}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}}



    else{
    try{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Update MANSWER SET MRES='"+res+"',ANS='"+L4.getText()+"' where QNO="+L3.getText()+";";
stmt.executeUpdate(sql);}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}}}


void M4Review(){
    String sub=Hlbl.getText();
    String res="YELLOW";
    if(sub.equals("Physics")){
    try{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Update PANSWER SET PRES='"+res+"',ANS=NULL where QNO="+L3.getText()+";";
stmt.executeUpdate(sql);}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}}


    else if(sub.equals("Chemistry")){
    try{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Update CANSWER SET CRES='"+res+"',ANS=NULL where QNO="+L3.getText()+";";
stmt.executeUpdate(sql);}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}}



    else{
    try{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Update MANSWER SET MRES='"+res+"',ANS=NULL where QNO="+L3.getText()+";";
stmt.executeUpdate(sql);}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}}}


void ClearResponse(){
    String sub=Hlbl.getText();
    String res="RED";
    if(sub.equals("Physics")){
    try{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Update PANSWER SET PRES='"+res+"',ANS=NULL where QNO="+L3.getText()+";";
stmt.executeUpdate(sql);}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}}


    else if(sub.equals("Chemistry")){
    try{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Update CANSWER SET CRES='"+res+"',ANS=NULL where QNO="+L3.getText()+";";
stmt.executeUpdate(sql);}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}}



    else{
    try{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Update MANSWER SET MRES='"+res+"',ANS=NULL where QNO="+L3.getText()+";";
stmt.executeUpdate(sql);}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}}}



void getpans(){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="SELECT ANS FROM PANSWER WHERE QNO="+L3.getText()+";";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
L5.setText(rs.getString("ANS"));}}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}}

void getcans(){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="SELECT ANS FROM CANSWER WHERE QNO="+L3.getText()+";";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
L5.setText(rs.getString("ANS"));}}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}}

void getmans(){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="SELECT ANS FROM MANSWER WHERE QNO="+L3.getText()+";";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
L5.setText(rs.getString("ANS"));}}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}}


void answeredgreen(){
String qno=L3.getText();
if(qno.equals("1")){
B6.setBackground(Color.GREEN);}
else if(qno.equals("2")){
B7.setBackground(Color.GREEN);}
else if(qno.equals("3")){
B8.setBackground(Color.GREEN);}
else if(qno.equals("4")){
B9.setBackground(Color.GREEN);}
else if(qno.equals("5")){
B10.setBackground(Color.GREEN);}
else if(qno.equals("6")){
B11.setBackground(Color.GREEN);}
else if(qno.equals("7")){
B12.setBackground(Color.GREEN);}
else if(qno.equals("8")){
B13.setBackground(Color.GREEN);}
else if(qno.equals("9")){
B14.setBackground(Color.GREEN);}
else if(qno.equals("10")){
B15.setBackground(Color.GREEN);}
else if(qno.equals("11")){
B16.setBackground(Color.GREEN);}
else if(qno.equals("12")){
B17.setBackground(Color.GREEN);}
else if(qno.equals("13")){
B18.setBackground(Color.GREEN);}
else if(qno.equals("14")){
B19.setBackground(Color.GREEN);}
else if(qno.equals("15")){
B20.setBackground(Color.GREEN);}
else if(qno.equals("16")){
B21.setBackground(Color.GREEN);}
else if(qno.equals("17")){
B22.setBackground(Color.GREEN);}
else if(qno.equals("18")){
B23.setBackground(Color.GREEN);}
else if(qno.equals("19")){
B24.setBackground(Color.GREEN);}
else if(qno.equals("20")){
B25.setBackground(Color.GREEN);}
else if(qno.equals("21")){
B26.setBackground(Color.GREEN);}
else if(qno.equals("22")){
B27.setBackground(Color.GREEN);}
else if(qno.equals("23")){
B28.setBackground(Color.GREEN);}
else if(qno.equals("24")){
B29.setBackground(Color.GREEN);}}


void getphyresponse(){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Select REG_NO,QNO,PRES FROM PANSWER WHERE REG_NO='"+T2.getText()+"';";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
String qno=rs.getString("QNO");
String res=rs.getString("PRES");
if(qno.equals("1")){
if(res.equals("RED"))
QuestionForm.B6.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B6.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B6.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B6.setBackground(Color.WHITE);
}
else if(qno.equals("2")){
if(res.equals("RED"))
QuestionForm.B7.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B7.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B7.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B7.setBackground(Color.WHITE);
}
else if(qno.equals("3")){
if(res.equals("RED"))
QuestionForm.B8.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B8.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B8.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B8.setBackground(Color.WHITE);
}
else if(qno.equals("4")){
if(res.equals("RED"))
QuestionForm.B9.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B9.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B9.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B9.setBackground(Color.WHITE);
}
else if(qno.equals("5")){
if(res.equals("RED"))
QuestionForm.B10.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B10.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B10.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B10.setBackground(Color.WHITE);
}
else if(qno.equals("6")){
if(res.equals("RED"))
QuestionForm.B11.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B11.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B11.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B11.setBackground(Color.WHITE);
}
else if(qno.equals("7")){
if(res.equals("RED"))
QuestionForm.B12.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B12.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B12.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B12.setBackground(Color.WHITE);
}
else if(qno.equals("8")){
if(res.equals("RED"))
QuestionForm.B13.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B13.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B13.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B13.setBackground(Color.WHITE);
}
else if(qno.equals("9")){
if(res.equals("RED"))
QuestionForm.B14.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B14.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B14.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B14.setBackground(Color.WHITE);
}
else if(qno.equals("10")){
if(res.equals("RED"))
QuestionForm.B15.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B15.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B15.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B15.setBackground(Color.WHITE);
}
else if(qno.equals("11")){
if(res.equals("RED"))
QuestionForm.B16.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B16.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B16.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B16.setBackground(Color.WHITE);
}
else if(qno.equals("12")){
if(res.equals("RED"))
QuestionForm.B17.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B17.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B17.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B17.setBackground(Color.WHITE);
}
else if(qno.equals("13")){
if(res.equals("RED"))
QuestionForm.B18.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B18.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B18.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B18.setBackground(Color.WHITE);
}
else if(qno.equals("14")){
if(res.equals("RED"))
QuestionForm.B19.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B19.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B19.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B19.setBackground(Color.WHITE);
}
else if(qno.equals("15")){
if(res.equals("RED"))
QuestionForm.B20.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B20.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B20.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B20.setBackground(Color.WHITE);
}
else if(qno.equals("16")){
if(res.equals("RED"))
QuestionForm.B21.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B21.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B21.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B21.setBackground(Color.WHITE);
}
else if(qno.equals("17")){
if(res.equals("RED"))
QuestionForm.B22.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B22.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B22.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B22.setBackground(Color.WHITE);
}
else if(qno.equals("18")){
if(res.equals("RED"))
QuestionForm.B23.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B23.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B23.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B23.setBackground(Color.WHITE);
}
else if(qno.equals("19")){
if(res.equals("RED"))
QuestionForm.B24.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B24.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B24.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B24.setBackground(Color.WHITE);
}
else if(qno.equals("20")){
if(res.equals("RED"))
QuestionForm.B25.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B25.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B25.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B25.setBackground(Color.WHITE);
}
else if(qno.equals("21")){
if(res.equals("RED"))
QuestionForm.B26.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B26.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B26.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B26.setBackground(Color.WHITE);
}
else if(qno.equals("22")){
if(res.equals("RED"))
QuestionForm.B27.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B27.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B27.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B27.setBackground(Color.WHITE);
}
else if(qno.equals("23")){
if(res.equals("RED"))
QuestionForm.B28.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B28.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B28.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B28.setBackground(Color.WHITE);
}
else if(qno.equals("24")){
if(res.equals("RED"))
QuestionForm.B29.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B29.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B29.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B29.setBackground(Color.WHITE);
}}}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}}/** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Img1 = new javax.swing.JLabel();
        B1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        B2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        B3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        B6 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        B13 = new javax.swing.JButton();
        B14 = new javax.swing.JButton();
        B15 = new javax.swing.JButton();
        B16 = new javax.swing.JButton();
        B17 = new javax.swing.JButton();
        B18 = new javax.swing.JButton();
        B19 = new javax.swing.JButton();
        B20 = new javax.swing.JButton();
        B21 = new javax.swing.JButton();
        B22 = new javax.swing.JButton();
        B23 = new javax.swing.JButton();
        B24 = new javax.swing.JButton();
        B25 = new javax.swing.JButton();
        B26 = new javax.swing.JButton();
        B27 = new javax.swing.JButton();
        B28 = new javax.swing.JButton();
        B29 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        T2 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        B5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Phy = new javax.swing.JLabel();
        Chem = new javax.swing.JLabel();
        Math = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Hlbl = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        Myanswer = new javax.swing.JLabel();
        L5 = new javax.swing.JTextField();
        L3 = new javax.swing.JLabel();
        R1 = new javax.swing.JRadioButton();
        R2 = new javax.swing.JRadioButton();
        R3 = new javax.swing.JRadioButton();
        R4 = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        Img = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        A = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("<html><u>Your Picture :</u></html>");

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Img1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Img1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        B1.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Info.png"))); // NOI18N
        jLabel7.setText("Not Visited");

        B2.setForeground(new java.awt.Color(255, 0, 0));
        B2.setEnabled(false);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Info.png"))); // NOI18N
        jLabel8.setText("Not Answered(only viewed)");

        B3.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Info.png"))); // NOI18N
        jLabel9.setText("Answered");

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Response To Questions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        B6.setFont(new java.awt.Font("Tahoma", 0, 12));
        B6.setText("01");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        jButton34.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Upload.png"))); // NOI18N
        jButton34.setText("Submit");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        B7.setFont(new java.awt.Font("Tahoma", 0, 12));
        B7.setText("02");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setFont(new java.awt.Font("Tahoma", 0, 12));
        B8.setText("03");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setFont(new java.awt.Font("Tahoma", 0, 12));
        B9.setText("04");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B10.setFont(new java.awt.Font("Tahoma", 0, 12));
        B10.setText("05");
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });

        B11.setFont(new java.awt.Font("Tahoma", 0, 12));
        B11.setText("06");
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });

        B12.setFont(new java.awt.Font("Tahoma", 0, 12));
        B12.setText("07");
        B12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B12ActionPerformed(evt);
            }
        });

        B13.setFont(new java.awt.Font("Tahoma", 0, 12));
        B13.setText("08");
        B13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B13ActionPerformed(evt);
            }
        });

        B14.setFont(new java.awt.Font("Tahoma", 0, 12));
        B14.setText("09");
        B14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B14ActionPerformed(evt);
            }
        });

        B15.setFont(new java.awt.Font("Tahoma", 0, 12));
        B15.setText("10");
        B15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B15ActionPerformed(evt);
            }
        });

        B16.setFont(new java.awt.Font("Tahoma", 0, 12));
        B16.setText("11");
        B16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B16ActionPerformed(evt);
            }
        });

        B17.setFont(new java.awt.Font("Tahoma", 0, 12));
        B17.setText("12");
        B17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B17ActionPerformed(evt);
            }
        });

        B18.setFont(new java.awt.Font("Tahoma", 0, 12));
        B18.setText("13");
        B18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B18ActionPerformed(evt);
            }
        });

        B19.setFont(new java.awt.Font("Tahoma", 0, 12));
        B19.setText("14");
        B19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B19ActionPerformed(evt);
            }
        });

        B20.setFont(new java.awt.Font("Tahoma", 0, 12));
        B20.setText("15");
        B20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B20ActionPerformed(evt);
            }
        });

        B21.setFont(new java.awt.Font("Tahoma", 0, 12));
        B21.setText("16");
        B21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B21ActionPerformed(evt);
            }
        });

        B22.setFont(new java.awt.Font("Tahoma", 0, 12));
        B22.setText("17");
        B22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B22ActionPerformed(evt);
            }
        });

        B23.setFont(new java.awt.Font("Tahoma", 0, 12));
        B23.setText("18");
        B23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B23ActionPerformed(evt);
            }
        });

        B24.setFont(new java.awt.Font("Tahoma", 0, 12));
        B24.setText("19");
        B24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B24ActionPerformed(evt);
            }
        });

        B25.setFont(new java.awt.Font("Tahoma", 0, 12));
        B25.setText("20");
        B25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B25ActionPerformed(evt);
            }
        });

        B26.setFont(new java.awt.Font("Tahoma", 0, 12));
        B26.setText("21");
        B26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B26ActionPerformed(evt);
            }
        });

        B27.setFont(new java.awt.Font("Tahoma", 0, 12));
        B27.setText("22");
        B27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B27ActionPerformed(evt);
            }
        });

        B28.setFont(new java.awt.Font("Tahoma", 0, 12));
        B28.setText("23");
        B28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B28ActionPerformed(evt);
            }
        });

        B29.setFont(new java.awt.Font("Tahoma", 0, 12));
        B29.setText("24");
        B29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B13)
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(B22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B25))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton34)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(B26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B28)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B29)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel11.setText("Registration No.");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel12.setText("DOB");

        T2.setEditable(false);
        T2.setFont(new java.awt.Font("Tahoma", 1, 12));

        T3.setEditable(false);
        T3.setFont(new java.awt.Font("Tahoma", 1, 12));

        B5.setForeground(new java.awt.Color(255, 0, 0));
        B5.setEnabled(false);
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Info.png"))); // NOI18N
        jLabel13.setText("Marked For Review");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(B1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(B2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(B3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(B5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        Phy.setFont(new java.awt.Font("Tahoma", 1, 14));
        Phy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Info.png"))); // NOI18N
        Phy.setText("<html><u>Physics</u></html>");
        Phy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhyMouseClicked(evt);
            }
        });

        Chem.setFont(new java.awt.Font("Tahoma", 1, 14));
        Chem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Info.png"))); // NOI18N
        Chem.setText("<html><u>Chemistry</u></html>");
        Chem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChemMouseClicked(evt);
            }
        });

        Math.setFont(new java.awt.Font("Tahoma", 1, 14));
        Math.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Info.png"))); // NOI18N
        Math.setText("<html><u>Maths</u></html>");
        Math.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MathMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Info.png"))); // NOI18N
        jLabel15.setText("<html><u>Instructions</u></html>");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        Hlbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        Hlbl.setForeground(new java.awt.Color(0, 204, 255));
        Hlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update right.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Phy)
                .addGap(18, 18, 18)
                .addComponent(Chem)
                .addGap(18, 18, 18)
                .addComponent(Math)
                .addGap(43, 43, 43)
                .addComponent(Hlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(26, 26, 26))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Phy)
                        .addComponent(Chem)
                        .addComponent(Math)
                        .addComponent(jLabel15)))
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton1.setText("Mark For Review");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Save  ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton33.setText("Clear Response");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        Myanswer.setFont(new java.awt.Font("Tahoma", 1, 12));
        Myanswer.setText("<html><u>My Answer</u></html>");
        Myanswer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        L5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(80, 80, 80)
                .addComponent(jButton33)
                .addGap(47, 47, 47)
                .addComponent(Myanswer, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton33)
                    .addComponent(Myanswer, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        L3.setFont(new java.awt.Font("Tahoma", 1, 12));
        L3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonGroup1.add(R1);
        R1.setFont(new java.awt.Font("Tahoma", 1, 11));
        R1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                R1MouseClicked(evt);
            }
        });

        buttonGroup1.add(R2);
        R2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                R2MouseClicked(evt);
            }
        });
        R2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(R3);
        R3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                R3MouseClicked(evt);
            }
        });

        buttonGroup1.add(R4);
        R4.setFont(new java.awt.Font("Tahoma", 1, 11));
        R4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                R4MouseClicked(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        T1.setColumns(20);
        T1.setEditable(false);
        T1.setRows(5);
        jScrollPane1.setViewportView(T1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(Img, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Img, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Q.");

        A.setFont(new java.awt.Font("Tahoma", 1, 11));
        A.setText("(A)");

        B.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B.setText("(B)");

        C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        C.setText("(C)");

        D.setFont(new java.awt.Font("Tahoma", 1, 11));
        D.setText("(D)");

        L4.setFont(new java.awt.Font("Tahoma", 1, 12));
        L4.setForeground(new java.awt.Color(255, 255, 255));
        L4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(A)
                            .addComponent(B))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(R3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(R1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(C))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(D)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(R2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(R4, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                        .addGap(29, 29, 29))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addComponent(L4, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addGap(261, 261, 261)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(R1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(R3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(C, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(R2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(R4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(53, 53, 53)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Info.png"))); // NOI18N
        jLabel1.setText("<html><u>AIET PRELIMINARY(2019)</u></html>");

        L1.setFont(new java.awt.Font("Tahoma", 1, 18));
        L1.setText("00");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setText(":");

        L2.setFont(new java.awt.Font("Tahoma", 1, 18));
        L2.setText("00");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("Time Left :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setText("NAME :");

        L6.setFont(new java.awt.Font("Tahoma", 1, 11));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(L6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(L1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L2)
                .addGap(56, 56, 56))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(L2)
                        .addComponent(jLabel4)
                        .addComponent(L6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_B2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
B1.setBackground(Color.WHITE);
B2.setBackground(Color.RED);
B3.setBackground(Color.GREEN);
B5.setBackground(Color.yellow);
Hlbl.setText("Physics");
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Select * from PHYSICS where QNO=1;";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
L3.setText("1");
T1.setText(rs.getString("QUESTION"));
R1.setText(rs.getString("OP1"));
R3.setText(rs.getString("OP2"));
R2.setText(rs.getString("OP3"));
R4.setText(rs.getString("OP4"));
byte[]imagedata=rs.getBytes("IMG");
ImageIcon img=new ImageIcon(new ImageIcon(imagedata).getImage().getScaledInstance(Img.getWidth(),Img.getHeight(),Image.SCALE_SMOOTH));
Img.setIcon(img);
}}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}


T2.setText(LoginPage.T1.getText());
T3.setText(LoginPage.T2.getText());
L6.setText(Instruction.T3.getText());
String reg=T2.getText();
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Select C_PIC FROM Stid1 where REG_NO='"+reg+"';";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
byte[]imagedata=rs.getBytes("C_PIC");
ImageIcon img=new ImageIcon(new ImageIcon(imagedata).getImage().getScaledInstance(Img1.getWidth(),Img1.getHeight(),Image.SCALE_SMOOTH));
Img1.setIcon(img);}}
 catch(Exception e)
 {JOptionPane.showMessageDialog(null,e.getMessage());}

getphyresponse();// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

    private void R2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_R2ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
L3.setText("1");
QuestionSelection();

NoResponse();

L5.setText("");

String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B6.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B6.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B6.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B6.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B6.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B6.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B6.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B6.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B6.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B6.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B6.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B6.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B6.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B6.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B6.setBackground(Color.RED);}}
// TODO add your handling code here:
    }//GEN-LAST:event_B6ActionPerformed

    private void B24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B24ActionPerformed
L3.setText("19");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B24.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B24.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B24.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B24.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B24.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B24.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B24.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B24.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B24.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B24.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B24.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B24.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B24.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B24.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B24.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B24ActionPerformed

    private void PhyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhyMouseClicked
Hlbl.setText("Physics");
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Select * from PHYSICS where QNO=1;";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
L3.setText("1");
T1.setText(rs.getString("QUESTION"));
R1.setText(rs.getString("OP1"));
R3.setText(rs.getString("OP2"));
R2.setText(rs.getString("OP3"));
R4.setText(rs.getString("OP4"));
byte[]imagedata=rs.getBytes("IMG");
ImageIcon img=new ImageIcon(new ImageIcon(imagedata).getImage().getScaledInstance(Img.getWidth(),Img.getHeight(),Image.SCALE_SMOOTH));
Img.setIcon(img);
}}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}

getphyresponse();
// TODO add your handling code here:
    }//GEN-LAST:event_PhyMouseClicked

    private void ChemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChemMouseClicked
 Hlbl.setText("Chemistry");
 try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Select * from CHEMISTRY where QNO=1;";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
L3.setText("1");
T1.setText(rs.getString("QUESTION"));
R1.setText(rs.getString("OP1"));
R3.setText(rs.getString("OP2"));
R2.setText(rs.getString("OP3"));
R4.setText(rs.getString("OP4"));
byte[]imagedata=rs.getBytes("IMG");
ImageIcon img=new ImageIcon(new ImageIcon(imagedata).getImage().getScaledInstance(Img.getWidth(),Img.getHeight(),Image.SCALE_SMOOTH));
Img.setIcon(img);
}}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}

try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Select REG_NO,QNO,CRES FROM CANSWER WHERE REG_NO='"+T2.getText()+"';";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
String qno=rs.getString("QNO");
String res=rs.getString("CRES");
if(qno.equals("1")){
if(res.equals("RED"))
QuestionForm.B6.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B6.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B6.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B6.setBackground(Color.WHITE);
}
else if(qno.equals("2")){
if(res.equals("RED"))
QuestionForm.B7.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B7.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B7.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B7.setBackground(Color.WHITE);
}
else if(qno.equals("3")){
if(res.equals("RED"))
QuestionForm.B8.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B8.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B8.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B8.setBackground(Color.WHITE);
}
else if(qno.equals("4")){
if(res.equals("RED"))
QuestionForm.B9.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B9.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B9.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B9.setBackground(Color.WHITE);
}
else if(qno.equals("5")){
if(res.equals("RED"))
QuestionForm.B10.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B10.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B10.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B10.setBackground(Color.WHITE);
}
else if(qno.equals("6")){
if(res.equals("RED"))
QuestionForm.B11.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B11.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B11.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B11.setBackground(Color.WHITE);
}
else if(qno.equals("7")){
if(res.equals("RED"))
QuestionForm.B12.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B12.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B12.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B12.setBackground(Color.WHITE);
}
else if(qno.equals("8")){
if(res.equals("RED"))
QuestionForm.B13.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B13.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B13.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B13.setBackground(Color.WHITE);
}
else if(qno.equals("9")){
if(res.equals("RED"))
QuestionForm.B14.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B14.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B14.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B14.setBackground(Color.WHITE);
}
else if(qno.equals("10")){
if(res.equals("RED"))
QuestionForm.B15.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B15.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B15.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B15.setBackground(Color.WHITE);
}
else if(qno.equals("11")){
if(res.equals("RED"))
QuestionForm.B16.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B16.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B16.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B16.setBackground(Color.WHITE);
}
else if(qno.equals("12")){
if(res.equals("RED"))
QuestionForm.B17.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B17.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B17.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B17.setBackground(Color.WHITE);
}
else if(qno.equals("13")){
if(res.equals("RED"))
QuestionForm.B18.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B18.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B18.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B18.setBackground(Color.WHITE);
}
else if(qno.equals("14")){
if(res.equals("RED"))
QuestionForm.B19.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B19.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B19.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B19.setBackground(Color.WHITE);
}
else if(qno.equals("15")){
if(res.equals("RED"))
QuestionForm.B20.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B20.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B20.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B20.setBackground(Color.WHITE);
}
else if(qno.equals("16")){
if(res.equals("RED"))
QuestionForm.B21.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B21.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B21.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B21.setBackground(Color.WHITE);
}
else if(qno.equals("17")){
if(res.equals("RED"))
QuestionForm.B22.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B22.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B22.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B22.setBackground(Color.WHITE);
}
else if(qno.equals("18")){
if(res.equals("RED"))
QuestionForm.B23.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B23.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B23.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B23.setBackground(Color.WHITE);
}
else if(qno.equals("19")){
if(res.equals("RED"))
QuestionForm.B24.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B24.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B24.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B24.setBackground(Color.WHITE);
}
else if(qno.equals("20")){
if(res.equals("RED"))
QuestionForm.B25.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B25.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B25.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B25.setBackground(Color.WHITE);
}
else if(qno.equals("21")){
if(res.equals("RED"))
QuestionForm.B26.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B26.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B26.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B26.setBackground(Color.WHITE);
}
else if(qno.equals("22")){
if(res.equals("RED"))
QuestionForm.B27.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B27.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B27.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B27.setBackground(Color.WHITE);
}
else if(qno.equals("23")){
if(res.equals("RED"))
QuestionForm.B28.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B28.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B28.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B28.setBackground(Color.WHITE);
}
else if(qno.equals("24")){
if(res.equals("RED"))
QuestionForm.B29.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B29.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B29.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B29.setBackground(Color.WHITE);
}}}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}
// TODO add your handling code here:
    }//GEN-LAST:event_ChemMouseClicked

    private void MathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MathMouseClicked
Hlbl.setText("Maths");
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Select * from MATHS where QNO=1;";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
L3.setText("1");
T1.setText(rs.getString("QUESTION"));
R1.setText(rs.getString("OP1"));
R3.setText(rs.getString("OP2"));
R2.setText(rs.getString("OP3"));
R4.setText(rs.getString("OP4"));
byte[]imagedata=rs.getBytes("IMG");
ImageIcon img=new ImageIcon(new ImageIcon(imagedata).getImage().getScaledInstance(Img.getWidth(),Img.getHeight(),Image.SCALE_SMOOTH));
Img.setIcon(img);
}}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}


try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://" +
"localhost:3306/ON9EXAM","root","manohar");
Statement stmt=con.createStatement();
String sql="Select REG_NO,QNO,MRES FROM MANSWER WHERE REG_NO='"+T2.getText()+"';";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next()){
String qno=rs.getString("QNO");
String res=rs.getString("MRES");
if(qno.equals("1")){
if(res.equals("RED"))
QuestionForm.B6.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B6.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B6.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B6.setBackground(Color.WHITE);
}
else if(qno.equals("2")){
if(res.equals("RED"))
QuestionForm.B7.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B7.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B7.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B7.setBackground(Color.WHITE);
}
else if(qno.equals("3")){
if(res.equals("RED"))
QuestionForm.B8.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B8.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B8.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B8.setBackground(Color.WHITE);
}
else if(qno.equals("4")){
if(res.equals("RED"))
QuestionForm.B9.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B9.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B9.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B9.setBackground(Color.WHITE);
}
else if(qno.equals("5")){
if(res.equals("RED"))
QuestionForm.B10.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B10.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B10.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B10.setBackground(Color.WHITE);
}
else if(qno.equals("6")){
if(res.equals("RED"))
QuestionForm.B11.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B11.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B11.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B11.setBackground(Color.WHITE);
}
else if(qno.equals("7")){
if(res.equals("RED"))
QuestionForm.B12.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B12.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B12.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B12.setBackground(Color.WHITE);
}
else if(qno.equals("8")){
if(res.equals("RED"))
QuestionForm.B13.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B13.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B13.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B13.setBackground(Color.WHITE);
}
else if(qno.equals("9")){
if(res.equals("RED"))
QuestionForm.B14.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B14.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B14.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B14.setBackground(Color.WHITE);
}
else if(qno.equals("10")){
if(res.equals("RED"))
QuestionForm.B15.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B15.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B15.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B15.setBackground(Color.WHITE);
}
else if(qno.equals("11")){
if(res.equals("RED"))
QuestionForm.B16.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B16.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B16.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B16.setBackground(Color.WHITE);
}
else if(qno.equals("12")){
if(res.equals("RED"))
QuestionForm.B17.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B17.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B17.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B17.setBackground(Color.WHITE);
}
else if(qno.equals("13")){
if(res.equals("RED"))
QuestionForm.B18.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B18.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B18.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B18.setBackground(Color.WHITE);
}
else if(qno.equals("14")){
if(res.equals("RED"))
QuestionForm.B19.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B19.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B19.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B19.setBackground(Color.WHITE);
}
else if(qno.equals("15")){
if(res.equals("RED"))
QuestionForm.B20.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B20.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B20.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B20.setBackground(Color.WHITE);
}
else if(qno.equals("16")){
if(res.equals("RED"))
QuestionForm.B21.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B21.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B21.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B21.setBackground(Color.WHITE);
}
else if(qno.equals("17")){
if(res.equals("RED"))
QuestionForm.B22.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B22.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B22.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B22.setBackground(Color.WHITE);
}
else if(qno.equals("18")){
if(res.equals("RED"))
QuestionForm.B23.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B23.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B23.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B23.setBackground(Color.WHITE);
}
else if(qno.equals("19")){
if(res.equals("RED"))
QuestionForm.B24.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B24.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B24.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B24.setBackground(Color.WHITE);
}
else if(qno.equals("20")){
if(res.equals("RED"))
QuestionForm.B25.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B25.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B25.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B25.setBackground(Color.WHITE);
}
else if(qno.equals("21")){
if(res.equals("RED"))
QuestionForm.B26.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B26.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B26.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B26.setBackground(Color.WHITE);
}
else if(qno.equals("22")){
if(res.equals("RED"))
QuestionForm.B27.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B27.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B27.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B27.setBackground(Color.WHITE);
}
else if(qno.equals("23")){
if(res.equals("RED"))
QuestionForm.B28.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B28.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B28.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B28.setBackground(Color.WHITE);
}
else if(qno.equals("24")){
if(res.equals("RED"))
QuestionForm.B29.setBackground(Color.RED);
else if(res.equals("GREEN"))
QuestionForm.B29.setBackground(Color.GREEN);
else if(res.equals("YELLOW"))
QuestionForm.B29.setBackground(Color.yellow);
else if(res.equals("NULL"))
QuestionForm.B29.setBackground(Color.WHITE);
}}}
catch(Exception e)
{JOptionPane.showMessageDialog(null,e.getMessage());}
// TODO add your handling code here:
    }//GEN-LAST:event_MathMouseClicked

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
ClearResponse();
buttonGroup1.clearSelection();
String qno=L3.getText();
if(qno.equals("1")){
B6.setBackground(Color.RED);}
else if(qno.equals("2")){
B7.setBackground(Color.RED);}
else if(qno.equals("3")){
B8.setBackground(Color.RED);}
else if(qno.equals("4")){
B9.setBackground(Color.RED);}
else if(qno.equals("5")){
B10.setBackground(Color.RED);}
else if(qno.equals("6")){
B11.setBackground(Color.RED);}
else if(qno.equals("7")){
B12.setBackground(Color.RED);}
else if(qno.equals("8")){
B13.setBackground(Color.RED);}
else if(qno.equals("9")){
B14.setBackground(Color.RED);}
else if(qno.equals("10")){
B15.setBackground(Color.RED);}
else if(qno.equals("11")){
B16.setBackground(Color.RED);}
else if(qno.equals("12")){
B17.setBackground(Color.RED);}
else if(qno.equals("13")){
B18.setBackground(Color.RED);}
else if(qno.equals("14")){
B19.setBackground(Color.RED);}
else if(qno.equals("15")){
B20.setBackground(Color.RED);}
else if(qno.equals("16")){
B21.setBackground(Color.RED);}
else if(qno.equals("17")){
B22.setBackground(Color.RED);}
else if(qno.equals("18")){
B23.setBackground(Color.RED);}
else if(qno.equals("19")){
B24.setBackground(Color.RED);}
else if(qno.equals("20")){
B25.setBackground(Color.RED);}
else if(qno.equals("21")){
B26.setBackground(Color.RED);}
else if(qno.equals("22")){
B27.setBackground(Color.RED);}
else if(qno.equals("23")){
B28.setBackground(Color.RED);}
else if(qno.equals("24")){
B29.setBackground(Color.RED);}// TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Response();
if(R1.isSelected())
answeredgreen();
else if(R2.isSelected())
answeredgreen();
else if(R3.isSelected())
answeredgreen();
else if(R4.isSelected())
answeredgreen();
else
{JOptionPane.showMessageDialog(null,"Select Any Option");}

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
L3.setText("2");
QuestionSelection();

NoResponse();
String sub=Hlbl.getText();
L5.setText("");
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B7.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B7.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B7.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B7.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B7.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B7.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B7.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B7.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B7.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B7.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B7.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B7.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B7.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B7.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B7.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
L3.setText("3");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B8.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B8.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B8.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B8.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B8.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B8.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B8.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B8.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B8.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B8.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B8.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B8.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B8.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B8.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B8.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
L3.setText("4");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B9.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B9.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B9.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B9.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B9.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B9.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B9.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B9.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B9.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B9.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B9.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B9.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B9.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B9.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B9.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B9ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
L3.setText("5");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B10.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B10.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B10.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B10.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B10.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B10.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B10.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B10.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B10.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B10.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B10.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B10.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B10.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B10.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B10.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B10ActionPerformed

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
L3.setText("6");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B11.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B11.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B11.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B11.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B11.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B11.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B11.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B11.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B11.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B11.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B11.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B11.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B11.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B11.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B11.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B11ActionPerformed

    private void B12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B12ActionPerformed
 L3.setText("7");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B12.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B12.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B12.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B12.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B12.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B12.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B12.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B12.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B12.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B12.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B12.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B12.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B12.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B12.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B12.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B12ActionPerformed

    private void B13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B13ActionPerformed
 L3.setText("8");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B13.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B13.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B13.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B13.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B13.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B13.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B13.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B13.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B13.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B13.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B13.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B13.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B13.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B13.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B13.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B13ActionPerformed

    private void B14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B14ActionPerformed
 L3.setText("9");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B14.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B14.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B14.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B14.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B14.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B14.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B14.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B14.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B14.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B14.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B14.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B14.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B14.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B14.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B14.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B14ActionPerformed

    private void B15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B15ActionPerformed
 L3.setText("10");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B15.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B15.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B15.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B15.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B15.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B15.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B15.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B15.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B15.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B15.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B15.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B15.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B15.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B15.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B15.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B15ActionPerformed

    private void B16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B16ActionPerformed
 L3.setText("11");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B16.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B16.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B16.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B16.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B16.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B16.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B16.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B16.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B16.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B16.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B16.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B16.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B16.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B16.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B16.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B16ActionPerformed

    private void B17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B17ActionPerformed
 L3.setText("12");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B17.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B17.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B17.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B17.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B17.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B17.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B17.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B17.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B17.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B17.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B17.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B17.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B17.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B17.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B17.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B17ActionPerformed

    private void B18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B18ActionPerformed
 L3.setText("13");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B18.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B18.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B18.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B18.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B18.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B18.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B18.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B18.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B18.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B18.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B18.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B18.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B18.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B18.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B18.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B18ActionPerformed

    private void B19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B19ActionPerformed
 L3.setText("14");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B19.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B19.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B19.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B19.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B19.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B19.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B19.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B19.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B19.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B19.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B19.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B19.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B19.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B19.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B19.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B19ActionPerformed

    private void B20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B20ActionPerformed
 L3.setText("15");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B20.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B20.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B20.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B20.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B20.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B20.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B20.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B20.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B20.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B20.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B20.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B20.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B20.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B20.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B20.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B20ActionPerformed

    private void B21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B21ActionPerformed
 L3.setText("16");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B21.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B21.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B21.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B21.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B21.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B21.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B21.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B21.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B21.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B21.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B21.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B21.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B21.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B21.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B21.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B21ActionPerformed

    private void B22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B22ActionPerformed
 L3.setText("17");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B22.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B22.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B22.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B22.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B22.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B22.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B22.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B22.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B22.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B22.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B22.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B22.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B22.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B22.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B22.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B22ActionPerformed

    private void B23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B23ActionPerformed
 L3.setText("18");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B23.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B23.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B23.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B23.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B23.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B23.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B23.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B23.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B23.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B23.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B23.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B23.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B23.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B23.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B23.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B23ActionPerformed

    private void B25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B25ActionPerformed
 L3.setText("20");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B25.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B25.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B25.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B25.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B25.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B25.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B25.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B25.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B25.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B25.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B25.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B25.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B25.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B25.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B25.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B25ActionPerformed

    private void B26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B26ActionPerformed
 L3.setText("21");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B26.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B26.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B26.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B26.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B26.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B26.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B26.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B26.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B26.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B26.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B26.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B26.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B26.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B26.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B26.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B26ActionPerformed

    private void B27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B27ActionPerformed
 L3.setText("22");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B27.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B27.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B27.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B27.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B27.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B27.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B27.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B27.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B27.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B27.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B27.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B27.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B27.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B27.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B27.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B27ActionPerformed

    private void B28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B28ActionPerformed
 L3.setText("23");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B28.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B28.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B28.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B28.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B28.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B28.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B28.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B28.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B28.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B28.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B28.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B28.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B28.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B28.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B28.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B28ActionPerformed

    private void B29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B29ActionPerformed
 L3.setText("24");
QuestionSelection();

NoResponse();
L5.setText("");
String sub=Hlbl.getText();
if(sub.equals("Physics")){
getpans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B29.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B29.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B29.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B29.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B29.setBackground(Color.RED);}}

else if(sub.equals("Chemistry")){
getcans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B29.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B29.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B29.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B29.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B29.setBackground(Color.RED);}}

else{
getmans();
String ans=L5.getText();
if(ans.equals("A")){R1.setSelected(true);B29.setBackground(Color.GREEN);}
else if(ans.equals("B")){R3.setSelected(true);B29.setBackground(Color.GREEN);}
else if(ans.equals("C")){R2.setSelected(true);B29.setBackground(Color.GREEN);}
else if(ans.equals("D")){R4.setSelected(true);B29.setBackground(Color.GREEN);}
else if(ans.equals("")){buttonGroup1.clearSelection();B29.setBackground(Color.RED);}}

// TODO add your handling code here:
    }//GEN-LAST:event_B29ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
Instruction.jButton1.setEnabled(true);
Instruction i=new Instruction();
i.setVisible(true);
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
M4Review();
L5.setText("");
String qno=L3.getText();
if(qno.equals("1")){
B6.setBackground(Color.yellow);}
else if(qno.equals("2")){
B7.setBackground(Color.yellow);}
else if(qno.equals("3")){
B8.setBackground(Color.yellow);}
else if(qno.equals("4")){
B9.setBackground(Color.yellow);}
else if(qno.equals("5")){
B10.setBackground(Color.yellow);}
else if(qno.equals("6")){
B11.setBackground(Color.yellow);}
else if(qno.equals("7")){
B12.setBackground(Color.yellow);}
else if(qno.equals("8")){
B13.setBackground(Color.yellow);}
else if(qno.equals("9")){
B14.setBackground(Color.yellow);}
else if(qno.equals("10")){
B15.setBackground(Color.yellow);}
else if(qno.equals("11")){
B16.setBackground(Color.yellow);}
else if(qno.equals("12")){
B17.setBackground(Color.yellow);}
else if(qno.equals("13")){
B18.setBackground(Color.yellow);}
else if(qno.equals("14")){
B19.setBackground(Color.yellow);}
else if(qno.equals("15")){
B20.setBackground(Color.yellow);}
else if(qno.equals("16")){
B21.setBackground(Color.yellow);}
else if(qno.equals("17")){
B22.setBackground(Color.yellow);}
else if(qno.equals("18")){
B23.setBackground(Color.yellow);}
else if(qno.equals("19")){
B24.setBackground(Color.yellow);}
else if(qno.equals("20")){
B25.setBackground(Color.yellow);}
else if(qno.equals("21")){
B26.setBackground(Color.yellow);}
else if(qno.equals("22")){
B27.setBackground(Color.yellow);}
else if(qno.equals("23")){
B28.setBackground(Color.yellow);}
else if(qno.equals("24")){
B29.setBackground(Color.yellow);}
buttonGroup1.clearSelection();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void R1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R1MouseClicked
L4.setText("A");        // TODO add your handling code here:
    }//GEN-LAST:event_R1MouseClicked

    private void R2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R2MouseClicked
L4.setText("C");       // TODO add your handling code here:
    }//GEN-LAST:event_R2MouseClicked

    private void R3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R3MouseClicked
L4.setText("B");        // TODO add your handling code here:
    }//GEN-LAST:event_R3MouseClicked

    private void R4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R4MouseClicked
L4.setText("D");        // TODO add your handling code here:
    }//GEN-LAST:event_R4MouseClicked

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
AnswerAnalysis aa=new AnswerAnalysis();
aa.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel B;
    private javax.swing.JButton B1;
    public static javax.swing.JButton B10;
    public static javax.swing.JButton B11;
    public static javax.swing.JButton B12;
    public static javax.swing.JButton B13;
    public static javax.swing.JButton B14;
    public static javax.swing.JButton B15;
    public static javax.swing.JButton B16;
    public static javax.swing.JButton B17;
    public static javax.swing.JButton B18;
    public static javax.swing.JButton B19;
    private javax.swing.JButton B2;
    public static javax.swing.JButton B20;
    public static javax.swing.JButton B21;
    public static javax.swing.JButton B22;
    public static javax.swing.JButton B23;
    public static javax.swing.JButton B24;
    public static javax.swing.JButton B25;
    public static javax.swing.JButton B26;
    public static javax.swing.JButton B27;
    public static javax.swing.JButton B28;
    public static javax.swing.JButton B29;
    private javax.swing.JButton B3;
    private javax.swing.JButton B5;
    public static javax.swing.JButton B6;
    public static javax.swing.JButton B7;
    public static javax.swing.JButton B8;
    public static javax.swing.JButton B9;
    private javax.swing.JLabel C;
    private javax.swing.JLabel Chem;
    private javax.swing.JLabel D;
    private javax.swing.JLabel Hlbl;
    private javax.swing.JLabel Img;
    private javax.swing.JLabel Img1;
    public static javax.swing.JLabel L1;
    public static javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JTextField L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel Math;
    private javax.swing.JLabel Myanswer;
    private javax.swing.JLabel Phy;
    private javax.swing.JRadioButton R1;
    private javax.swing.JRadioButton R2;
    private javax.swing.JRadioButton R3;
    private javax.swing.JRadioButton R4;
    private javax.swing.JTextArea T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
