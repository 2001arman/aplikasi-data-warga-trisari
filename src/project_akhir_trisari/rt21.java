/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_akhir_trisari;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static project_akhir_trisari.login.conn;

/**
 *
 * @author Armann
 */
public class rt21 extends javax.swing.JFrame {
    String nomor, nama, jumlah, ekonomi,id;
    static Connection conn;
    static Statement stmt;
    static ResultSet rs; 
    
     public void tampil(){
        try{
            connect connect = new connect();
             conn=(Connection)connect.DB();
             String sql = "SELECT * FROM rt21";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
              DefaultTableModel model = new DefaultTableModel();
                 model.addColumn("No. Rumah");
                 model.addColumn("Kepala Keluarga");
                 model.addColumn("Jumlah Anggota");
                 model.addColumn("Golongan");
                 model.addColumn("Agama");
                 model.addColumn("RT");
              int no = 1;
              while(rs.next()){
                 model.addRow(new Object[] {rs.getString("nomor"), rs.getString("nama"), rs.getString("jumlah"), rs.getString("golongan"), rs.getString("agama"), rs.getString("rt")});
              }
              warga.setModel(model);
              warga.setShowGrid(true);
              warga.getColumnModel().getColumn(0).setPreferredWidth(90);
              warga.getColumnModel().getColumn(1).setPreferredWidth(120);
              warga.getColumnModel().getColumn(2).setPreferredWidth(100);
              warga.getColumnModel().getColumn(3).setPreferredWidth(85);
              warga.getColumnModel().getColumn(4).setPreferredWidth(70);
              warga.getColumnModel().getColumn(5).setPreferredWidth(50);
              warga.setRowHeight(30);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
     
     void hapus(){
         nomorRumah.setText(null);
         namaKeluarga.setText(null);
         jumlahKeluarga.setText(null);
         cbgolongan.setSelectedItem(this);
     }
     
    public rt21() {
        initComponents();
        tampil();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomorRumah = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        namaKeluarga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jumlahKeluarga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbgolongan = new javax.swing.JComboBox<>();
        tambah = new javax.swing.JButton();
        perbarui = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        warga = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        rt22 = new javax.swing.JButton();
        rt23 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        agamaTxt = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Data Warga Trisari");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama Kepala Keluarga");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nomor Rumah");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Jumlah Anggota Keluarga");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Golongan Ekonomi");

        cbgolongan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kaya", "Mampu", "Kurang Mampu" }));

        tambah.setText("Tambah Data");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        perbarui.setText("Perbarui Data");
        perbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perbaruiActionPerformed(evt);
            }
        });

        hapus.setText("Hapus Data");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        warga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nomor Rumah", "Kepala Keluarga", "Jumlah Anggota", "Golongan Ekonomi"
            }
        ));
        warga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wargaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(warga);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("RT 21");

        menu.setText("Menu Utama");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        rt22.setText("Data RT. 22");
        rt22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rt22ActionPerformed(evt);
            }
        });

        rt23.setText("Data RT. 23");
        rt23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rt23ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Agama");

        agamaTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Katolik", "Hindhu", "Buddha" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nomorRumah)
                                .addComponent(namaKeluarga)
                                .addComponent(jumlahKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbgolongan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel2))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(agamaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tambah)
                            .addComponent(menu))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rt22)
                            .addComponent(perbarui))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hapus)
                            .addComponent(rt23))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomorRumah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jumlahKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cbgolongan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(agamaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tambah)
                            .addComponent(hapus)
                            .addComponent(perbarui))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menu)
                            .addComponent(rt23)
                            .addComponent(rt22))
                        .addGap(41, 41, 41))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rt23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rt23ActionPerformed
        rt23 rt23 = new rt23();
        rt23.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rt23ActionPerformed

    private void rt22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rt22ActionPerformed
        rt22 rt22= new rt22();
        rt22.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rt22ActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuActionPerformed

    private void wargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wargaMouseClicked
        int baris = warga.rowAtPoint(evt.getPoint());
        id = warga.getValueAt(baris, 0).toString();
        nomorRumah.setText(id);
        nama = warga.getValueAt(baris, 1).toString();
        namaKeluarga.setText(nama);
        jumlah = warga.getValueAt(baris, 2).toString();
        jumlahKeluarga.setText(jumlah);
        ekonomi = warga.getValueAt(baris, 3).toString();
        cbgolongan.setSelectedItem(ekonomi);
        String agama = warga.getValueAt(baris, 4).toString();
        agamaTxt.setSelectedItem(agama);
    }//GEN-LAST:event_wargaMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        try{
            connect connect = new connect();
            conn=(Connection)connect.DB();
            stmt = conn.createStatement();
            String nama = namaKeluarga.getText();
            String sql = "DELETE FROM `rt21` WHERE nama = '%s'";
            sql = String.format(sql, nama);
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DIHAPUS");
            tampil();
            hapus();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void perbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perbaruiActionPerformed
        String namaB = namaKeluarga.getText();
        String nomor = nomorRumah.getText();
        String jumlah = jumlahKeluarga.getText();
        String golongan = cbgolongan.getSelectedItem().toString();
        String agama = agamaTxt.getSelectedItem().toString();
        boolean betul = false;
        //        verifikasi jika ada data kosong
        if (namaB.isEmpty() | nomor.isEmpty() | jumlah.isEmpty()){
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
            hapus();
        }
        else{
            try{
                connect connect = new connect();
                conn=(Connection)connect.DB();
                String sql1 = "SELECT * FROM rt21";
                rs = stmt.executeQuery(sql1);
                stmt = conn.createStatement();
                String sql = "UPDATE rt21 SET nomor='%s',nama='%s',jumlah='%s',golongan='%s',agama='%s'  WHERE nomor='%s'";
                sql = String.format(sql, nomor, namaB, jumlah, golongan, agama, id);
                stmt.execute(sql);
                JOptionPane.showMessageDialog(null, "DATA BERHASIL DIPERBARUI");
                tampil();
                hapus();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_perbaruiActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        String nama = namaKeluarga.getText();
        String nomor = nomorRumah.getText();
        boolean betul = false;
        String jumlah = jumlahKeluarga.getText();
        String golongan = cbgolongan.getSelectedItem().toString();
        String agama = agamaTxt.getSelectedItem().toString();
        String rt = "21";
        //        verifikasi jika ada data kosong
        if (nama.isEmpty() | nomor.isEmpty() | jumlah.isEmpty()){
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
            hapus();
        }
        else{
            try{
                connect connect = new connect();
                conn=(Connection)connect.DB();
                String sql1 = "SELECT * FROM rt21";
                rs = stmt.executeQuery(sql1);
                //             verifikasi jika ada data yang sama
                while(rs.next()){
                    String namaDB = rs.getString("nama");
                    String nomorDB = rs.getString("nomor");
                    if (nama.equals(namaDB)||nomor.equals(nomorDB)){
                        betul = true;
                        break;
                    }
                    else{
                        betul = false;
                    }
                }
                if(betul == true){
                    JOptionPane.showMessageDialog(null, "Nomor Rumah atau Nama sudah ada");
                    hapus();
                }
                if(betul == false){

                    stmt = conn.createStatement();
                    
                    String sql = "INSERT INTO `rt21`(`nomor`, `nama`, `jumlah`, `golongan`, `agama`, `rt`) VALUES ('%s','%s','%s','%s','%s','%s')";
                    sql = String.format(sql, nomor, nama, jumlah, golongan, agama, rt);
                    stmt.execute(sql);
                    JOptionPane.showMessageDialog(null, "DATA BERHASIL DITAMBAHKAN");
                    tampil();
                    hapus();

                }

            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tambahActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(rt21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rt21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rt21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rt21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rt21().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agamaTxt;
    private javax.swing.JComboBox<String> cbgolongan;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlahKeluarga;
    private javax.swing.JButton menu;
    private javax.swing.JTextField namaKeluarga;
    private javax.swing.JTextField nomorRumah;
    private javax.swing.JButton perbarui;
    private javax.swing.JButton rt22;
    private javax.swing.JButton rt23;
    private javax.swing.JButton tambah;
    private javax.swing.JTable warga;
    // End of variables declaration//GEN-END:variables
}
