/*
 *  copyright (c) thelook.cn
 */
package com.qunfanyi.ws1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author 老唐
 */
@Path("/user")
public class UserResource {

    @GET
    @Path("{userId}")
    public String getName(@PathParam("userId") Integer userId) {
        return "user:" + userId;
    }
}
