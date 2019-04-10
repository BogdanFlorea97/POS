package com.pos.pointofsale.entity;

import com.pos.pointofsale.entity.SaleLineItem;
import com.pos.pointofsale.entity.Store;
import com.pos.pointofsale.entity.User;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-09T11:10:44")
@StaticMetamodel(Sale.class)
public class Sale_ { 

    public static volatile CollectionAttribute<Sale, SaleLineItem> saleLineItem;
    public static volatile SingularAttribute<Sale, LocalTime> saleTime;
    public static volatile SingularAttribute<Sale, User> cashier;
    public static volatile SingularAttribute<Sale, Integer> id;
    public static volatile SingularAttribute<Sale, LocalDate> saleDate;
    public static volatile SingularAttribute<Sale, Store> store;
    public static volatile SingularAttribute<Sale, Double> paymentAmount;

}