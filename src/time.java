import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Kamboj
 */
public class time extends javax.swing.JFrame {

    /**
     * Creates new form time
     */
    public time() {
        initComponents();
        init();
        ntf.setVisible(false);
    }

    public void init() {
        setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        s_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        s_tx = new javax.swing.JTextField();
        vat = new javax.swing.JTextField();
        imprt = new javax.swing.JTextField();
        xprt = new javax.swing.JTextField();
        wght = new javax.swing.JTextField();
        dstnc = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        modify = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        search = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        back = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        ntf = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pymntmd = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ins = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Time Management System");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 2, true));
        jPanel1.setToolTipText("Time Management System");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Uttam Nagar, New Delhi");
        jLabel2.setToolTipText("Uttam Nagar, New Delhi");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel9.setFont(new java.awt.Font("Magneto", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Time Management System");
        jLabel9.setToolTipText("Time Management System");
        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Brush Script MT", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 0));
        jLabel3.setText("Service Tax ID");
        jLabel3.setToolTipText("Service Tax ID");

        s_id.setFont(new java.awt.Font("Baskerville Old Face", 1, 12)); // NOI18N
        s_id.setForeground(new java.awt.Color(0, 102, 102));
        s_id.setToolTipText("Enter Your Service Tax ID");

        jLabel4.setFont(new java.awt.Font("Brush Script MT", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 0));
        jLabel4.setText("Service Tax");
        jLabel4.setToolTipText("Service Tax");

        jLabel5.setFont(new java.awt.Font("Brush Script MT", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 0));
        jLabel5.setText("VAT");
        jLabel5.setToolTipText("VAT");

        jLabel6.setFont(new java.awt.Font("Brush Script MT", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 0));
        jLabel6.setText("Export Charge");
        jLabel6.setToolTipText("Export Charge");

        jLabel7.setFont(new java.awt.Font("Brush Script MT", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 0));
        jLabel7.setText("Import Charge");
        jLabel7.setToolTipText("Import Charge");

        jLabel8.setFont(new java.awt.Font("Brush Script MT", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 0));
        jLabel8.setText("Weight");
        jLabel8.setToolTipText("Weight");

        jLabel10.setFont(new java.awt.Font("Brush Script MT", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 0));
        jLabel10.setText("Distance");
        jLabel10.setToolTipText("Distance");

        s_tx.setFont(new java.awt.Font("Baskerville Old Face", 1, 12)); // NOI18N
        s_tx.setForeground(new java.awt.Color(0, 102, 102));
        s_tx.setToolTipText("Enter Your Service Tax Amount");

        vat.setFont(new java.awt.Font("Baskerville Old Face", 1, 12)); // NOI18N
        vat.setForeground(new java.awt.Color(0, 102, 102));
        vat.setToolTipText("Enter Your VAT Amount");

        imprt.setFont(new java.awt.Font("Baskerville Old Face", 1, 12)); // NOI18N
        imprt.setForeground(new java.awt.Color(0, 102, 102));
        imprt.setToolTipText("Enter Your Import Charge's");

        xprt.setFont(new java.awt.Font("Baskerville Old Face", 1, 12)); // NOI18N
        xprt.setForeground(new java.awt.Color(0, 102, 102));
        xprt.setToolTipText("Enter Your Export Charge's");

        wght.setFont(new java.awt.Font("Baskerville Old Face", 1, 12)); // NOI18N
        wght.setForeground(new java.awt.Color(0, 102, 102));
        wght.setToolTipText("Enter Your Weight");

        dstnc.setFont(new java.awt.Font("Baskerville Old Face", 1, 12)); // NOI18N
        dstnc.setForeground(new java.awt.Color(0, 102, 102));
        dstnc.setToolTipText("Enter Your Distance");

        submit.setFont(new java.awt.Font("Script MT Bold", 3, 16)); // NOI18N
        submit.setForeground(new java.awt.Color(75, 51, 0));
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ins.png"))); // NOI18N
        submit.setToolTipText("Submit Your Record");
        submit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 204, 255), new java.awt.Color(0, 255, 204)));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        modify.setFont(new java.awt.Font("Script MT Bold", 3, 16)); // NOI18N
        modify.setForeground(new java.awt.Color(75, 51, 0));
        modify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/modify.png"))); // NOI18N
        modify.setToolTipText("Modify Your Record");
        modify.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 204, 255), new java.awt.Color(0, 255, 204)));
        modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyActionPerformed(evt);
            }
        });

        remove.setFont(new java.awt.Font("Script MT Bold", 3, 16)); // NOI18N
        remove.setForeground(new java.awt.Color(75, 51, 0));
        remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/remove.png"))); // NOI18N
        remove.setToolTipText("Remove Your Record");
        remove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 204, 255), new java.awt.Color(0, 255, 204)));
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Script MT Bold", 3, 16)); // NOI18N
        search.setForeground(new java.awt.Color(75, 51, 0));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searchp.png"))); // NOI18N
        search.setToolTipText("Search Your Record");
        search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 204, 255), new java.awt.Color(0, 255, 204)));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Script MT Bold", 3, 16)); // NOI18N
        clear.setForeground(new java.awt.Color(75, 51, 0));
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear.png"))); // NOI18N
        clear.setToolTipText("Clear All Inputs");
        clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 204, 255), new java.awt.Color(0, 255, 204)));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Script MT Bold", 3, 16)); // NOI18N
        back.setForeground(new java.awt.Color(75, 51, 0));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        back.setToolTipText("Exit");
        back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 204, 255), new java.awt.Color(0, 255, 204)));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        print.setFont(new java.awt.Font("Script MT Bold", 3, 16)); // NOI18N
        print.setForeground(new java.awt.Color(75, 51, 0));
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/print.png"))); // NOI18N
        print.setToolTipText("Print The Information");
        print.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 204, 255), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 204, 255), new java.awt.Color(0, 255, 204)));
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tmng.jpg"))); // NOI18N
        jLabel11.setToolTipText("Time");

        ntf.setFont(new java.awt.Font("Brush Script MT", 3, 18)); // NOI18N
        ntf.setForeground(new java.awt.Color(102, 0, 0));
        ntf.setText("Notifications");
        ntf.setToolTipText("Notification");

        jLabel12.setFont(new java.awt.Font("Brush Script MT", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 0));
        jLabel12.setText("Payment Mode");
        jLabel12.setToolTipText("Payment Mode");

        pymntmd.setFont(new java.awt.Font("Baskerville Old Face", 1, 12)); // NOI18N
        pymntmd.setForeground(new java.awt.Color(0, 102, 102));
        pymntmd.setToolTipText("Enter Your Payment Mode");

        jLabel13.setFont(new java.awt.Font("Brush Script MT", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 0));
        jLabel13.setText("Insurance");
        jLabel13.setToolTipText("Insurance");

        ins.setFont(new java.awt.Font("Baskerville Old Face", 1, 12)); // NOI18N
        ins.setForeground(new java.awt.Color(0, 102, 102));
        ins.setToolTipText("Enter Your Insurance Amount");

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESOURCE MAINTENANCE & MANAGEMENT");
        jLabel1.setToolTipText("RESOURCE MAINTENANCE & MANAGEMENT");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(51, 0, 102))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(459, 27));
        jLabel1.setMinimumSize(new java.awt.Dimension(469, 27));
        jLabel1.setPreferredSize(new java.awt.Dimension(469, 27));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(363, 363, 363)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(297, 297, 297)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(101, 101, 101)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pymntmd, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dstnc, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(wght, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imprt, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(xprt, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vat, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s_tx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ins, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(ntf, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(modify, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(347, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(s_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(print))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s_tx, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(vat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(xprt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(imprt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(wght, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(dstnc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(pymntmd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ins, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modify)
                    .addComponent(submit)
                    .addComponent(remove)
                    .addComponent(search)
                    .addComponent(clear)
                    .addComponent(back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ntf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String sid,stx,vt,xpt,impt,wgt,dt,pymnt,in;
        sid=s_id.getText();
        stx=s_tx.getText();
        vt=vat.getText();
        xpt=xprt.getText();
        impt=imprt.getText();
        wgt=wght.getText();
        dt=dstnc.getText();
        pymnt=pymntmd.getText();
        in=ins.getText();
        if((sid!="")&&(stx!="")&&(vt!="")&&(xpt!="")&&(impt!="")&&(wgt!="")&&(dt!="")&&(pymnt!="")&&(in!="")){
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","resourcem","resourcem");
                Statement stmt=con.createStatement();
                int a=stmt.executeUpdate("insert into TIME_FILE values('"+sid+"','"+stx+"','"+vt+"','"+xprt+"','"+impt+"','"+wgt+"','"+dt+"','"+pymnt+"','"+in+"')");
                con.close();
                ntf.setVisible(true);
                ntf.setText("Record Successfully Inserted...!!");
                s_id.setText("");
                s_tx.setText("");
                vat.setText("");
                xprt.setText("");
                imprt.setText("");
                wght.setText("");
                dstnc.setText("");
            }catch(Exception e){
                e.printStackTrace();
                ntf.setVisible(true);
                ntf.setText("An Error Has Been Occurred While Inserting The Record...!!");
            }
        }else{
            ntf.setVisible(true);
            ntf.setText("Some of the Given Fields is Empty.Please Fill them Properly and Try Again Later...!!");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed
        String sid,stx,vt,xpt,impt,wgt,dt,pymnt,in;
        sid=s_id.getText();
        stx=s_tx.getText();
        vt=vat.getText();
        xpt=xprt.getText();
        impt=imprt.getText();
        wgt=wght.getText();
        dt=dstnc.getText();
        pymnt=pymntmd.getText();
        in=ins.getText();
        if((sid!="")&&(stx!="")&&(vt!="")&&(xpt!="")&&(impt!="")&&(wgt!="")&&(dt!="")&&(pymnt!="")&&(in!="")){
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","resourcem","resourcem");
                Statement stmt=con.createStatement();
                int a=stmt.executeUpdate("update TIME_FILE set S_TX='"+stx+"',VAT='"+vt+"',E_CHRG='"+xpt+"',I_CHRG='"+imprt+"',WGHT='"+wgt+"',DSTNC='"+dt+"',P_MODE='"+pymnt+"',INS='"+in+"' where S_ID='"+sid+"' ");
                con.close();
                ntf.setVisible(true);
                ntf.setText("Record Successfully Modified...!!");
                s_id.setText("");
                s_tx.setText("");
                vat.setText("");
                xprt.setText("");
                imprt.setText("");
                wght.setText("");
                dstnc.setText("");
            }catch(Exception e){
                //e.printStackTrace();
                ntf.setVisible(true);
                ntf.setText("An Error Has Been Occurred While Modifying The Record...!!");
            }
        }else{
            ntf.setVisible(true);
            ntf.setText("Some of the Given Field's is Empty.Please Fill them Properly and Try Again Later...!!");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_modifyActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        String sid=s_id.getText();
        if(sid!=""){
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","resourcem","resourcem");
                Statement stmt=con.createStatement();
                int a=stmt.executeUpdate("delete from TIME_FILE where S_ID='"+sid+"'");
                ntf.setVisible(true);
                ntf.setText("Record Successfully Removed...!!");
                s_id.setText("");
                s_tx.setText("");
                vat.setText("");
                xprt.setText("");
                imprt.setText("");
                wght.setText("");
                dstnc.setText("");
                pymntmd.setText("");
                ins.setText("");
                con.close();
            }catch(Exception e){
                e.printStackTrace();
                ntf.setVisible(true);
                ntf.setText("An Error Has Been Occurred While Removing The Reocrd...!!");
            }
        }else{
            ntf.setVisible(true);
            ntf.setText("Plese Enter the Customer ID First...!!");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_removeActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String pid=s_id.getText();
        if(pid!=""){
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","resourcem","resourcem");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from CLIENT where P_ID='"+pid+"'");
                if(rs.next()){
                    ntf.setVisible(true);
                    ntf.setText("Record is Available...!!");
                    s_tx.setText(rs.getString(5));
                    vat.setText(rs.getString(2));
                    xprt.setText(rs.getString(4));
                    imprt.setText(rs.getString(3));
                    wght.setText(rs.getString(6));
                    dstnc.setText(rs.getString(7));
                }else{
                    ntf.setVisible(true);
                    ntf.setText("Record isn't Available...!!");
                }
                con.close();
            }catch(Exception e){
                e.printStackTrace();
                ntf.setVisible(true);
                ntf.setText("An Error Has Been Occurred While Searching The Record...!!");
            }
        }else{
            ntf.setVisible(true);
            ntf.setText("Please Enter the Customer ID First...!!");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        s_id.setText("");
        s_tx.setText("");
        vat.setText("");
        xprt.setText("");
        imprt.setText("");
        wght.setText("");
        dstnc.setText("");
        pymntmd.setText("");
        ins.setText("");
        ntf.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        main obj231=new main();
        obj231.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        ntf.setVisible(true);
        ntf.setText("Please First Installed The Printer With Software...!!");
        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed

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
            java.util.logging.Logger.getLogger(time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new time().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JTextField dstnc;
    private javax.swing.JTextField imprt;
    private javax.swing.JTextField ins;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton modify;
    private javax.swing.JLabel ntf;
    private javax.swing.JButton print;
    private javax.swing.JTextField pymntmd;
    public javax.swing.JButton remove;
    private javax.swing.JTextField s_id;
    private javax.swing.JTextField s_tx;
    public javax.swing.JButton search;
    public javax.swing.JButton submit;
    private javax.swing.JTextField vat;
    private javax.swing.JTextField wght;
    private javax.swing.JTextField xprt;
    // End of variables declaration//GEN-END:variables
}
