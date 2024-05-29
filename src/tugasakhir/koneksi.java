/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasakhir;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER NITRO
 */

   
public class koneksi {
    private static Connection koneksi;
    private String keyword;
    
    public static void main(String args[]){
        new login().setVisible(true);
    } 


   public static void konek() {
     try {
          Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException cnf) {
        }
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/itoko", "root", "");
            JOptionPane.showMessageDialog(null, "Koneksi Database Berhasil");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Koneksi Database Tidak Berhasil");
        } catch (Exception e) {
        }
    }    
}