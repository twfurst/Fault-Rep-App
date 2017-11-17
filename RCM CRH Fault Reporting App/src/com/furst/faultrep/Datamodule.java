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
public class Datamodule {
    
    private String model;
    private String sysDiff;
    private String system;
    private String subsystem;
    private String subsubsystem;
    private String assy;
    private String disassy;
    private String disassyv;
    private String info;
    private String infov;
    private String itemloc;
    private String tname;
    private String iname;
    
    public Datamodule(String mod, String sysd, String sys, String sub, String subsub, String assy, String dis, String disv, String inf, String infv, String item, String tn, String inm)
    {
        this.model = mod;
        this.sysDiff = sysd;
        this.system = sys;
        this.subsystem = sub;
        this.subsubsystem = subsub;
        this.assy = assy;
        this.disassy = dis;
        this.disassyv = disv;
        this.info = inf;
        this.infov = infv;
        this.itemloc = item;
        this.tname = tn;
        this.iname = inm;
    }
    
    @Override
    public String toString()
    {
        return getModel() + "-" + getSysDiff() + "-" + getSystem() + "-" + getSubsystem() + getSubsubsystem() + "-" + getAssy() + "-" + getDisassy() + getDisassyv() + "-" + getInfo() + getInfov() + "-" + getItemloc();
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the sysDiff
     */
    public String getSysDiff() {
        return sysDiff;
    }

    /**
     * @param sysDiff the sysDiff to set
     */
    public void setSysDiff(String sysDiff) {
        this.sysDiff = sysDiff;
    }

    /**
     * @return the system
     */
    public String getSystem() {
        return system;
    }

    /**
     * @param system the system to set
     */
    public void setSystem(String system) {
        this.system = system;
    }

    /**
     * @return the subsystem
     */
    public String getSubsystem() {
        return subsystem;
    }

    /**
     * @param subsystem the subsystem to set
     */
    public void setSubsystem(String subsystem) {
        this.subsystem = subsystem;
    }

    /**
     * @return the subsubsystem
     */
    public String getSubsubsystem() {
        return subsubsystem;
    }

    /**
     * @param subsubsystem the subsubsystem to set
     */
    public void setSubsubsystem(String subsubsystem) {
        this.subsubsystem = subsubsystem;
    }

    /**
     * @return the assy
     */
    public String getAssy() {
        return assy;
    }

    /**
     * @param assy the assy to set
     */
    public void setAssy(String assy) {
        this.assy = assy;
    }

    /**
     * @return the disassy
     */
    public String getDisassy() {
        return disassy;
    }

    /**
     * @param disassy the disassy to set
     */
    public void setDisassy(String disassy) {
        this.disassy = disassy;
    }

    /**
     * @return the disassyv
     */
    public String getDisassyv() {
        return disassyv;
    }

    /**
     * @param disassyv the disassyv to set
     */
    public void setDisassyv(String disassyv) {
        this.disassyv = disassyv;
    }

    /**
     * @return the info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * @return the infov
     */
    public String getInfov() {
        return infov;
    }

    /**
     * @param infov the infov to set
     */
    public void setInfov(String infov) {
        this.infov = infov;
    }

    /**
     * @return the itemloc
     */
    public String getItemloc() {
        return itemloc;
    }

    /**
     * @param itemloc the itemloc to set
     */
    public void setItemloc(String itemloc) {
        this.itemloc = itemloc;
    }

    /**
     * @return the tname
     */
    public String getTname() {
        return tname;
    }

    /**
     * @param tname the tname to set
     */
    public void setTname(String tname) {
        this.tname = tname;
    }

    /**
     * @return the iname
     */
    public String getIname() {
        return iname;
    }

    /**
     * @param iname the iname to set
     */
    public void setIname(String iname) {
        this.iname = iname;
    }
}
