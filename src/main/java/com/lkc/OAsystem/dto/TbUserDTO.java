package com.lkc.OAsystem.dto;

import java.util.List;

public class TbUserDTO {
    private int userId;
    private String userName;
    private String userEmail;
    private String userWorkid;
    private String userEdu;
    private String userCollege;
    private String userIDcard;
    private String userAddtime;
    private String userPassword;
    private String userSalt;
    private String userSex;
    private String userTel;
    private String userAddress;
    private String userImg;
    private int deptId;
    private  TbDeptDTO deptDTO;
    private List<TbOverorleavetimeDTO> overorleavetimeDTOS;
    private List<TbCheckDTO> checkDTOS;
    private List<TbAnnunciateDTO> annunciateDTOS;

    public List<TbOverorleavetimeDTO> getOverorleavetimeDTOS() {
        return overorleavetimeDTOS;
    }

    public void setOverorleavetimeDTOS(List<TbOverorleavetimeDTO> overorleavetimeDTOS) {
        this.overorleavetimeDTOS = overorleavetimeDTOS;
    }

    public List<TbCheckDTO> getCheckDTOS() {
        return checkDTOS;
    }

    public void setCheckDTOS(List<TbCheckDTO> checkDTOS) {
        this.checkDTOS = checkDTOS;
    }

    public List<TbAnnunciateDTO> getAnnunciateDTOS() {
        return annunciateDTOS;
    }

    public void setAnnunciateDTOS(List<TbAnnunciateDTO> annunciateDTOS) {
        this.annunciateDTOS = annunciateDTOS;
    }

    public TbDeptDTO getDeptDTO() {
        return deptDTO;
    }

    public void setDeptDTO(TbDeptDTO deptDTO) {
        this.deptDTO = deptDTO;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserWorkid() {
        return userWorkid;
    }

    public void setUserWorkid(String userWorkid) {
        this.userWorkid = userWorkid;
    }

    public String getUserEdu() {
        return userEdu;
    }

    public void setUserEdu(String userEdu) {
        this.userEdu = userEdu;
    }

    public String getUserCollege() {
        return userCollege;
    }

    public void setUserCollege(String userCollege) {
        this.userCollege = userCollege;
    }

    public String getUserIDcard() {
        return userIDcard;
    }

    public void setUserIDcard(String userIDcard) {
        this.userIDcard = userIDcard;
    }

    public String getUserAddtime() {
        return userAddtime;
    }

    public void setUserAddtime(String userAddtime) {
        this.userAddtime = userAddtime;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbUserDTO tbUserDTO = (TbUserDTO) o;

        if (userId != tbUserDTO.userId) return false;
        if (deptId != tbUserDTO.deptId) return false;
        if (userName != null ? !userName.equals(tbUserDTO.userName) : tbUserDTO.userName != null) return false;
        if (userEmail != null ? !userEmail.equals(tbUserDTO.userEmail) : tbUserDTO.userEmail != null) return false;
        if (userWorkid != null ? !userWorkid.equals(tbUserDTO.userWorkid) : tbUserDTO.userWorkid != null) return false;
        if (userEdu != null ? !userEdu.equals(tbUserDTO.userEdu) : tbUserDTO.userEdu != null) return false;
        if (userCollege != null ? !userCollege.equals(tbUserDTO.userCollege) : tbUserDTO.userCollege != null)
            return false;
        if (userIDcard != null ? !userIDcard.equals(tbUserDTO.userIDcard) : tbUserDTO.userIDcard != null) return false;
        if (userAddtime != null ? !userAddtime.equals(tbUserDTO.userAddtime) : tbUserDTO.userAddtime != null)
            return false;
        if (userPassword != null ? !userPassword.equals(tbUserDTO.userPassword) : tbUserDTO.userPassword != null)
            return false;
        if (userSalt != null ? !userSalt.equals(tbUserDTO.userSalt) : tbUserDTO.userSalt != null) return false;
        if (userSex != null ? !userSex.equals(tbUserDTO.userSex) : tbUserDTO.userSex != null) return false;
        if (userTel != null ? !userTel.equals(tbUserDTO.userTel) : tbUserDTO.userTel != null) return false;
        if (userAddress != null ? !userAddress.equals(tbUserDTO.userAddress) : tbUserDTO.userAddress != null)
            return false;
        if (userImg != null ? !userImg.equals(tbUserDTO.userImg) : tbUserDTO.userImg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userWorkid != null ? userWorkid.hashCode() : 0);
        result = 31 * result + (userEdu != null ? userEdu.hashCode() : 0);
        result = 31 * result + (userCollege != null ? userCollege.hashCode() : 0);
        result = 31 * result + (userIDcard != null ? userIDcard.hashCode() : 0);
        result = 31 * result + (userAddtime != null ? userAddtime.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        result = 31 * result + (userSalt != null ? userSalt.hashCode() : 0);
        result = 31 * result + (userSex != null ? userSex.hashCode() : 0);
        result = 31 * result + (userTel != null ? userTel.hashCode() : 0);
        result = 31 * result + (userAddress != null ? userAddress.hashCode() : 0);
        result = 31 * result + (userImg != null ? userImg.hashCode() : 0);
        result = 31 * result + deptId;
        return result;
    }
}
