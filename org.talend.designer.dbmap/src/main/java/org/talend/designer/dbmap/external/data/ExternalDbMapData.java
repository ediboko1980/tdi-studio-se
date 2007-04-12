// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006-2007 Talend - www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.designer.dbmap.external.data;

import java.util.ArrayList;
import java.util.List;

import org.talend.core.model.process.IExternalData;

/**
 * DOC amaumont class global comment. Detailled comment <br/>
 * 
 * $Id: ExternalMapperData.java 1 2006-09-29 17:06:40Z nrousseau $
 * 
 */
public class ExternalDbMapData implements IExternalData {

    /**
     * 
     */
    private static final long serialVersionUID = 4877887839142463534L;

    private ExternalDbMapUiProperties uiProperties = new ExternalDbMapUiProperties();

    private List<ExternalDbMapTable> inputTables = new ArrayList<ExternalDbMapTable>(0);

    private List<ExternalDbMapTable> outputTables = new ArrayList<ExternalDbMapTable>(0);

    /** not used ... */
    private List<ExternalDbMapTable> varsTables = new ArrayList<ExternalDbMapTable>(0);

    public List<ExternalDbMapTable> getInputTables() {
        return this.inputTables;
    }

    public void setInputTables(List<ExternalDbMapTable> tables) {
        this.inputTables = tables;
    }

    public List<ExternalDbMapTable> getOutputTables() {
        return this.outputTables;
    }

    public void setOutputTables(List<ExternalDbMapTable> outputTables) {
        this.outputTables = outputTables;
    }

    /** not used ... */
    public List<ExternalDbMapTable> getVarsTables() {
        return this.varsTables;
    }

    /** not used ... */
    public void setVarsTables(List<ExternalDbMapTable> varsTables) {
        this.varsTables = varsTables;
    }

    public ExternalDbMapUiProperties getUiProperties() {
        return this.uiProperties;
    }

    public void setUiProperties(ExternalDbMapUiProperties layoutProperties) {
        this.uiProperties = layoutProperties;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#clone()
     */
    @SuppressWarnings("unchecked")
    @Override
    public IExternalData clone() throws CloneNotSupportedException {
        ExternalDbMapData cloned = (ExternalDbMapData) super.clone();
        cloned.uiProperties = (ExternalDbMapUiProperties) uiProperties.clone();
        cloned.inputTables = (List<ExternalDbMapTable>) ((ArrayList) inputTables).clone();
        cloned.outputTables = (List<ExternalDbMapTable>) ((ArrayList) outputTables).clone();
        cloned.varsTables = (List<ExternalDbMapTable>) ((ArrayList) varsTables).clone();
        return cloned;
    }

}
