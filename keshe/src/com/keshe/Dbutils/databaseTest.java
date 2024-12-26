package com.keshe.Dbutils;

import org.junit.Test;

import java.sql.Connection;

public class databaseTest {

@Test
    public void dodbuitl(){
    Connection connection = Dbutill.getConnection();
    if (connection !=null) {
        System.out.println("连接成功");
    }else {
        System.out.println("失败");
    }
}
}
