package com.zxc.user.po;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author zhongxiancai
 * @Description
 * @Date: Created in 2019/3/25 10:46.
 * @Modified By:
 */
@Entity
public class User {
    @Id
    private String id;
    @Column
    private String userName;
    @Column
    private String passWord;
    @Column
    private String createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
