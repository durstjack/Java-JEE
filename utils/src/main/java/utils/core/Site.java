package utils.core;

import java.util.ArrayList;
import java.util.List;

public class Site {
	
	private String url;
	private String author;
	private List<Page> pages;
	
	public Site() {
		this("", "", new ArrayList<Page>());
	}
	
	public Site(String url, String author, List<Page> pages) {
		super();
		this.url = url;
		this.author = author;
		this.pages = pages;
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
	public List<Page> getPages() {
		return pages;
	}
	public void setPages(List<Page> pages) {
		this.pages = pages;
	}

}
