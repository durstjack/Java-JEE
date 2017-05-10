package main.java.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sites")
public class SiteVO {

	private int id;
	private String url;
	private String author;
	private List<PageVO> pages;

	public SiteVO() {
		this(0, "", "", new ArrayList<PageVO>());
	}
	
	public SiteVO(int id, String url, String author, List<PageVO> pages) {
		super();
		this.id = id;
		this.url = url;
		this.author = author;
		this.pages = pages;
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@OneToMany(mappedBy="site"/*, fetch=FetchType.EAGER*/)
	public List<PageVO> getPages() {
		return pages;
	}

	public void setPages(List<PageVO> pages) {
		this.pages = pages;
	}

}
