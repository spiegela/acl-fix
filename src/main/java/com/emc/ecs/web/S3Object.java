package com.emc.ecs.web;

import java.net.URL;
import java.util.Date;

public class S3Object {

    private String key;
    private String name;
    private Date date;
    private String acls;
    private Boolean bad;

    S3Object(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String getAcls() {
        return acls;
    }

    public void setAcls(String acls) {
        this.acls = acls;
    }

    public Boolean getBad() {
        return bad;
    }

    public void setBad(Boolean bad) {
        this.bad = bad;
    }
}
