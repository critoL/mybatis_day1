package com.lkc.OAsystem.dto;

public class TbJurisdictionDTO {
    private int juriId;
    private String juriName;

    public int getJuriId() {
        return juriId;
    }

    public void setJuriId(int juriId) {
        this.juriId = juriId;
    }

    public String getJuriName() {
        return juriName;
    }

    public void setJuriName(String juriName) {
        this.juriName = juriName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbJurisdictionDTO that = (TbJurisdictionDTO) o;

        if (juriId != that.juriId) return false;
        if (juriName != null ? !juriName.equals(that.juriName) : that.juriName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = juriId;
        result = 31 * result + (juriName != null ? juriName.hashCode() : 0);
        return result;
    }
}
