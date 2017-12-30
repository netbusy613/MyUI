/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netbusy.myui.tab.bytab;

import java.util.ArrayList;

/**
 *
 * @author netbusy613
 */
public class ByTabs {
    private ArrayList<ByTab> ByTabList;

    public ByTabs(ArrayList<ByTab> ByTabList) {
        this.ByTabList = ByTabList;
    }

    public ByTabs() {
    }

    public ArrayList<ByTab> getByTabList() {
        return ByTabList;
    }

    public void setByTabList(ArrayList<ByTab> ByTabList) {
        this.ByTabList = ByTabList;
    }
    
}
