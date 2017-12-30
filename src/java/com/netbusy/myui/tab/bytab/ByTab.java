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
public class ByTab {
    private String name;
    private String url;
    private ArrayList<DateLi> dateLists;

    public ByTab() {
    }

    public ByTab(String name, String url, ArrayList<DateLi> dateLists) {
        this.name = name;
        this.url = url;
        this.dateLists = dateLists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<DateLi> getDateLists() {
        return dateLists;
    }

    public void setDateLists(ArrayList<DateLi> dateLists) {
        this.dateLists = dateLists;
    }
    
    
}
