/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joptiopaneactivity;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class JOptiopaneActivity {

    public static void main(String[] args) {
        boolean execution=true;
       Calculation Calculation=new Calculation();//created a class
       
      //Prompting the user input
      String number=JOptionPane.showInputDialog("Enter a number:");
      int num1= Integer.parseInt(number);
      number=JOptionPane.showInputDialog("Enter a second number:");
      int num2= Integer.parseInt(number);
      while(execution){
          String Menu =JOptionPane.showInputDialog("Please select an option(1-4)for calculation you want/n"
               + "Menu/n"
               + "1.addition/n"
               + "2.subtraction/n"
               + "3.division/n"
               + "4.multiplication/n"
               + "0.Exit");
      int Option= Integer.parseInt(Menu);
      //operation based on user option
      switch(Option){
          case 1:
              JOptionPane.showMessageDialog(null,Calculation.addition(num2, num1, num2) );
              break;
              
           case 2:
              JOptionPane.showMessageDialog(null,Calculation.subraction(num2, num1, num2));
              break;
              
           case 3:
              JOptionPane.showMessageDialog(null,Calculation.Division(num2, num1, num2) );
              break;
              
           case 4:
              JOptionPane.showMessageDialog(null,Calculation.Multiplication(num2, num1, num2));
              break;
              
               case 5:
                   execution=false;
              JOptionPane.showMessageDialog(null, "exit ");
              break;
               default:
                   JOptionPane.showMessageDialog(null, "Option not recognized");
                   
                   
              
      }
      }
    }
}
