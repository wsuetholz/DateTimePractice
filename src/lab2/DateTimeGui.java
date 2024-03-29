/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.text.ParseException;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author wsuetholz
 */
public class DateTimeGui extends javax.swing.JFrame {

    private static String DATETIME_FORMAT = "M/d/yyyy hh:mm";

    /**
     * Creates new form DateTimeGui
     */
    public DateTimeGui() {
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

        lblHeading = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        txtEndDate = new javax.swing.JTextField();
        btnCalcDifference = new javax.swing.JButton();
        lblDifference = new javax.swing.JLabel();
        lblCalculatedDiff = new javax.swing.JLabel();
        lblNote1 = new javax.swing.JLabel();
        lblNote2 = new javax.swing.JLabel();
        lblDiffOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeading.setFont(new java.awt.Font("Delta Hey Max Nine", 2, 24)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Date/Time Difference");

        lblStartDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStartDate.setText("Start Date/Time");
        lblStartDate.setToolTipText("");

        lblEndDate.setText("End Date/Time");

        txtStartDate.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtStartDate.setText("10/14/2014 10:44");
        txtStartDate.setToolTipText("");

        txtEndDate.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEndDate.setText("10/14/2014 10:44");

        btnCalcDifference.setText("Calculate Difference");
        btnCalcDifference.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcDifferenceActionPerformed(evt);
            }
        });

        lblDifference.setText("Time Difference");

        lblCalculatedDiff.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCalculatedDiff.setText("00:00");

        lblNote1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblNote1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNote1.setText("Please enter a starting date/time and an ending date/time");

        lblNote2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblNote2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNote2.setText("The date/times are formatted \"M/d/yyyy hh:mm\"");

        lblDiffOutput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiffOutput.setText("0 hours, 0 minutes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblNote2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNote1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblDifference, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblEndDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                        .addComponent(lblStartDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtStartDate)
                                        .addComponent(txtEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(lblCalculatedDiff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(lblDiffOutput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnCalcDifference, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNote1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNote2)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDifference, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCalculatedDiff))
                .addGap(18, 18, 18)
                .addComponent(lblDiffOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCalcDifference)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcDifferenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcDifferenceActionPerformed
	// TODO add your handling code here:
	try {
	    String diffTime = DateTimeHelper.calculateDiffInHHMM(DATETIME_FORMAT, txtEndDate.getText(), txtStartDate.getText());
	    String diffOutput;
	    String[] diffSplit = diffTime.split(":");
	    if (diffSplit.length < 2) {
		diffOutput = "0 hours, " + diffTime + " minutes";
	    } else {
		diffOutput = diffSplit[0] + " hours, " + diffSplit[1] + " minutes";
	    }
	    lblDiffOutput.setText(diffOutput);
	    lblCalculatedDiff.setText(diffTime);
	    
	} catch (IllegalArgumentException ie) {
	    String msg = ie.getMessage();
	    JOptionPane.showMessageDialog(this, "Sorry you must enter a valid dates.\n" + msg);	    
	}
    }//GEN-LAST:event_btnCalcDifferenceActionPerformed

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
	    java.util.logging.Logger.getLogger(DateTimeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(DateTimeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(DateTimeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(DateTimeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
        //</editor-fold>
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new DateTimeGui().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcDifference;
    private javax.swing.JLabel lblCalculatedDiff;
    private javax.swing.JLabel lblDiffOutput;
    private javax.swing.JLabel lblDifference;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblNote1;
    private javax.swing.JLabel lblNote2;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtStartDate;
    // End of variables declaration//GEN-END:variables
}
