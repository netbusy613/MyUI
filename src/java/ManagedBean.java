/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.netbusy.myui.tab.bytab.ByTab;
import com.netbusy.myui.tab.bytab.ByTabs;
import com.netbusy.myui.tab.bytab.DateLi;
import java.util.ArrayList;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author netbusy613
 */
@Named(value = "managedBean")
@RequestScoped
public class ManagedBean {

    /**
     * Creates a new instance of ManagedBean
     */
    public ManagedBean() {
    }
    
    private ByTabs bytabs;
    private ByTab bytab;

    public ByTab getBytab() {
        if(bytab==null){
            bytab = new ByTab();
            ArrayList<DateLi> al = new ArrayList();
            DateLi li1= new DateLi(new Date(),"泛接受的价格时间大概就是链接www.baidu.com","#");
                al.add(li1);
            for(int i = 0;i<10;i++){
                DateLi li= new DateLi(new Date(),"段官方觉得；广泛接放松放松公司的股份开始的胡椒粉和公司老客警方根据法国就sdfasfassddasfds郭德纲说的归属感是否公司的分公司的功夫十多个父好房管局很反感黄金分割和交话费户订购螺丝刀交流空间看了设计风格上看见的老公放假受的价格时间大概就是链接"+i,"www.baidu.com");
                al.add(li);
            }
            bytab.setDateLists(al);
            bytab.setName("测试链接1");
            bytab.setUrl("#");
            ArrayList<ByTab> bl = new ArrayList();
            bl.add(bytab);
            bl.add(bytab);
            bl.add(bytab);
        }
        return bytab;
    }
    
    

    public ByTabs getBytabs() {
        if(bytabs==null){
            bytabs = new ByTabs();
            ByTab bytab = new ByTab();
            ArrayList<DateLi> al = new ArrayList();
            DateLi li1= new DateLi(new Date(),"泛接受的价格时间大概就是链接www.baidu.com","#");
                al.add(li1);
            for(int i = 0;i<10;i++){
                DateLi li= new DateLi(new Date(),"段官方觉得；广泛接放松放松公司的股份开始的胡椒粉和公司老客警方根据法国就sdfasfassddasfds郭德纲说的归属感是否公司的分公司的功夫十多个父好房管局很反感黄金分割和交话费户订购螺丝刀交流空间看了设计风格上看见的老公放假受的价格时间大概就是链接"+i,"www.baidu.com");
                al.add(li);
            }
            bytab.setDateLists(al);
            bytab.setName("测试链接1");
            bytab.setUrl("#");
            ArrayList<ByTab> bl = new ArrayList();
            bl.add(bytab);
            bl.add(bytab);
            bl.add(bytab);
            bytabs.setByTabList(bl);
        }
        return bytabs;
    }
    
    
}
