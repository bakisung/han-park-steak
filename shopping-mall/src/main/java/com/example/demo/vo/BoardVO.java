package com.example.demo.vo;

import java.util.Date;

public class BoardVO {

    private String board_no;
    private String user_number;
    private String title;
    private String content;
    private String writer;
    private Date regdate;
    private int enabled;
    private String files;
    private String file_name;
    private Date update_date;
    private String updater;
    private int view_count;
    private int like_count;

    // Getter 메서드
    public String getBoard_no() {
        return board_no;
    }

    public String getUser_number() {
        return user_number;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public Date getRegdate() {
        return regdate;
    }

    public int getEnabled() {
        return enabled;
    }

    public String getFiles() {
        return files;
    }

    public String getFile_name() {
        return file_name;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public String getUpdater() {
        return updater;
    }

    public int getView_count() {
        return view_count;
    }

    public int getLike_count() {
        return like_count;
    }

    // Setter 메서드
    public void setBoard_no(String board_no) {
        this.board_no = board_no;
    }

    public void setUser_number(String user_number) {
        this.user_number = user_number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public void setView_count(int view_count) {
        this.view_count = view_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }
}
