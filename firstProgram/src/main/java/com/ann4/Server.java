package com.ann4;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Controller;

@Controller
@DependsOn("canara")
public class Server {
  public void startServer() {
	  System.out.println("Server is starting");
	  System.out.println("Started at https://localhost.com/5121/*****");
  }
}
