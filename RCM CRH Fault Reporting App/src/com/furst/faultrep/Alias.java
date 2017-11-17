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
public class Alias {
    private String alias_name;
    private String source;
    private String system;
    private String evidence;
    private String name;
    private String po_ref;
    
    public Alias(String a_name, String src, String sys, String evid, String name, String po)
    {
        this.alias_name = a_name;
        this.source = src;
        this.evidence = evid;
        this.system = sys;
        this.name = name;
        this.po_ref = po;
    }

    /**
     * @return the alias_name
     */
    public String getAlias_name() {
        return alias_name;
    }

    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * @return the system
     */
    public String getSystem() {
        return system;
    }

    /**
     * @return the evidence
     */
    public String getEvidence() {
        return evidence;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the po_ref
     */
    public String getPo_ref() {
        return po_ref;
    }
}
