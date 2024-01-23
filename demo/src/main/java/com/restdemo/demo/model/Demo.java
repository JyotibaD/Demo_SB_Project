package com.restdemo.demo.model;

public class Demo {
    private String demoId;
    private String demoName;
    private String demoPhone;

    public Demo() {

    }

    public Demo(String demoId, String demoName, String demoPhone) {
        this.demoId = demoId;
        this.demoName = demoName;
        this.demoPhone = demoPhone;
    }

    public String getDemoId() {
        return demoId;
    }

    public void setDemoId(String demoId) {
        this.demoId = demoId;
    }

    public String getDemoName() {
        return demoName;
    }

    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }

    public String getDemoPhone() {
        return demoPhone;
    }

    public void setDemoPhone(String demoPhone) {
        this.demoPhone = demoPhone;
    }
}
