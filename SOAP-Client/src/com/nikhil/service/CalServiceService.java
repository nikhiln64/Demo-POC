/**
 * CalServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nikhil.service;

public interface CalServiceService extends javax.xml.rpc.Service {
    public java.lang.String getCalServiceAddress();

    public com.nikhil.service.CalService getCalService() throws javax.xml.rpc.ServiceException;

    public com.nikhil.service.CalService getCalService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
