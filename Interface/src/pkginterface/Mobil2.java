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
public  abstract class Mobil2 implements Mesin{
     private String nomor_mesin;
     @Override
    public void setNoMesin(String nomor_mesin) {
        this.nomor_mesin=nomor_mesin; 
    }
     @Override
    public String getNoMesin() {
        return nomor_mesin;
    }
}
