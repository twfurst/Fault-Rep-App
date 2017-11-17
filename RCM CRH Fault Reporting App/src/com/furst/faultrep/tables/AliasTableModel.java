/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.furst.faultrep.tables;

import com.furst.faultrep.Alias;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tfurst
 */
public class AliasTableModel extends AbstractTableModel{
    private String[] colNames = {"Name","Source","Detecting System","Evidence"};
    private List<Alias> aliases;
    
    public AliasTableModel(List<Alias> aliasList)
    {
        this.aliases = aliasList;
    }
    
    @Override
    public int getRowCount() {
        return aliases.size();
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
        Alias alias = aliases.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:
                value = alias.getAlias_name();
                break;
            case 1:
                value = alias.getSource();
                break;
            case 2:
                value = alias.getSystem();
                break;
            case 3:
                value = alias.getEvidence();
                break;
        }
        
        return value;
    }
    
    public void removeRow(int row)
    {
        fireTableRowsDeleted(row,row);
        aliases.remove(row);
    }
    
}
