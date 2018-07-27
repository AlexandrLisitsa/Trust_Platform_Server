package listener;

import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.listener.DataListener;
import model.Data;

public class EventListener implements Listener {

    private SocketIOServer server;

    public void initListener(SocketIOServer server) {
        this.server=server;
        initEventListener();
    }

    private void initEventListener() {
        server.addEventListener("registration", Data.class, new DataListener<Data>() {
            public void onData(SocketIOClient socketIOClient, Data data, AckRequest ackRequest) throws Exception {
                System.out.println(data.getData());
            }
        });
    }
}
