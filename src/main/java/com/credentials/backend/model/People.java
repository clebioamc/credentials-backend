/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.credentials.backend.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
/**
 *
 * @author clebio.lima
 */
@Entity
@Table(name = "people")
public class People {
    
    @Id
     private Long id;
     
     public void setId(Long id) {
         this.id = id;
     }
     
     public Long getId() {
         return id;
     }
}
