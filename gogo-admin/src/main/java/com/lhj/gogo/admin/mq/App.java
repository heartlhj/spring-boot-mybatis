//package com.lhj.gogo.admin.mq;
//
//import javax.jms.Destination;
//import javax.jms.Queue;
//
//import org.apache.activemq.command.ActiveMQQueue;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//
//@SpringBootApplication
//public class App {
//
//	  @Autowired
//	  private JMSProducer jmsProducer;
//	 @Test
//    public  void main(String[] args) {
//    	  Destination destination = new ActiveMQQueue("springboot.queue.test");
//
//          for (int i=0;i<10;i++) {
//              jmsProducer.sendMessage(destination,"hello,world!" + i);
//          }
//
//    }
//
//}