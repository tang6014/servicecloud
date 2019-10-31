package com.atguigu.springcloud.entities;

import java.io.Serializable;
import java.util.Objects;

//Dept(Entity) orm mysql->Dept(table) 类表关系映射

public class Dept implements Serializable {

    /**
     *  部门编码 主键
     */
    private Long deptNo;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 数据库名称
     */
    private String dbSource;
    public Dept() {
        super();
    }

    public Dept(Long deptno, String dname, String db_sourcce) {
        super();
        this.deptNo = deptno;
        this.deptName = dname;
        this.dbSource = db_sourcce;
    }

    public Long getDeptno() {
        return deptNo;
    }

    public void setDeptno(Long deptno) {
        this.deptNo = deptno;
    }

    public String getDname() {
        return deptName;
    }

    public void setDname(String dname) {
        this.deptName = dname;
    }

    public String getDb_sourcce() {
        return dbSource;
    }

    public void setDb_sourcce(String db_sourcce) {
        this.dbSource = db_sourcce;
    }


    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptNo +
                ", dname='" + deptName + '\'' +
                ", db_sourcce='" + dbSource + '\'' +
                '}';
    }
}
