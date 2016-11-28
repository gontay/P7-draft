package demo;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
/**
 * Created by 153085T on 11/28/2016.
 */
@ServerEndpoint("/chat/{id}")
public class Connected {
    private static Set<Session>allSession= new HashSet<Session>();

}
