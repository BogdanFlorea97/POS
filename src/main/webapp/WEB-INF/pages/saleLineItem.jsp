<%-- 
    Document   : saleLineItem
    Created on : Jan 9, 2019, 2:54:18 AM
    Author     : Asus
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="History">
    <h1>History</h1>
    <div class="row">
            <div class="col-md-2">
                <h4>Sale ID</h4>
            </div>
            <div class="col-md-2">
                <h4>Name</h4>
            </div>
            <div class="col-md-2">
                <h4>Quantity</h4>
            </div>
            <div class="col-md-2">
                <h4>Cashier</h4>
            </div>
            <div class="col-md-2">
                <h4>Data</h4>
            </div>
            <div class="col-md-2">
                <h4>Time</h4>
            </div>
            
        </div>
    <div class="row" >
        <div class="col-md-6">
            <c:forEach var="saleLineItem" items="${saleLineItems}" varStatus="status">
                <div class="row" >
                    <div class="col-md-4">
                        ${saleLineItem.saleId}
                    </div>
                    <div class="col-md-4">
                        ${saleLineItem.prodName}
                    </div>
                    <div class="col-md-4">
                        ${saleLineItem.quantity}
                    </div>
                </div>
            </c:forEach>
        </div>
        <div class="col-md-6">
            <c:forEach var="sale" items="${sale}" varStatus="status">
                <div class="row">
                    <div class="col-md-4">
                        ${sale.cashierName}
                    </div>
                    <div class="col-md-4">
                        ${sale.saleDate}
                    </div>
                    <div class="col-md-4">
                        ${sale.saleTime}
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</t:pageTemplate> 
