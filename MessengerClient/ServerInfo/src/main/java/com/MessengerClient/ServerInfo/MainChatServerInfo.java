package com.MessengerClient.ServerInfo;

public class MainChatServerInfo
{
  private String host;
  private int port;

  public MainChatServerInfo()
  {
    this.host = "127.0.0.1";
    this.port = 53800;
  }

  public String getHost()
  {
    return host;
  }

  public int getPort()
  {
    return port;
  }
}
