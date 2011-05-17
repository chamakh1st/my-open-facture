package com.mounir.openfacture.entities;

// Generated 15 mai 2011 17:36:47 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Article generated by hbm2java
 */
public class Article implements java.io.Serializable {

	private long id;
	private ArticleType articleType;
	private String name;
	private Set factureLines = new HashSet(0);

	public Article() {
	}

	public Article(long id) {
		this.id = id;
	}

	public Article(long id, ArticleType articleType, String name,
			Set factureLines) {
		this.id = id;
		this.articleType = articleType;
		this.name = name;
		this.factureLines = factureLines;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ArticleType getArticleType() {
		return this.articleType;
	}

	public void setArticleType(ArticleType articleType) {
		this.articleType = articleType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getFactureLines() {
		return this.factureLines;
	}

	public void setFactureLines(Set factureLines) {
		this.factureLines = factureLines;
	}

}