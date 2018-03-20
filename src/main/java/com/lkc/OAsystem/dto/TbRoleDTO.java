package com.lkc.OAsystem.dto;

public class TbRoleDTO {
    private int roleId;
    private String roleName;
    private Integer deptId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbRoleDTO tbRoleDTO = (TbRoleDTO) o;

        if (roleId != tbRoleDTO.roleId) return false;
        if (roleName != null ? !roleName.equals(tbRoleDTO.roleName) : tbRoleDTO.roleName != null) return false;
        if (deptId != null ? !deptId.equals(tbRoleDTO.deptId) : tbRoleDTO.deptId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        result = 31 * result + (deptId != null ? deptId.hashCode() : 0);
        return result;
    }
}
