package com.mmc.order_service_consumer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mmc.common_api.order.OrderService;
import com.mmc.common_api.user.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
         context.start();
         OrderService orderService = (OrderService)context.getBean(OrderService.class); // 获取远程服务代理
         orderService.initOrder("1");
         System.in.read();
    }
}
