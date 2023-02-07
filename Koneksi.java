/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datamahasiswakampusmerdeka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
Yosef Bernardus Janson Subur (21103112)
Fadhilah Khairunisa Hasanah (21103100)
Nopenus Amos
Delvia Kathrin
 * @author Bernard
 */
public class Koneksi {
public static Connection con;
public static Statement st;

public static void main(String args[]){
    try{
        String url = "jdbc:mysql://localhost/login";
        String user = "root";
        String pass = "";
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        st = con.createStatement();
        System.out.println("Koneksi Berhasil");
    }catch(Exception e){
        System.err.println("Koneksi Gagal" + e.getMessage());
    }
  }
}
