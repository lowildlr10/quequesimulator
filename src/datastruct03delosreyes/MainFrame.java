
package datastruct03delosreyes;

import javax.swing.JOptionPane;

/**
 *
 * @author  Lowil Ray C. Delos Reyes
 */
public class MainFrame extends javax.swing.JFrame {
    private QueueProcess qClass = new QueueProcess();
    
    public MainFrame() {
        initComponents();
        this.setTitle("DATASTRUCT03: QUEUE SIMULATION");
        this.btnSimulate.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        list01 = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        list02 = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        weight = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        Input = new javax.swing.JTextField();
        btnSimulate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        btnClose.setBackground(new java.awt.Color(153, 153, 153));
        btnClose.setForeground(new java.awt.Color(0, 51, 153));
        btnClose.setText("EXIT");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel2.setText("QUEUE 1 DISPLAY:");

        btnClear.setBackground(new java.awt.Color(153, 153, 153));
        btnClear.setForeground(new java.awt.Color(0, 51, 153));
        btnClear.setText("CLEAR");
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        list01.setBackground(new java.awt.Color(0, 0, 0));
        list01.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        list01.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(list01);

        list02.setBackground(new java.awt.Color(0, 0, 0));
        list02.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        list02.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(list02);

        jLabel4.setText("QUEUE 2 DISPLAY:");

        weight.setBackground(new java.awt.Color(102, 102, 102));
        weight.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        weight.setForeground(new java.awt.Color(255, 255, 255));
        weight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        weight.setEnabled(false);

        btnInsert.setBackground(new java.awt.Color(153, 153, 153));
        btnInsert.setForeground(new java.awt.Color(0, 51, 153));
        btnInsert.setText("CONFIRM");
        btnInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        Input.setBackground(new java.awt.Color(204, 204, 204));
        Input.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnSimulate.setBackground(new java.awt.Color(153, 153, 153));
        btnSimulate.setForeground(new java.awt.Color(0, 51, 153));
        btnSimulate.setText("SIMULATE");
        btnSimulate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimulateActionPerformed(evt);
            }
        });

        jLabel1.setText("ENTER ANY VALUE:");

        jLabel3.setText("SIZE OF QUEUE:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Input))
                    .addComponent(btnSimulate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(weight)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Input)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSimulate)
                .addContainerGap())
        );

        jMenu1.setText("FILE");

        menuExit.setText("EXIT");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("HELP");

        menuAbout.setText("ABOUT");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        jMenu2.add(menuAbout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
    System.exit(0);
}//GEN-LAST:event_btnCloseActionPerformed

private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
    String str = this.Input.getText();
    
    if (str.isEmpty()){
        JOptionPane.showMessageDialog(null, "ENTER ANY VALUE.",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
    }else {
        qClass.get_Input(str);
        this.Input.setText("");
        list01.setListData(qClass.ShowQueue01().toArray());
        this.btnSimulate.setVisible(true);
        this.weight.setText(qClass.InitialQueueCount() + "");
    }
    
}//GEN-LAST:event_btnInsertActionPerformed

    private void btnSimulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimulateActionPerformed
        if ("0".equals(qClass.InitialQueueCount())){
            JOptionPane.showMessageDialog(null, "NOTHING TO SIMULATE.",
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }else {
            list01.setListData(qClass.ShowQueue01().toArray());
            list02.setListData(qClass.ShowQueue02().toArray());

            qClass.QueueSimulate();
        }
        
    }//GEN-LAST:event_btnSimulateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        qClass.ClearAll();
        this.Input.setText("");
        this.weight.setText("");
        this.btnSimulate.setVisible(false);
        list01.setListData(qClass.ShowQueue01().toArray());
        list02.setListData(qClass.ShowQueue02().toArray());
        JOptionPane.showMessageDialog(null, "ALL CLEARED.",
                    "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnClearActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        JOptionPane.showMessageDialog(null, "CREATED BY LOWIL RAY C. DELOS REYES.",
                    "ABOUT", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuAboutActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Input;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSimulate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList list01;
    private javax.swing.JList list02;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables

}
