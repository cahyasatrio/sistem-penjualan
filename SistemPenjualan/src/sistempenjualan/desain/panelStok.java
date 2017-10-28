/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempenjualan.desain;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import sistempenjualan.Main;
import sistempenjualan.model.Stok;

/**
 *
 * @author altintop
 */
public class panelStok extends javax.swing.JInternalFrame {

    private Stok modelStok;
    //String id, nama, pokok, jual, stok;

    /**
     * Creates new form PanelKasir
     */
    public panelStok() throws SQLException {
        initComponents();
        modelStok = new Stok();
        this.tabelStok.setModel(modelStok.getTabel());
        Fhidup();
        getNo().setVisible(false);
    }

    public void Fhidup() {
        getTambah().setEnabled(true);
        getSimpan().setEnabled(false);
        getBatal().setEnabled(false);
        getUbah().setEnabled(true);
        getHapus().setEnabled(true);
        getId().setEnabled(false);
        getNama().setEnabled(false);
        getStok().setEnabled(false);
        getPokok().setEnabled(false);
        getJual().setEnabled(false);
    }

    public void Fmati() {
        getTambah().setEnabled(false);
        getSimpan().setEnabled(true);
        getUbah().setEnabled(false);
        getHapus().setEnabled(false);
        getBatal().setEnabled(true);
        getId().setEnabled(false);
        getNama().setEnabled(true);
        getStok().setEnabled(true);
        getPokok().setEnabled(true);
        getJual().setEnabled(true);
    }

    public JButton getTambah() {
        return tambahButton;
    }

    public JButton getSimpan() {
        return simpanButton;
    }

    public JButton getUbah() {
        return ubahButton;
    }

    public JButton getHapus() {
        return hapusButton;
    }

    public JButton getBatal() {
        return batalButton;
    }

    public JTextField getNo() {
        return noField;
    }

    public JTextField getId() {
        return idProdukField;
    }

    public JTextField getNama() {
        return namaField;
    }

    public JTextField getStok() {
        return stokField;
    }

    public JTextField getPokok() {
        return pokokField;
    }

    public JTextField getJual() {
        return jualField;
    }

    public JTable getTabel() {
        return tabelStok;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        tabelStok = new javax.swing.JTable();
        tambahButton = new javax.swing.JButton();
        simpanButton = new javax.swing.JButton();
        ubahButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        batalButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idProdukField = new javax.swing.JTextField();
        namaField = new javax.swing.JTextField();
        stokField = new javax.swing.JTextField();
        pokokField = new javax.swing.JTextField();
        jualField = new javax.swing.JTextField();
        noField = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Stok");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempenjualan/images/stok_16.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        tabelStok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane.setViewportView(tabelStok);

        tambahButton.setText("Tambah");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        ubahButton.setText("Ubah");
        ubahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahButtonActionPerformed(evt);
            }
        });

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        batalButton.setText("Batal");
        batalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ID Produk");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Stok");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Harga Pokok");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Harga Jual");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tambahButton)
                        .addGap(18, 18, 18)
                        .addComponent(ubahButton)
                        .addGap(18, 18, 18)
                        .addComponent(hapusButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaField, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(idProdukField)
                            .addComponent(stokField))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jualField, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(pokokField))
                                .addGap(43, 43, 43)
                                .addComponent(noField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(simpanButton)
                                .addGap(18, 18, 18)
                                .addComponent(batalButton)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahButton)
                    .addComponent(ubahButton)
                    .addComponent(hapusButton))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(idProdukField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pokokField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jualField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(stokField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpanButton)
                    .addComponent(batalButton))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        Main.getFrameUtama().panelKasir = null;
        System.out.println("sudah di null pas ditutup: " + Main.getFrameUtama().panelKasir);
    }//GEN-LAST:event_formInternalFrameClosing

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        Fmati();
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        Fhidup();
        getId().setText("");
        getNama().setText("");
        getPokok().setText("");
        getJual().setText("");
        getStok().setText("");
    }//GEN-LAST:event_batalButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        String Id = getId().getText();
        String Nama = getNama().getText();
        String Pokok = getPokok().getText();
        String Jual = getJual().getText();
        String Stok = getStok().getText();
        if (Id.equals("")) {
            modelStok.Tambah(Id, Nama, Pokok, Jual, Stok);
        } else {
            modelStok.Ubah(Id, Nama, Pokok, Jual, Stok);
        }
        try {
            modelStok = new Stok();
        } catch (SQLException ex) {
            Logger.getLogger(PanelKasir2.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.tabelStok.setModel(modelStok.getTabel());
        JOptionPane.showMessageDialog(null, "Data berhasil masuk", "MultiRasa", 1);
        getId().setText("");
        getNama().setText("");
        getPokok().setText("");
        getJual().setText("");
        getStok().setText("");
        Fhidup();
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void ubahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahButtonActionPerformed
        int baris = getTabel().getSelectedRow();
        String no = getTabel().getValueAt(baris, 0).toString();
        String id = getTabel().getValueAt(baris, 1).toString();
        String nama = getTabel().getValueAt(baris, 2).toString();
        String pokok = getTabel().getValueAt(baris, 3).toString();
        String jual = getTabel().getValueAt(baris, 4).toString();
        String stok = getTabel().getValueAt(baris, 5).toString();
        //getId().setEnabled(false);
        getNo().setText(no);
        getId().setText(id);
        getNama().setText(nama);
        getPokok().setText(pokok);
        getJual().setText(jual);
        getStok().setText(stok);
        Fmati();
    }//GEN-LAST:event_ubahButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        String noStok = getNo().getText();
        int baris = getTabel().getSelectedRow();
        String no = getTabel().getValueAt(baris, 0).toString();
        modelStok.Hapus(no);
        getTabel().setModel(modelStok.getTabel());
    }//GEN-LAST:event_hapusButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JTextField idProdukField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextField jualField;
    private javax.swing.JTextField namaField;
    private javax.swing.JTextField noField;
    private javax.swing.JTextField pokokField;
    private javax.swing.JButton simpanButton;
    private javax.swing.JTextField stokField;
    private javax.swing.JTable tabelStok;
    private javax.swing.JButton tambahButton;
    private javax.swing.JButton ubahButton;
    // End of variables declaration//GEN-END:variables
}