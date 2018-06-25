/*
 * This file is generated by jOOQ.
*/
package com.guoguo.domain.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 用户表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUserObj implements Serializable {

    private static final long serialVersionUID = -1287417136;

    private Integer   id;
    private String    username;
    private String    password;
    private String    realName;
    private String    phone;
    private String    email;
    private String    qqNum;
    private String    wechatNum;
    private Integer   score;
    private String    careerType;
    private Integer   workTime;
    private String    specialty;
    private String    intro;
    private String    userUrl;
    private String    icon;
    private String    sex;
    private String    address;
    private Integer   status;
    private String    mcode;
    private Timestamp sendTime;
    private String    createTime;
    private String    createUser;
    private String    updateTime;
    private String    updateUser;

    public TUserObj() {}

    public TUserObj(TUserObj value) {
        this.id = value.id;
        this.username = value.username;
        this.password = value.password;
        this.realName = value.realName;
        this.phone = value.phone;
        this.email = value.email;
        this.qqNum = value.qqNum;
        this.wechatNum = value.wechatNum;
        this.score = value.score;
        this.careerType = value.careerType;
        this.workTime = value.workTime;
        this.specialty = value.specialty;
        this.intro = value.intro;
        this.userUrl = value.userUrl;
        this.icon = value.icon;
        this.sex = value.sex;
        this.address = value.address;
        this.status = value.status;
        this.mcode = value.mcode;
        this.sendTime = value.sendTime;
        this.createTime = value.createTime;
        this.createUser = value.createUser;
        this.updateTime = value.updateTime;
        this.updateUser = value.updateUser;
    }

    public TUserObj(
        Integer   id,
        String    username,
        String    password,
        String    realName,
        String    phone,
        String    email,
        String    qqNum,
        String    wechatNum,
        Integer   score,
        String    careerType,
        Integer   workTime,
        String    specialty,
        String    intro,
        String    userUrl,
        String    icon,
        String    sex,
        String    address,
        Integer   status,
        String    mcode,
        Timestamp sendTime,
        String    createTime,
        String    createUser,
        String    updateTime,
        String    updateUser
    ) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.realName = realName;
        this.phone = phone;
        this.email = email;
        this.qqNum = qqNum;
        this.wechatNum = wechatNum;
        this.score = score;
        this.careerType = careerType;
        this.workTime = workTime;
        this.specialty = specialty;
        this.intro = intro;
        this.userUrl = userUrl;
        this.icon = icon;
        this.sex = sex;
        this.address = address;
        this.status = status;
        this.mcode = mcode;
        this.sendTime = sendTime;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQqNum() {
        return this.qqNum;
    }

    public void setQqNum(String qqNum) {
        this.qqNum = qqNum;
    }

    public String getWechatNum() {
        return this.wechatNum;
    }

    public void setWechatNum(String wechatNum) {
        this.wechatNum = wechatNum;
    }

    public Integer getScore() {
        return this.score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getCareerType() {
        return this.careerType;
    }

    public void setCareerType(String careerType) {
        this.careerType = careerType;
    }

    public Integer getWorkTime() {
        return this.workTime;
    }

    public void setWorkTime(Integer workTime) {
        this.workTime = workTime;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getIntro() {
        return this.intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getUserUrl() {
        return this.userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMcode() {
        return this.mcode;
    }

    public void setMcode(String mcode) {
        this.mcode = mcode;
    }

    public Timestamp getSendTime() {
        return this.sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return this.createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return this.updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TUserObj other = (TUserObj) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        }
        else if (!username.equals(other.username))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        }
        else if (!password.equals(other.password))
            return false;
        if (realName == null) {
            if (other.realName != null)
                return false;
        }
        else if (!realName.equals(other.realName))
            return false;
        if (phone == null) {
            if (other.phone != null)
                return false;
        }
        else if (!phone.equals(other.phone))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        }
        else if (!email.equals(other.email))
            return false;
        if (qqNum == null) {
            if (other.qqNum != null)
                return false;
        }
        else if (!qqNum.equals(other.qqNum))
            return false;
        if (wechatNum == null) {
            if (other.wechatNum != null)
                return false;
        }
        else if (!wechatNum.equals(other.wechatNum))
            return false;
        if (score == null) {
            if (other.score != null)
                return false;
        }
        else if (!score.equals(other.score))
            return false;
        if (careerType == null) {
            if (other.careerType != null)
                return false;
        }
        else if (!careerType.equals(other.careerType))
            return false;
        if (workTime == null) {
            if (other.workTime != null)
                return false;
        }
        else if (!workTime.equals(other.workTime))
            return false;
        if (specialty == null) {
            if (other.specialty != null)
                return false;
        }
        else if (!specialty.equals(other.specialty))
            return false;
        if (intro == null) {
            if (other.intro != null)
                return false;
        }
        else if (!intro.equals(other.intro))
            return false;
        if (userUrl == null) {
            if (other.userUrl != null)
                return false;
        }
        else if (!userUrl.equals(other.userUrl))
            return false;
        if (icon == null) {
            if (other.icon != null)
                return false;
        }
        else if (!icon.equals(other.icon))
            return false;
        if (sex == null) {
            if (other.sex != null)
                return false;
        }
        else if (!sex.equals(other.sex))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        }
        else if (!address.equals(other.address))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (mcode == null) {
            if (other.mcode != null)
                return false;
        }
        else if (!mcode.equals(other.mcode))
            return false;
        if (sendTime == null) {
            if (other.sendTime != null)
                return false;
        }
        else if (!sendTime.equals(other.sendTime))
            return false;
        if (createTime == null) {
            if (other.createTime != null)
                return false;
        }
        else if (!createTime.equals(other.createTime))
            return false;
        if (createUser == null) {
            if (other.createUser != null)
                return false;
        }
        else if (!createUser.equals(other.createUser))
            return false;
        if (updateTime == null) {
            if (other.updateTime != null)
                return false;
        }
        else if (!updateTime.equals(other.updateTime))
            return false;
        if (updateUser == null) {
            if (other.updateUser != null)
                return false;
        }
        else if (!updateUser.equals(other.updateUser))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.username == null) ? 0 : this.username.hashCode());
        result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
        result = prime * result + ((this.realName == null) ? 0 : this.realName.hashCode());
        result = prime * result + ((this.phone == null) ? 0 : this.phone.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.qqNum == null) ? 0 : this.qqNum.hashCode());
        result = prime * result + ((this.wechatNum == null) ? 0 : this.wechatNum.hashCode());
        result = prime * result + ((this.score == null) ? 0 : this.score.hashCode());
        result = prime * result + ((this.careerType == null) ? 0 : this.careerType.hashCode());
        result = prime * result + ((this.workTime == null) ? 0 : this.workTime.hashCode());
        result = prime * result + ((this.specialty == null) ? 0 : this.specialty.hashCode());
        result = prime * result + ((this.intro == null) ? 0 : this.intro.hashCode());
        result = prime * result + ((this.userUrl == null) ? 0 : this.userUrl.hashCode());
        result = prime * result + ((this.icon == null) ? 0 : this.icon.hashCode());
        result = prime * result + ((this.sex == null) ? 0 : this.sex.hashCode());
        result = prime * result + ((this.address == null) ? 0 : this.address.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.mcode == null) ? 0 : this.mcode.hashCode());
        result = prime * result + ((this.sendTime == null) ? 0 : this.sendTime.hashCode());
        result = prime * result + ((this.createTime == null) ? 0 : this.createTime.hashCode());
        result = prime * result + ((this.createUser == null) ? 0 : this.createUser.hashCode());
        result = prime * result + ((this.updateTime == null) ? 0 : this.updateTime.hashCode());
        result = prime * result + ((this.updateUser == null) ? 0 : this.updateUser.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TUserObj (");

        sb.append(id);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(realName);
        sb.append(", ").append(phone);
        sb.append(", ").append(email);
        sb.append(", ").append(qqNum);
        sb.append(", ").append(wechatNum);
        sb.append(", ").append(score);
        sb.append(", ").append(careerType);
        sb.append(", ").append(workTime);
        sb.append(", ").append(specialty);
        sb.append(", ").append(intro);
        sb.append(", ").append(userUrl);
        sb.append(", ").append(icon);
        sb.append(", ").append(sex);
        sb.append(", ").append(address);
        sb.append(", ").append(status);
        sb.append(", ").append(mcode);
        sb.append(", ").append(sendTime);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createUser);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(updateUser);

        sb.append(")");
        return sb.toString();
    }
}
