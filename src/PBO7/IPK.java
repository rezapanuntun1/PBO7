/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO7;
import java.util.Comparator;
public class IPK implements Comparator<Mahasiswa> {
     @Override
    public int compare(Mahasiswa m, Mahasiswa n){
        return Float.compare(m.getipk(), n.getipk());
    }
}
