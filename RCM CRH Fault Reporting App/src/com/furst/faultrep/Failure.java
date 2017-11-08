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
    private double c_failRatio;
    private String system;
    private String component_name;
    private String maintTaskName;
    private String maintDataID;
    /*
    
        String f_id = rs.getString("f_id");
        String sys = rs.getString("system");
        String comp_id = rs.getString("comp_id");
        String fail = rs.getString("f_name");
        String action_id = rs.getString("maint_task_id");
        double f_ratio = rs.getDouble("f_ratio");
        double c_f_ratio = res.getDouble("comp_fail_rate");
    
    */
    public Failure(String id, String sys, String comp_name, String name, String maintTaskName, String maintDataID, double failRate, double c_rat) {
        this.id = id;
        this.system = sys;
        this.component_name = comp_name;
        this.name = name;
        this.maintTaskName = maintTaskName;
        this.maintDataID = maintDataID;
        this.failRatio = failRate;
        this.c_failRatio = c_rat;
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
     * @return the maintDataID
     */
    public String getMaintDataID() {
        return maintDataID;
    }

    /**
     * @return the c_failRatio
     */
    public double getC_failRatio() {
        return c_failRatio;
    }

    /**
     * @return the maintTaskName
     */
    public String getMaintTaskName() {
        return maintTaskName;
    }

    /**
     * @return the mId
     */


}
