/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tv;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author nguyenhinh
 */
public class tiviservice {
    ArrayList<tivi> lsttivi= new ArrayList();
    public void fakedata(){
        lsttivi.add(new tivi("sony","samsung",8000,"có"));
        lsttivi.add(new tivi("ipart","appe",9000,"không"));
        lsttivi.add(new tivi("LG","oppo",5000,"có"));
    }
    public boolean ghifile(ArrayList<tivi> lst,String filename){
        try {
            ObjectOutputStream oos = new    ObjectOutputStream(new FileOutputStream("filename"));
            oos.writeObject(lst);
            oos.close();
            return true;
            
        } catch (Exception e) {
            return false;
        }
        
    }
}
