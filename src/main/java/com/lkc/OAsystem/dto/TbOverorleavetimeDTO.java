package com.lkc.OAsystem.dto;

public class TbOverorleavetimeDTO {
    private int overtimeId;
    private Integer userId;
    private String overtimeBegin;
    private String overtimeEnd;
    private String leavetimeBegin;
    private String leavetimeEnd;

    public int getOvertimeId() {
        return overtimeId;
    }

    public void setOvertimeId(int overtimeId) {
        this.overtimeId = overtimeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOvertimeBegin() {
        return overtimeBegin;
    }

    public void setOvertimeBegin(String overtimeBegin) {
        this.overtimeBegin = overtimeBegin;
    }

    public String getOvertimeEnd() {
        return overtimeEnd;
    }

    public void setOvertimeEnd(String overtimeEnd) {
        this.overtimeEnd = overtimeEnd;
    }

    public String getLeavetimeBegin() {
        return leavetimeBegin;
    }

    public void setLeavetimeBegin(String leavetimeBegin) {
        this.leavetimeBegin = leavetimeBegin;
    }

    public String getLeavetimeEnd() {
        return leavetimeEnd;
    }

    public void setLeavetimeEnd(String leavetimeEnd) {
        this.leavetimeEnd = leavetimeEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbOverorleavetimeDTO that = (TbOverorleavetimeDTO) o;

        if (overtimeId != that.overtimeId) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (overtimeBegin != null ? !overtimeBegin.equals(that.overtimeBegin) : that.overtimeBegin != null)
            return false;
        if (overtimeEnd != null ? !overtimeEnd.equals(that.overtimeEnd) : that.overtimeEnd != null) return false;
        if (leavetimeBegin != null ? !leavetimeBegin.equals(that.leavetimeBegin) : that.leavetimeBegin != null)
            return false;
        if (leavetimeEnd != null ? !leavetimeEnd.equals(that.leavetimeEnd) : that.leavetimeEnd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = overtimeId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (overtimeBegin != null ? overtimeBegin.hashCode() : 0);
        result = 31 * result + (overtimeEnd != null ? overtimeEnd.hashCode() : 0);
        result = 31 * result + (leavetimeBegin != null ? leavetimeBegin.hashCode() : 0);
        result = 31 * result + (leavetimeEnd != null ? leavetimeEnd.hashCode() : 0);
        return result;
    }
}
