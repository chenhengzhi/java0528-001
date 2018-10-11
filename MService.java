package com.offcn.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.offcn.po.Mobile;
//*************************************************************
//##############################################################3
public interface MService {
	@GET
	@Path("/find/{number}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Mobile find(@PathParam("number")String number);
}
