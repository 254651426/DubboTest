package com.yangjie.idea;

public class HelloServiceImpl implements Helloservice{
    @Override
    public String hello(String msg) {
        return "你好"+msg;
    }
}
