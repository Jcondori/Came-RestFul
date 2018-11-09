package com.came.controller;

import com.came.model.TipoprogEntity;
import com.came.service.TipoprogService;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import java.util.List;

@ApplicationPath("/")
@Path("/TipoProg")
@Consumes("application/json")
@Produces("application/json")
public class TipoprogC extends Application {

    private TipoprogService service = new TipoprogService();

    @GET
    public List<TipoprogEntity> getLstTipoProgs(){
        return service.listarTipoPrograma();
    }

    @GET
    @Path("/{codigo}")
    public TipoprogEntity getTipoProgs(@PathParam("codigo") int Codigo){
        return service.obtenerTipoPrograma(Codigo);
    }

}
