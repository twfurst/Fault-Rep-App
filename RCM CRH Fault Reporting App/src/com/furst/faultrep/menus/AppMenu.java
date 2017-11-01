/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.furst.faultrep.menus;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.icon.ImageWrapperResizableIcon;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenu;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenuEntryPrimary;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenuEntryPrimary.PrimaryRolloverCallback;

/**
 *
 * @author tfurst
 */
public class AppMenu extends RibbonApplicationMenu{
    private boolean testBool = false;
    private AppMenuPrimaryEntry ChgCsdbEntry;
    private AppMenuPrimaryEntry CreateCsdbEntry;
    private AppMenuPrimaryEntry ChgUserEntry;
    private AppMenuPrimaryEntry loginEntry;
    private AppMenuPrimaryEntry exitEntry;
    public AppMenu()
    {
        /*
            create the change CSDB menu entry
        */
        ChgCsdbEntry = new AppMenuPrimaryEntry(getIcon("database-3.png"),"Change CSDB",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); //To change body of generated methods, choose Tools | Templates.
            }
        },CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
        ChgCsdbEntry.setEnabled(testBool);
        
        CreateCsdbEntry = new AppMenuPrimaryEntry(getIcon("database.png"),"Create CSDB",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); //To change body of generated methods, choose Tools | Templates.
            }
        },CommandButtonKind.ACTION_ONLY);
        CreateCsdbEntry.setEnabled(testBool);
        
        /*
            create the change user menu entry
        */
        ChgUserEntry = new AppMenuPrimaryEntry(getIcon("user-56.png"),"Change User",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); //To change body of generated methods, choose Tools | Templates.
            }
        },CommandButtonKind.ACTION_ONLY);
        ChgUserEntry.setEnabled(testBool);
        /*
            create the login menu entry
        */
        loginEntry = new AppMenuPrimaryEntry(getIcon("login.png"),"Login",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.exit(0); //To change body of generated methods, choose Tools | Templates.
                testBool = true;
                ChgCsdbEntry.setEnabled(testBool);
                CreateCsdbEntry.setEnabled(testBool);
                ChgUserEntry.setEnabled(testBool);
            }
        },CommandButtonKind.ACTION_ONLY);
        /*
            create the exit menu entry
        */
        exitEntry = new AppMenuPrimaryEntry(getIcon("exit.png"),"Exit",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 System.exit(0);//To change body of generated methods, choose Tools | Templates.
            }
        },CommandButtonKind.ACTION_ONLY);
        this.addMenuEntry(loginEntry);
        this.addMenuEntry(ChgCsdbEntry);
        this.addMenuEntry(CreateCsdbEntry);
        this.addMenuEntry(ChgUserEntry);
        this.addMenuEntry(exitEntry);
//        this.addMenuEntry(new AppMenuPrimaryEntry(null,"Test",null,null));
//        this.addMenuEntry(new AppMenuPrimaryEntry(null,"Test 1",null,null));
//        this.addMenuEntry(new AppMenuPrimaryEntry(null,"Test 2",null,null));
    }
    
    private ResizableIcon getIcon(String res)
    {
        String resource = "com/furst/faultrep/icons/" + res;
        return ImageWrapperResizableIcon.getIcon(AppMenu.class.getClassLoader().getResource(resource), new Dimension(32,32));
    }
}
