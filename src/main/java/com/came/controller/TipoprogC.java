package com.came.controller;

import com.came.model.TipoprogEntity;
import com.came.service.ImplTipoprogService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import java.util.List;


@ApplicationPath("/")
@Path("/TipoProg")
@Consumes("application/json")
@Produces("application/json")
public class TipoprogC extends Application {

    @Inject
    private ImplTipoprogService service;

    @GET
    public List<TipoprogEntity> getLstTipoProgs() {
        return service.listarTipoPrograma();
    }

    @GET
    @Path("/{codigo}")
    public TipoprogEntity getTipoProg(@PathParam("codigo") int Codigo) {
        return service.obtenerTipoPrograma(Codigo);
    }

    @POST
    public void createTipoProg(TipoprogEntity model) {
        model.setEsttipopg("A");
        service.agregar(model);
    }

}
