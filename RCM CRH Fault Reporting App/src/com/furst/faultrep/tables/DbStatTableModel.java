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
public class DbStatTableModel extends AbstractTableModel{

    private final String[] colNames = {"Property", "Value"};
    private final Object[][]data = 
    {
        {"Number of systems",""},
        {"Number of maintenance IDs",""},
        {"Number of faults",""},
        {"Number of listed data modules",""},
        {"Number of maintenance IDs in data modules",""}
    };
    @Override
    public int getRowCount() {
        return data.length;
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
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }
    
    @Override
    public void setValueAt(Object value, int row, int col)
    {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }

    @Override
    public Class getColumnClass(int c)
    {
        return getValueAt(0,c).getClass();
    }
    
}
