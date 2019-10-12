package com.jagrosh.jmusicbot;

import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;

public class SuccCocc
{
	public static boolean isInt(String s)
	{
		try
		{  
			Integer.parseInt(s);
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}
	
	public static class EatShit implements HttpHandler
	{
		@SuppressWarnings("restriction")
		@Override
		public void handle(HttpExchange t) throws IOException
		{
			if ((isInt(System.getenv("ISON")) ? Integer.parseInt(System.getenv("ISON")) : 0) != 0)
			{
				System.exit(0);
			}
		}
	}
	
	@SuppressWarnings("restriction")
	public static void InitCocc()
	{
		int defaultPort = 6969;

		try
		{
			int port = isInt(System.getenv("PORT")) ? Integer.parseInt(System.getenv("PORT")) : defaultPort;

			System.out.println("Port: " + port);
			
			HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
			server.createContext("/killproc", new EatShit());
			server.setExecutor(null);
			server.start();
		}
		catch (Exception e)	
		{
			System.out.println(e);
		}
	}
	
}
