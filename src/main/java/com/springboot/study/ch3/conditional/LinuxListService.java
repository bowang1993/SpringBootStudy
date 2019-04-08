package com.springboot.study.ch3.conditional;

public class LinuxListService implements ListService{

    @Override
    public String showListCmd() {
        return "ls";
    }
}
