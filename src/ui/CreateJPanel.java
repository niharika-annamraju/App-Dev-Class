/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.UserProfile;

/**
 *
 * @author nihar
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    UserProfile userProfile;
    public CreateJPanel(UserProfile thisUserProfile) {
        this.userProfile = thisUserProfile;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jOpenBtn = new javax.swing.JButton();
        jTxtFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtAffiliation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtMajor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtDob = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxtAge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtCareer = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTxtDegree1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtDegree1End = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTxtStreetLine1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTxtStreetLine2 = new javax.swing.JTextField();
        jTxtNum = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTxtDegree2 = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTxtDegree2Start = new javax.swing.JTextField();
        jTxtDegree1Start = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTxtCity = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTxtCountry = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTxtDegree2End = new javax.swing.JTextField();
        jBtnSave = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create User");

        jLabel2.setText("First Name");

        jOpenBtn.setText("Upload image");
        jOpenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpenBtnActionPerformed(evt);
            }
        });

        jTxtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFirstNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Last Name");

        jTxtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtLastNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Affiliation");

        jTxtAffiliation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAffiliationActionPerformed(evt);
            }
        });

        jLabel5.setText("Major");

        jTxtMajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtMajorActionPerformed(evt);
            }
        });

        jLabel6.setText("DOB");

        jTxtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDobActionPerformed(evt);
            }
        });

        jLabel7.setText("Age");

        jTxtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAgeActionPerformed(evt);
            }
        });

        jLabel8.setText("Career");

        jTxtCareer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCareerActionPerformed(evt);
            }
        });

        jLabel9.setText("Degree 1");

        jTxtDegree1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDegree1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Degree 1 End");

        jTxtDegree1End.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDegree1EndActionPerformed(evt);
            }
        });

        jLabel11.setText("Street Line 1");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Telephone Number");

        jTxtStreetLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtStreetLine1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Street Line 2");

        jTxtStreetLine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtStreetLine2ActionPerformed(evt);
            }
        });

        jTxtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNumActionPerformed(evt);
            }
        });

        jLabel14.setText("Degree 2");

        jLabel15.setText("Email");

        jTxtDegree2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDegree2ActionPerformed(evt);
            }
        });

        jTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmailActionPerformed(evt);
            }
        });

        jLabel16.setText("Degree 2 Start");

        jLabel17.setText("Degree 1 Start");

        jTxtDegree2Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDegree2StartActionPerformed(evt);
            }
        });

        jTxtDegree1Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDegree1StartActionPerformed(evt);
            }
        });

        jLabel18.setText("City");

        jTxtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCityActionPerformed(evt);
            }
        });

        jLabel19.setText("Country");

        jTxtCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCountryActionPerformed(evt);
            }
        });

        jLabel20.setText("Degree 2 End");

        jTxtDegree2End.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDegree2EndActionPerformed(evt);
            }
        });

        jBtnSave.setText("Save");
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jOpenBtn)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel13)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel6)))
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtStreetLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtStreetLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtAffiliation, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtCareer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtDegree1Start, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtDegree1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtDegree1End, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtDegree2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtDegree2Start, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtDegree2End, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnSave))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTxtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTxtAffiliation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTxtMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTxtCareer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTxtDegree1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTxtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtDegree1Start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTxtDegree1End, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtStreetLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTxtStreetLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jTxtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTxtDegree2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtDegree2Start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTxtDegree2End, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnSave)
                            .addComponent(jOpenBtn))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
public String imgePath;
    private void jOpenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpenBtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.image", "jpg");
        chooser.addChoosableFileFilter(filter);
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        imgePath = file.getAbsolutePath();
       
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jOpenBtnActionPerformed

    private void jTxtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFirstNameActionPerformed

    private void jTxtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtLastNameActionPerformed

    private void jTxtAffiliationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAffiliationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAffiliationActionPerformed

    private void jTxtMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtMajorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtMajorActionPerformed

    private void jTxtDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDobActionPerformed

    private void jTxtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAgeActionPerformed

    private void jTxtCareerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCareerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCareerActionPerformed

    private void jTxtDegree1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDegree1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDegree1ActionPerformed

    private void jTxtDegree1EndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDegree1EndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDegree1EndActionPerformed

    private void jTxtStreetLine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtStreetLine1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtStreetLine1ActionPerformed

    private void jTxtStreetLine2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtStreetLine2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtStreetLine2ActionPerformed

    private void jTxtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNumActionPerformed

    private void jTxtDegree2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDegree2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDegree2ActionPerformed

    private void jTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmailActionPerformed

    private void jTxtDegree2StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDegree2StartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDegree2StartActionPerformed

    private void jTxtDegree1StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDegree1StartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDegree1StartActionPerformed

    private void jTxtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCityActionPerformed

    private void jTxtCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCountryActionPerformed

    private void jTxtDegree2EndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDegree2EndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDegree2EndActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        userProfile.setFirstName(jTxtFirstName.getText());
        userProfile.setLastName(jTxtLastName.getText());
        userProfile.setDob(jTxtDob.getText());
        userProfile.setAge(jTxtAge.getText());
        userProfile.setTelephoneNumber(jTxtNum.getText());
        userProfile.setEmail(jTxtEmail.getText());
        userProfile.setStreetLine1(jTxtStreetLine1.getText());
        userProfile.setStreetLine2(jTxtStreetLine2.getText());
        userProfile.setCity(jTxtCity.getText());
        userProfile.setCountry(jTxtCountry.getText());
        // userPic.setIcon(new ImageIcon(imgePath));
        userProfile.setPhoto(imgePath);
        userProfile.setAffiliation(jTxtAffiliation.getText());
        userProfile.setMajor(jTxtMajor.getText());
        userProfile.setCareer(jTxtCareer.getText());
        userProfile.setDegree1(jTxtDegree1.getText());
        userProfile.setDegree1Start(jTxtDegree1Start.getText());
        userProfile.setDegree1End(jTxtDegree1End.getText());
        userProfile.setDegree2(jTxtDegree2.getText());
        userProfile.setDegree2Start(jTxtDegree2Start.getText());
        userProfile.setDegree2End(jTxtDegree2End.getText());  
        
        JOptionPane.showMessageDialog(this, "Information is saved");        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jOpenBtn;
    private javax.swing.JTextField jTxtAffiliation;
    private javax.swing.JTextField jTxtAge;
    private javax.swing.JTextField jTxtCareer;
    private javax.swing.JTextField jTxtCity;
    private javax.swing.JTextField jTxtCountry;
    private javax.swing.JTextField jTxtDegree1;
    private javax.swing.JTextField jTxtDegree1End;
    private javax.swing.JTextField jTxtDegree1Start;
    private javax.swing.JTextField jTxtDegree2;
    private javax.swing.JTextField jTxtDegree2End;
    private javax.swing.JTextField jTxtDegree2Start;
    private javax.swing.JTextField jTxtDob;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtFirstName;
    private javax.swing.JTextField jTxtLastName;
    private javax.swing.JTextField jTxtMajor;
    private javax.swing.JTextField jTxtNum;
    private javax.swing.JTextField jTxtStreetLine1;
    private javax.swing.JTextField jTxtStreetLine2;
    // End of variables declaration//GEN-END:variables
}
