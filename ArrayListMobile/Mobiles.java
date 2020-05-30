
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class Mobiles
{
    int  counter = 1;
    ArrayList <Mobile> mobileData = new ArrayList<Mobile>();
    JPanel window;
    JFrame frame;
    JLabel lCmpName,lMblName,lMdlNum,lRam,lIntStorage,lScrnSize,lbExpandableStorage,lTotalCount;
    JTextField tfCmpName,tfMblName,tfMdlNum,tfRam,tfIntStorage,tfScrnSize,tfExpandableStorage,tfTotalCount;
    JButton addMobile,showMobile;
    public Mobiles(){

        mainFrame();
        mainBody();
    }
    public void mainFrame(){
        frame = new JFrame ();
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        frame.setSize(600,600);
        frame.setResizable(false);
    }

    public void mainBody(){
        
        window = new JPanel();
        window.setLayout(null);
        frame.add(window,BorderLayout.CENTER);
        lCmpName= new JLabel("Company Name");
        lCmpName.setBounds(50,20,100,20);
        lMblName = new JLabel("Mobile Name:");
        lMblName.setBounds(50,50,100,20);
        lMdlNum = new JLabel("Model Number:");
        lMdlNum.setBounds(50,80,100,20);
        window.add(lMdlNum);
        lRam = new JLabel("RAM Size");
        lRam.setBounds(50,110,100,20);
        lIntStorage= new JLabel("Internal Storage");
        lIntStorage.setBounds(50,140,100,20);
        lScrnSize = new JLabel("Screen Size");
        lScrnSize.setBounds(50,170,100,20);
        lbExpandableStorage= new JLabel("Expandable Storage");
        lbExpandableStorage.setBounds(50,200,100,20);
        window.add(lbExpandableStorage);
        lTotalCount = new JLabel("Total Count");
        lTotalCount.setBounds(50,230,100,20);

        tfCmpName = new JTextField();
        tfCmpName.setBounds(350,20,100,20);
        tfMblName = new JTextField();
        tfMblName.setBounds(350,50,100,20);
        window.add(tfMblName);
        tfMdlNum= new JTextField();
        tfMdlNum.setBounds(350,80,100,20);
        tfRam= new JTextField();
        tfRam.setBounds(350,110,100,20);
        tfIntStorage= new JTextField();
        tfIntStorage.setBounds(350,140,100,20);
        tfScrnSize= new JTextField();
        tfScrnSize.setBounds(350,170,100,20);
        tfExpandableStorage= new JTextField();
        tfExpandableStorage.setBounds(350,200,100,20);
        window.add(tfExpandableStorage);
        tfTotalCount= new JTextField();
        tfTotalCount.setBounds(350,230,100,20);
        tfTotalCount.setEditable(false);
        window.add(lCmpName);
        window.add(tfCmpName);
        window.add(lMblName);
        
        window.add(tfMdlNum);
        window.add(lRam);
        window.add(tfRam);
        window.add(lIntStorage);
        window.add(tfIntStorage);
        window.add(lScrnSize);
        window.add(tfScrnSize);
        window.add(lTotalCount);

        Color c = new Color(57, 162, 145);
        window.setOpaque(true);
        window.setBackground(c);
        addingButtons();
    }
    public void addingButtons(){
    addMobile = new JButton("Add Mobile");
    addMobile.setBounds(200,300,100,30);
    addMobile.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
    addToList();
    }
    });
    window.add(addMobile);
    
    
    showMobile = new JButton("Show Mobile");
    showMobile.setBounds(300,300,100,30);
    showMobile.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
    displayingMobile();
    }
    });
    window.add(showMobile);
    }
    
    public void addToList(){
    String companyName=tfCmpName.getText();
    String mobileName =tfMblName.getText();
    String modelNumber=tfMdlNum.getText();
    byte ram=Byte.parseByte(tfRam.getText());
    int internalStorage=Integer.parseInt(tfIntStorage.getText());
    double screenSize=Double.parseDouble(tfScrnSize.getText());
    boolean expandableStorage = Boolean.parseBoolean(tfExpandableStorage.getText());
    
    Mobile obj = new Mobile(companyName, mobileName, modelNumber, ram, internalStorage, screenSize, expandableStorage);
    mobileData.add(obj );
    }
    
    public void displayingMobile(){
    JPanel displayPanel = new JPanel();
    displayPanel.setSize(300,300);
    window.add(displayPanel);
    for(int i = 0;i<mobileData.size();i++){
        int y = 20;
        displayPanel.add(new JLabel(mobileData.get(i).getCompanyName()));
        
        //+mobileData.get(i).getMobileName()+" "+mobileData.get(i).getModelNumber()+" "+mobileData.get(i).getRam()+" "+mobileData.get(i).getInternalStorage()+" "+mobileData.get(i).getScreenSize()+" "+mobileData.get(i).getExpandableStorage()+" "
    }
    
    }
    

    public static void main(String []args){
        new Mobiles().frame.setVisible(true);
    }
}