 package stock;



import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import table.TableCustom;

public class Stock1 extends javax.swing.JFrame {

    connectDatabase con=new connectDatabase();
    ResultSet rs;
    DefaultTableModel tbl=new DefaultTableModel();
    public Stock1() {
        initComponents();
        tbl=(DefaultTableModel) jTable1.getModel();
        
        TableCustom.apply(jScrollPane1, TableCustom.TableType.MULTI_LINE);
        Imagetitle();
        tbStock1();
        tbstockValue2();
        combodata();
        StatusSTock1();
        StatusSTock2();
        StatusMagazin();
        valeurTotal3();
    }
   private void tbStock1(){
       String query="select tb_sorties.num_produit as 'produit',nom_prod,quantite_initial,sum(quantite),sum(distinct qt_sortie),(sum(quantite)+quantite_initial)-sum(distinct qt_sortie) as 'Stock_final', concat(date_format(date_sortie,'%M'),' ',year(date_sortie)) as 'date' from tb_produit,tb_entrees,tb_sorties where month(date_sortie)=month(now()) and tb_sorties.stock='"+jComboBox2.getSelectedItem()+"' and  numero_prod=tb_entrees.num_produit and tb_entrees.num_produit=tb_sorties.num_produit group by tb_sorties.num_produit desc";
      
       try {
             
             rs=con.extaireData(query);
             
             
             while(rs.next()){
                 tbl.addRow(new Object[]{
                
                 rs.getString("produit"),
                 rs.getString("nom_prod"),
                 rs.getString("quantite_initial"),
                 rs.getString("sum(quantite)"),
                 rs.getString("sum(distinct qt_sortie)"),
                 rs.getString("Stock_final"),
                 rs.getString("date")
                 });
             }
       } catch (Exception e) {
       }
   }
   
      
   
   private void tbstockValue2(){ 
       
     String query="select numero_prod,nom_prod,quantite_initial,sum(quantite) ,(quantite_initial+sum(quantite)) as 'Stock_final',concat(date_format(date_entree,'%M'),' ',year(date_entree)) as 'date' from tb_entrees,tb_produit where month(date_entree)=month(now())and numero_prod=num_produit and num_produit not in (select num_produit from tb_sorties ) group by num_produit desc";
      
       try {
             
             rs=con.extaireData(query);
             
             
             while(rs.next()){
                 tbl.addRow(new Object[]{
                
                 rs.getString("numero_prod"),
                 rs.getString("nom_prod"),
                 rs.getString("quantite_initial"),
                 rs.getString("sum(quantite)"),
                 ("0"),
                 rs.getString("Stock_final"),
                 rs.getString("date")
                 });
             }
       } catch (Exception e) {
       }
   }
    private void combodata(){
        
        String query="select distinct DATE_FORMAT(date_sortie,'%Y') as 'date' from tb_sorties";
        
        try {
              
              rs=con.extaireData(query);
              jComboBox1.removeAllItems();
              while(rs.next()){
                  jComboBox1.addItem(rs.getString("date"));
              }
            
        } catch (Exception e) {
        }
    }
    
    private void StatusSTock1(){
        String query="select Concat(' Stock 1: ',count(distinct num_produit),' ','Articles sorties') as 'status' from tb_sorties where month(date_sortie)=month(now()) and stock='Stock 1'  ";
        try {
              rs=con.extaireData(query);
              while(rs.next())
                  jLabel1.setText(rs.getString("status"));
        } catch (Exception e) {
        }
    }
    private void StatusSTock2(){
        String query="select Concat(' Stock 2: ',count(distinct num_produit),' ','Articles sorties') as 'status' from tb_sorties where month(date_sortie)=month(now()) and stock='Stock 2'  ";
        try {
              rs=con.extaireData(query);
              while(rs.next())
                  jLabel2.setText(rs.getString("status"));
        } catch (Exception e) {
        }
    }
    private void StatusMagazin(){
        String query="select Concat(' Magazin: ',count(distinct num_produit),' ','Articles entrees') as 'status' from tb_sorties where month(date_sortie)=month(now()) and stock='Stock 1'";
        
         try {
              rs=con.extaireData(query);
              while(rs.next())
                  jLabel7.setText(rs.getString("status"));
        } catch (Exception e) {
        }
    }
    
    
   
    private void valeurTotal3(){
        String query="select concat('Valeur Total: ',sum(qt_sortie*pv),'Fbu') as 'valeur'  from tb_sorties where month(date_sortie)=month(now()) and tb_sorties.stock='Stock 1'";
         try {
               rs=con.extaireData(query);
              while(rs.next())
                  jLabel8.setText(rs.getString("valeur"));
        } catch (Exception e) {
        }
    }
    private void Imagetitle()
     {
      setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon-dashboard-9.png")));
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableCustom1 = new TableCustom();
        tableScrollButton1 = new table.TableScrollButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        input_recherche = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel8 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informations du Stock");
        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Article", "Nom de l'Article", "Stock Initial", "Quantités entrées", "Quantités sorties", "Stock final", "Mois/An"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        tableScrollButton1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("<html>\n<h3>Option de Recherche :<h3>"));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 110, 30));

        input_recherche.setForeground(new java.awt.Color(153, 153, 153));
        input_recherche.setText("Rechercher...");
        input_recherche.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_rechercheFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_rechercheFocusLost(evt);
            }
        });
        input_recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_rechercheActionPerformed(evt);
            }
        });
        input_recherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_rechercheKeyReleased(evt);
            }
        });
        jPanel1.add(input_recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, 30));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stock 1", "Stock 2" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 70));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBox3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox3PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 110, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("<html>\n<h3>Status :<h3>"));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel3.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel3.setkStartColor(new java.awt.Color(0, 102, 102));

        jLabel8.setBackground(new java.awt.Color(0, 204, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Aucune Donnée");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 390, 60));

        kGradientPanel4.setkEndColor(new java.awt.Color(0, 102, 102));
        kGradientPanel4.setkStartColor(new java.awt.Color(75, 44, 75));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aucune Donnée");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 29, 330, 60));

        kGradientPanel5.setkEndColor(new java.awt.Color(0, 102, 102));
        kGradientPanel5.setkStartColor(new java.awt.Color(75, 44, 75));

        jLabel2.setBackground(new java.awt.Color(0, 102, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Aucune Donnée");

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 390, 60));

        kGradientPanel6.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel6.setkStartColor(new java.awt.Color(0, 102, 102));

        jLabel7.setBackground(new java.awt.Color(0, 102, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Aucune Donnée");

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(kGradientPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 330, 60));

        jMenu1.setText("Tâches");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Actualiser");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Retour au Management");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Exporter vers Excel");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Déconnecter");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edition");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Mode Sombre");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Informations");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Stock  ");
        jMenuItem1.setEnabled(false);
        jMenu3.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Magazin");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Actualiser");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableScrollButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableScrollButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

        Stock1 t=new Stock1();
        t.setLocationRelativeTo(this);
        pack();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Management m=new Management();
        m.setLocationRelativeTo(this);
        pack();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Export_Excel e=new Export_Excel(jTable1, this);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void input_rechercheFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_rechercheFocusGained
        if(input_recherche.getText().equals("Rechercher...")){
            input_recherche.setText("");    
            input_recherche.setForeground(Color.black);
            
        }
    }//GEN-LAST:event_input_rechercheFocusGained

    private void input_rechercheFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_rechercheFocusLost
       if(input_recherche.getText().equals("")){
            input_recherche.setText("Rechercher...");
            input_recherche.setForeground(new Color(153, 153, 153));
            
        } 
    }//GEN-LAST:event_input_rechercheFocusLost

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void input_rechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_rechercheKeyReleased
         String q=(String) input_recherche.getText(); 
        TableRowSorter<DefaultTableModel> tbRs=new TableRowSorter<DefaultTableModel>(tbl);
        jTable1.setRowSorter(tbRs);
        tbRs.setRowFilter(RowFilter.regexFilter(q));
    }//GEN-LAST:event_input_rechercheKeyReleased

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
      String query="select tb_sorties.num_produit as 'produit',nom_prod,quantite_initial,sum(quantite),sum(distinct qt_sortie),(sum(quantite)+quantite_initial)-sum(distinct qt_sortie) as 'Stock_final', concat(date_format(date_sortie,'%M'),' ',year(date_sortie)) as 'date' from tb_produit,tb_entrees,tb_sorties where month(date_sortie)=month(now()) and tb_sorties.stock='"+jComboBox2.getSelectedItem()+"' and  numero_prod=tb_entrees.num_produit and tb_entrees.num_produit=tb_sorties.num_produit group by tb_sorties.num_produit desc";
      
       try {
             
             rs=con.extaireData(query);
             
             tbl.setRowCount(0);
             while(rs.next()){
                 tbl.addRow(new Object[]{
                
                 rs.getString("produit"),
                 rs.getString("nom_prod"),
                 rs.getString("quantite_initial"),
                 rs.getString("sum(quantite)"),
                 rs.getString("sum(distinct qt_sortie)"),
                 rs.getString("Stock_final"),
                 rs.getString("date")
                 });
             }
       } catch (Exception e) {
       }
        
        String query1="select numero_prod,nom_prod,quantite_initial,sum(quantite) ,(quantite_initial+sum(quantite)) as 'Stock_final',concat(date_format(date_entree,'%M'),' ',year(date_entree)) as 'date' from tb_entrees,tb_produit where month(date_entree)=month(now()) and tb_entrees.stock='"+jComboBox2.getSelectedItem()+"' and numero_prod=num_produit and num_produit not in (select num_produit from tb_sorties ) group by num_produit desc";
      
       try {
             
             rs=con.extaireData(query1);
             
             while(rs.next()){
                 tbl.addRow(new Object[]{
                 
                 rs.getString("numero_prod"),
                 rs.getString("nom_prod"),
                 rs.getString("quantite_initial"),
                 rs.getString("sum(quantite)"),
                 ("0"),
                 rs.getString("Stock_final"),
                 rs.getString("date")
                 });
             }
       } catch (Exception e) {
       }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        Stock1 t=new Stock1();
        t.setLocationRelativeTo(this);
        pack();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
         String query="select tb_sorties.num_produit as 'produit',nom_prod,quantite_initial,sum(quantite),sum(distinct qt_sortie),(sum(quantite)+quantite_initial)-sum(distinct qt_sortie) as 'Stock_final', concat(date_format(date_sortie,'%M'),' ',year(date_sortie)) as 'date' from tb_produit,tb_entrees,tb_sorties where year(date_sortie)='"+jComboBox1.getSelectedItem()+"' and date_format(date_sortie,'%M')='"+jComboBox3.getSelectedItem()+"' and tb_entrees.stock='"+jComboBox2.getSelectedItem()+"' and  numero_prod=tb_entrees.num_produit and tb_entrees.num_produit=tb_sorties.num_produit group by tb_sorties.num_produit desc";
      
       try {
             
             rs=con.extaireData(query);
             
             tbl.setRowCount(0);
             while(rs.next()){
                 tbl.addRow(new Object[]{
                
                 rs.getString("produit"),
                 rs.getString("nom_prod"),
                 rs.getString("quantite_initial"),
                 rs.getString("sum(quantite)"),
                 rs.getString("sum(distinct qt_sortie)"),
                 rs.getString("Stock_final"),
                 rs.getString("date")
                 });
             }
       } catch (Exception e) {
       }
        
        String query1="select numero_prod,nom_prod,quantite_initial,sum(quantite) ,(quantite_initial+sum(quantite)) as 'Stock_final',concat(date_format(date_entree,'%M'),' ',year(date_entree)) as 'date' from tb_entrees,tb_produit where year(date_entree)='"+jComboBox1.getSelectedItem()+"' and date_format(date_entree,'%M')='"+jComboBox3.getSelectedItem()+"' and tb_entrees.stock='"+jComboBox2.getSelectedItem()+"' and numero_prod=num_produit and num_produit not in (select num_produit from tb_sorties ) group by num_produit desc";
      
       try {
             
             rs=con.extaireData(query1);
             
             while(rs.next()){
                 tbl.addRow(new Object[]{
                 
                 rs.getString("numero_prod"),
                 rs.getString("nom_prod"),
                 rs.getString("quantite_initial"),
                 rs.getString("sum(quantite)"),
                 ("0"),
                 rs.getString("Stock_final"),
                 rs.getString("date")
                 });
             }
       } catch (Exception e) {
       }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void jComboBox3PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox3PopupMenuWillBecomeInvisible
         String query="select tb_sorties.num_produit as 'produit',nom_prod,quantite_initial,sum(quantite),sum(distinct qt_sortie),(sum(quantite)+quantite_initial)-sum(distinct qt_sortie) as 'Stock_final', concat(date_format(date_sortie,'%M'),' ',year(date_sortie)) as 'date' from tb_produit,tb_entrees,tb_sorties where year(date_sortie)='"+jComboBox1.getSelectedItem()+"' and date_format(date_sortie,'%M')='"+jComboBox3.getSelectedItem()+"' and tb_entrees.stock='"+jComboBox2.getSelectedItem()+"' and  numero_prod=tb_entrees.num_produit and tb_entrees.num_produit=tb_sorties.num_produit group by tb_sorties.num_produit desc";
      
       try {
             
             rs=con.extaireData(query);
             
             tbl.setRowCount(0);
             while(rs.next()){
                 tbl.addRow(new Object[]{
                
                 rs.getString("produit"),
                 rs.getString("nom_prod"),
                 rs.getString("quantite_initial"),
                 rs.getString("sum(quantite)"),
                 rs.getString("sum(distinct qt_sortie)"),
                 rs.getString("Stock_final"),
                 rs.getString("date")
                 });
             }
       } catch (Exception e) {
       }
        
        String query1="select numero_prod,nom_prod,quantite_initial,sum(quantite) ,(quantite_initial+sum(quantite)) as 'Stock_final',concat(date_format(date_entree,'%M'),' ',year(date_entree)) as 'date' from tb_entrees,tb_produit where year(date_entree)='"+jComboBox1.getSelectedItem()+"' and date_format(date_entree,'%M')='"+jComboBox3.getSelectedItem()+"' and tb_entrees.stock='"+jComboBox2.getSelectedItem()+"' and numero_prod=num_produit and num_produit not in (select num_produit from tb_sorties ) group by num_produit desc";
      
       try {
             
             rs=con.extaireData(query1);
             
             while(rs.next()){
                 tbl.addRow(new Object[]{
                 
                 rs.getString("numero_prod"),
                 rs.getString("nom_prod"),
                 rs.getString("quantite_initial"),
                 rs.getString("sum(quantite)"),
                 ("0"),
                 rs.getString("Stock_final"),
                 rs.getString("date")
                 });
             }
       } catch (Exception e) {
       }
    }//GEN-LAST:event_jComboBox3PopupMenuWillBecomeInvisible

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Magazin m=new Magazin();
        m.setVisible(true);
        pack();
        m.setLocationRelativeTo(this);
        dispose();
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void input_rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_rechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_rechercheActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       login l=new login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        new Stock1().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField input_recherche;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private TableCustom tableCustom1;
    private table.TableScrollButton tableScrollButton1;
    // End of variables declaration//GEN-END:variables
}
