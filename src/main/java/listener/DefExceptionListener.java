package listener;

import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.listener.DefaultExceptionListener;
import io.netty.channel.ChannelHandlerContext;

import java.util.List;

public class DefExceptionListener extends DefaultExceptionListener {

    @Override
    public void onDisconnectException(Exception e, SocketIOClient client) {
        System.out.println("onDisconnectException");
    }

    @Override
    public void onEventException(Exception e, List<Object> args, SocketIOClient client) {
        System.out.println("onEventException");
    }

    @Override
    public void onConnectException(Exception e, SocketIOClient client) {
        System.out.println("onConnectException");
    }

    @Override
    public void onPingException(Exception e, SocketIOClient client) {
        System.out.println("onPingException");
    }

    @Override
    public boolean exceptionCaught(ChannelHandlerContext ctx, Throwable e) throws Exception {
        System.out.println("exceptionCaught");
        return true;
    }
    
}
