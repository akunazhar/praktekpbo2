package config;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class configDB extends javax.swing.JFrame {
    
   private String url = "jdbc:mysql://localhost:3306/dokter";
    private String user = "root";
    private String pass = "";
    
    private Connection KoneksiDatabase;
    private configDB crud = new configDB();


    public configDB(){}
    

    public Connection getKoneksi() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load driver terbaru
        } catch (ClassNotFoundException e) {
            System.err.println("Driver MySQL tidak ditemukan: " + e.toString());
        }
        return DriverManager.getConnection(this.url, this.user, this.pass);
    }

    // ========================= CRUD FOR ANGGOTA =========================
    public void saveAnggota(String id, String nama, String email, String noTlp) {
        try {
            String SQL = "INSERT INTO anggota (Id_Anggota, Nama_Anggota, Email, No_Tlp) VALUES (?, ?, ?, ?)";
            PreparedStatement simpan = getKoneksi().prepareStatement(SQL);
            simpan.setString(1, id);
            simpan.setString(2, nama);
            simpan.setString(3, email);
            simpan.setString(4, noTlp);
            simpan.executeUpdate();
            simpan.close();
            getKoneksi().close();
            System.out.println("Data Anggota Berhasil Disimpan");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void updateAnggota(String id, String nama, String email, String noTlp) {
        try {
            String SQL = "UPDATE anggota SET Nama_Anggota=?, Email=?, No_Tlp=? WHERE Id_Anggota=?";
            PreparedStatement update = getKoneksi().prepareStatement(SQL);
            update.setString(1, nama);
            update.setString(2, email);
            update.setString(3, noTlp);
            update.setString(4, id);
            update.executeUpdate();
            update.close();
            getKoneksi().close();
            System.out.println("Data Anggota Berhasil Diubah");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    public void deleteAnggota(String id) {
        try {
            String SQL = "DELETE FROM anggota WHERE Id_Anggota=?";
            PreparedStatement delete = getKoneksi().prepareStatement(SQL);
            delete.setString(1, id);
            delete.executeUpdate();
            delete.close();
            getKoneksi().close();
            JOptionPane.showMessageDialog(null, "Data Anggota Berhasil Dihapus");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    // ========================= CRUD FOR DOKTER =========================
    public void saveDokter(String id, String nama, String email, String noTlp) {
        try {
            String SQL = "INSERT INTO dokter (Id_Dokter, Nama_Dokter, Email, No_Tlp) VALUES (?, ?, ?, ?)";
            PreparedStatement simpan = getKoneksi().prepareStatement(SQL);
            simpan.setString(1, id);
            simpan.setString(2, nama);
            simpan.setString(3, email);
            simpan.setString(4, noTlp);
            simpan.executeUpdate();
            simpan.close();
            getKoneksi().close();
            System.out.println("Data Dokter Berhasil Disimpan");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void updateDokter(String id, String nama, String email, String noTlp) {
        try {
            String SQL = "UPDATE dokter SET Nama_Dokter=?, Email=?, No_Tlp=? WHERE Id_Dokter=?";
            PreparedStatement update = getKoneksi().prepareStatement(SQL);
            update.setString(1, nama);
            update.setString(2, email);
            update.setString(3, noTlp);
            update.setString(4, id);
            update.executeUpdate();
            update.close();
            getKoneksi().close();
            System.out.println("Data Dokter Berhasil Diubah");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    public void deleteDokter(String id) {
        try {
            String SQL = "DELETE FROM dokter WHERE Id_Dokter=?";
            PreparedStatement delete = getKoneksi().prepareStatement(SQL);
            delete.setString(1, id);
            delete.executeUpdate();
            delete.close();
            getKoneksi().close();
            JOptionPane.showMessageDialog(null, "Data Dokter Berhasil Dihapus");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
