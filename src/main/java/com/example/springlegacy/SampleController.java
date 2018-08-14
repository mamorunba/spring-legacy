package com.example.springlegacy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springlegacy.bean.MyRequestData;
import com.example.springlegacy.bean.MyResponseData;

@RestController
public class SampleController {
	private static Logger logger = LoggerFactory.getLogger(SampleController.class);

	@RequestMapping("/login")
	public ResponseEntity<MyResponseData> login(@RequestBody MyRequestData reqdata) throws Exception {
        System.out.println("!!!! test !!!!");
        logger.info("=== test ===");
//        if (1 == 1) {
//        	throw new Exception("test error");
//        }
        MyResponseData resdata = new MyResponseData();
        resdata.setMessage("TEST DATA");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ResponseEntity<MyResponseData> responseEntity = new ResponseEntity<MyResponseData>(resdata, headers, HttpStatus.OK);
        return responseEntity;
    }

}
