package com.comarch.kiosque.mock.api;

import com.comarch.kiosque.mock.model.Employee;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * API Employee discount
 *
 * <p> # FR  API permettant de connaitre la position d'un salariÃ© Orange RÃ©union Mayotte pour faire valoir ses droits lors de l'achat de produits en boutique ou en VAD (PCM)  Elle dÃ©crit les ressources suivantes : - `eligibilityEmployee` : L'Ã©gibilitÃ© d'un employÃ©  ## Fonctionnement gÃ©nÃ©ral  Il existe 1 type d'usagers de l'API : - l'accÃ¨s en lecture pour le composant Comarch system  ## Permissions d'accÃ¨s  L'API va autoriser les accÃ¨s en fonction du contenu de l'header `X-OAPI-Validated-Scope`. Cet header devra Ãªtre provisionnÃ© par un composant de __confiance__ - un filtre applicatif et/ou une gateway -.  Le consommateur rÃ©el de l'application lui s'authentifiera via le serveur d'autorisation cible.  Ce mÃ©canisme pourra Ãªtre amenÃ© Ã  changer en fonction des choix d'implÃ©mentation effectuÃ© sur le sujet gateway d'API et il est ainsi possible que l'API rÃ©cupÃ¨re directement un `accessToken` oauth2 et qu'elle doivent se charger de rÃ©cupÃ©rer les informations d'identitÃ© utilisateur  ## API Dior  L'API ira rÃ©cupÃ©rer les informations auprÃ¨s de l'API DIOR (Digital Identiy On Request) et retournera uniquement les informations nÃ©cessaires Ã  Comarch API.  # EN  API enabling the position of an Orange RÃ©union Mayotte employee to be known in order to assert his rights when purchasing products in a store or in a VAD (PCM).  It describes the following resources: - `eligibilityEmployee`: The eligibility of an employee  ## General operation  There are 1 type of API users: - read access for the Comarch system component  ## Access Permissions  The API will allow accesses depending on the contents of the `X-OAPI-Validated-Scope` header. This header will have to be provided by a __trust__ component - an application filter and/or a gateway.  The real consumer of the application will authenticate to it via the target authorization server.  This mechanism may change depending on the implementation choices made on the API gateway subject and it is thus possible that the API directly retrieves an `accessToken` oauth2 and that it must take care of retrieving the user identity information.  ## API Dior  The API will retrieve the information from the DIOR (Digital Identity On Request) API and return only the necessary information to Comarch API. 
 *
 */
@Path("/eligibilityRequests")
@Api(value = "/", description = "")
public interface EmployeeDiscountApi  {

    /**
     * Is the person described an employee
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Is the person described an employee", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request has been proceed", response = Employee.class),
        @ApiResponse(code = 400, message = "Unable to process the request") })
    public Employee eligibilityRequests(@HeaderParam("X-OAPI-Application-Id")  String xOAPIApplicationId, @HeaderParam("X-OAPI-User-Id")  String xOAPIUserId, @HeaderParam("X-OAPI-Channel")  String xOAPIChannel, @HeaderParam("X-OAPI-Origin")  String xOAPIOrigin, @HeaderParam("X-OAPI-Validated-Scope")  List<String> xOAPIValidatedScope, Employee employee);
}

