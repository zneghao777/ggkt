package com.atguigu.excel;

import com.alibaba.excel.EasyExcel;

public class TestRead {
    public static void main(String[] args) {
        //设置文件名称和路劲
        String fileName = "D:\\atguigu.xlsx";
        //调用方法星系读取操作
        EasyExcel.read(fileName,User.class,new ExcelListener()).sheet().doRead();



    }
}
