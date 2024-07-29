package org.apache.dubbo.springboot.demo.consumer;


import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.springboot.demo.DemoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ConsumerTask implements CommandLineRunner {

    @DubboReference
    private DemoService demoService;

    @Override
    public void run(String... args) throws Exception {

        while (true) {
            Thread.sleep(3000);
            System.out.println(new Date().getTime() + "result==>" + demoService.sayHello());
        }

    }
}
