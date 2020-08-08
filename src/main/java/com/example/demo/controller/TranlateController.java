package com.example.demo.controller;

import com.example.demo.util.FanyiV3DemoUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TranlateController {

    //有道云api请求地址
    @Value("${ydCloud.translate.ydUrl}")
    private String ydUrl;
    //应用ID
    @Value("${ydCloud.translate.appKey}")
    private String appKey;
    //应用secret
    @Value("${ydCloud.translate.appSecret}")
    private String appSecret;
    @RequestMapping(value = "/translate/{text}",method = RequestMethod.GET)
    public String translate(@PathVariable("text") String text) throws IOException {
        return FanyiV3DemoUtil.translate(text,ydUrl,appKey,appSecret);
    }
}
