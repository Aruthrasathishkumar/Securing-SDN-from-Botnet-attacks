/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computernetwork;

import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Elcot
 */
public class Main 
{
    public static void main(String[] args) 
    {                                
        try
        {                    			
            UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());
            
            int nodeid=Integer.parseInt((JOptionPane.showInputDialog(new JFrame(),"Enter the Computer Id:")).trim());
            
            NodeFrame nf=new NodeFrame(nodeid);
            nf.setTitle("Computer - "+nodeid);
            nf.jLabel1.setText("Computer - "+nodeid);
            nf.setVisible(true);
            nf.setResizable(false);
            
            NodeReceiver nr=new NodeReceiver(nf,nodeid);
            nr.start();
	}
	catch (Exception ex)
	{            
            //System.out.println(ex);
	}   
    }
}
