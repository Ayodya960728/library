/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.library.view;

import edu.ijse.library.controller.CategoryController;
import edu.ijse.library.dto.CategoryDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class CategoryView extends javax.swing.JFrame {
    
    private final CategoryController categoryController;
    private CategoryDto categoryDto;
    private Object tblCatogory;
    private CategoryDto var;
    private CategoryDto dto;

    /**
     * Creates new form CategoryView
     */
    public CategoryView() throws Exception {
        initComponents();
        categoryController = new CategoryController();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblCategoryName = new javax.swing.JLabel();
        txtCategoryName = new javax.swing.JTextField();
        lblId1 = new javax.swing.JLabel();
        txtCategoryID1 = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        tblCategory = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Book Category Management");

        lblCategoryName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCategoryName.setText("Category Name");

        txtCategoryName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblId1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblId1.setText("Category ID");

        txtCategoryID1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        tblCategory.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblId1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCategoryID1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(273, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblId1)
                    .addComponent(txtCategoryID1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoryName)
                    .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete)
                        .addComponent(btnUpdate)))
                .addGap(18, 18, 18)
                .addComponent(tblCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addGap(199, 199, 199))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       saveCategory();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        searchCategory();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteCategory();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateCategory();
    }//GEN-LAST:event_btnUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
   //

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCategoryName;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane tblCategory;
    private javax.swing.JTextField txtCategoryID1;
    private javax.swing.JTextField txtCategoryName;
    // End of variables declaration//GEN-END:variables

private void saveCategory(){
    try {
         dto = new CategoryDto(Integer.parseInt(txtCategoryID1.getText()), txtCategoryName.getText());
        String resp = categoryController.save(dto);
        JOptionPane.showMessageDialog(this, resp);
        clearForm();
        loadTable();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error at save data");
    }
    }

private void clearForm () {
    txtCategoryID1.setText("");
    txtCategoryName.setText("");
}

private void loadTable() {
   try {
       String columns[] ={"Category Id", "Category Name"};
       DefaultTableModel dtm = new DefaultTableModel(columns, 0){
           @Override
           public boolean isCellEditable(int row, int column){
               return false;
           }
       };
       jTable1.setModel(dtm);
       
       ArrayList<CategoryDto> categoryDtos = categoryController.getAll();
       for(CategoryDto dto : categoryDtos) {
           Object[] rowData = {dto.getId(),dto.getName()};
           dtm.addRow(rowData);
       }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this,"Error at Loading Data to category Table");
    }
}

 private void searchCategory() {
        try {
            int selectedRow = jTable1.getSelectedRow();
            if(selectedRow != -1){
                int categoryId = (int) jTable1.getValueAt(selectedRow, 0);
                 dto = categoryController.get(categoryId);
            }
           
            if(dto != null) {
                txtCategoryID1.setText(Integer.toString(dto.getId()));
                txtCategoryName.setText(dto.getName());
                
            } else {
                JOptionPane.showMessageDialog(this, "Category Not Found");
                
            }
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Error at loading Category");
        }
    }
    
    private void deleteCategory() {
        try {
           int categoryId = Integer.parseInt(txtCategoryID1.getText());
           String resp = categoryController.delete(categoryId);
           JOptionPane.showMessageDialog(this, resp); 
           clearForm();
           loadTable();
        }catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Error at Delete Item"); 
        }
    }

    private void updateCategory() {
        try {
           dto = new CategoryDto(Integer.parseInt(txtCategoryID1.getText()), txtCategoryName.getText());
          String resp = categoryController.update(dto);
          JOptionPane.showMessageDialog(this, resp);
          loadTable();
          clearForm();
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error at Update Category");
        }
    }
}
