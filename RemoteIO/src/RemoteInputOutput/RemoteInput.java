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
public class RemoteInput implements Closeable{
	Socket socket;
	String address;
	int port;
	byte id;

	public RemoteInput(String address, int port, byte id){
		this.address = address;
		this.port = port;
		this.id = id;
	}

	public InputStream getInputStream() throws Exception {
		socket = new Socket(InetAddress.getByName(address), port);
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write(id);
		InputStream inputStream = socket.getInputStream();
		int response =  inputStream.read();
		if(response != id)
			throw new Exception("Wrong id");
		return socket.getInputStream();
	}

	@Override
	public void close() throws IOException {
		socket.close();
	}
}
