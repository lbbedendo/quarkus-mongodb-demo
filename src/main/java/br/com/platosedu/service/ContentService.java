package br.com.platosedu.service;

import br.com.platosedu.dto.commands.ContentSaveCommand;
import br.com.platosedu.domain.Content;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ContentService {

    public Content save(ContentSaveCommand contentSaveCommand) {
        Content content = Content.of(contentSaveCommand);
        content.persist();
        return content;
    }

    public List<Content> findAll() {
        return Content.listAll();
    }
}
