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
public class Failure {

    private String id;
    private String name;
    private double failRatio;
    private String system;
    private String component_name;
    private String comp_id;
    private String action;
    private String maintTaskID;
    private String maintDataID;

    public Failure(String id, String sys, String comp_name, String comp_id, String name, String act, String maintTaskID, String maintDataID, double failRate) {
        this.id = id;
        this.system = sys;
        this.component_name = comp_name;
        this.comp_id = comp_id;
        this.name = name;
        this.action = act;
        this.maintTaskID = maintTaskID;
        this.maintDataID = maintDataID;
        this.failRatio = failRate;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the system
     */
    public String getSystem() {
        return system;
    }

    /**
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the failRatio
     */
    public double getFailRatio() {
        return failRatio;
    }

    /**
     * @return the component_name
     */
    public String getComponent_name() {
        return component_name;
    }

    /**
     * @return the comp_id
     */
    public String getComp_id() {
        return comp_id;
    }

    /**
     * @return the maintTaskID
     */
    public String getMaintTaskID() {
        return maintTaskID;
    }

    /**
     * @return the maintDataID
     */
    public String getMaintDataID() {
        return maintDataID;
    }

    /**
     * @return the mId
     */


}
