/**********
    Copyright © 2010-2012 Olanto Foundation Geneva

   This file is part of myCAT.

   myCAT is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of
    the License, or (at your option) any later version.

    myCAT is distributed in the hope that it will be useful, but
    WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
    See the GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with myCAT.  If not, see <http://www.gnu.org/licenses/>.

**********/

package org.olanto.mycat.lineseg;

import java.util.List;
import org.olanto.senseos.SenseOS;

/** test segmentation

 */
public class testSeg {

    public static void main(String[] args) {
        FileSegmentation.init("ENGLISH");
        List<String> seg = FileSegmentation.readFile(SenseOS.getMYCAT_HOME()+"/corpus/source/BY_EXT/Bodies$2010$CEP$CEP PLEN$MEETING$CEP PLEN 2010.1$Doc 16$src$cep_plen-1_d016_ad00_an03_p00_r00.doc.txt", "UTF-16", true);
        for (String s : seg) {
            System.out.println(s);
        }
    }
}
