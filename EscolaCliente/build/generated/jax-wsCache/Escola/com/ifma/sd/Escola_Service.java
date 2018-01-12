
package com.ifma.sd;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Escola", targetNamespace = "http://sd.ifma.com/", wsdlLocation = "http://localhost:8080/WSEscola/Escola?wsdl")
public class Escola_Service
    extends Service
{

    private final static URL ESCOLA_WSDL_LOCATION;
    private final static WebServiceException ESCOLA_EXCEPTION;
    private final static QName ESCOLA_QNAME = new QName("http://sd.ifma.com/", "Escola");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WSEscola/Escola?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ESCOLA_WSDL_LOCATION = url;
        ESCOLA_EXCEPTION = e;
    }

    public Escola_Service() {
        super(__getWsdlLocation(), ESCOLA_QNAME);
    }

    public Escola_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ESCOLA_QNAME, features);
    }

    public Escola_Service(URL wsdlLocation) {
        super(wsdlLocation, ESCOLA_QNAME);
    }

    public Escola_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ESCOLA_QNAME, features);
    }

    public Escola_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Escola_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Escola
     */
    @WebEndpoint(name = "EscolaPort")
    public Escola getEscolaPort() {
        return super.getPort(new QName("http://sd.ifma.com/", "EscolaPort"), Escola.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Escola
     */
    @WebEndpoint(name = "EscolaPort")
    public Escola getEscolaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sd.ifma.com/", "EscolaPort"), Escola.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ESCOLA_EXCEPTION!= null) {
            throw ESCOLA_EXCEPTION;
        }
        return ESCOLA_WSDL_LOCATION;
    }

}