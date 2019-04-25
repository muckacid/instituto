package model;

import clasess.TMAccion;
import clasess.TMLugar;
import clasess.TMNombre;
import clasess.Lugar;
import clasess.Nombre;
import clasess.Accion;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App extends javax.swing.JFrame {
     private java.util.List<Nombre> listaNombre;
     private java.util.List<Accion> listaAccion;
     private java.util.List<Lugar> listaLugar;
     private TMNombre modelNombre;
     private TMAccion modelAccion;
     private TMLugar modelLugar;
     private Random ran;
     private int contIdsNombre; //Generar id's
     private int contIdsAccion; //Generar id's
     private int contIdsLugar; //Generar id's
    
    public App() {
        initComponents();
        ran = new Random();
        listaNombre = new ArrayList<>();
        listaAccion = new ArrayList<>();
        listaLugar = new ArrayList<>();
        
        contIdsNombre = 0;
        modelNombre = new TMNombre(listaNombre);
        tblNombre.setModel(modelNombre);
        
        contIdsAccion = 0;
        modelAccion = new TMAccion(listaAccion);
        tblAccion.setModel(modelAccion);
        
        contIdsLugar = 0;
        modelLugar = new TMLugar(listaLugar);
        tblLugar.setModel(modelLugar);
        
        
        
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAniadNomb = new javax.swing.JButton();
        txtAccion = new javax.swing.JTextField();
        txtLugar = new javax.swing.JTextField();
        btnAniadirAccion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAniadirLugar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAccion = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNombre = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLugar = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblRandom = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSegundos = new javax.swing.JTextField();
        btnRANDOMIZER = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAFrases = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Nombre:");

        btnAniadNomb.setText("Añadir");
        btnAniadNomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadNombActionPerformed(evt);
            }
        });

        btnAniadirAccion.setText("Añadir");
        btnAniadirAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadirAccionActionPerformed(evt);
            }
        });

        jLabel3.setText("Lugar:");

        jLabel2.setText("Acción:");

        btnAniadirLugar.setText("Añadir");
        btnAniadirLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadirLugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAniadNomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAccion))
                            .addComponent(btnAniadirAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLugar))
                            .addComponent(btnAniadirLugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAniadNomb)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccion)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnAniadirAccion)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(btnAniadirLugar)
                .addGap(209, 209, 209))
        );

        jTabbedPane1.addTab("Agregar", jPanel1);

        jScrollPane2.setViewportView(tblAccion);

        tblNombre.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblNombre);

        jScrollPane3.setViewportView(tblLugar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tablas", jPanel2);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        jLabel4.setText("Frase Random:");

        lblRandom.setBackground(new java.awt.Color(0, 0, 0));
        lblRandom.setForeground(new java.awt.Color(204, 0, 51));

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRandom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(btnGenerar)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar))
                .addGap(27, 27, 27)
                .addComponent(lblRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(394, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("GENERAR", jPanel4);

        jLabel5.setText("Número de frases");

        jLabel6.setText("Segundos");

        btnRANDOMIZER.setText("RANDOMIZER");
        btnRANDOMIZER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRANDOMIZERActionPerformed(evt);
            }
        });

        txtAFrases.setColumns(20);
        txtAFrases.setRows(5);
        jScrollPane1.setViewportView(txtAFrases);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(txtSegundos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btnRANDOMIZER)))
                .addGap(29, 29, 29))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRANDOMIZER)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("RANDOMIZER", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        int size1 = listaNombre.size();
        int size2 = listaAccion.size();
        int size3 = listaLugar.size();
        if (size1 > 0 && size2 > 0 && size3 > 0) {
            int numRandomNombre = ran.nextInt(size1);
            int numRandomAccion = ran.nextInt(size2);
            int numRandomLugar = ran.nextInt(size3);
            
            Nombre nom = listaNombre.get(numRandomNombre);
            Accion acc = listaAccion.get(numRandomAccion);
            Lugar lug = listaLugar.get(numRandomLugar);
            
            lblRandom.setText((String) nom.getDato() +" está "+ (String) acc.getDato() +" en "+ (String) lug.getDato());
        }else {
            System.out.println("No existen elementos, para generar frase");
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnAniadirLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirLugarActionPerformed
        String lug = txtLugar.getText();
        if (!lug.trim().isEmpty()) {
            Lugar lugar = new Lugar();
            lugar.setDato(lug);
            contIdsLugar++;
            lugar.setId(contIdsLugar);

            listaLugar.add(lugar);
            txtLugar.setText(null);
            txtLugar.requestFocus();

            modelLugar = new TMLugar(listaLugar);
            tblLugar.setModel(modelLugar);
            tblLugar.updateUI();
        }
    }//GEN-LAST:event_btnAniadirLugarActionPerformed

    private void btnAniadirAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirAccionActionPerformed
        String acc = txtAccion.getText();
        if (!acc.trim().isEmpty()) {
            Accion accion = new Accion();
            accion.setDato(acc);
            contIdsAccion++;
            accion.setId(contIdsAccion);
            listaAccion.add(accion);
            txtAccion.setText(null);
            txtAccion.requestFocus();
            modelAccion = new TMAccion(listaAccion);
            tblAccion.setModel(modelAccion);
            tblAccion.updateUI();
        }
    }//GEN-LAST:event_btnAniadirAccionActionPerformed

    private void btnAniadNombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadNombActionPerformed
        String nombre = txtNombre.getText();
        if (!nombre.trim().isEmpty()) {
            Nombre nomb = new Nombre();
            nomb.setDato(nombre);
            contIdsNombre++;
            nomb.setId(contIdsNombre);
            listaNombre.add(nomb);
            txtNombre.setText(null);
            txtNombre.requestFocus();
            modelNombre = new TMNombre(listaNombre);
            tblNombre.setModel(modelNombre);
            tblNombre.updateUI();
        }
    }//GEN-LAST:event_btnAniadNombActionPerformed

    private void btnRANDOMIZERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRANDOMIZERActionPerformed
        Hilo hilo = new Hilo();
        hilo.start();
    }//GEN-LAST:event_btnRANDOMIZERActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAniadNomb;
    private javax.swing.JButton btnAniadirAccion;
    private javax.swing.JButton btnAniadirLugar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnRANDOMIZER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblRandom;
    private javax.swing.JTable tblAccion;
    private javax.swing.JTable tblLugar;
    private javax.swing.JTable tblNombre;
    private javax.swing.JTextArea txtAFrases;
    private javax.swing.JTextField txtAccion;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSegundos;
    // End of variables declaration//GEN-END:variables

    
    private class Hilo extends Thread{
        private int contador = Integer.parseInt(txtCantidad.getText());
        private String acumulador = "";
        public void run(){
            while(contador > 0){
                try {
                    int size1 = listaNombre.size();
                    int size2 = listaAccion.size();
                    int size3 = listaLugar.size();
                    
                    if (size1 > 0 && size2 > 0 && size3 > 0) {
                        int numRandomNombre = ran.nextInt(size1);
                        Nombre nom = listaNombre.get(numRandomNombre);
                        int numRandomAccion = ran.nextInt(size2);
                        Accion acc = listaAccion.get(numRandomAccion);
                        int numRandomLugar = ran.nextInt(size3);
                        Lugar lug = listaLugar.get(numRandomLugar);
                        acumulador = acumulador + (String) nom.getDato() +" esta "+ (String) acc.getDato() +" en "+ (String) lug.getDato()+"\n";
                        txtAFrases.setText(acumulador);
                    }else {
                        System.out.println("No existen elementos, para generar frase");
                    }
                    Thread.sleep(Integer.parseInt(txtSegundos.getText())*1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
            contador--;
            }
        }
    }
}
