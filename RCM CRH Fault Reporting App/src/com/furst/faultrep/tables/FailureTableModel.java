/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.furst.faultrep.tables;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import com.furst.faultrep.Failure;
/**
 *
 * @author tfurst
 */
public class FailureTableModel extends AbstractTableModel{
    /*
    
        <failure>
          <failureId>42e39dba-6e13-4c16-b49a-0e3456a30350</failureId>
          <failureName>DEC#2 400 Hz Internal Fail</failureName>
          <failRatio>0.151515</failRatio>
          <subsystemName>Air Vehicle</subsystemName>
          <hwComponentId>2eb4d545-47bf-45b6-92da-06e4ebbeeb10</hwComponentId>
          <hwComponentName>DEC#2</hwComponentName>
          <hwComponentFailRate>0.553712</hwComponentFailRate>
          <maintenanceTaskId>8559fd57-d955-4495-81aa-a88c3c560715</maintenanceTaskId>
          <maintenanceTaskName>Replace DEC#2</maintenanceTaskName>
          <maintenanceTaskDescription/>
        </failure>
    
    */
    private String[] colNames = {"Name","System","Failure Ratio", "Component Name", "Component Fail Ratio","Maintenance Task", "Failure ID"};
    private List<Failure> failures;
    
    public FailureTableModel(List<Failure> failures)
    {
        this.failures = failures;
    }
    
    @Override
    public int getRowCount() {
        return failures.size();
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
        Failure failure = failures.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:
                value = failure.getName();
                break;
            case 1:
                value = failure.getSystem();
                break;
            case 2:
                value = failure.getFailRatio();
                break;
            case 3:
                value = failure.getComponent_name();
                break;
            case 4:
                value = failure.getC_failRatio();
                break;
            case 5:
                value = failure.getMaintTaskName();
                break;
            case 6:
                value = failure.getId();
                break;
        }
        
        return value;
    }
    
}
