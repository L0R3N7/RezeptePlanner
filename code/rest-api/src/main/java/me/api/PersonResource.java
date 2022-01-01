package me.api;

import me.models.PersonDTO;
import me.models.mapper.Mappings;
import me.workloads.person.logic.PersonService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("person")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {

    @Inject
    private PersonService personService;

    @POST
    @Path("signin")
    @Transactional
    public Response addUser(
        PersonDTO newUser
    ){
        System.out.println("New User: "+newUser.getEmail()+" is signing in");
        return Response.ok(
                Mappings.INSTANCE.personToPersonDTO(this.personService.addPerson(newUser.getEmail(),
                        newUser.getPassword()))
                ).build();
    }



    /*@POST
    @Path("login")
    public Response validateUser)(
            UserDTO validUser
            ){
        User u =
    }*/
}
