package br.com.platosedu.resource;

import br.com.platosedu.domain.Content;
import br.com.platosedu.dto.commands.ContentSaveCommand;
import br.com.platosedu.service.ContentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/content")
@Produces(value = MediaType.APPLICATION_JSON)
@Consumes(value = MediaType.APPLICATION_JSON)
public class ContentResource {

    private ContentService contentService;

    public ContentResource(ContentService contentService) {
        this.contentService = contentService;
    }

    @POST
    public Content save(ContentSaveCommand contentSaveCommand) {
        return contentService.save(contentSaveCommand);
    }

    @PUT
    @Path("/{id}")
    public Content update(String id, ContentSaveCommand contentSaveCommand) {
        return null;//TODO
    }

    @GET
    public List<Content> findAll() {
        return contentService.findAll();
    }

    @GET
    @Path("/{id}")
    public Content findOne(@PathParam("id") String id) {
        return null;//TODO
    }

    @DELETE
    @Path("/{id}")
    public void deleteOne(@PathParam("id") String id) {
        //TODO
    }
}
