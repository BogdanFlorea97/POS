package com.pos.pointofsale.entity;

import com.pos.pointofsale.entity.ProductSpecification;
import com.pos.pointofsale.entity.SaleLineItem;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-09T11:10:44")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile CollectionAttribute<Product, SaleLineItem> saleLineItem;
    public static volatile SingularAttribute<Product, ProductSpecification> productSpecification;
    public static volatile SingularAttribute<Product, String> prodName;
    public static volatile SingularAttribute<Product, Integer> id;

}