/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimaltobinaryconversion;
import javax.swing.*;
/**
 *
 * @author Meso Okoye
 */
public class DecimaltoBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String y = "";
    String a = JOptionPane.showInputDialog("Enter Decimal Number");
    int x = Integer.parseInt(a);
    int num = x;
    
            while (num>0)
            {
                int z = num % 2;
                y = " " + z + y;
                num = (num - z) / 2;
            }
                JOptionPane.showMessageDialog(null, "The Answer is: " + y);
           
    }
    
}
