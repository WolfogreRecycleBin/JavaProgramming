package RemoteInputOutput;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/15/2016.
 */
public class RemoteOutput implements Closeable {
	Socket socket;
	String address;
	int port;
	byte id;

	public RemoteOutput(String address, int port, byte id){
		this.address = address;
		this.port = port;
		this.id = id;
	}

	public OutputStream getInputStream() throws Exception {
		socket = new Socket(InetAddress.getByName(address), port);
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write(id);
		InputStream inputStream = socket.getInputStream();
		int response =  inputStream.read();
		if(response != id)
			throw new Exception("Wrong id");
		return socket.getOutputStream();
		//I have no idea what I am doing ...
		//Fuck all thing.
	}

	@Override
	public void close() throws IOException {
		socket.close();
	}
}
