package com.example.demo.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class MemberVO {

    private int user_no; // 계정번호
    private String id;
    private String pwd;
    private String name;
    private String gen;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;
    private String tel;
    private Date regdate;   // 가입날짜
    private Date last_login; // 마지막로그인
    private String c_no; // 업체코드
    private String email;
    private String addr;
    private int enabled;

    // Getter 메서드
    public int getUser_no() {
        return user_no;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public String getGen() {
        return gen;
    }

    public Date getBirth() {
        return birth;
    }

    public String getTel() {
        return tel;
    }

    public Date getRegdate() {
        return regdate;
    }

    public Date getLast_login() {
        return last_login;
    }

    public String getC_no() {
        return c_no;
    }

    public String getEmail() {
        return email;
    }

    public String getAddr() {
        return addr;
    }

    public int getEnabled() {
        return enabled;
    }

    // Setter 메서드
    public void setUser_no(int user_no) {
        this.user_no = user_no;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public void setC_no(String c_no) {
        this.c_no = c_no;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public MemberVO() {}

    public MemberVO(String id, String pwd, String name, Date birth, String gen, String email, String tel, String addr) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.birth = birth;
        this.gen = gen;
        this.email = email;
        this.tel = tel;
        this.addr = addr;
    }
}
