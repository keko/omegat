/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2000-2006 Henry Pijffers
               2008, 2010 Alex Buloichik
               2014 Aaron Madlon-Kay
               2015 Yu Tang, Aaron Madlon-Kay
               Home page: http://www.omegat.org/
               Support center: https://omegat.org/support

 This file is part of OmegaT.

 OmegaT is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 OmegaT is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **************************************************************************/
package org.omegat.gui.dialogs;

import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.omegat.core.Core;
import org.omegat.gui.editor.AlphabeticalMarkers;
import org.omegat.gui.editor.EditorController;
import org.omegat.util.OStrings;
import org.omegat.util.StringUtil;
import org.omegat.util.gui.StaticUIUtils;

/**
 * Dialog that accepts a segment number to jump to in the editor.
 *
 * @author Henry Pijffers
 * @author Alex Buloichik
 * @author Aaron Madlon-Kay
 * @author Yu Tang
 */
@SuppressWarnings("serial")
public class GoToSegmentDialog extends javax.swing.JDialog {

    private AlphabeticalMarkers alphabeticalMarkers;
    private int result = -1;

    /**
     * Creates new form GoToSegmentDialog
     */
    public GoToSegmentDialog(java.awt.Frame parent) {
        super(parent, true);
        initComponents();

        segmentField.enableInputMethods(false);
        segmentField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                detectDidInputLetter();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                detectDidInputLetter();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                detectDidInputLetter();
            }
        });

        StaticUIUtils.setEscapeAction(this, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doClose();
            }
        });
        getRootPane().setDefaultButton(okButton);
        setLocationRelativeTo(parent);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                alphabeticalMarkers = ((EditorController) Core.getEditor()).getAlphabeticalMarkers();
                alphabeticalMarkers.showMarkers();
            }
        });
    }

    private void detectDidInputLetter() {
        String input = segmentField.getText();
        if (input.codePointCount(0, input.length()) != 1) {
            return;
        }
        if (alphabeticalMarkers.containsTitle(input.codePointAt(0))) {
            okButtonActionPerformed(null);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fieldLabel = new javax.swing.JLabel();
        segmentField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(OStrings.getString("MW_PROMPT_SEG_NR_TITLE")); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setLayout(new java.awt.BorderLayout());

        fieldLabel.setLabelFor(segmentField);
        fieldLabel.setText(OStrings.getString("MW_PROMPT_SEG_NR_MSG")); // NOI18N
        jPanel1.add(fieldLabel, java.awt.BorderLayout.NORTH);
        jPanel1.add(segmentField, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(okButton, OStrings.getString("BUTTON_OK")); // NOI18N
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        jPanel3.add(okButton);

        org.openide.awt.Mnemonics.setLocalizedText(cancelButton, OStrings.getString("BUTTON_CANCEL")); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel3.add(cancelButton);

        jPanel2.add(jPanel3, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        String inputValue = segmentField.getText();

        int maxNr = Core.getProject().getAllEntries().size();

        // Check if the user entered a value at all
        if (inputValue == null || inputValue.trim().isEmpty()) {
            // Show error message
            displayErrorMessage(maxNr);
            return;
        }

        // translate a marker title letter to segment number string
        inputValue = alphabeticalMarkers.translateSegmentNumber(inputValue);

        // Check if the user really entered a number
        int segmentNr;
        try {
            // Just parse it. If parsed, it's a number.
            segmentNr = Integer.parseInt(inputValue);
        } catch (NumberFormatException e) {
            // If the exception is thrown, the user didn't
            // enter a number
            // Show error message
            displayErrorMessage(maxNr);
            return;
        }

        // Check if the segment number is within bounds
        if (segmentNr < 1 || segmentNr > maxNr) {
            // Tell the user he has to enter a number within
            // certain bounds
            displayErrorMessage(maxNr);
            return;
        }

        result = segmentNr;
        doClose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        doClose();
    }//GEN-LAST:event_formWindowClosing

    private void doClose() {
        alphabeticalMarkers.hideMarkers();
        setVisible(false);
        dispose();
    }

    private void displayErrorMessage(int maxNr) {
        JOptionPane.showMessageDialog(this,
                StringUtil.format(OStrings.getString("MW_SEGMENT_NUMBER_ERROR"), maxNr),
                OStrings.getString("TF_ERROR"), JOptionPane.ERROR_MESSAGE);
    }

    public int getResult() {
        return result;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel fieldLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField segmentField;
    // End of variables declaration//GEN-END:variables
}
