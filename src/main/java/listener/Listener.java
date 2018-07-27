package listener;

import com.corundumstudio.socketio.SocketIOServer;

public interface Listener {

    void initListener(SocketIOServer server);

}
