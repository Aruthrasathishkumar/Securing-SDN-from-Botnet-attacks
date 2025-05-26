/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botmaster;

import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author Elcot
 */
public class Main {
    public static void main(String[] args) 
    {                                
        try
        {                    			
            UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());
                                                
            BotMasterFrame bmf=new BotMasterFrame();
            bmf.setTitle("Bot Master");
            bmf.setVisible(true);
            bmf.setResizable(false); 
            
            BotMasterReceiver bmr=new BotMasterReceiver(bmf);
            bmr.start();
	}
	catch (Exception ex)
	{            
            //System.out.println(ex);
	}   
    }
}
