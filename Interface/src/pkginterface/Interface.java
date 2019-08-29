/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mobil1 m1=new Mobil1();
        m1.setMerk("Ford");
        m1.setNoMesin("01010");
        System.out.println(m1.getMerk());
        System.out.println(m1.getNoMesin());
    }
  
    
}
