package listener;

import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;

public class ConnectListener implements Listener {

    private SocketIOServer instanceServer;

    public void initListener(SocketIOServer socketIOServer) {
        instanceServer=socketIOServer;
        instanceServer.addConnectListener(new com.corundumstudio.socketio.listener.ConnectListener() {
            public void onConnect(SocketIOClient socketIOClient) {
                System.out.println("Connect >>> "+socketIOClient.getSessionId());
                socketIOClient.sendEvent("sd","df");
            }
        });
    }
}
