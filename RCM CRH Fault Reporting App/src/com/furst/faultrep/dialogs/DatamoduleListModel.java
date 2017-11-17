/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.furst.faultrep.dialogs;

import com.furst.faultrep.Datamodule;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author tfurst
 */
public class DatamoduleListModel extends AbstractListModel{
    private List<Datamodule> modules;
    
    public DatamoduleListModel(List<Datamodule> mods)
    {
        this.modules = mods;
    }
    
    @Override
    public int getSize() {
        return modules.size();
    }

    @Override
    public Object getElementAt(int index) {
        return modules.get(index);
    }
    
    public void removeElementAt(int index)
    {
        modules.remove(index);
    }
    
}
