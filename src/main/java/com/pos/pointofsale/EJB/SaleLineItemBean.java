/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.pointofsale.EJB;

import com.pos.pointofsale.details.SaleLineItemDetails;
import com.pos.pointofsale.entity.Product;
import com.pos.pointofsale.entity.Sale;
import com.pos.pointofsale.entity.SaleLineItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Alex
 */
@Stateless
public class SaleLineItemBean {

    private static final Logger LOG = Logger.getLogger(SaleLineItemBean.class.getName());
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext
    private EntityManager em;
    
    public List<SaleLineItemDetails> getAllSaleLineItems() {
        LOG.info("getAllSaleLineItems");
        
        try {
            Query query = em.createQuery("SELECT s FROM SaleLineItem s");
            List<SaleLineItem> saleLineItems = (List<SaleLineItem>) query.getResultList();
            return copySaleLineItemsToDetails(saleLineItems);
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }
    
    private List<SaleLineItemDetails> copySaleLineItemsToDetails(List<SaleLineItem> saleLineItems) {
        List<SaleLineItemDetails> detailsList = new ArrayList<>();
        for (SaleLineItem saleLineItem : saleLineItems) {
            SaleLineItemDetails saleLineItemDetails = new SaleLineItemDetails(
            saleLineItem.getId(),
            saleLineItem.getQuantity(),
            saleLineItem.getProduct().getProdName(),
            saleLineItem.getSale().getId());
            detailsList.add(saleLineItemDetails);
        }
        return detailsList;
    }
    
    
    public void createSaleLineItem(Integer quantity, Integer prodId, Integer saleId) {
        LOG.info("createSaleLineItem");
        SaleLineItem saleLineItem = new SaleLineItem();
        saleLineItem.setQuantity(quantity);
        
        Product product = em.find(Product.class, prodId);
        product.getSaleLineItem().add(saleLineItem);
        saleLineItem.setProduct(product);
        
        Sale sale = em.find(Sale.class, saleId);
        sale.getSaleLineItem().add(saleLineItem);
        saleLineItem.setSale(sale);
        
        em.persist(saleLineItem);
    }
    
    public void deleteSaleLineItemsByIds(Collection<Integer> ids) {
        LOG.info("deleteSaleLineItemsByIds");
        for (Integer id : ids) {
            SaleLineItem saleLineItem = em.find(SaleLineItem.class, id);
            em.remove(saleLineItem);
        }
    }
}
