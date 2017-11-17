/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.furst.faultrep.tables;

import com.furst.faultrep.ProcedureOutput;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tfurst
 */
public class ProcedureOutputTableModel extends AbstractTableModel{
    private String[] colNames = {"Name","Procedure Output ID"};
    private List<ProcedureOutput> outputs;
    
    public ProcedureOutputTableModel(List<ProcedureOutput> pos)
    {
        this.outputs = pos;
    }
    
    @Override
    public int getRowCount() {
        return outputs.size();
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
        ProcedureOutput po = outputs.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:
                value = po.getName();
                break;
            case 1:
                value = po.getId();
                break;
        }
        
        return value;
    }
    
    public ProcedureOutput getPo(int row)
    {
        return outputs.get(row);
    }
    
    public void removeRow(int row)
    {
        fireTableRowsDeleted(row,row);
        outputs.remove(row);
    }
    
}
