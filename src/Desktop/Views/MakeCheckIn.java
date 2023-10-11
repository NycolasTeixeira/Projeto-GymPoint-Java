package Desktop.Views;

import Desktop.Controllers.GymController;
import Entities.Gym;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jxmapviewer.JXMapKit;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.Waypoint;
import org.jxmapviewer.viewer.WaypointPainter;

public class MakeCheckIn extends javax.swing.JFrame {

    private final JXMapKit mapKit = new JXMapKit();
    private final UUID userId;
    GeoPosition initialPosition = null;
    List<Gym> listGyms = new ArrayList<>();

    public MakeCheckIn(UUID userId) {
        this.userId = userId;
        initComponents();
        initializeMap();
        this.setLocationRelativeTo(null);
    }

    private void initializeMap() {
        this.mapKit.setDefaultProvider(JXMapKit.DefaultProviders.OpenStreetMaps);
        initialPosition = new GeoPosition(-27.237536666590675, -48.62617492675781);
        this.mapKit.setAddressLocation(initialPosition);
        this.mapKit.setZoom(7);
        createMarkerNewPosition();
        this.mapPanel.setLayout(new BorderLayout());
        this.mapPanel.add(mapKit);
    }

    private void createMarkerNewPosition() {
        Set<Waypoint> waypoints = new HashSet<>();
        Waypoint marker = new DefaultWaypoint(initialPosition);
        waypoints.add(marker);
        WaypointPainter<Waypoint> waypointPainter = new WaypointPainter<>();
        waypointPainter.setWaypoints(waypoints);
        mapKit.getMainMap().setOverlayPainter(waypointPainter);
        mapKit.getMainMap().repaint();
    }

    private void loadGyms(String query) {
        // BUSCAR AS ACADEMIAS
        this.listGyms = new GymController().BuscarAcademia(query);
        // VERIFICAR SE É NULA
        if(listGyms.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não foi encontrado nenhuma academia");
            return;
        }
        // SE FOR RETURN VAZIO
        // SENÃO PREENCHE A TABELA

        DefaultTableModel table = (DefaultTableModel) this.tableGym.getModel();
        for (Gym gym : this.listGyms) {
            Object[] dados = {gym.getNome(), gym.getDesc(), gym.getTel() };
            table.addRow(dados);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblGymName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGym = new javax.swing.JTable();
        lblAddress = new javax.swing.JLabel();
        mapPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fazer Check-in");
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("JetBrainsMono NF", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Fazer Check-In");

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desktop/Assets/logo-header.png"))); // NOI18N

        tfSearch.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N

        btnSearch.setFont(new java.awt.Font("JetBrainsMono NF", 1, 14)); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblGymName.setFont(new java.awt.Font("JetBrainsMono NF", 1, 14)); // NOI18N
        lblGymName.setText("Nome da Academia");

        tableGym.setFont(new java.awt.Font("JetBrainsMono NF", 1, 14)); // NOI18N
        tableGym.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Descrição", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableGym.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableGym.setShowGrid(true);
        tableGym.getTableHeader().setReorderingAllowed(false);
        tableGym.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGymMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableGym);
        if (tableGym.getColumnModel().getColumnCount() > 0) {
            tableGym.getColumnModel().getColumn(0).setResizable(false);
            tableGym.getColumnModel().getColumn(1).setResizable(false);
            tableGym.getColumnModel().getColumn(2).setResizable(false);
        }

        lblAddress.setFont(new java.awt.Font("JetBrainsMono NF", 1, 14)); // NOI18N
        lblAddress.setText("Endereço (Localização)");

        mapPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mapPanelLayout = new javax.swing.GroupLayout(mapPanel);
        mapPanel.setLayout(mapPanelLayout);
        mapPanelLayout.setHorizontalGroup(
            mapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mapPanelLayout.setVerticalGroup(
            mapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("JetBrainsMono NF", 1, 14)); // NOI18N
        jButton1.setText("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mapPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(lblGymName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGymName)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String gymName = this.tfSearch.getText();
        
        loadGyms(gymName);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tableGymMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGymMouseClicked

        int index = this.tableGym.getSelectedRow();
        Object gym = this.listGyms.get(index);

        // AJUSTA MARCADOR NO MAPA
        initialPosition = new GeoPosition(48.8588443, 2.2943506);
        createMarkerNewPosition();

        // ABRE TELA DE CHECK-IN
        new CheckIn(this.userId, UUID.randomUUID()).setVisible(true);
    }//GEN-LAST:event_tableGymMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblGymName;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel mapPanel;
    private javax.swing.JPanel panelMap;
    private javax.swing.JPanel panelMap1;
    private javax.swing.JPanel panelMap2;
    private javax.swing.JPanel panelMap3;
    private javax.swing.JPanel panelMap4;
    private javax.swing.JPanel panelMap5;
    private javax.swing.JPanel panelMap6;
    private javax.swing.JPanel panelMap7;
    private javax.swing.JPanel panelMap8;
    private javax.swing.JTable tableGym;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
