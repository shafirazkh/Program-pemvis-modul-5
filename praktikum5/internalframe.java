/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package praktikum5;

import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class internalframe extends javax.swing.JInternalFrame {

    public internalframe() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btn_tampil = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_cost = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_kode = new javax.swing.JTextField();
        txt_subtotal = new javax.swing.JTextField();
        txt_angka = new javax.swing.JTextField();
        txt_kembali = new javax.swing.JTextField();
        txt_tunai = new javax.swing.JTextField();
        cmb_barang = new javax.swing.JComboBox<>();
        btn_simpan = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btn_hapus = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("purchase order");
        getContentPane().setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(162, 194, 232));
        jTabbedPane1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(151, 178, 200));
        jPanel2.setLayout(null);

        jTable2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "COSTUMER", "NAMA", "KODE", "HARGA", "TOTAL ", "SUBTOTAL", "TUNAI", "KEMBALI"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 620, 260);

        btn_tampil.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btn_tampil.setText("TAMPILAKAN");
        btn_tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tampilActionPerformed(evt);
            }
        });
        jPanel2.add(btn_tampil);
        btn_tampil.setBounds(480, 300, 130, 30);

        jTabbedPane1.addTab("Infromasi Penjualan", jPanel2);

        jPanel3.setBackground(new java.awt.Color(151, 178, 200));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setText("NAMA BARANG");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 50, 130, 30);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setText("HARGA BARANG");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 130, 130, 30);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setText("KODE BARANG");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 90, 130, 30);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setText("SUBTOTAL");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 210, 130, 30);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setText("TOTAL BARANG");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 170, 130, 30);

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setText("KEMBALI");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 290, 130, 30);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setText("TUNAI");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 250, 130, 30);

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setText("COSTUMER");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 10, 130, 30);

        txt_cost.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jPanel3.add(txt_cost);
        txt_cost.setBounds(180, 10, 180, 30);

        txt_harga.setEditable(false);
        txt_harga.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });
        jPanel3.add(txt_harga);
        txt_harga.setBounds(180, 130, 180, 30);

        txt_kode.setEditable(false);
        txt_kode.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jPanel3.add(txt_kode);
        txt_kode.setBounds(180, 90, 180, 30);

        txt_subtotal.setEditable(false);
        txt_subtotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txt_subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_subtotalActionPerformed(evt);
            }
        });
        jPanel3.add(txt_subtotal);
        txt_subtotal.setBounds(180, 210, 180, 30);

        txt_angka.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txt_angka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_angkaActionPerformed(evt);
            }
        });
        txt_angka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_angkaKeyReleased(evt);
            }
        });
        jPanel3.add(txt_angka);
        txt_angka.setBounds(180, 170, 180, 30);

        txt_kembali.setEditable(false);
        txt_kembali.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txt_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kembaliActionPerformed(evt);
            }
        });
        jPanel3.add(txt_kembali);
        txt_kembali.setBounds(180, 290, 180, 30);

        txt_tunai.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txt_tunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tunaiActionPerformed(evt);
            }
        });
        txt_tunai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_tunaiKeyReleased(evt);
            }
        });
        jPanel3.add(txt_tunai);
        txt_tunai.setBounds(180, 250, 180, 30);

        cmb_barang.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cmb_barang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "White Turtleneck", "Cashmere Sweater", "Wool Coat", "Blazer", "Cardigan", "Tweed Jacket", "Vintage Jeans" }));
        cmb_barang.setToolTipText("");
        cmb_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_barangActionPerformed(evt);
            }
        });
        jPanel3.add(cmb_barang);
        cmb_barang.setBounds(180, 50, 180, 30);

        btn_simpan.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btn_simpan.setText("SIMPAN");
        btn_simpan.setActionCommand("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel3.add(btn_simpan);
        btn_simpan.setBounds(510, 330, 80, 30);

        btn_reset.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel3.add(btn_reset);
        btn_reset.setBounds(240, 330, 80, 30);

        jTable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 8)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "COSTUMER", "NAMA", "KODE", "HARGA", "TOTAL ", "SUBTOTAL", "TUNAI", "KEMBALI"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 370, 620, 190);

        btn_hapus.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel3.add(btn_hapus);
        btn_hapus.setBounds(330, 330, 80, 30);

        btn_edit.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel3.add(btn_edit);
        btn_edit.setBounds(420, 330, 80, 30);

        jTabbedPane1.addTab("Form Order", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("informasi penjualan");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -30, 640, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tampil_data(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("costumer");
        tabel.addColumn("nama_barang");
        tabel.addColumn("kode_barang");
        tabel.addColumn("harga_barang");
        tabel.addColumn("total_barang");
        tabel.addColumn("subtotal");
        tabel.addColumn("tunai");
        tabel.addColumn("kembali");
        
        try {
            java.sql.Connection conn = praktikum5.koneksi.koneksiDB();
            String sql = "select * from data_penjualan";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
//          diekstrak dari rs ke tabel
            while (rs.next()) {
                Object[] row = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)};
                tabel.addRow(row);
            }
        
            jTable.setModel(tabel);
            jTable2.setModel(tabel);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed

    }//GEN-LAST:event_txt_hargaActionPerformed

    private void txt_subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_subtotalActionPerformed

    }//GEN-LAST:event_txt_subtotalActionPerformed

    private void txt_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kembaliActionPerformed

    }//GEN-LAST:event_txt_kembaliActionPerformed

    private void txt_angkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_angkaActionPerformed
        
    }//GEN-LAST:event_txt_angkaActionPerformed
    
    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        try {
            String sql = "INSERT INTO data_penjualan (costumer, nama_barang, kode_barang, harga_barang, total_barang, subtotal, tunai, kembali) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            java.sql.Connection conn=(java.sql.Connection)praktikum5.koneksi.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            
            int harga = Integer.parseInt(txt_harga.getText().replaceAll("\\D+", "")); //menghapus karakter selain angka
            int total = Integer.parseInt(txt_angka.getText());
            int subtotal = Integer.parseInt(txt_subtotal.getText().replaceAll("\\D+", ""));
            int tunai = Integer.parseInt(txt_tunai.getText());
            int kembali = Integer.parseInt(txt_kembali.getText().replaceAll("\\D+", ""));
            
            pst.setString(1, txt_cost.getText());
            pst.setString(2, cmb_barang.getSelectedItem().toString());
            pst.setString(3, txt_kode.getText());
            pst.setInt(4, harga);
            pst.setInt(5, total);
            pst.setInt(6, subtotal);
            pst.setInt(7, tunai);
            pst.setInt(8, kembali);
            pst.execute();
            JOptionPane.showMessageDialog(null, "penyimpanan data berhasil");
            resetform();
            tampil_data();
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal disimpan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private String hargaFormatted;
    private void cmb_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_barangActionPerformed
        // Membuat peta untuk memetakan barang ke harga
        Map<String, Double> hargaBarang = new HashMap<>();
        hargaBarang.put("White Turtleneck", 93000.0);
        hargaBarang.put("Cashmere Sweater", 134000.0);
        hargaBarang.put("Wool Coat", 222000.0);
        hargaBarang.put("Blazer", 153000.0);
        hargaBarang.put("Cardigan", 275000.0);
        hargaBarang.put("Tweed Jacket", 123000.0);
        hargaBarang.put("Vintage Jeans", 212000.0);

        Map<String, String> kodeBarang = new HashMap<>();
        kodeBarang.put("White Turtleneck", "C100");
        kodeBarang.put("Cashmere Sweater", "C200");
        kodeBarang.put("Wool Coat", "C300");
        kodeBarang.put("Blazer", "C400");
        kodeBarang.put("Cardigan", "C500");
        kodeBarang.put("Tweed Jacket", "C600");
        kodeBarang.put("Vintage Jeans", "C700");

        // Mendapatkan nama barang yang dipilih dari combo box
        String namaBarang = cmb_barang.getSelectedItem().toString();
        double hargabarang = hargaBarang.get(namaBarang);
        String kodebarang = kodeBarang.get(namaBarang);

        // Mengubah harga menjadi format mata uang rupiah
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        hargaFormatted = rupiahFormat.format(hargabarang);

        // Menampilkan harga dan kode barang di elemen teks
        txt_harga.setText(hargaFormatted);
        txt_kode.setText(kodebarang);
    }//GEN-LAST:event_cmb_barangActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        resetform();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void txt_tunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tunaiActionPerformed

    }//GEN-LAST:event_txt_tunaiActionPerformed

    //    melepaskan tombol keyboard 
    private void txt_angkaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_angkaKeyReleased
        String hargaawal = txt_harga.getText().replaceAll("[^\\d]",""); //menghapus karakter selain angka
        double harga = Double.parseDouble(hargaawal)/100;
        int jumlah = Integer.parseInt(txt_angka.getText());
        double subtotal = harga * jumlah;
        String total = Double.toString(subtotal);
        String totalRp = "Rp." + total;
        
        txt_subtotal.setText(totalRp);
    }//GEN-LAST:event_txt_angkaKeyReleased

    private void txt_tunaiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tunaiKeyReleased
        String subtotalawal = txt_subtotal.getText().replaceAll("[^\\d.]", ""); 
        subtotalawal = subtotalawal.replaceFirst("\\.", "");
        
        double subtotal = Double.parseDouble(subtotalawal);
        double tunai = Double.parseDouble(txt_tunai.getText());

        if (tunai >= subtotal) {
            double kembali = tunai - subtotal;
            String kembalian = Double.toString(kembali);
            String kembalianRp = "Rp." + kembalian;
            txt_kembali.setText(kembalianRp);
        } else {
            txt_kembali.setText("Tunai tidak mencukupi");
        }
    }//GEN-LAST:event_txt_tunaiKeyReleased

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int selectedRow = jTable.getSelectedRow();

        if (selectedRow != -1) {
            String namavalue = (String) jTable.getValueAt(selectedRow, 0);
            String barangvalue = (String) jTable.getValueAt(selectedRow, 1);
            String kodevalue = (String) jTable.getValueAt(selectedRow, 2);
            String hargavalue = (String) jTable.getValueAt(selectedRow, 3);
            String totalvalue = (String) jTable.getValueAt(selectedRow, 4);
            String subtotalvalue = (String) jTable.getValueAt(selectedRow, 5);
            String tunaivalue = (String) jTable.getValueAt(selectedRow, 6);
            String kembalivalue = (String) jTable.getValueAt(selectedRow, 7);

            txt_cost.setText(namavalue);
            cmb_barang.setSelectedItem(barangvalue);
            txt_kode.setText(kodevalue);
            txt_harga.setText(hargavalue);
            txt_angka.setText(totalvalue);
            txt_subtotal.setText(subtotalvalue);
            txt_tunai.setText(tunaivalue);
            txt_kembali.setText(kembalivalue);
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int selectedRow = jTable.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Pilih baris yang ingin dihapus.");
        } else {
            int option = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                try {
                    String kodeToDelete = (String) jTable.getValueAt(selectedRow, 0);
                    String sql = "DELETE FROM data_penjualan WHERE costumer = ?";
                    java.sql.Connection conn = (java.sql.Connection) praktikum5.koneksi.koneksiDB();
                    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setString(1, kodeToDelete);
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus.");
                    resetform();
                    tampil_data();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Gagal menghapus data.");
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        int selectedRow = jTable.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Pilih baris yang ingin diedit.");
        } else {
            String newcostumer = txt_cost.getText();
            Object selectedItem = cmb_barang.getSelectedItem();
            String newbarang = (selectedItem != null) ? selectedItem.toString() : "";
            String newkode = txt_kode.getText();
            String newharga = txt_harga.getText();
            String newtotal = txt_angka.getText();
            String newsubtotal = txt_subtotal.getText();
            String newtunai = txt_tunai.getText();
            String newkembali = txt_kembali.getText();

//            cek kolom kosong
            if (newcostumer.isEmpty() || newbarang.isEmpty() || newkode.isEmpty() || newharga.isEmpty() || newtotal.isEmpty() || newsubtotal.isEmpty() || newtunai.isEmpty() || newkembali.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Isi semua kolom terlebih dahulu.");
            } else {
                int option = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menyimpan perubahan?", "Konfirmasi Edit", JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    try {
                        String updatedata = (String) jTable.getValueAt(selectedRow, 0);
                        String sql = "UPDATE data_penjualan SET costumer = ?, nama_barang = ?, kode_barang = ?, harga_barang = ?, total_barang = ?, subtotal = ?, tunai = ?, kembali = ? WHERE costumer = ?";
                        java.sql.Connection conn = (java.sql.Connection) praktikum5.koneksi.koneksiDB();
                        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                        pst.setString(1, newcostumer);
                        pst.setString(2, newbarang);
                        pst.setString(3, newkode);
                        pst.setString(4, newharga);
                        pst.setString(5, newtotal);
                        pst.setString(6, newsubtotal);
                        pst.setString(7, newtunai);
                        pst.setString(8, newkembali);
                        pst.setString(9, updatedata);
                        pst.executeUpdate();
                        
                        JOptionPane.showMessageDialog(null, "Data berhasil diupdate.");
                        resetform();
                        tampil_data();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Gagal mengupdate data.");
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tampilActionPerformed
        tampil_data();
    }//GEN-LAST:event_btn_tampilActionPerformed

    private void resetform(){
        txt_cost.setText(null);
        cmb_barang.setSelectedIndex(0);
        txt_kode.setText(null);
        txt_harga.setText(null);
        txt_angka.setText(null);
        txt_subtotal.setText(null);
        txt_tunai.setText(null);
        txt_kembali.setText(null);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tampil;
    private javax.swing.JComboBox<String> cmb_barang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txt_angka;
    private javax.swing.JTextField txt_cost;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_kembali;
    private javax.swing.JTextField txt_kode;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_tunai;
    // End of variables declaration//GEN-END:variables
}
