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
public class MaintIdSearchTableModel extends AbstractTableModel{

    private String[] colNames = {"Maintenance ID"};
    private List<String> ids;
    
    public MaintIdSearchTableModel(List<String> maintIds)
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
        Object value;
        String id = ids.get(rowIndex);
        value = id;
        return value;
    }
    
    public void removeRow(int row)
    {
        fireTableRowsDeleted(row,row);
        ids.remove(row);
    }
    
}
