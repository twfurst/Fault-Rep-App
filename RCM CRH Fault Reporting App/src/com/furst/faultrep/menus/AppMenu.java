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
    private AppMenuPrimaryEntry exitEntry;
    public AppMenu()
    {
        /*
            create the exit menu entry
        */
        exitEntry = new AppMenuPrimaryEntry(getIcon("exit.png"),"Exit",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 System.exit(0);//To change body of generated methods, choose Tools | Templates.
            }
        },CommandButtonKind.ACTION_ONLY);

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
