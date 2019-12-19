/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2017 Aaron Madlon-Kay
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

package org.omegat.gui.preferences.view;

import javax.swing.JPanel;

import org.omegat.util.OStrings;

/**
 * @author Aaron Madlon-Kay
 */
@SuppressWarnings("serial")
public class VersionCheckPreferencesPanel extends JPanel {

    /** Creates new form PluginsPanel */
    public VersionCheckPreferencesPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currentVersionLabel = new javax.swing.JLabel();
        updateChannelLabel = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        autoCheckCheckBox = new javax.swing.JCheckBox();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        checkNowButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setMinimumSize(new java.awt.Dimension(250, 200));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(currentVersionLabel, OStrings.getString("PREFS_VERSION_CURRENT_VERSION")); // NOI18N
        currentVersionLabel.setAlignmentY(0.0F);
        add(currentVersionLabel);

        org.openide.awt.Mnemonics.setLocalizedText(updateChannelLabel, OStrings.getString("PREFS_VERSION_UPDATE_CHANNEL")); // NOI18N
        updateChannelLabel.setAlignmentY(0.0F);
        add(updateChannelLabel);
        add(filler4);

        org.openide.awt.Mnemonics.setLocalizedText(autoCheckCheckBox, OStrings.getString("PREFS_VERSION_CHECK_AUTO_CHECK")); // NOI18N
        add(autoCheckCheckBox);
        add(filler2);

        org.openide.awt.Mnemonics.setLocalizedText(checkNowButton, OStrings.getString("PREFS_VERSION_CHECK_CHECK_NOW")); // NOI18N
        add(checkNowButton);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JCheckBox autoCheckCheckBox;
    javax.swing.JButton checkNowButton;
    javax.swing.JLabel currentVersionLabel;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler4;
    javax.swing.JLabel updateChannelLabel;
    // End of variables declaration//GEN-END:variables
}
