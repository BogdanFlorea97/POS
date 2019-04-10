/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.pointofsale.details;

/**
 *
 * @author Alex
 */
public class SaleLineItemDetails implements java.io.Serializable{
    
    private Integer id;
    
    private Integer quantity;
    
    private String prodName;
    
    private Integer saleId;

    public SaleLineItemDetails(Integer id, Integer quantity, String prodName, Integer saleId) {
        this.id = id;
        this.quantity = quantity;
        this.prodName = prodName;
        this.saleId = saleId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }
}
