package com.example.billirdproject;

public class BeanPlayer {
    //사용자
    private String plId;
    private int plPass;
    private String plName;
    private int plWin;
    private int plLose;

    //생성자로 초기값 저장 - 사용자
    public BeanPlayer (String plId1, int plPass1, String plName1, int plWin, int plLose){

    }

    public String getPlId() {
        return plId;
    }

    public void setPlId(String plId) {
        this.plId = plId;
    }

    public int getPlPass() {
        return plPass;
    }

    public void setPlPass(int plPass) {
        this.plPass = plPass;
    }

    public String getPlName() {
        return plName;
    }

    public void setPlName(String plName) {
        this.plName = plName;
    }

    public int getPlWin() {
        return plWin;
    }

    public void setPlWin(int plWin) {
        this.plWin = plWin;
    }

    public int getPlLose() {
        return plLose;
    }

    public void setPlLose(int plLose) {
        this.plLose = plLose;
    }
}
