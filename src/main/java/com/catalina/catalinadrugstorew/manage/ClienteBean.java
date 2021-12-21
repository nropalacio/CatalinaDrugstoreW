/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.catalina.catalinadrugstorew.manage;

import com.catalina.catalinadrugstoreb.entities.Cliente;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Nelson Palacios
 */
@ManagedBean(name = "clienteBean")
@ViewScoped
public class ClienteBean implements Serializable{

private Cliente cliente;
public String nombre;

@PostConstruct
public void init(){
cliente = new Cliente();
cliente.setId(1);
cliente.setName("Mega hombre");
setNombre(cliente.getName());

}



    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
}
