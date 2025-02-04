
package stock;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.poi.ss.usermodel.DateUtil;



public class Management extends javax.swing.JFrame {
    connectDatabase con=new connectDatabase();
    Connexion con1=new Connexion();
    ResultSet rs;
    java.sql.Statement st;
    DefaultTableModel tbl=new DefaultTableModel();
    String stck;
    String stck2;
    
    public Management() {
        initComponents();
        Imagetitle();
        tbl=(DefaultTableModel) jTable1.getModel();
        tblUpdate1();
        tbUpdate();
        combo1Update();
        radio();
        radio2();
        
    }

    private void radio(){
        if(radiostock1.isSelected()){
            stck="Stock 1";
        }else if(radiostock2.isSelected())
           stck="Stock 2";  
    }
     private void radio2(){
        if(radioSortieStock1.isSelected()){
            stck2="Stock 1";
        }else if(radioSortieStock2.isSelected())
           stck2="Stock 2";  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        comboExiste = new javax.swing.JComboBox<>();
        numArticleCashe1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputNomNouv = new javax.swing.JTextField();
        inputNumNouv = new com.toedter.components.JSpinField();
        jLabel7 = new javax.swing.JLabel();
        mesure = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        radioExiste = new javax.swing.JRadioButton();
        radioNouveau = new javax.swing.JRadioButton();
        radiostock1 = new javax.swing.JRadioButton();
        radiostock2 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        inputDateEntree = new com.toedter.calendar.JDateChooser();
        inputqt = new com.toedter.components.JSpinField();
        inputPU = new javax.swing.JTextField();
        qt_initial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboSortie = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        radioSortieStock1 = new javax.swing.JRadioButton();
        radioSortieStock2 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        numArticleCashe2 = new javax.swing.JLabel();
        inputDateSortie = new com.toedter.calendar.JDateChooser();
        inputQtSortie = new com.toedter.components.JSpinField();
        num_sortie = new javax.swing.JLabel();
        num_entree = new javax.swing.JLabel();
        pv = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        inputFiltre = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Management");
        setBackground(new java.awt.Color(255, 255, 255));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 80, 40));

        comboExiste.setOpaque(false);
        comboExiste.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboExisteItemStateChanged(evt);
            }
        });
        comboExiste.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboExistePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(comboExiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 170, 30));

        numArticleCashe1.setBackground(new java.awt.Color(255, 255, 255));
        numArticleCashe1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jPanel1.add(numArticleCashe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 80, 10));

        jLabel1.setText("Produit :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, 30));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder("<html>\n<h4>Article existant<h4>"));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 250, 90));

        jLabel8.setText("Quantite :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 60, 30));

        jLabel9.setText("P.U :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 60, 30));

        jLabel10.setText("Date d'Achat :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, 30));

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setText("Supprimer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 90, 40));

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setText("Modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 80, 40));

        jLabel2.setText("Nº Article :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 60, 30));

        jLabel3.setText("Nom :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 40, 30));

        inputNomNouv.setEnabled(false);
        inputNomNouv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomNouvActionPerformed(evt);
            }
        });
        jPanel1.add(inputNomNouv, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 160, 30));

        inputNumNouv.setEnabled(false);
        jPanel1.add(inputNumNouv, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 160, 30));

        jLabel7.setText("Mesure  par :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 80, 30));

        mesure.setEnabled(false);
        jPanel1.add(mesure, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 140, 30));

        jLabel17.setBorder(javax.swing.BorderFactory.createTitledBorder("<html>\n<h4>Nouveau Article<h4>"));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 250, 170));

        radioExiste.setSelected(true);
        radioExiste.setText("Existe déjà");
        radioExiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioExisteActionPerformed(evt);
            }
        });
        jPanel1.add(radioExiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 100, 30));

        radioNouveau.setText("Nouveau");
        radioNouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNouveauActionPerformed(evt);
            }
        });
        jPanel1.add(radioNouveau, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, 30));

        buttonGroup1.add(radiostock1);
        radiostock1.setSelected(true);
        radiostock1.setText("Stock 1");
        radiostock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiostock1ActionPerformed(evt);
            }
        });
        jPanel1.add(radiostock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, -1, -1));

        buttonGroup1.add(radiostock2);
        radiostock2.setText("Stock 2");
        radiostock2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiostock2ActionPerformed(evt);
            }
        });
        jPanel1.add(radiostock2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, -1, -1));

        jLabel18.setText("Pour :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 50, 20));

        inputDateEntree.setDateFormatString(" yyyy-MM-dd"); // NOI18N
        jPanel1.add(inputDateEntree, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 150, 30));

        inputqt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputqtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inputqtMouseEntered(evt);
            }
        });
        jPanel1.add(inputqt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 100, 30));
        jPanel1.add(inputPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 170, 30));

        qt_initial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        qt_initial.setForeground(new java.awt.Color(153, 153, 153));
        qt_initial.setText("Qt initial");
        qt_initial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qt_initialFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                qt_initialFocusLost(evt);
            }
        });
        jPanel1.add(qt_initial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 70, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder("<html>\n<h3>Option d'une Entrée<h3>"));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 270, 580));

        comboSortie.setOpaque(false);
        comboSortie.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboSortiePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(comboSortie, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 150, 30));

        jLabel19.setText("Article :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, -1, 30));

        jLabel20.setText("Quantite :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 60, 30));

        jLabel21.setText("Date de sortie :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, 80, 30));

        buttonGroup2.add(radioSortieStock1);
        radioSortieStock1.setSelected(true);
        radioSortieStock1.setText("Stock 1");
        radioSortieStock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSortieStock1ActionPerformed(evt);
            }
        });
        jPanel1.add(radioSortieStock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, -1, 30));

        buttonGroup2.add(radioSortieStock2);
        radioSortieStock2.setText("Stock 2");
        radioSortieStock2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSortieStock2ActionPerformed(evt);
            }
        });
        jPanel1.add(radioSortieStock2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, -1, 30));

        jLabel22.setText("Pour :");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 50, 30));

        jButton5.setBackground(new java.awt.Color(0, 102, 255));
        jButton5.setText("Ajouter");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 590, 80, 40));

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setText("Modifier");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 590, 80, 40));

        jButton7.setBackground(new java.awt.Color(204, 0, 51));
        jButton7.setText("Supprimer");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 590, 90, 40));

        numArticleCashe2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jPanel1.add(numArticleCashe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 80, 10));

        inputDateSortie.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(inputDateSortie, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 620, 100, 30));
        jPanel1.add(inputQtSortie, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 150, 30));

        num_sortie.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        num_sortie.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(num_sortie, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, 50, 20));

        num_entree.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        num_entree.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(num_entree, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 60, 20));

        pv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pvActionPerformed(evt);
            }
        });
        jPanel1.add(pv, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 580, 140, 30));

        jLabel13.setText("P.V :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 40, 30));

        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder("<html>\n<h3>Option d'une Sortie<h3>"));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 720, 170));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Article", "Nom de l'Article", "Quantité ", "Mesure par ", "P.V /  P.U (Fbu)", "Option", "Stock", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(1).setMinWidth(70);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(2).setMinWidth(70);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(3).setMinWidth(40);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(4).setMinWidth(120);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(5).setMinWidth(70);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(6).setMinWidth(80);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(80);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 720, 480));

        inputFiltre.setForeground(new java.awt.Color(153, 153, 153));
        inputFiltre.setText("Rechercher");
        inputFiltre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputFiltreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputFiltreFocusLost(evt);
            }
        });
        inputFiltre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFiltreActionPerformed(evt);
            }
        });
        inputFiltre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputFiltreKeyReleased(evt);
            }
        });
        jPanel1.add(inputFiltre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stock 1", "Stock 2" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 70, 30));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entree", "Sortie" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox2MouseEntered(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 70, 30));

        jLabel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1030, 20));

        jMenu1.setText("Tâches");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Actualiser");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Exporter vers Excel");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Déconnecter");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edition");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jCheckBoxMenuItem1.setText("Mode Sombre");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Informations");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Stock ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Magasin");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
     if(radioExiste.isSelected()){
         if(numArticleCashe1.getText().isEmpty() || qt_initial.getText().isEmpty() || inputqt.getValue()<=0 || inputPU.getText().isEmpty() || ((JTextField) inputDateEntree.getDateEditor().getUiComponent()).getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Veillez remplir tous les champs ! ");  
         }
          else{
           String query1="insert into tb_entrees(num_produit,quantite_initial,quantite,pu,stock,date_entree) values ("+numArticleCashe1.getText()+","+qt_initial.getText()+","+inputqt.getValue()+","+inputPU.getText()+",'"+stck+"','"+((JTextField)inputDateEntree.getDateEditor().getUiComponent()).getText()+"')";       

          try {
               con.updateData(query1);
               tblUpdate1();
               tbUpdate();
               num_entree.setText("");
               inputNumNouv.setValue(0);
               inputNomNouv.setText("");
               inputqt.setValue(0);
               inputPU.setText("");      
               qt_initial.setText("");
                     
              } catch (Exception e) {
                }
             
         }  
       
             
        }

       
       
        
   if(radioNouveau.isSelected())
    {
      if(inputNumNouv.getValue()<=0 || inputNomNouv.getText().isEmpty() || mesure.getText().isEmpty() || qt_initial.getText().isEmpty() || inputqt.getValue()<=0 || inputPU.getText().isEmpty() || ((JTextField) inputDateEntree.getDateEditor().getUiComponent()).getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Veillez remplir tous les champs ! ");  
      } 
      
      else{
           String query="insert into tb_produit values ("+inputNumNouv.getValue()+",'"+inputNomNouv.getText()+"','"+mesure.getText()+"')";
        try {
              con.updateData(query);
        } catch (Exception e) {
            
            inputNumNouv.setValue(0);
            inputNomNouv.setText("");
            mesure.setText("");
            inputqt.setValue(0);
            inputPU.setText("");
            qt_initial.setText("");
            
        }
      
              
        String query1="insert into tb_entrees(num_produit,quantite_initial,quantite,pu,stock,date_entree) values ("+inputNumNouv.getValue()+","+qt_initial.getText()+","+inputqt.getValue()+","+inputPU.getText()+",'"+stck+"','"+((JTextField) inputDateEntree.getDateEditor().getUiComponent()).getText()+"')";   
          try {
                con.updateData(query1);
                tblUpdate1();
                tbUpdate();
                combo1Update();
          } catch (Exception e) {
          }
  
          
      } 
  
    }
         
    }//GEN-LAST:event_jButton1ActionPerformed
      
    
    
    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
     
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void inputNomNouvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomNouvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomNouvActionPerformed

    private void radioNouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNouveauActionPerformed
        
            radioExiste.setSelected(false);
            comboExiste.setEnabled(false);
            inputNumNouv.setEnabled(true);
            inputNomNouv.setEnabled(true);
            mesure.setEnabled(true);
            
       
       
    }//GEN-LAST:event_radioNouveauActionPerformed

    private void radioExisteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioExisteActionPerformed
        
            radioExiste.setSelected(true);
            radioNouveau.setSelected(false);
            comboExiste.setEnabled(true);
            inputNumNouv.setEnabled(false);
            inputNomNouv.setEnabled(false);
            mesure.setEnabled(false);
        
        
    }//GEN-LAST:event_radioExisteActionPerformed

    private void radiostock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiostock1ActionPerformed
         stck="Stock 1";  
    }//GEN-LAST:event_radiostock1ActionPerformed

    private void radiostock2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiostock2ActionPerformed
         stck="Stock 2";
    }//GEN-LAST:event_radiostock2ActionPerformed

    private void radioSortieStock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSortieStock1ActionPerformed
       stck2="Stock 1";
    }//GEN-LAST:event_radioSortieStock1ActionPerformed

    private void radioSortieStock2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSortieStock2ActionPerformed
        stck2="Stock 2";
    }//GEN-LAST:event_radioSortieStock2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Management n=new Management();    
        n.setLocationRelativeTo(this);
        pack();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selected=jTable1.getSelectedRow();
        String option=jTable1.getValueAt(selected,5).toString();
        
        
        String query="delete from tb_entrees where num_entree="+num_entree.getText()+" ";
        
        if(option.equals("Entree")){
            if(JOptionPane.showConfirmDialog(rootPane,"Voulez-vous supprimer cet article  ?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
               
               con.updateData(query);
               tblUpdate1();
               tbUpdate();
               num_entree.setText("");
               inputNumNouv.setValue(0);
               inputNomNouv.setText("");
               inputqt.setValue(0);
               inputPU.setText("");      
               qt_initial.setText("");
               mesure.setText("");
            
            }
        
            
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Veillez utiliser le bouton spécifique !");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      if(JOptionPane.showConfirmDialog(rootPane,"Voulez-vous modifier cet article  ?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){        
       
       if(radioExiste.isSelected()){
         
        if(numArticleCashe1.getText().isEmpty() || qt_initial.getText().isEmpty() || inputqt.getValue()<=0 || inputPU.getText().isEmpty() || ((JTextField) inputDateEntree.getDateEditor().getUiComponent()).getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Veillez remplir tous les champs ! ");  
         }
          else{
           String query1="update tb_entrees set  num_produit="+numArticleCashe1.getText()+",quantite_initial="+qt_initial.getText()+",quantite="+inputqt.getValue()+",pu="+inputPU.getText()+",stock='"+stck+"',date_entree='"+((JTextField)inputDateEntree.getDateEditor().getUiComponent()).getText()+"' where num_entree="+num_entree.getText()+"";       

            try {
               con.updateData(query1);
               tblUpdate1();
               tbUpdate();
                        
                        
              } catch (Exception e) {
                }
             
         }  
       
             
        }

       
       
        
   if(radioNouveau.isSelected())
    {
      if(inputNumNouv.getValue()<=0 || inputNomNouv.getText().isEmpty() || qt_initial.getText().isEmpty() || inputqt.getValue()<=0 || inputPU.getText().isEmpty() || ((JTextField) inputDateEntree.getDateEditor().getUiComponent()).getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Veillez remplir tous les champs ! ");  
      } 
      
      else{
           String query="update tb_produit set numero_prod="+inputNumNouv.getValue()+",nom_prod='"+inputNomNouv.getText()+"',unite_de_mesure='"+mesure.getText()+"' where numero_prod="+numArticleCashe1.getText()+"";
        try {
              con.updateData(query);
        } catch (Exception e) {
            
            inputNumNouv.setValue(0);
            inputNomNouv.setText("");
            inputqt.setValue(0);
            inputPU.setText("");
            mesure.setText("");
            qt_initial.setText("");
             
        }
      
              
        String query1="update tb_entrees set  num_produit="+inputNumNouv.getValue()+",quantite_initial="+qt_initial.getText()+",quantite="+inputqt.getValue()+",pu="+inputPU.getText()+",stock='"+stck+"',date_entree='"+((JTextField)inputDateEntree.getDateEditor().getUiComponent()).getText()+"' where num_entree="+num_entree.getText()+"";   
          try {
                con.updateData(query1);
                tblUpdate1();
                tbUpdate();
                combo1Update();
          } catch (Exception e) {
          }
  
          
      } 
  
     }
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void comboExistePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboExistePopupMenuWillBecomeInvisible
        String a=comboExiste.getSelectedItem().toString();
        numeroCashe(a,numArticleCashe1);
         
        String b="select (sum(quantite)+quantite_initial)-sum(distinct qt_sortie) as 'SF' from tb_entrees,tb_sorties where month(date_sortie)=month(now()) and  tb_entrees.num_produit="+numArticleCashe1.getText()+" and tb_entrees.num_produit=tb_sorties.num_produit";
        
        try {
            rs=con.extaireData(b);
            while(rs.next())
            qt_initial.setText(rs.getString("SF"));
        } catch (SQLException ex) {
            
        }
        
        if(qt_initial.getText().isEmpty())
        {
          String c="select quantite+quantite_initial as 'SF' from tb_entrees where tb_entrees.num_produit="+numArticleCashe1.getText()+" order by date_entree desc limit 1";
        
        try {
            rs=con.extaireData(c);
            while(rs.next())
            qt_initial.setText(rs.getString("SF"));
        } catch (SQLException ex) {
            
        }  
        }
       
    }//GEN-LAST:event_comboExistePopupMenuWillBecomeInvisible

    private void comboSortiePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboSortiePopupMenuWillBecomeInvisible
         String a=comboSortie.getSelectedItem().toString();
        numeroCashe(a,numArticleCashe2);
    }//GEN-LAST:event_comboSortiePopupMenuWillBecomeInvisible

    private void inputFiltreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputFiltreKeyReleased
        String e=inputFiltre.getText();
        filtrer(e);
    }//GEN-LAST:event_inputFiltreKeyReleased

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        Management n=new Management();
        n.setVisible(true);
        n.setLocationRelativeTo(this);
        pack();
        dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       Export_Excel e=new Export_Excel(jTable1, this);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int selected=jTable1.getSelectedRow();
        String option=jTable1.getValueAt(selected,5).toString();
        
        
        String query="delete from tb_sorties where num_sortie="+num_sortie.getText()+" ";
        
        if(option.equals("Sortie")){
            try {
                  if(JOptionPane.showConfirmDialog(rootPane,"Voulez-vous supprimer cet article  ?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                     
                     con.updateData(query);
                     tblUpdate1();
                     tbUpdate(); 
                     numArticleCashe2.setText("");
                     inputQtSortie.setValue(0);
                     pv.setText("");
                  }
              
            } catch (Exception e) {
            }
            
        }else
        {
            JOptionPane.showMessageDialog(rootPane,"Veillez utiliser le bouton spécifique !");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String q=(String) jComboBox1.getSelectedItem(); 
        TableRowSorter<DefaultTableModel> tbRs=new TableRowSorter<DefaultTableModel>(tbl);
        jTable1.setRowSorter(tbRs);
        tbRs.setRowFilter(RowFilter.regexFilter(q));
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selected=jTable1.getSelectedRow();
        
        int numero=Integer.parseInt(jTable1.getValueAt(selected,0).toString());
        String cashe=jTable1.getValueAt(selected,0).toString();
        String nom=jTable1.getValueAt(selected,1).toString();
        int qt=Integer.parseInt(jTable1.getValueAt(selected,2).toString());
        String mesureset=jTable1.getValueAt(selected,3).toString();
        String pu=jTable1.getValueAt(selected,4).toString();
        String option=jTable1.getValueAt(selected,5).toString();
        Date date=DateUtil.parseYYYYMMDDDate(jTable1.getValueAt(selected,7).toString());
        String stock=jTable1.getValueAt(selected,6).toString();
        
        if(option.equals("Entree"))
        {
            
            if(stock.equals("Stock 1"))
            {
                numArticleCashe1.setText(cashe);
                inputNumNouv.setValue(numero);
                inputNomNouv.setText(nom);
                mesure.setText(mesureset);
                comboExiste.setSelectedItem(nom);
                inputPU.setText(pu);
                inputqt.setValue(qt);
                radiostock1.setSelected(true);
                radiostock2.setSelected(false);
                inputDateEntree.setDate(date);
                String query="select num_entree,quantite_initial from tb_entrees  where num_produit="+numero+" and quantite="+qt+"  and pu="+pu+" and stock='"+stock+"' and date_entree='"+((JTextField)inputDateEntree.getDateEditor().getUiComponent()).getText()+"' ";
                
                try {
                    
                      rs=con.extaireData(query);
                      while(rs.next()){
                          num_entree.setText(rs.getString("num_entree"));
                          qt_initial.setText(rs.getString("quantite_initial"));
                          
                      }
                      
                } catch (Exception e) {
                }
                
                
                
            }
                
             if(stock.equals("Stock 2"))
             {
                numArticleCashe1.setText(cashe);
                inputNumNouv.setValue(numero);
                inputNomNouv.setText(nom);
                mesure.setText(mesureset);
                comboExiste.setSelectedItem(nom);
                inputqt.setValue(qt);
                inputPU.setText(pu);
                radiostock2.setSelected(true);
                radiostock1.setSelected(false);
                inputDateEntree.setDate(date);  
                 
                 try {
                      String query="select num_entree,quantite_initial from tb_entrees  where num_produit="+numero+" and quantite="+qt+"  and pu="+pu+" and stock='"+stock+"' and date_entree='"+((JTextField)inputDateEntree.getDateEditor().getUiComponent()).getText()+"' ";
                      rs=con.extaireData(query);
                      while(rs.next()){
                          num_entree.setText(rs.getString("num_entree"));
                          qt_initial.setText(rs.getString("quantite_initial"));
                          
                      }
                      
                } catch (Exception e) {
                }
                
                 
             }
        }
        
        
        if(option.equals("Sortie"))
        {
            if(stock.equals("Stock 1"))
            {
                
               numArticleCashe2.setText(cashe);
               comboSortie.setSelectedItem(nom);
               inputQtSortie.setValue(qt);
               pv.setText(pu);
               inputDateSortie.setDate(date);
               radioSortieStock1.setSelected(true);
               radioSortieStock2.setSelected(false);
               
                try {
                    
                    String query="select num_sortie from tb_sorties where num_produit="+numero+" and qt_sortie="+qt+" and pv="+pu+" and stock='"+stock+"' and date_sortie='"+((JTextField)inputDateSortie.getDateEditor().getUiComponent()).getText()+"' ";
                    rs=con.extaireData(query);
                    while(rs.next()){
                        num_sortie.setText(rs.getString("num_sortie"));
                        
                    }
                
                } catch (Exception e) {
                }
            }
                
             if(stock.equals("Stock 2"))
             {
               numArticleCashe2.setText(cashe);
               comboSortie.setSelectedItem(nom);
               inputQtSortie.setValue(qt);
               pv.setText(pu);
               inputDateSortie.setDate(date);
               radioSortieStock2.setSelected(true);
               radioSortieStock1.setSelected(false); 
               
                try {
                    
                    String query="select num_sortie from tb_sorties where num_produit="+numero+" and qt_sortie="+qt+" and pv="+pu+" and stock='"+stock+"' and date_sortie='"+((JTextField)inputDateSortie.getDateEditor().getUiComponent()).getText()+"' ";
                    rs=con.extaireData(query);
                    while(rs.next()){
                        num_sortie.setText(rs.getString("num_sortie"));
                        
                    }
                
                } catch (Exception e) {
                }
             }
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeInvisible
      
    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeInvisible

    private void jComboBox2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseEntered
        
    }//GEN-LAST:event_jComboBox2MouseEntered

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        String q=(String) jComboBox2.getSelectedItem();
        TableRowSorter<DefaultTableModel> tbRs=new TableRowSorter<DefaultTableModel>(tbl);
        jTable1.setRowSorter(tbRs);
        tbRs.setRowFilter(RowFilter.regexFilter(q));
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void inputFiltreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputFiltreFocusGained
        if(inputFiltre.getText().equals("Rechercher"))
        {
            inputFiltre.setText("");
            inputFiltre.setForeground(Color.black);
            
        }
    }//GEN-LAST:event_inputFiltreFocusGained

    private void inputFiltreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputFiltreFocusLost
        if(inputFiltre.getText().equals(""))
        {
            inputFiltre.setText("Rechercher");
            inputFiltre.setForeground(new Color(153, 153, 153));
           
        }
    }//GEN-LAST:event_inputFiltreFocusLost

    private void inputFiltreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFiltreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFiltreActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(numArticleCashe2.getText().isEmpty() || inputQtSortie.getValue()<=0 || pv.getText().isEmpty() || ((JTextField)inputDateSortie.getDateEditor().getUiComponent()).getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Veillez remplir tous les champs ! ");
        }
          else{
            String query="insert into tb_sorties(num_produit,qt_sortie,pv,stock,date_sortie) values ("+numArticleCashe2.getText()+","+inputQtSortie.getValue()+","+pv.getText()+",'"+stck2+"','"+((JTextField)inputDateSortie.getDateEditor().getUiComponent()).getText()+"')";
            con.updateData(query);
            tblUpdate1();
            tbUpdate();
            numArticleCashe2.setText("");
            inputQtSortie.setValue(0);
            pv.setText("");
            
          }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void comboExisteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboExisteItemStateChanged
        
    }//GEN-LAST:event_comboExisteItemStateChanged

    private void inputqtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputqtMouseClicked
        
    }//GEN-LAST:event_inputqtMouseClicked

    private void inputqtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputqtMouseEntered
        
    }//GEN-LAST:event_inputqtMouseEntered

    private void qt_initialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qt_initialFocusGained
        if(qt_initial.getText().equals("Qt initial")){
            qt_initial.setText("");
            qt_initial.setForeground(Color.black);
            
        }
    }//GEN-LAST:event_qt_initialFocusGained

    private void qt_initialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qt_initialFocusLost
        if(qt_initial.getText().equals("")){
            qt_initial.setText("Qt initial");
            qt_initial.setForeground(new Color(153, 153 ,153 ));
            
        }
    }//GEN-LAST:event_qt_initialFocusLost

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Stock1 t=new Stock1();
        t.setLocationRelativeTo(this);
        pack();
        t.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Magazin m=new Magazin();
        m.setLocationRelativeTo(this);
        pack();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane,"Voulez-vous modifier cet article  ?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){ 
            
          if(numArticleCashe2.getText().isEmpty() || inputQtSortie.getValue()<=0 || pv.getText().isEmpty() || ((JTextField)inputDateSortie.getDateEditor().getUiComponent()).getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Veillez remplir tous les champs ! ");
           }else{
             
             String query="update tb_sorties set num_produit="+numArticleCashe2.getText()+",qt_sortie="+inputQtSortie.getValue()+",pv="+pv.getText()+",stock='"+stck2+"',date_sortie='"+((JTextField)inputDateSortie.getDateEditor().getUiComponent()).getText()+"' where num_sortie="+num_sortie.getText()+"";
             try {
                  con.updateData(query);
                  tblUpdate1();
                  tbUpdate();
                  numArticleCashe2.setText("");
                  inputQtSortie.setValue(0);
                  pv.setText("");
                  
             } catch (Exception e) {
             }
         }
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        login l=new login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void pvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pvActionPerformed
    private void Imagetitle()
     {
      setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon-dashboard-9.png")));
     }
   
        private void tbUpdate()
        {
          //String query="select numero_prod,nom_prod,quantite from tb_produit,tb_entrees where numero_prod not in (select num_produit from tb_sorties) and numero_prod=tb_entrees.num_produit group by numero_prod desc ; ";
          String query="select numero_prod,nom_prod,quantite,unite_de_mesure,pu,stock,date_entree from tb_produit,tb_entrees where numero_prod=num_produit order by date_entree desc ";
          try {
           rs=con.extaireData(query);
           while(rs.next())
            {
               tbl.addRow(new Object[]{
             rs.getString("numero_prod"),
             rs.getString("nom_prod"),
             rs.getString("quantite"),
             rs.getString("unite_de_mesure"),
             rs.getString("pu"),
             ("Entree"),
             rs.getString("stock"),         
             rs.getString("date_entree")
          
             });
          }
    } catch (Exception e) {
    }
}
         private void tblUpdate1()
    {
    //String query="select numero_prod,nom_prod,quantite-qt_sortie as 'stock_initial',quantite,qt_sortie,quantite-qt_sortie as 'S.F'  from tb_entrees,tb_produit,tb_sorties where numero_prod=tb_entrees.num_produit and tb_entrees.num_produit=tb_sorties.num_produit group by numero_prod ";
      String query="select numero_prod,nom_prod,qt_sortie,unite_de_mesure,pv,t3.stock,date_sortie from tb_produit t1 join tb_entrees t2 on numero_prod=t2.num_produit join tb_sorties t3 on t2.num_produit=t3.num_produit group by num_sortie desc; ";
       try {
        
          rs=con.extaireData(query);
          tbl.setRowCount(0);
          while(rs.next())
          {
             tbl.addRow(new Object[]{
             rs.getString("numero_prod"),
             rs.getString("nom_prod"),
             rs.getString("qt_sortie"),
             rs.getString("unite_de_mesure"),
             rs.getString("pv"),
             ("Sortie"),
             rs.getString("t3.stock"), 
             rs.getString("date_sortie")
          
             });
           }
          
           } catch (Exception e) {
        
             } 
    
         }

 private void combo1Update()
    {
        String query="select distinct nom_prod  as 'nom' from  tb_produit";
        
        try {
              rs=con.extaireData(query);
              comboExiste.removeAllItems();
              comboSortie.removeAllItems();
              while(rs.next())
              {
                  comboExiste.addItem(rs.getString("nom"));
                  comboSortie.addItem(rs.getString("nom"));
              }
        } catch (Exception e) {
        }
    }
public void numeroCashe(String nom,JLabel l)
{
    String query="select numero_prod from tb_produit where nom_prod='"+nom+"' order by numero_prod desc";
    try {
          rs=con.extaireData(query);
          while(rs.next())
          {
              l.setText(rs.getString("numero_prod"));
              
          }
    } catch (Exception e) {
    }
}
public void filtrer(String filtra){
    TableRowSorter<DefaultTableModel> tbRs=new TableRowSorter<DefaultTableModel>(tbl);
    jTable1.setRowSorter(tbRs);
    tbRs.setRowFilter(RowFilter.regexFilter(filtra));

}



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        new Management().setVisible(true);
         /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Management().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> comboExiste;
    private javax.swing.JComboBox<String> comboSortie;
    private com.toedter.calendar.JDateChooser inputDateEntree;
    private com.toedter.calendar.JDateChooser inputDateSortie;
    private javax.swing.JTextField inputFiltre;
    private javax.swing.JTextField inputNomNouv;
    private com.toedter.components.JSpinField inputNumNouv;
    private javax.swing.JTextField inputPU;
    private com.toedter.components.JSpinField inputQtSortie;
    private com.toedter.components.JSpinField inputqt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mesure;
    private javax.swing.JLabel numArticleCashe1;
    private javax.swing.JLabel numArticleCashe2;
    private javax.swing.JLabel num_entree;
    private javax.swing.JLabel num_sortie;
    private javax.swing.JTextField pv;
    private javax.swing.JTextField qt_initial;
    private javax.swing.JRadioButton radioExiste;
    private javax.swing.JRadioButton radioNouveau;
    private javax.swing.JRadioButton radioSortieStock1;
    private javax.swing.JRadioButton radioSortieStock2;
    private javax.swing.JRadioButton radiostock1;
    private javax.swing.JRadioButton radiostock2;
    // End of variables declaration//GEN-END:variables
}
