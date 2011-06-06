package com.mounir.openfacture.entities;

// Generated 3 juin 2011 00:46:45 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * ArticleType generated by hbm2java
 */
public class ArticleType implements java.io.Serializable {

	private long id;
	private String code;
	private String description;
	private Set<Article> articles = new HashSet<Article>(0);

	public ArticleType() {
	}

	public ArticleType(long id) {
		this.id = id;
	}

	public ArticleType(long id, String code, String description,
			Set<Article> articles) {
		this.id = id;
		this.code = code;
		this.description = description;
		this.articles = articles;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

}
