package br.com.platosedu.dto.commands;

import br.com.platosedu.domain.enums.ContentType;
import org.bson.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

public class ContentSaveCommand {
    @NotNull
    private ContentType type;
    @NotBlank
    private String name;
    private String author;
    private Boolean root;
    private Document data;
    private String lang;
    private List<String> tags;
    private Integer questions;
    private String path;
    private String collectionId;

    public ContentType getType() {
        return type;
    }

    public void setType(ContentType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getRoot() {
        return root;
    }

    public void setRoot(Boolean root) {
        this.root = root;
    }

    public Document getData() {
        return data;
    }

    public void setData(Document data) {
        this.data = data;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getQuestions() {
        return questions;
    }

    public void setQuestions(Integer questions) {
        this.questions = questions;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }
}
