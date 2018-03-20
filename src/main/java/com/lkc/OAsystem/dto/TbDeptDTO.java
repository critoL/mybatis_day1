package com.lkc.OAsystem.dto;

import java.util.List;

public class TbDeptDTO {
    private int deptId;
    private String deptName;
    private String deptTel;
    private String deptCheif;
    private String deptAddress;
    private List<TbUserDTO> userDTOList;

    public List<TbUserDTO> getUserDTOList() {
        return userDTOList;
    }

    public void setUserDTOList(List<TbUserDTO> userDTOList) {
        this.userDTOList = userDTOList;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptTel() {
        return deptTel;
    }

    public void setDeptTel(String deptTel) {
        this.deptTel = deptTel;
    }

    public String getDeptCheif() {
        return deptCheif;
    }

    public void setDeptCheif(String deptCheif) {
        this.deptCheif = deptCheif;
    }

    public String getDeptAddress() {
        return deptAddress;
    }

    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbDeptDTO tbDeptDTO = (TbDeptDTO) o;

        if (deptId != tbDeptDTO.deptId) return false;
        if (deptName != null ? !deptName.equals(tbDeptDTO.deptName) : tbDeptDTO.deptName != null) return false;
        if (deptTel != null ? !deptTel.equals(tbDeptDTO.deptTel) : tbDeptDTO.deptTel != null) return false;
        if (deptCheif != null ? !deptCheif.equals(tbDeptDTO.deptCheif) : tbDeptDTO.deptCheif != null) return false;
        if (deptAddress != null ? !deptAddress.equals(tbDeptDTO.deptAddress) : tbDeptDTO.deptAddress != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deptId;
        result = 31 * result + (deptName != null ? deptName.hashCode() : 0);
        result = 31 * result + (deptTel != null ? deptTel.hashCode() : 0);
        result = 31 * result + (deptCheif != null ? deptCheif.hashCode() : 0);
        result = 31 * result + (deptAddress != null ? deptAddress.hashCode() : 0);
        return result;
    }
}
