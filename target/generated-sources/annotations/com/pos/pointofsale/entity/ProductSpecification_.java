package com.pos.pointofsale.entity;

import com.pos.pointofsale.entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-09T11:10:44")
@StaticMetamodel(ProductSpecification.class)
public class ProductSpecification_ { 

    public static volatile SingularAttribute<ProductSpecification, Product> product;
    public static volatile SingularAttribute<ProductSpecification, Integer> unitOnStock;
    public static volatile SingularAttribute<ProductSpecification, Double> price;
    public static volatile SingularAttribute<ProductSpecification, String> description;
    public static volatile SingularAttribute<ProductSpecification, Integer> id;
    public static volatile SingularAttribute<ProductSpecification, String> barcode;

}