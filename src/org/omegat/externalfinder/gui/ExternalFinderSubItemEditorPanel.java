/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool 
          with fuzzy matching, translation memory, keyword search, 
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2016 Aaron Madlon-Kay
               Home page: http://www.omegat.org/
               Support center: http://groups.yahoo.com/group/OmegaT/

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

package org.omegat.externalfinder.gui;

import org.omegat.externalfinder.item.ExternalFinderItem;
import org.omegat.util.OStrings;

/**
 * @author Aaron Madlon-Kay
 */
@SuppressWarnings("serial")
public class ExternalFinderSubItemEditorPanel extends javax.swing.JPanel {

    /**
     * Creates new form ExternalFinderSubItemEditorPanel
     */
    public ExternalFinderSubItemEditorPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        urlPanel = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        jScrollPane1 = new javax.swing.JScrollPane();
        urlTextArea = new javax.swing.JTextArea();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        commandPanel = new javax.swing.JPanel();
        jTextArea2 = new javax.swing.JTextArea();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        jScrollPane2 = new javax.swing.JScrollPane();
        commandTextArea = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        delimiterTextField = new javax.swing.JTextField();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        targetComboBox = new javax.swing.JComboBox<>();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        encodingComboBox = new javax.swing.JComboBox<>();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        urlPanel.setAlignmentX(0.0F);
        urlPanel.setLayout(new javax.swing.BoxLayout(urlPanel, javax.swing.BoxLayout.PAGE_AXIS));

        jTextArea1.setEditable(false);
        jTextArea1.setFont(jLabel1.getFont());
        jTextArea1.setLineWrap(true);
        jTextArea1.setText(OStrings.getString("EXTERNALFINDER_SUBEDITOR_URL_MESSAGE")); // NOI18N
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAlignmentX(0.0F);
        jTextArea1.setFocusable(false);
        jTextArea1.setOpaque(false);
        urlPanel.add(jTextArea1);
        urlPanel.add(filler11);

        jPanel7.setAlignmentX(0.0F);
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText(OStrings.getString("EXTERNALFINDER_SUBEDITOR_URL_LABEL")); // NOI18N
        jPanel7.add(jLabel1);
        jPanel7.add(filler1);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        urlTextArea.setColumns(50);
        urlTextArea.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        urlTextArea.setLineWrap(true);
        urlTextArea.setRows(5);
        jScrollPane1.setViewportView(urlTextArea);

        jPanel7.add(jScrollPane1);

        urlPanel.add(jPanel7);

        add(urlPanel);
        add(filler8);

        commandPanel.setAlignmentX(0.0F);
        commandPanel.setLayout(new javax.swing.BoxLayout(commandPanel, javax.swing.BoxLayout.PAGE_AXIS));

        jTextArea2.setEditable(false);
        jTextArea2.setFont(jLabel1.getFont());
        jTextArea2.setLineWrap(true);
        jTextArea2.setText(OStrings.getString("EXTERNALFINDER_SUBEDITOR_COMMAND_MESSAGE")); // NOI18N
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setAlignmentX(0.0F);
        jTextArea2.setFocusable(false);
        jTextArea2.setOpaque(false);
        commandPanel.add(jTextArea2);
        commandPanel.add(filler12);

        jPanel5.setAlignmentX(0.0F);
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setText(OStrings.getString("EXTERNALFINDER_SUBEDITOR_COMMAND_LABEL")); // NOI18N
        jPanel5.add(jLabel5);
        jPanel5.add(filler3);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        commandTextArea.setColumns(50);
        commandTextArea.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        commandTextArea.setLineWrap(true);
        commandTextArea.setRows(5);
        jScrollPane2.setViewportView(commandTextArea);

        jPanel5.add(jScrollPane2);

        commandPanel.add(jPanel5);

        jPanel6.setAlignmentX(0.0F);
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setText(OStrings.getString("EXTERNALFINDER_SUBEDITOR_DELIMITER_LABEL")); // NOI18N
        jPanel6.add(jLabel4);
        jPanel6.add(filler5);

        delimiterTextField.setColumns(5);
        jPanel6.add(delimiterTextField);

        commandPanel.add(jPanel6);

        add(commandPanel);
        add(filler7);

        jPanel3.setAlignmentX(0.0F);
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setLabelFor(targetComboBox);
        jLabel2.setText(OStrings.getString("EXTERNALFINDER_SUBEDITOR_TARGET_LABEL")); // NOI18N
        jPanel3.add(jLabel2);
        jPanel3.add(filler2);
        jPanel3.add(targetComboBox);

        add(jPanel3);
        add(filler10);

        jPanel4.setAlignmentX(0.0F);
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setLabelFor(encodingComboBox);
        jLabel3.setText(OStrings.getString("EXTERNALFINDER_SUBEDITOR_ENCODING_LABEL")); // NOI18N
        jPanel4.add(jLabel3);
        jPanel4.add(filler4);
        jPanel4.add(encodingComboBox);

        add(jPanel4);
        add(filler9);

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(okButton, OStrings.getString("BUTTON_OK")); // NOI18N
        jPanel2.add(okButton);

        org.openide.awt.Mnemonics.setLocalizedText(cancelButton, OStrings.getString("BUTTON_CANCEL")); // NOI18N
        jPanel2.add(cancelButton);

        jPanel1.add(jPanel2, java.awt.BorderLayout.EAST);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton cancelButton;
    javax.swing.JPanel commandPanel;
    javax.swing.JTextArea commandTextArea;
    javax.swing.JTextField delimiterTextField;
    javax.swing.JComboBox<ExternalFinderItem.ENCODING> encodingComboBox;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    javax.swing.JButton okButton;
    javax.swing.JComboBox<ExternalFinderItem.TARGET> targetComboBox;
    javax.swing.JPanel urlPanel;
    javax.swing.JTextArea urlTextArea;
    // End of variables declaration//GEN-END:variables
}
