package com.example.server.service;

import com.example.server.model.Server;

import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Server ping(String ipAdress);
    Collection<Server> list(int limit);
    Server get(long id);
    Server update(Server server);
    Boolean delete(Long id);

}
