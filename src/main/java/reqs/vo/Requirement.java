package reqs.vo;

import java.util.Date;

public class Requirement {
    private Integer id;

    private String shortDesc;

    private String detail;

    private String onlinetime;

    private String img;

    private String dept;

    private String puter;

    private String connecttype;

    private String connecttypevalue;

    private Date ctime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc == null ? null : shortDesc.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getOnlinetime() {
        return onlinetime;
    }

    public void setOnlinetime(String onlinetime) {
        this.onlinetime = onlinetime == null ? null : onlinetime.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getPuter() {
        return puter;
    }

    public void setPuter(String puter) {
        this.puter = puter == null ? null : puter.trim();
    }

    public String getConnecttype() {
        return connecttype;
    }

    public void setConnecttype(String connecttype) {
        this.connecttype = connecttype == null ? null : connecttype.trim();
    }

    public String getConnecttypevalue() {
        return connecttypevalue;
    }

    public void setConnecttypevalue(String connecttypevalue) {
        this.connecttypevalue = connecttypevalue == null ? null : connecttypevalue.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}