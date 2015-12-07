
package cliente.clube;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SIBClubeImplService", targetNamespace = "http://servico/", wsdlLocation = "http://localhost:8087/clubes?wsdl")
public class SIBClubeImplService
    extends Service
{

    private final static URL SIBCLUBEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SIBCLUBEIMPLSERVICE_EXCEPTION;
    private final static QName SIBCLUBEIMPLSERVICE_QNAME = new QName("http://servico/", "SIBClubeImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8087/clubes?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SIBCLUBEIMPLSERVICE_WSDL_LOCATION = url;
        SIBCLUBEIMPLSERVICE_EXCEPTION = e;
    }

    public SIBClubeImplService() {
        super(__getWsdlLocation(), SIBCLUBEIMPLSERVICE_QNAME);
    }

    public SIBClubeImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SIBCLUBEIMPLSERVICE_QNAME, features);
    }

    public SIBClubeImplService(URL wsdlLocation) {
        super(wsdlLocation, SIBCLUBEIMPLSERVICE_QNAME);
    }

    public SIBClubeImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SIBCLUBEIMPLSERVICE_QNAME, features);
    }

    public SIBClubeImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SIBClubeImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SEIClube
     */
    @WebEndpoint(name = "SIBClubeImplPort")
    public SEIClube getSIBClubeImplPort() {
        return super.getPort(new QName("http://servico/", "SIBClubeImplPort"), SEIClube.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SEIClube
     */
    @WebEndpoint(name = "SIBClubeImplPort")
    public SEIClube getSIBClubeImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servico/", "SIBClubeImplPort"), SEIClube.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SIBCLUBEIMPLSERVICE_EXCEPTION!= null) {
            throw SIBCLUBEIMPLSERVICE_EXCEPTION;
        }
        return SIBCLUBEIMPLSERVICE_WSDL_LOCATION;
    }

}
