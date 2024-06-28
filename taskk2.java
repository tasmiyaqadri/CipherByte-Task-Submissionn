2.The user is prompted to enter their given number in a displayed dialogue box.


import javax.swing.JOptionPane;

class Box
 {

  public static void main(String args[]) 
{
    String st = JOptionPane.showInputDialog("Enter a number:");

    
    if (st == null) 
{
      System.out.println("User canceled input.");
      return;
    }

    else
    
      System.out.println("You entered: " + st);
    }
 
  }
