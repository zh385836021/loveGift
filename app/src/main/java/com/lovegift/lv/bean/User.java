package com.lovegift.lv.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;


/**
 * Created by Zane on 2016/6/28.
 */
@Table(name="user")
public class User{
    @Column(name="_id",isId = true,autoGen = true)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="pwd")
    private String passWord;

    public User() {
    }

    public User(String name, String passWord) {
        this.name = name;
        this.passWord = passWord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
