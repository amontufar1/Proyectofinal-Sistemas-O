/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metroos;

import com.alee.laf.WebLookAndFeel;
import javax.swing.table.DefaultTableModel;


public class MetroOS extends javax.swing.JFrame {
    private Memoria memoria;
    private Proceso procesos[];
    private int contadorProceso = 0;


    public MetroOS() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalTrenzas3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fieldMemoriaPrincipal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldMemoriaSecundaria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldPagina = new javax.swing.JTextField();
        instalar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fieldNombreProceso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldTamañoProceso = new javax.swing.JTextField();
        crearProceso = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        labelTamañoMemoria = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelMemoriaDisponible = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelMemoriaUsada = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelCantidadProcesos = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelMarcosPagina = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelTamañoPagina = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        labelTamañoSecundario = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelSecundariaDisponible = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMemoriaPrincipal = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        suspenderProcesoBloqueado = new javax.swing.JButton();
        eliminarProceso = new javax.swing.JButton();
        listoProceso = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        labelProcesoActual = new javax.swing.JLabel();
        bloquearProceso = new javax.swing.JButton();
        suspenderProcesoListo = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProcesos = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMemoriaSecundaria = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        bonoPagina = new javax.swing.JTextField();
        bonoResolver = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        bonoProceso = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        bonoDesplazamiento = new javax.swing.JTextField();

        totalTrenzas3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        totalTrenzas3.setText("X");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Instalación"));

        fieldMemoriaPrincipal.setText("20480");
        fieldMemoriaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMemoriaPrincipalActionPerformed(evt);
            }
        });

        jLabel2.setText("Tamaño de memoria principal");

        jLabel3.setText("Tamaño de memoria secundaria");

        fieldMemoriaSecundaria.setText("51200");
        fieldMemoriaSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMemoriaSecundariaActionPerformed(evt);
            }
        });

        jLabel4.setText("Tamaño de paginas");

        fieldPagina.setText("1024");
        fieldPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPaginaActionPerformed(evt);
            }
        });

        instalar.setText("Instalar");
        instalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instalarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldMemoriaPrincipal)
                    .addComponent(fieldMemoriaSecundaria)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldPagina)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(instalar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldMemoriaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldMemoriaSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instalar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear Proceso"));

        jLabel1.setText("Nombre del proceso");

        fieldNombreProceso.setText("Proceso 0");
        fieldNombreProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreProcesoActionPerformed(evt);
            }
        });

        jLabel5.setText("Tamaño del proceso");

        fieldTamañoProceso.setText("4096");
        fieldTamañoProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTamañoProcesoActionPerformed(evt);
            }
        });

        crearProceso.setText("Crear proceso");
        crearProceso.setEnabled(false);
        crearProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearProcesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldNombreProceso)
                    .addComponent(fieldTamañoProceso)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(crearProceso, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNombreProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldTamañoProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crearProceso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Estadísticas"));

        jLabel6.setText("Cantidad de memoria");

        labelTamañoMemoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTamañoMemoria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTamañoMemoria.setText("X");

        jLabel7.setText("Memoria disponible");

        labelMemoriaDisponible.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelMemoriaDisponible.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelMemoriaDisponible.setText("X");

        jLabel8.setText("Memoria usada:");

        labelMemoriaUsada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelMemoriaUsada.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelMemoriaUsada.setText("X");

        jLabel9.setText("Cantidad de procesos");

        labelCantidadProcesos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCantidadProcesos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCantidadProcesos.setText("X");

        jLabel10.setText("Marcos de página");

        labelMarcosPagina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelMarcosPagina.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelMarcosPagina.setText("X");

        jLabel12.setText("Tamaño de pagina");

        labelTamañoPagina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTamañoPagina.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTamañoPagina.setText("X");

        jLabel14.setText("Tamaño secundario");

        labelTamañoSecundario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTamañoSecundario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTamañoSecundario.setText("X");

        jLabel15.setText("M.Secundaria disponible");

        labelSecundariaDisponible.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelSecundariaDisponible.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelSecundariaDisponible.setText("X");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelSecundariaDisponible))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTamañoSecundario))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTamañoMemoria))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMemoriaDisponible))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMemoriaUsada))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCantidadProcesos))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMarcosPagina))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTamañoPagina)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelTamañoMemoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelMemoriaDisponible))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelMemoriaUsada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labelCantidadProcesos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(labelMarcosPagina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(labelTamañoPagina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(labelTamañoSecundario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(labelSecundariaDisponible))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Memoria principal"));

        tablaMemoriaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dirección fisica", "# Marco", "ID Proceso", "Nombre de proceso", "# Página"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMemoriaPrincipal);
        if (tablaMemoriaPrincipal.getColumnModel().getColumnCount() > 0) {
            tablaMemoriaPrincipal.getColumnModel().getColumn(0).setResizable(false);
            tablaMemoriaPrincipal.getColumnModel().getColumn(1).setResizable(false);
            tablaMemoriaPrincipal.getColumnModel().getColumn(2).setResizable(false);
            tablaMemoriaPrincipal.getColumnModel().getColumn(3).setResizable(false);
            tablaMemoriaPrincipal.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Cambiar estado de proceso"));

        suspenderProcesoBloqueado.setText("Suspender/bloqueado");
        suspenderProcesoBloqueado.setEnabled(false);
        suspenderProcesoBloqueado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suspenderProcesoBloqueadoActionPerformed(evt);
            }
        });

        eliminarProceso.setText("Eliminar");
        eliminarProceso.setEnabled(false);
        eliminarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProcesoActionPerformed(evt);
            }
        });

        listoProceso.setText("Listo");
        listoProceso.setEnabled(false);
        listoProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listoProcesoActionPerformed(evt);
            }
        });

        jLabel13.setText("Proceso actual");

        labelProcesoActual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelProcesoActual.setText("X");

        bloquearProceso.setText("Bloquear");
        bloquearProceso.setEnabled(false);
        bloquearProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloquearProcesoActionPerformed(evt);
            }
        });

        suspenderProcesoListo.setText("Suspender/listo");
        suspenderProcesoListo.setEnabled(false);
        suspenderProcesoListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suspenderProcesoListoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(suspenderProcesoBloqueado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listoProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(labelProcesoActual))
                    .addComponent(bloquearProceso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(suspenderProcesoListo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(suspenderProcesoListo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suspenderProcesoBloqueado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarProceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listoProceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bloquearProceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(labelProcesoActual))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de procesos"));

        tablaProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Proceso", "Nombre", "Tamaño", "Páginas", "Estado", "Paginas en memoria", "Paginas en almacenamiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProcesos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tablaProcesosFocusLost(evt);
            }
        });
        tablaProcesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProcesosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProcesos);
        if (tablaProcesos.getColumnModel().getColumnCount() > 0) {
            tablaProcesos.getColumnModel().getColumn(0).setResizable(false);
            tablaProcesos.getColumnModel().getColumn(1).setResizable(false);
            tablaProcesos.getColumnModel().getColumn(2).setResizable(false);
            tablaProcesos.getColumnModel().getColumn(3).setResizable(false);
            tablaProcesos.getColumnModel().getColumn(4).setResizable(false);
            tablaProcesos.getColumnModel().getColumn(5).setResizable(false);
            tablaProcesos.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Memoria secundaria"));

        tablaMemoriaSecundaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# Almacenamiento", "ID Proceso", "Nombre de proceso", "# Página"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaMemoriaSecundaria);
        if (tablaMemoriaSecundaria.getColumnModel().getColumnCount() > 0) {
            tablaMemoriaSecundaria.getColumnModel().getColumn(0).setResizable(false);
            tablaMemoriaSecundaria.getColumnModel().getColumn(1).setResizable(false);
            tablaMemoriaSecundaria.getColumnModel().getColumn(2).setResizable(false);
            tablaMemoriaSecundaria.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane4.setViewportView(textArea);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Bono"));

        jLabel11.setText("Numero de página");

        bonoResolver.setText("Resolver");
        bonoResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonoResolverActionPerformed(evt);
            }
        });

        jLabel16.setText("ID Proceso");

        jLabel17.setText("Desplazamiento");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bonoPagina)
                    .addComponent(bonoResolver, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bonoProceso)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bonoDesplazamiento, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bonoProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bonoPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bonoDesplazamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bonoResolver)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldMemoriaSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMemoriaSecundariaActionPerformed

    }

    private void fieldMemoriaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMemoriaPrincipalActionPerformed

    }

    private void instalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instalarActionPerformed
        int tamañoMemoria = Integer.parseInt(fieldMemoriaPrincipal.getText());
        int tamañoSecundario = Integer.parseInt(fieldMemoriaSecundaria.getText());
        int tamañoPagina = Integer.parseInt(fieldPagina.getText());
        if ((tamañoMemoria % 2) == 0 && (tamañoSecundario % 2) == 0 && (tamañoPagina % 2) == 0) {
            if (tamañoMemoria > tamañoPagina) {
                memoria = new Memoria(tamañoMemoria, tamañoSecundario, tamañoPagina, textArea);
            } else {
                // tamaño de pagina mayor que la memoria
            }
        } else {
            // Solo multiplos de 2
        }
        this.procesos = new Proceso[memoria.getMaximasPaginas()];
        instalar.setEnabled(false);
        labelTamañoMemoria.setText(Integer.toString(tamañoMemoria));
        labelMemoriaDisponible.setText(Integer.toString(tamañoMemoria));
        labelMemoriaUsada.setText("0");
        labelCantidadProcesos.setText("0");
        labelMarcosPagina.setText(Integer.toString(memoria.getCantidadMarcos()));
        labelTamañoPagina.setText(Integer.toString(tamañoPagina));
        labelSecundariaDisponible.setText(Integer.toString(memoria.getMemoriaSecundaria()));
        labelTamañoSecundario.setText(Integer.toString(memoria.getMemoriaSecundariaTotal()));
        crearProceso.setEnabled(true);
        textArea.append("- Ha comenzado el programa de manejo de memoria virtual\n");
        actualizarMemoriaPrincipal();
        actualizarMemoriaSecundaria();
    }

    private void crearProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearProcesoActionPerformed
        String nombreProceso = fieldNombreProceso.getText();       
        int tamañoProceso = Integer.parseInt(fieldTamañoProceso.getText());
        if (tamañoProceso <= memoria.getMemoriaPrincipal()+memoria.getMemoriaSecundaria()) {
            moverRamdomMemoriaToAlmacenamiento();
            this.procesos[contadorProceso] = new Proceso(contadorProceso, nombreProceso, tamañoProceso, memoria.getTamañoPagina());
            this.memoria.agregarProceso(this.procesos[contadorProceso]);
            textArea.append("- Se ha creado un proceso de un tamaño "+tamañoProceso+", su id es '"+contadorProceso+"', y el numero de paginas que posee son "+tamañoProceso/memoria.getTamañoPagina()+"\n");
            contadorProceso++;
            labelCantidadProcesos.setText(Integer.toString(contadorProceso));
            fieldNombreProceso.setText("Proceso "+contadorProceso);
            actualizar();
        } else {
            textArea.append("* ALERTA: No hay suficiente espacio en la memoria principal + la memoria secundaria para crear el proceso.\n");
        }
    }

    private void fieldTamañoProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTamañoProcesoActionPerformed

    }

    private void fieldNombreProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreProcesoActionPerformed

    }

    private void suspenderProcesoBloqueadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suspenderProcesoBloqueadoActionPerformed
        int row = tablaProcesos.getSelectedRow();
        int idProceso = Integer.parseInt(tablaProcesos.getModel().getValueAt(row, 0).toString());
        if (memoria.getContadorDisponiblesAlmacenamiento() >= procesos[idProceso].getPaginasMemoriaPrincipal()) {
            memoria.suspenderProceso(procesos[idProceso]);
            listoProceso.setEnabled(true);
            suspenderProcesoBloqueado.setEnabled(false);
            suspenderProcesoListo.setEnabled(false);
            procesos[idProceso].setEstado("Suspendido/Bloqueado");
            actualizar();
        } else {
            textArea.append("* ALERTA: No hay suficiente espacio en la memoria secundaria para suspender el proceso\n");
        }
    }
    private void tablaProcesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProcesosMouseClicked
        int row = tablaProcesos.getSelectedRow();
        int idProceso = Integer.parseInt(tablaProcesos.getModel().getValueAt(row, 0).toString());
        String estado = procesos[idProceso].getEstado();
        labelProcesoActual.setText(tablaProcesos.getModel().getValueAt(row, 0).toString());
        eliminarProceso.setEnabled(true);
        if (estado == "Listo" || estado == "Activo") {
            listoProceso.setEnabled(false);
            suspenderProcesoBloqueado.setEnabled(true);
            suspenderProcesoListo.setEnabled(true);
            bloquearProceso.setEnabled(true);
        } else if(estado == "Suspendido/Listo") {
            suspenderProcesoBloqueado.setEnabled(false);
            suspenderProcesoListo.setEnabled(false);
            listoProceso.setEnabled(true);
            bloquearProceso.setEnabled(false);
        } else if (estado == "Suspendido/Bloqueado") {
            suspenderProcesoBloqueado.setEnabled(false);
            suspenderProcesoListo.setEnabled(false);
            listoProceso.setEnabled(true);
            bloquearProceso.setEnabled(true);
        } else if(estado == "Bloqueado") {
            bloquearProceso.setEnabled(false);
            suspenderProcesoBloqueado.setEnabled(true);
            suspenderProcesoListo.setEnabled(true);
            listoProceso.setEnabled(true);
        } else if (estado == "Eliminado"){
            suspenderProcesoBloqueado.setEnabled(false);
            suspenderProcesoListo.setEnabled(false);
            listoProceso.setEnabled(false);
            eliminarProceso.setEnabled(false);
            bloquearProceso.setEnabled(false);
        }
    }

    private void eliminarProcesoActionPerformed(java.awt.event.ActionEvent evt) {
        int row = tablaProcesos.getSelectedRow();
        int idProceso = Integer.parseInt(tablaProcesos.getModel().getValueAt(row, 0).toString());
        memoria.eliminarProceso(procesos[idProceso]);
        actualizar();
    }

    private void listoProcesoActionPerformed(java.awt.event.ActionEvent evt) {
        int row = tablaProcesos.getSelectedRow();
        int idProceso = Integer.parseInt(tablaProcesos.getModel().getValueAt(row, 0).toString());
        if (procesos[idProceso].getEstado() != "Bloqueado") {
        if(memoria.getMemoriaPrincipal()+memoria.getMemoriaSecundaria() != 0) {
            moverRamdomMemoriaToAlmacenamiento();
            memoria.listoProceso(procesos[idProceso]);
            listoProceso.setEnabled(false);
            suspenderProcesoBloqueado.setEnabled(true);
            actualizar();
        } else {
            textArea.append("* ALERTA: No hay espacio de espacio en memoria principal ni en memoria secundaria\n");
        }
        } else {
            procesos[idProceso].setEstado("Listo");
            actualizar();
        }
    }

    private void tablaProcesosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablaProcesosFocusLost
        labelProcesoActual.setText("X");
    }

    private void bonoResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonoResolverActionPerformed
        int idProceso = Integer.parseInt(bonoProceso.getText());
        int pagina = Integer.parseInt(bonoPagina.getText(), 2);
        int desplazamiento = Integer.parseInt(bonoDesplazamiento.getText(), 2);
        int direccionFisica;
        
        if (pagina <= procesos[idProceso].getCantidadPaginas()) {
            if (desplazamiento <= memoria.getTamañoPagina()) {
                if (procesos[idProceso].getTablaPagina()[pagina].getPrincipal()) {
                    textArea.append(">> BONO: La pagina se encuentra en memoria principal.\n");
                    direccionFisica = (procesos[idProceso].getTablaPagina()[pagina].getIdMarco()*memoria.getTamañoPagina())+desplazamiento;
                    textArea.append("> BONO: La direccion fisica en binario es: "+Integer.toBinaryString(direccionFisica)+" y su direccion hexadecimal es: 0x"+Integer.toHexString(direccionFisica)+"\n");
                } else {
                    textArea.append(">> BONO: Fallo de pagina. Se va a traer la pagina a memoria principal.\n");
                    if (memoria.getMemoriaPrincipal() == 0) {
                        moverRamdomMemoriaToAlmacenamiento();
                    }
                    memoria.agregarPaginaMemoria(procesos[idProceso], pagina);
                    actualizar();
                    direccionFisica = (procesos[idProceso].getTablaPagina()[pagina].getIdMarco()*memoria.getTamañoPagina())+desplazamiento;
                    textArea.append("> BONO: La direccion fisica en binario es: "+Integer.toBinaryString(direccionFisica)+" y su direccion hexadecimal es: 0x"+Integer.toHexString(direccionFisica)+"\n");
                }
            } else {
                textArea.append(">> BONO: El desplazamiento es mayor al tamaño de pagina\n");
            }
        } else {
            textArea.append(">> BONO: Se ha insertado una pagina que no existe\n");
        }
    }

    private void fieldPaginaActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void bloquearProcesoActionPerformed(java.awt.event.ActionEvent evt) {
        int row = tablaProcesos.getSelectedRow();
        int idProceso = Integer.parseInt(tablaProcesos.getModel().getValueAt(row, 0).toString());
        if (procesos[idProceso].getEstado() == "Suspendido/Bloqueado") {
                   if(memoria.getMemoriaPrincipal()+memoria.getMemoriaSecundaria() != 0) {
            moverRamdomMemoriaToAlmacenamiento();
            memoria.listoProceso(procesos[idProceso]);
            listoProceso.setEnabled(false);
            suspenderProcesoBloqueado.setEnabled(true);
            suspenderProcesoListo.setEnabled(true);
            actualizar();
        } else {
            textArea.append("* ALERTA: No hay espacio de espacio en memoria principal ni en memoria secundaria\n");
        } 
        }
        procesos[idProceso].setEstado("Bloqueado");
        actualizar();
    }

    private void suspenderProcesoListoActionPerformed(java.awt.event.ActionEvent evt) {
        int row = tablaProcesos.getSelectedRow();
        int idProceso = Integer.parseInt(tablaProcesos.getModel().getValueAt(row, 0).toString());
        if (memoria.getContadorDisponiblesAlmacenamiento() >= procesos[idProceso].getPaginasMemoriaPrincipal()) {
            memoria.suspenderProceso(procesos[idProceso]);
            listoProceso.setEnabled(true);
            suspenderProcesoBloqueado.setEnabled(false);
            suspenderProcesoListo.setEnabled(false);
            procesos[idProceso].setEstado("Suspendido/Listo");
            actualizar();
        } else {
            textArea.append("* ALERTA: No hay suficiente espacio en la memoria secundaria para suspender el proceso\n");
        }
    }
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new WebLookAndFeel());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetroOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetroOS().setVisible(true);
            }
        });
    }
    
    private void moverRamdomMemoriaToAlmacenamiento() {
        if(memoria.getMemoriaPrincipal() == 0) {
            try {
                for(int i = 0; i < procesos.length; i++) {
                    if(procesos[i].getPaginasMemoriaPrincipal() >= 2) {
                        this.memoria.quitarUnaPaginaMemoria(procesos[i]);
                        break;
                    }
                }
            } catch(NullPointerException e) {
                for(int i = 0; i < procesos.length; i++) {
                    if(procesos[i].getPaginasMemoriaPrincipal() == 1) {
                        this.memoria.quitarUnaPaginaMemoria(procesos[i]);
                        textArea.append("> Se ha suspendido el proceso de id "+procesos[i].getIdProceso()+" porque la memoria esta demasiado llena de procesos.\n");
                        procesos[i].setEstado("Suspendido");
                        break;
                    }
                }
            }
            }
    }
    
    private void actualizar() {
        labelSecundariaDisponible.setText(Integer.toString(memoria.getMemoriaSecundaria()));
        labelMemoriaDisponible.setText(Integer.toString(memoria.getMemoriaPrincipal()));
        labelMemoriaUsada.setText(Integer.toString(memoria.getMemoriaPrincipalTotal() - memoria.getMemoriaPrincipal()));
        actualizarProcesos();
        actualizarMemoriaPrincipal();
        actualizarMemoriaSecundaria();
    }
    
    private void actualizarProcesos() {
        DefaultTableModel model = (DefaultTableModel) tablaProcesos.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        for (int i = 0; i < contadorProceso; i++) {
            Object[] row = {procesos[i].getIdProceso(), procesos[i].getNombre(), procesos[i].getTamaño(), procesos[i].getCantidadPaginas(), procesos[i].getEstado(), procesos[i].getPaginasMemoriaPrincipal(), procesos[i].getPaginasMemoriaSecundaria()};
            model.addRow(row); 
        }
    }
        
    private void actualizarMemoriaPrincipal() {
        DefaultTableModel model = (DefaultTableModel) tablaMemoriaPrincipal.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        Pagina paginasAux[] = memoria.getMemoria();
        
        int desplazar = 0;
        
        for (int i = 0; i < paginasAux.length; i++) {
            int direccion = (paginasAux[i].getIdMarco()*memoria.getTamañoPagina());
            Object[] row = {"0x"+Integer.toHexString(direccion), paginasAux[i].getIdMarco()+1, paginasAux[i].getIdProceso(), paginasAux[i].getNombreProceso(), paginasAux[i].getIdPagina()};
            model.addRow(row); 
        }
    }
    
    private void actualizarMemoriaSecundaria() {
        DefaultTableModel model = (DefaultTableModel) tablaMemoriaSecundaria.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        Pagina paginasAux[] = memoria.getAlmacenamiento();
        
        for (int i = 0; i < paginasAux.length; i++) {
            Object[] row = {paginasAux[i].getIdMarco()+1, paginasAux[i].getIdProceso(), paginasAux[i].getNombreProceso(), paginasAux[i].getIdPagina()};
            model.addRow(row); 
        }
    }

    // Variables declaration
    private javax.swing.JButton bloquearProceso;
    private javax.swing.JTextField bonoDesplazamiento;
    private javax.swing.JTextField bonoPagina;
    private javax.swing.JTextField bonoProceso;
    private javax.swing.JButton bonoResolver;
    private javax.swing.JButton crearProceso;
    private javax.swing.JButton eliminarProceso;
    private javax.swing.JTextField fieldMemoriaPrincipal;
    private javax.swing.JTextField fieldMemoriaSecundaria;
    private javax.swing.JTextField fieldNombreProceso;
    private javax.swing.JTextField fieldPagina;
    private javax.swing.JTextField fieldTamañoProceso;
    private javax.swing.JButton instalar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelCantidadProcesos;
    private javax.swing.JLabel labelMarcosPagina;
    private javax.swing.JLabel labelMemoriaDisponible;
    private javax.swing.JLabel labelMemoriaUsada;
    private javax.swing.JLabel labelProcesoActual;
    private javax.swing.JLabel labelSecundariaDisponible;
    private javax.swing.JLabel labelTamañoMemoria;
    private javax.swing.JLabel labelTamañoPagina;
    private javax.swing.JLabel labelTamañoSecundario;
    private javax.swing.JButton listoProceso;
    private javax.swing.JButton suspenderProcesoBloqueado;
    private javax.swing.JButton suspenderProcesoListo;
    private javax.swing.JTable tablaMemoriaPrincipal;
    private javax.swing.JTable tablaMemoriaSecundaria;
    private javax.swing.JTable tablaProcesos;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel totalTrenzas3;
    
}
