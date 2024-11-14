/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2;

import forms.mainFrame;
inmport
/**
 *
 * @author Asus
 */   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new mainFrame().setVisible(true);
        configDatabase obj = new configDatabase();
        String TabelField[]={"id","email","nama","notlp","tahun"};
        String Fill[]={"KR01","Panji Petualang","Action","10","2021"};
        
        System.out.println(obj.getTabelField(TabelField));
        System.out.println(obj.getTabelFill(Fill));
        
    }
    
}

public class Pbo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
