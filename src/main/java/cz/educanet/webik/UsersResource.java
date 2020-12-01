package cz.educanet.webik;


import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("users") //localhost:8080/nazev-appky/api/users
@Produces(MediaType.APPLICATION_JSON)
public class UsersResource {

    private static List<Users> names = new ArrayList<Users>();

    // TODO: @POST
    // TODO: @GET
    // TODO: @PUT
    // TODO: @DELETE


}
