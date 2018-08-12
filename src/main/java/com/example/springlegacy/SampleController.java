package com.example.springlegacy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    private static Logger logger = LoggerFactory.getLogger(SampleController.class);

	@RequestMapping("/test")
	public String test() throws Exception {
        System.out.println("★★★ test ★★★");
        logger.info("=== test ===");
        if (1 == 1) {
        	throw new Exception("test error");
        }
        return "SUCCESS";
    }

}
