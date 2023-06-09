import java.awt.*;
import javax.swing.*;

public class Registrationform extends JFrame 
{
    public static void main(String h[])
    {
        
       Frame frame=new Frame("Rajasthan Trip");
       frame.setBackground(Color.BLUE);
       frame.setSize(1000,700);
       frame.setVisible(true); 
     

       /*Label heading=new Label ("Registration for Rajasthan Trip");
       heading.setFont(new Font("Tahoma", Font.PLAIN, 16));
       heading.setBounds(500,00,300,30);
       heading.setForeground(Color.WHITE);
       frame.add(heading);

       Label subheading=new Label ("For Students");
       subheading.setFont(new Font("Tahoma", Font.PLAIN, 16));
       subheading.setForeground(Color.WHITE);
       subheading.setBounds(300, 300, 50, 30);
       frame.add(subheading);*/

       Label name=new Label("Enter your Name");
       name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(1000, 100);
        name.setLocation(100, 100);
        frame.add(name);

         TextField t1=new TextField();
        t1.setBounds(50,100, 200,30);
        frame.add(t1); 

        Label branch=new Label("Enter your Branch");
       branch.setFont(new Font("Arial", Font.PLAIN, 20));
        branch.setSize(1000, 100);
        branch.setLocation(100, 100);
        frame.add(name);

        TextField tbranch = new TextField();
        tbranch.setFont(new Font("Arial", Font.PLAIN, 15));
        tbranch.setSize(190, 20);
        tbranch.setLocation(200, 100);
        frame.add(tbranch);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        frame.add(gender);
 
        JRadioButton male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        frame.add(male);
 
        JRadioButton  female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        frame.add(female);
 

       /*JButton submit=new JButton("Submit");
       submit.setBounds(30,50,150,50);
       submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
       submit.setBackground(new Color(30, 144, 255));
       submit.setForeground(Color.WHITE);
       frame.add(submit);

    
       Button cancel=new Button("Cancel");
       cancel.setBounds(60,100,300,100);
       submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
       cancel.setForeground(Color.WHITE);
       cancel.setBackground(new Color(30, 144, 255));
       frame.add(cancel);*/
    }
}
