package com.lkc.OAsystem.dto;

public class TbAnnunciateDTO {
    private int annuId;
    private String annuTitle;
    private String annuTxt;
    private String annuAuthor;
    private int userId;

    public int getAnnuId() {
        return annuId;
    }

    public void setAnnuId(int annuId) {
        this.annuId = annuId;
    }

    public String getAnnuTitle() {
        return annuTitle;
    }

    public void setAnnuTitle(String annuTitle) {
        this.annuTitle = annuTitle;
    }

    public String getAnnuTxt() {
        return annuTxt;
    }

    public void setAnnuTxt(String annuTxt) {
        this.annuTxt = annuTxt;
    }

    public String getAnnuAuthor() {
        return annuAuthor;
    }

    public void setAnnuAuthor(String annuAuthor) {
        this.annuAuthor = annuAuthor;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
