package desafioprueba2;

import desafioprueba2.manejoDatos.Data;
import desafioprueba2.clases.Libro;
import desafioprueba2.tableModel.TMLibro;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class App extends javax.swing.JFrame {
    private Data d;
    public App(){
        initComponents();
        setLocationRelativeTo(null);
        formSistema.setVisible(false);
        formSistema.setSize(500, 500);
        formSistema.setLocationRelativeTo(this);
        formRegistro.setVisible(false);
        formRegistro.setSize(500,400);
        formRegistro.setLocationRelativeTo(this);
        
        
        try {
            d = new Data();
            List<Libro> lista = d.getLibros();
            TMLibro model = new TMLibro(lista);
            tblLibros.setModel(model);
            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formSistema = new javax.swing.JFrame();
        lblNameUser = new javax.swing.JLabel();
        tbpLibros = new javax.swing.JTabbedPane();
        pnlRegLibro = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblRegNomLibro = new javax.swing.JLabel();
        txtNameLibro = new javax.swing.JTextField();
        lblRegEditLibro = new javax.swing.JLabel();
        txtEditorialLibro = new javax.swing.JTextField();
        lblRegAnioLibro = new javax.swing.JLabel();
        txtAnioLibro = new javax.swing.JTextField();
        lblRegPrecioLibro = new javax.swing.JLabel();
        txtPrecioLibro = new javax.swing.JTextField();
        lblRegStockLibro = new javax.swing.JLabel();
        txtStockLibro = new javax.swing.JTextField();
        btnRagistrarLibro = new javax.swing.JButton();
        pnlListarLibros = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        btnEliminarLibro = new javax.swing.JButton();
        btnActualizarLibro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnCerrarSesion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnInfo = new javax.swing.JMenuItem();
        formRegistro = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtRegNamaUser = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtRegRunUser = new javax.swing.JTextField();
        txtRegEdadUser = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnRegUser = new javax.swing.JButton();
        pnlInicioSesion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRunUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();

        formSistema.setBackground(new java.awt.Color(204, 204, 255));
        formSistema.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formSistemaWindowClosing(evt);
            }
        });

        lblNameUser.setBackground(new java.awt.Color(204, 255, 255));
        lblNameUser.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        lblNameUser.setForeground(new java.awt.Color(204, 0, 0));
        lblNameUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNameUser.setText(" ");

        tbpLibros.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tbpLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbpLibros.setName(""); // NOI18N

        lblRegNomLibro.setText("Nombre");

        lblRegEditLibro.setText("Editorial");

        lblRegAnioLibro.setText("Año");

        lblRegPrecioLibro.setText("Precio");

        lblRegStockLibro.setText("Stock");

        btnRagistrarLibro.setText("Registrar");
        btnRagistrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRagistrarLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRagistrarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegNomLibro)
                            .addComponent(lblRegEditLibro)
                            .addComponent(lblRegAnioLibro))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAnioLibro)
                            .addComponent(txtEditorialLibro)
                            .addComponent(txtNameLibro)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegStockLibro)
                            .addComponent(lblRegPrecioLibro))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioLibro)
                            .addComponent(txtStockLibro))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRegNomLibro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegEditLibro)
                    .addComponent(txtEditorialLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegAnioLibro)
                    .addComponent(txtAnioLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegPrecioLibro)
                    .addComponent(txtPrecioLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegStockLibro)
                    .addComponent(txtStockLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRagistrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlRegLibroLayout = new javax.swing.GroupLayout(pnlRegLibro);
        pnlRegLibro.setLayout(pnlRegLibroLayout);
        pnlRegLibroLayout.setHorizontalGroup(
            pnlRegLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlRegLibroLayout.setVerticalGroup(
            pnlRegLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbpLibros.addTab("Crear", pnlRegLibro);

        jLabel3.setBackground(new java.awt.Color(102, 102, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listado de libros");

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblLibros);

        btnEliminarLibro.setText("Eliminar");

        btnActualizarLibro.setText("Actualizar");

        jButton1.setText("jButton1");

        jLabel4.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(btnEliminarLibro)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarLibro)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13)
                        .addComponent(jTextField1))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarLibro)
                    .addComponent(btnActualizarLibro)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlListarLibrosLayout = new javax.swing.GroupLayout(pnlListarLibros);
        pnlListarLibros.setLayout(pnlListarLibrosLayout);
        pnlListarLibrosLayout.setHorizontalGroup(
            pnlListarLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlListarLibrosLayout.setVerticalGroup(
            pnlListarLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tbpLibros.addTab("Listar", pnlListarLibros);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Menu de libros");

        jMenu1.setText("Archivo");

        jMenuItem2.setText("Actializar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Estadisticas");
        jMenu1.add(jMenuItem3);

        mnCerrarSesion.setText("Cerrar Sesión");
        jMenu1.add(mnCerrarSesion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        mnInfo.setText("Informacion");
        mnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnInfoActionPerformed(evt);
            }
        });
        jMenu2.add(mnInfo);

        jMenuBar1.add(jMenu2);

        formSistema.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout formSistemaLayout = new javax.swing.GroupLayout(formSistema.getContentPane());
        formSistema.getContentPane().setLayout(formSistemaLayout);
        formSistemaLayout.setHorizontalGroup(
            formSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNameUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tbpLibros)
            .addGroup(formSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        formSistemaLayout.setVerticalGroup(
            formSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbpLibros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        tbpLibros.getAccessibleContext().setAccessibleDescription("");

        formRegistro.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formRegistroWindowClosing(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Registro de Usuario");

        jLabel11.setText("Nombre");

        jLabel12.setText("Run");

        jLabel13.setText("Edad");

        btnRegUser.setText("Registrar");
        btnRegUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRegNamaUser)
                            .addComponent(txtRegRunUser)
                            .addComponent(txtRegEdadUser))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtRegNamaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtRegRunUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegEdadUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout formRegistroLayout = new javax.swing.GroupLayout(formRegistro.getContentPane());
        formRegistro.getContentPane().setLayout(formRegistroLayout);
        formRegistroLayout.setHorizontalGroup(
            formRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        formRegistroLayout.setVerticalGroup(
            formRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlInicioSesion.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Inicio Sesión");

        txtRunUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRunUserKeyReleased(evt);
            }
        });

        jLabel2.setText("Run Usuario");

        btnIniciarSesion.setText("Iniciar");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInicioSesionLayout = new javax.swing.GroupLayout(pnlInicioSesion);
        pnlInicioSesion.setLayout(pnlInicioSesionLayout);
        pnlInicioSesionLayout.setHorizontalGroup(
            pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRunUser, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1))
                    .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnIniciarSesion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInicioSesionLayout.setVerticalGroup(
            pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRunUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnIniciarSesion)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txtRunUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRunUserKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            iniciarSesion();
        }
    }//GEN-LAST:event_txtRunUserKeyReleased

    private void formRegistroWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formRegistroWindowClosing
        this.setEnabled(true);
        this.toFront();
    }//GEN-LAST:event_formRegistroWindowClosing

    private void formSistemaWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formSistemaWindowClosing
        this.setVisible(true);
    }//GEN-LAST:event_formSistemaWindowClosing

    private void mnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnInfoActionPerformed
        
    }//GEN-LAST:event_mnInfoActionPerformed

    private void btnRagistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRagistrarLibroActionPerformed
        
        String nombre = txtNameLibro.getText().trim();
        String editorial = txtEditorialLibro.getText().trim();
        String anio = txtAnioLibro.getText().trim();
        String precio = txtPrecioLibro.getText().trim();
        String stock = txtStockLibro.getText().trim();
        
        try {
            d.registrarLibro(nombre,editorial,anio,precio,stock);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR SQL");
        }
    }//GEN-LAST:event_btnRagistrarLibroActionPerformed

    private void btnRegUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegUserActionPerformed
        String nombre = txtRegNamaUser.getText().trim();
        String run = txtRegRunUser.getText().trim();
        String edad = txtRegEdadUser.getText().trim();
        try {
            d.registrarUsuario(nombre, run, edad);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error SQL");
        }
    }//GEN-LAST:event_btnRegUserActionPerformed

    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarLibro;
    private javax.swing.JButton btnEliminarLibro;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRagistrarLibro;
    private javax.swing.JButton btnRegUser;
    private javax.swing.JFrame formRegistro;
    private javax.swing.JFrame formSistema;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblNameUser;
    private javax.swing.JLabel lblRegAnioLibro;
    private javax.swing.JLabel lblRegEditLibro;
    private javax.swing.JLabel lblRegNomLibro;
    private javax.swing.JLabel lblRegPrecioLibro;
    private javax.swing.JLabel lblRegStockLibro;
    private javax.swing.JMenuItem mnCerrarSesion;
    private javax.swing.JMenuItem mnInfo;
    private javax.swing.JPanel pnlInicioSesion;
    private javax.swing.JPanel pnlListarLibros;
    private javax.swing.JPanel pnlRegLibro;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTabbedPane tbpLibros;
    private javax.swing.JTextField txtAnioLibro;
    private javax.swing.JTextField txtEditorialLibro;
    private javax.swing.JTextField txtNameLibro;
    private javax.swing.JTextField txtPrecioLibro;
    private javax.swing.JTextField txtRegEdadUser;
    private javax.swing.JTextField txtRegNamaUser;
    private javax.swing.JTextField txtRegRunUser;
    private javax.swing.JTextField txtRunUser;
    private javax.swing.JTextField txtStockLibro;
    // End of variables declaration//GEN-END:variables
    
    private void iniciarSesion(){
        String run = txtRunUser.getText();
        
        try {
            String name = d.getNameUser(run);
            if (name != null){
                this.setVisible(false);
                formSistema.setVisible(true);
                lblNameUser.setText(name);
            }else{
                int resp = JOptionPane.showConfirmDialog(this, "Usuario no registrado ¿Desea regirtrar usuario?","ERROR", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                if(resp == 0){
                    formRegistro.setVisible(true);
                    this.setEnabled(false);
                }
            }
        }catch (SQLException ex) {
            JOptionPane.showConfirmDialog(this, "Error SQL");
        }
    }
}
