package com.mega.mvc14;

public class ReplyDTO {
	private String id;
	private String content;
	private String writer;
	private String bbsid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getBbsid() {
		return bbsid;
	}
	public void setBbsid(String bbsid) {
		this.bbsid = bbsid;
	}
	@Override
	public String toString() {
		return "ReplyDTO [id=" + id + ", content=" + content + ", writer=" + writer + ", bbsid=" + bbsid + "]";
	}
	
}
