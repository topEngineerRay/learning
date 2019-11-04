package com.dr.learning;

import java.util.ArrayList;
import java.util.List;

import com.dr.learning.model.Dept;

public class DeptDao  {
    public static List<Dept> searchAllDept() throws Exception {
        List<Object[]> listAllObject = new ArrayList<Object[]>();
        List<Object[]> tmp = new ArrayList<Object[]>();
        List<Dept> listAllDept = new ArrayList<Dept>();
        //String sql = "select id,dname,up_did from tbl_dept";
        //listAllObject = getResult(sql);
        for (Object[] row : listAllObject) {
            Object[] ro = new Object[3];
            ro[0] = row[0];
            ro[1] = row[1];
            ro[2] = row[2];
            tmp.add(row);
        }
        for (Object[] row : tmp) {
            if (null == row[2]) {
                Dept d = new Dept();
                d.setId(Integer.parseInt(String.valueOf(row[0])));
                d.setDname(String.valueOf(row[1]));
                listAllDept.add(d);
                fomateDept(tmp, d);
            }
        }
        return listAllDept;
    }

    private static void fomateDept(List<Object[]> tmp, Dept dept) {
        for (Object[] row : tmp) {
            if ((null != row[2])
                    && Integer.parseInt(String.valueOf(row[2])) == dept.getId()) {
                Dept d = new Dept();
                d.setId(Integer.parseInt(String.valueOf(row[0])));
                d.setDname(String.valueOf(row[1]));
                List<Dept> list = dept.getChildren();
                if (list == null) {
                    list = new ArrayList<Dept>();
                }
                list.add(d);
                dept.setChildren(list);
                fomateDept(tmp, d);
            }
        }
    }
}