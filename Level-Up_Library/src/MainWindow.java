
import javax.swing.ImageIcon;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dylan
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebarScroll = new javax.swing.JScrollPane();
        sidebarInner = new javax.swing.JPanel();
        searchMenu1 = new SearchMenu();
        filterLabel = new javax.swing.JLabel();
        classificationMenu1 = new ClassificationMenu();
        mACLMenu1 = new MACLMenu();
        ratingMenu1 = new RatingMenu();
        statusMenu1 = new StatusMenu();
        yearMenu1 = new YearMenu();
        tabs = new javax.swing.JTabbedPane();
        gameEntriesScroll = new javax.swing.JScrollPane();
        gameEntriesInner = new javax.swing.JPanel();
        gameEntry1 = new GameEntry();
        titleBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveOption = new javax.swing.JMenuItem();
        loadOption = new javax.swing.JMenuItem();
        quitOption = new javax.swing.JMenuItem();
        gameMenu = new javax.swing.JMenu();
        addOption = new javax.swing.JMenuItem();
        updateOption = new javax.swing.JMenuItem();
        removeOption = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        docsOption = new javax.swing.JMenuItem();
        manualOption = new javax.swing.JMenuItem();
        aboutOption = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Level-Up Library - Main Window");
        setMinimumSize(new java.awt.Dimension(918, 446));
        setName("MainWIndow"); // NOI18N

        sidebarScroll.getVerticalScrollBar().setUnitIncrement(10);
        sidebarScroll.setBackground(new java.awt.Color(113, 119, 122));
        sidebarScroll.setBorder(null);
        sidebarScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sidebarScroll.setToolTipText("");
        sidebarScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        sidebarScroll.setHorizontalScrollBar(null);

        sidebarInner.setLayout(new org.jdesktop.swingx.VerticalLayout());
        sidebarInner.add(searchMenu1);

        filterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filterLabel.setText("Filters");
        filterLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sidebarInner.add(filterLabel);
        sidebarInner.add(classificationMenu1);
        sidebarInner.add(mACLMenu1);
        sidebarInner.add(ratingMenu1);
        sidebarInner.add(statusMenu1);
        sidebarInner.add(yearMenu1);

        sidebarScroll.setViewportView(sidebarInner);

        gameEntriesScroll.getVerticalScrollBar().setUnitIncrement(16);
        gameEntriesScroll.setBorder(null);
        gameEntriesScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        gameEntriesScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        gameEntriesInner.setLayout(new org.jdesktop.swingx.VerticalLayout());
        gameEntriesInner.add(gameEntry1);

        gameEntriesScroll.setViewportView(gameEntriesInner);

        tabs.addTab("tab1", gameEntriesScroll);

        fileMenu.setText("File");

        saveOption.setText("Save");
        fileMenu.add(saveOption);

        loadOption.setText("Load");
        fileMenu.add(loadOption);

        quitOption.setText("Quit");
        quitOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitOptionActionPerformed(evt);
            }
        });
        fileMenu.add(quitOption);

        titleBar.add(fileMenu);

        gameMenu.setText("Game");

        addOption.setText("Add New");
        gameMenu.add(addOption);

        updateOption.setText("Update Data");
        gameMenu.add(updateOption);

        removeOption.setText("Remove");
        gameMenu.add(removeOption);

        titleBar.add(gameMenu);

        helpMenu.setText("Help");

        docsOption.setText("Online Documentation");
        helpMenu.add(docsOption);

        manualOption.setText("Offline Manual");
        helpMenu.add(manualOption);

        aboutOption.setText("About");
        helpMenu.add(aboutOption);

        titleBar.add(helpMenu);

        setJMenuBar(titleBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebarScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebarScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
            .addComponent(tabs)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitOptionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitOptionActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutOption;
    private javax.swing.JMenuItem addOption;
    private ClassificationMenu classificationMenu1;
    private javax.swing.JMenuItem docsOption;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel filterLabel;
    private javax.swing.JPanel gameEntriesInner;
    private javax.swing.JScrollPane gameEntriesScroll;
    private GameEntry gameEntry1;
    private javax.swing.JMenu gameMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem loadOption;
    private MACLMenu mACLMenu1;
    private javax.swing.JMenuItem manualOption;
    private javax.swing.JMenuItem quitOption;
    private RatingMenu ratingMenu1;
    private javax.swing.JMenuItem removeOption;
    private javax.swing.JMenuItem saveOption;
    private SearchMenu searchMenu1;
    private javax.swing.JPanel sidebarInner;
    private javax.swing.JScrollPane sidebarScroll;
    private StatusMenu statusMenu1;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JMenuBar titleBar;
    private javax.swing.JMenuItem updateOption;
    private YearMenu yearMenu1;
    // End of variables declaration//GEN-END:variables
}
