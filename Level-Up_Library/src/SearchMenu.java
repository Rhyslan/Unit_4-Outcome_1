
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author dylan
 */
public class SearchMenu extends javax.swing.JPanel {

    /**
     * Creates new form SearchPane
     */
    public SearchMenu() {
        initComponents();
    }
    
    public ImageIcon expandedIcon = new ImageIcon("src/assets/Expanded.png");
    public ImageIcon collapsedIcon = new ImageIcon("src/assets/Collapsed.png");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        advancedSearchCategory = new javax.swing.ButtonGroup();
        searchToggle = new javax.swing.JButton();
        searchPane = new javax.swing.JPanel();
        searchQuery = new javax.swing.JTextField();
        searchConfirm = new javax.swing.JButton();
        advancedToggle = new javax.swing.JButton();
        advancedSearchPane = new javax.swing.JPanel();
        advancedCategory = new javax.swing.JLabel();
        titleSearchCategory = new javax.swing.JRadioButton();
        notesSearchCategory = new javax.swing.JRadioButton();
        searchExactMatch = new javax.swing.JCheckBox();

        searchToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Expanded.png"))); // NOI18N
        searchToggle.setText("Search");
        searchToggle.setBorderPainted(false);
        searchToggle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        searchToggle.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        searchToggle.setIconTextGap(52);
        searchToggle.setMinimumSize(new java.awt.Dimension(193, 23));
        searchToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchToggleActionPerformed(evt);
            }
        });

        searchPane.setBackground(new java.awt.Color(255, 0, 0));

        searchQuery.setText("Search Text");

        searchConfirm.setText("Search");

        advancedToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Expanded.png"))); // NOI18N
        advancedToggle.setText("Advanced");
        advancedToggle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        advancedToggle.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        advancedToggle.setIconTextGap(40);
        advancedToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedToggleActionPerformed(evt);
            }
        });

        advancedSearchPane.setBackground(new java.awt.Color(0, 0, 255));

        advancedCategory.setText("Category:");

        advancedSearchCategory.add(titleSearchCategory);
        titleSearchCategory.setSelected(true);
        titleSearchCategory.setText("Title");

        advancedSearchCategory.add(notesSearchCategory);
        notesSearchCategory.setText("Notes");

        searchExactMatch.setText("Exact Match");
        searchExactMatch.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout advancedSearchPaneLayout = new javax.swing.GroupLayout(advancedSearchPane);
        advancedSearchPane.setLayout(advancedSearchPaneLayout);
        advancedSearchPaneLayout.setHorizontalGroup(
            advancedSearchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advancedSearchPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(advancedSearchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(advancedCategory)
                    .addComponent(titleSearchCategory)
                    .addComponent(notesSearchCategory)
                    .addComponent(searchExactMatch))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        advancedSearchPaneLayout.setVerticalGroup(
            advancedSearchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advancedSearchPaneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(advancedCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleSearchCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notesSearchCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchExactMatch)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout searchPaneLayout = new javax.swing.GroupLayout(searchPane);
        searchPane.setLayout(searchPaneLayout);
        searchPaneLayout.setHorizontalGroup(
            searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPaneLayout.createSequentialGroup()
                .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPaneLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(searchQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchConfirm)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(searchPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(advancedSearchPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(advancedToggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        searchPaneLayout.setVerticalGroup(
            searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPaneLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchConfirm))
                .addGap(32, 32, 32)
                .addComponent(advancedToggle)
                .addGap(5, 5, 5)
                .addComponent(advancedSearchPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchToggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchToggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchToggleActionPerformed
        searchPane.setVisible(!searchPane.isVisible());
        if (searchPane.isVisible()) {
            searchToggle.setIcon(expandedIcon);
        } else {
            searchToggle.setIcon(collapsedIcon);
        }
    }//GEN-LAST:event_searchToggleActionPerformed

    private void advancedToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advancedToggleActionPerformed
        advancedSearchPane.setVisible(!advancedSearchPane.isVisible());
        if (advancedSearchPane.isVisible()) {
            advancedToggle.setIcon(expandedIcon);
        } else {
            advancedToggle.setIcon(collapsedIcon);
        }
    }//GEN-LAST:event_advancedToggleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advancedCategory;
    private javax.swing.ButtonGroup advancedSearchCategory;
    private javax.swing.JPanel advancedSearchPane;
    private javax.swing.JButton advancedToggle;
    private javax.swing.JRadioButton notesSearchCategory;
    private javax.swing.JButton searchConfirm;
    private javax.swing.JCheckBox searchExactMatch;
    private javax.swing.JPanel searchPane;
    private javax.swing.JTextField searchQuery;
    private javax.swing.JButton searchToggle;
    private javax.swing.JRadioButton titleSearchCategory;
    // End of variables declaration//GEN-END:variables
}
