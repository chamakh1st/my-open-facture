package com.mounir.openfacture.entities;
// Generated 7 juin 2011 15:25:27 by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Article generated by hbm2java
 */
public class Article  implements java.io.Serializable {


     private long id;
     private ArticleType articleType;
     private String name;
     private Set<DocumentLine> documentLines = new HashSet<DocumentLine>(0);

    public Article() {
    }

    public Article(ArticleType articleType, String name, Set<DocumentLine> documentLines) {
       this.articleType = articleType;
       this.name = name;
       this.documentLines = documentLines;
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
    public Set<DocumentLine> getDocumentLines() {
        return this.documentLines;
    }
    
    public void setDocumentLines(Set<DocumentLine> documentLines) {
        this.documentLines = documentLines;
    }




}


