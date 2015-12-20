package shu.gobang.server;

public class TestGobangSever_Sever {
	public static void main(String args[]) throws Exception{
		GobangServer gbs = new GobangServer(6789);
		gbs.startServer();
	}
}
