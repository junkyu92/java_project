package com.mega.mvctest;

public class NewsDTO {
	String title;
	String pubDate;
	String link;
	String author;
	
	public NewsDTO(String title, String pubDate, String link, String author) {
		super();
		this.title = title;
		this.pubDate = pubDate;
		this.link = link;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "newsDTO [title=" + title + ", pubDate=" + pubDate + ", link=" + link + ", author=" + author + "]";
	}
	
}
