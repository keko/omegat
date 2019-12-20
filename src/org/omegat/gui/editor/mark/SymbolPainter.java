/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2012 Martin Fleurke
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

package org.omegat.gui.editor.mark;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.text.JTextComponent;

import org.omegat.gui.editor.UnderlineFactory.Underliner;

/**
 * Class to paint some character/symbol as highlight. E.g. to highlight whitespace characters.
 * @author Martin Fleurke
 */
public class SymbolPainter extends Underliner {
    protected final Color color;
    protected final String symbol;

    public SymbolPainter(final Color c, final String s) {
        this.color = c;
        this.symbol = s;
    }

    protected void paint(Graphics g, Rectangle rect, JTextComponent c) {
        Font f = c.getFont();
        FontMetrics fm = c.getFontMetrics(f);
        int y = rect.y - 1 + fm.getAscent();

        g.setFont(f);
        g.setColor(color);
        g.drawString(symbol, rect.x, y);
    }
}
