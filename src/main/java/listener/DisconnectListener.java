package listener;

import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;

public class DisconnectListener implements Listener {

    private SocketIOServer server;

    public void initListener(final SocketIOServer server) {
        this.server=server;
        server.addDisconnectListener(new com.corundumstudio.socketio.listener.DisconnectListener() {
            public void onDisconnect(SocketIOClient socketIOClient) {
                System.out.println("Disconect >>> "+socketIOClient.getSessionId());
            }
        });
    }
}
