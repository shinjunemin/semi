package com.example.billirdproject;

import java.util.Date;

public class BeanSales {
    //매출
    private int saNum;
    private Date saDay;
    private int saTime;
    private int saMoney;

    //생성자로 초기값 저장 - 매출
    public BeanSales (int saNum, Date saDay, int saTime, int saMoney){

    }

    public int getSaNum() {
        return saNum;
    }

    public void setSaNum(int saNum) {
        this.saNum = saNum;
    }

    public Date getSaDay() {
        return saDay;
    }

    public void setSaDay(Date saDay) {
        this.saDay = saDay;
    }

    public int getSaTime() {
        return saTime;
    }

    public void setSaTime(int saTime) {
        this.saTime = saTime;
    }

    public int getSaMoney() {
        return saMoney;
    }

    public void setSaMoney(int saMoney) {
        this.saMoney = saMoney;
    }
}
