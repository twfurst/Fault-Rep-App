/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.furst.faultrep.tables;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tfurst
 */
public class IbitTableModel extends AbstractTableModel{
    private String[] colNames = new String[]{"Component Name"};
    private List<String[]> ibits;
    
    public IbitTableModel(List<String[]> comps)
    {
        this.ibits = comps;
    }
    @Override
    public int getRowCount() {
        return ibits.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }
    
    @Override
    public String getColumnName(int col)
    {
        return colNames[col];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value = "??";
        
        switch(columnIndex)
        {
            case 0:
                value = ibits.get(rowIndex)[0];
                break;

        }
        
        return value;
    }
    
}
