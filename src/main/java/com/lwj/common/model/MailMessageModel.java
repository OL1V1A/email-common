package com.lwj.common.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.File;
import java.io.Serializable;

/**
 * @Auth: lwj
 * @Date: 2019/6/27 10:13
 */
public class MailMessageModel implements Serializable {

    @JSONField(name = "from")
    private String from;

    @JSONField(name = "to")
    private String to;

    @JSONField(name = "subject")
    private String subject;

    @JSONField(name = "text")
    private String text;

    private File[] files;

    public File[] getFiles() {
        return files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Email{from:").append(this.from).append(", ");
        sb.append("to:").append(this.to).append(", ");
        sb.append("subject:").append(this.subject).append(", ");
        sb.append("text:").append(this.text).append("}");
        return sb.toString();
    }
}
