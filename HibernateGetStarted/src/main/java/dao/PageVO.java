package main.java.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="pages")
public class PageVO {	

	public PageVO() {
		this(0, 0, "", "");
	}
	public PageVO(int size, int status, String header, String content) {
		super();
		this.size = size;
		this.status = status;
		this.header = header;
		this.content = content;
	}

	private int id;
	private int size;
	private int status;
	private String header;
	private String content;
	private SiteVO site;
	
	@Id
	@GeneratedValue	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne
	public SiteVO getSite() {
		return site;
	}
	public void setSite(SiteVO site) {
		this.site = site;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
