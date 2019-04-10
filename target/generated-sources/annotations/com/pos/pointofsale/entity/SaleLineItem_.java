package com.pos.pointofsale.entity;

import com.pos.pointofsale.entity.Product;
import com.pos.pointofsale.entity.Sale;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-09T11:10:44")
@StaticMetamodel(SaleLineItem.class)
public class SaleLineItem_ { 

    public static volatile SingularAttribute<SaleLineItem, Product> product;
    public static volatile SingularAttribute<SaleLineItem, Sale> sale;
    public static volatile SingularAttribute<SaleLineItem, Integer> quantity;
    public static volatile SingularAttribute<SaleLineItem, Integer> id;

}