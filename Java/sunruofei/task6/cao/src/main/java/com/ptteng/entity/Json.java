package com.ptteng.entity;

import java.io.Serializable;

/**
 * @ClassName Json
 * @Description TODO
 * @Author 孙若飞
 * @Date 2019/2/22  17:43
 * @Version 1.0
 **/
public class Json implements Serializable{
    private Long id;
    private String name;
    private Long qq;
    private Long phone;

    @Override
    public String toString() {
        return "Json{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qq=" + qq +
                ", phone=" + phone +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQq() {
        return qq;
    }

    public void setQq(Long qq) {
        this.qq = qq;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
}