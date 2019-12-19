/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2011 Alex Buloichik
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

package org.omegat.filters;

import org.junit.Test;
import org.omegat.core.data.IProject;
import org.omegat.filters3.xml.resx.ResXFilter;

public class ResXFilterTest extends TestFilterBase {

    @Test
    public void testLoad() throws Exception {
        String f = "test/data/filters/ResX/Resources.resx";
        IProject.FileInfo fi = loadSourceFiles(new ResXFilter(), f);

        checkMultiStart(fi, f);
        checkMulti("This is a text displayed in the UI.", "InfoExperimentStoppingMessage", null, null, null,
                "This is a comment. It should not be displayed to the translator.");
        checkMulti("One more text", "InfoExperimentStoppingMessage2", null, null, null, "Second comment");
        checkMultiEnd();
    }
}
