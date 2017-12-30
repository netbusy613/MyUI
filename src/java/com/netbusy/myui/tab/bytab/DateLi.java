/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netbusy.myui.tab.bytab;

import java.util.Date;

/**
 *
 * @author netbusy613
 */
public class DateLi {
    private Date date;
    private String txt;
    private String url;

    public DateLi(){
        
    }

    public DateLi(Date date, String txt, String url) {
        this.date = date;
        this.txt = txt;
        this.url = url;
    }

    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
