package com.lkc.OAsystem.dto;

public class TbCheckDTO {
    private int checkId;
    private Integer userId;
    private String onDuty;
    private String offDuty;

    public int getCheckId() {
        return checkId;
    }

    public void setCheckId(int checkId) {
        this.checkId = checkId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOnDuty() {
        return onDuty;
    }

    public void setOnDuty(String onDuty) {
        this.onDuty = onDuty;
    }

    public String getOffDuty() {
        return offDuty;
    }

    public void setOffDuty(String offDuty) {
        this.offDuty = offDuty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbCheckDTO that = (TbCheckDTO) o;

        if (checkId != that.checkId) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (onDuty != null ? !onDuty.equals(that.onDuty) : that.onDuty != null) return false;
        if (offDuty != null ? !offDuty.equals(that.offDuty) : that.offDuty != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = checkId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (onDuty != null ? onDuty.hashCode() : 0);
        result = 31 * result + (offDuty != null ? offDuty.hashCode() : 0);
        return result;
    }
}
