package br.com.platosedu.domain;

import br.com.platosedu.dto.commands.ContentSaveCommand;
import br.com.platosedu.domain.enums.ContentType;
import io.quarkus.mongodb.panache.MongoEntity;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@MongoEntity(collection = "content")
public class Content extends BaseMongoEntity {
    private ContentType type;
    private String name;
    private String author;
    private Boolean root;
    private Boolean active;
    private Document data;
    private String lang;
    private List<String> tags;
    private Integer questions;
    private String path;
    private ObjectId collectionId;

    public static Content of(ContentSaveCommand contentSaveCommand) {
        Content content = new Content();
        content.setType(contentSaveCommand.getType());
        content.setName(contentSaveCommand.getName());
        content.setAuthor(contentSaveCommand.getAuthor());
        content.setRoot(contentSaveCommand.getRoot());
        content.setData(contentSaveCommand.getData());
        content.setLang(contentSaveCommand.getLang());
        content.setTags(contentSaveCommand.getTags());
        content.setQuestions(contentSaveCommand.getQuestions());
        content.setCollectionId(Objects.nonNull(contentSaveCommand.getCollectionId())
                ? new ObjectId(contentSaveCommand.getCollectionId())
                : null);
        content.setActive(true);
        content.setUpdatedAt(LocalDateTime.now());
        content.setCreatedAt(LocalDateTime.now());
        return content;
    }

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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
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

    public ObjectId getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(ObjectId collectionId) {
        this.collectionId = collectionId;
    }
}
