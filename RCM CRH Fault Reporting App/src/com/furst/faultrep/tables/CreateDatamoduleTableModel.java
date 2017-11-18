/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.furst.faultrep.tables;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tfurst
 */
public class CreateDatamoduleTableModel extends AbstractTableModel{

    private String[] colNames = new String[]{"Property", "Value"};
    private Object[][] data = 
    {
        {"Model Identification Code","HH60W"},
        {"System Difference Code","A"},
        {"System Code",""},
        {"Sub-System Code",""},
        {"Sub-Sub-System Code",""},
        {"Assembly Code",""},
        {"Disassembly Code",""},
        {"Disassembly Code Variant",""},
        {"Information Code",""},
        {"Information Code Variant",""},
        {"Item Location Code",""},
        {"Technical Name",""},
        {"Information Name",""}
    };
    
    @Override
    public int getRowCount() {
        return data.length;
    }
    
    @Override
    public String getColumnName(int col)
    {
        return colNames[col];
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }
    
    @Override
    public void setValueAt(Object value, int row, int col)
    {
        data[row][col] = value;
        fireTableCellUpdated(row,col);
    }
    
    @Override
    public boolean isCellEditable(int row, int col)
    {
        if(col == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
