package com.sangjin.model.dto;

public class MnoteDTO {

	private int memoNo;
	private String title;
	private String author;
	private String content;
	private String createDate;
	private String modifyDate;
	private boolean delYn;
	
	public MnoteDTO() {
		super();
	}

	public MnoteDTO(int memoNo, String title, String author, String content, String createDate, String modifyDate,
			boolean delYn) {
		super();
		this.memoNo = memoNo;
		this.title = title;
		this.author = author;
		this.content = content;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.delYn = delYn;
	}

	public int getMemoNo() {
		return memoNo;
	}

	public void setMemoNo(int memoNo) {
		this.memoNo = memoNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public void setmodifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public boolean isDelYn() {
		return delYn;
	}

	public void setDelYn(boolean delYn) {
		this.delYn = delYn;
	}

	@Override
	public String toString() {
		return "MnoteDTO [memoNo=" + memoNo + ", title=" + title + ", author=" + author + ", content=" + content
				+ ", createDate=" + createDate + ", modifyDate=" + modifyDate + ", delYn=" + delYn + "]";
	}
	
	
	
}
