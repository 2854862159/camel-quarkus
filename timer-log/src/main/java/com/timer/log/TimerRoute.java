package com.timer.log;

import org.apache.camel.builder.RouteBuilder;

/**
 * ClassName: TimerRoute <br/>
 * Description: <br/>
 * date: 2021/11/26 11:08 上午<br/>
 *
 * @author tooru<br />
 */
public class TimerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:foo?period=1000")
                .log("Hello World");
    }
}
