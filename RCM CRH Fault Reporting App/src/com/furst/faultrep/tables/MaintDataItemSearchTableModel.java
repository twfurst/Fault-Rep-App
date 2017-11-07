/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.furst.faultrep.tables;

import com.furst.faultrep.Failure;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tfurst
 */
public class MaintDataItemSearchTableModel extends AbstractTableModel{

    private String[] colNames = {"Maintenance ID", "Description"};
    private List<String[]> ids;
    
    public MaintDataItemSearchTableModel(List<String[]> maintIds)
    {
        this.ids = maintIds;
    }
    
    @Override
    public int getRowCount() {
        return ids.size();
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
                value = ids.get(rowIndex)[0];
                break;
            case 1:
                value = ids.get(rowIndex)[1];
                break;

        }
        
        return value;
    }
    
    public void removeRow(int row)
    {
        fireTableRowsDeleted(row,row);
        ids.remove(row);
    }
    
}
