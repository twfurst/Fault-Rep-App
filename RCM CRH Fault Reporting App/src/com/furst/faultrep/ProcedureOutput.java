/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.furst.faultrep;

/**
 *
 * @author tfurst
 */
public class ProcedureOutput {
    
    private String id;
    private String name;
    private String maint_id;
    
    public ProcedureOutput(String id, String name, String mid)
    {
        this.id = id;
        this.name = name;
        this.maint_id = mid;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the maint_id
     */
    public String getMaint_id() {
        return maint_id;
    }
    
}
