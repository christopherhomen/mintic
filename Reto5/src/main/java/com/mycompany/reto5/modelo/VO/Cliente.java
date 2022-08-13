/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5.modelo.VO;

/**
 *
 * @author CHRIS HOMEN
 */
public class Cliente {
    private int id_compra;
    private String Constructura;
    private String Banco;

    public Cliente() {
    }

    public Cliente(int id_compra, String Constructura, String Banco) {
        this.id_compra = id_compra;
        this.Constructura = Constructura;
        this.Banco = Banco;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getConstructura() {
        return Constructura;
    }

    public void setConstructura(String Constructura) {
        this.Constructura = Constructura;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_compra=" + id_compra + ", Constructura=" + Constructura + ", Banco=" + Banco + '}';
    }
    

}
