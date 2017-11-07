package com.nikhil.service;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

public class TestClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		// TODO Auto-generated method stub
		
		java.net.URL endpointUrl= new java.net.URL("http://localhost:8080/CalculatorService/services/CalService");
		
		org.apache.axis.client.Service service = new org.apache.axis.client.Service(); 
		
		CalServiceSoapBindingStub stub = new CalServiceSoapBindingStub(endpointUrl,service);
		
		int result1 = stub.add(12,3);
		System.out.println("ADDED AMMA " +result1);
		
		int result2 = stub.sub(10,5);
		System.out.println("SUBBED AMMA " +result2);
	}

}
