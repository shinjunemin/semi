package com.example.billirdproject;

public class BeanAdmin {
    //관리자
    private String adId;
    private int adPass;
    private String adName;
    private int adPhone;

    //생성자로 초기값 저장 - 관리자
    public BeanAdmin (String adId1, int adPass1, String adName1, int adPhone1){

    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    public int getAdPass() {
        return adPass;
    }

    public void setAdPass(int adPass) {
        this.adPass = adPass;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public int getAdPhone() {
        return adPhone;
    }

    public void setAdPhone(int adPhone) {
        this.adPhone = adPhone;
    }
}
