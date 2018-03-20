package com.lkc.OAsystem.dto;

public class TbRoleJuriDTO {
    private int rjId;
    private Integer rjRoleId;
    private Integer rjJuriId;

    public int getRjId() {
        return rjId;
    }

    public void setRjId(int rjId) {
        this.rjId = rjId;
    }

    public Integer getRjRoleId() {
        return rjRoleId;
    }

    public void setRjRoleId(Integer rjRoleId) {
        this.rjRoleId = rjRoleId;
    }

    public Integer getRjJuriId() {
        return rjJuriId;
    }

    public void setRjJuriId(Integer rjJuriId) {
        this.rjJuriId = rjJuriId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbRoleJuriDTO that = (TbRoleJuriDTO) o;

        if (rjId != that.rjId) return false;
        if (rjRoleId != null ? !rjRoleId.equals(that.rjRoleId) : that.rjRoleId != null) return false;
        if (rjJuriId != null ? !rjJuriId.equals(that.rjJuriId) : that.rjJuriId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rjId;
        result = 31 * result + (rjRoleId != null ? rjRoleId.hashCode() : 0);
        result = 31 * result + (rjJuriId != null ? rjJuriId.hashCode() : 0);
        return result;
    }
}
