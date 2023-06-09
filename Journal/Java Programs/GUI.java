import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Random extends JFrame implements ActionListener
{
    Container container = getContentPane();
	Label lblTitle,lblName,lblAge,lblGender,lblChoice;
	TextField txtName,txtAge;
	Checkbox checkMale, checkFemale,checkOther,Opt1,Opt2,Opt3;
	Choice Chchoice;
	CheckboxGroup group1;
	Button btnSubmit,btnCancel;
	JFrame f; 
 
	Random()
     {
		super("Rajasthan Trip Registration Form");
		setSize(1000, 600);
		setLayout(null);
		setVisible(true);
		Color formColor = new Color(53, 75, 72);
		setBackground(formColor);
 
		Font titleFont = new Font("arial", Font.BOLD, 25);
		Font labelFont =new  Font("arial", Font.PLAIN, 18);
		Font textFont =new  Font("arial", Font.PLAIN, 15);
 
		lblTitle=new Label("Student Form");  
		lblTitle.setBounds(250,40,300,50);
		lblTitle.setFont(titleFont);
		lblTitle.setForeground(Color.YELLOW);
		container.add(lblTitle);
 
		lblName=new Label("Name");  
		lblName.setBounds(250,100,150,30);
		lblName.setFont(labelFont);  
		lblName.setForeground(Color.BLACK);
		container.add(lblName);
 
		txtName=new TextField();
		txtName.setBounds(400,100,400,30);
		txtName.setFont(textFont);
		container.add(txtName);
		
		lblAge =new Label("Age");  
		lblAge.setBounds(250,200,150,30);
		lblAge.setFont(labelFont);
		lblAge.setForeground(Color.BLACK);
		container.add(lblAge);

		txtAge=new TextField();
		txtAge.setBounds(400,200,400,30);
		txtAge.setFont(textFont);
		container.add(txtAge);
 
		
		lblGender=new Label("Gender");  
		lblGender.setBounds(250,250,150,30);
		lblGender.setFont(labelFont);
		lblGender.setForeground(Color.BLACK);
		container.add(lblGender);
 
		group1 = new CheckboxGroup();
 
		checkMale = new Checkbox("Male",group1,true);
		checkMale.setBounds(400,250, 100, 30);
		checkMale.setFont(labelFont);
		checkMale.setForeground(Color.BLACK);
		container.add(checkMale);
 
		checkFemale = new Checkbox("Female",group1,false);
		checkFemale.setBounds(500,250, 100, 30);
		checkFemale.setFont(labelFont);
		checkFemale.setForeground(Color.BLACK);
		container.add(checkFemale);

		checkOther = new Checkbox("Other",group1,false);
		checkOther.setBounds(600,250, 100, 30);
		checkOther.setFont(labelFont);
		checkOther.setForeground(Color.BLACK);
		container.add(checkOther);

		
 
		lblChoice=new Label("Which tickets do you want ?");  
		lblChoice.setBounds(250,300,300,30);
		lblChoice.setFont(labelFont);
		lblChoice.setForeground(Color.BLACK);
		container.add(lblChoice);
		

		Opt1=new Checkbox("Only Rajasthan");
		Opt1.setBounds(400, 350, 300, 50);
		Opt1.setFont(labelFont);
		Opt1.setForeground(Color.BLACK);
		container.add(Opt1);

		Opt2=new Checkbox("Only Mumbai");
		Opt2.setBounds(400, 400, 300, 50);
		Opt2.setFont(labelFont);
		Opt2.setForeground(Color.BLACK);
		container.add(Opt2);

		Opt3=new Checkbox("Both");
		Opt3.setBounds(400, 450, 300, 50);
		Opt3.setFont(labelFont);
		Opt3.setForeground(Color.BLACK);
		container.add(Opt3);


		btnSubmit=new Button("Submit");
		btnSubmit.setBounds(400,530,150,30);
		btnSubmit.setFont(labelFont);
		btnSubmit.setBackground(Color.BLUE);
		btnSubmit.setForeground(Color.WHITE);
		container.add(btnSubmit);
		
		btnCancel=new Button("Cancel");
		btnCancel.setBounds(560,530,150,30);
		btnCancel.setFont(labelFont);
		btnCancel.setBackground(Color.RED);
		btnCancel.setForeground(Color.WHITE);
		container.add(btnCancel);
        addActionEvent();
		
	}

    public void addActionEvent()
    {
       //adding Action listener to components
       btnSubmit.addActionListener(this);
        btnCancel.addActionListener(this);
        
    }
		
    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == btnSubmit)
        {
            JOptionPane.showMessageDialog(this, "Registration Successful");
        }

        //Coding Part of RESET button
        if (e.getSource() == btnCancel)
        {
            JOptionPane.showMessageDialog(this, "Are you sure you want to cancel");
        }

 
 
    }
}	
 

 
public class GUI 
{
	public static void main(String[] args)
	 {
		Random frm = new Random();
	}
 
}