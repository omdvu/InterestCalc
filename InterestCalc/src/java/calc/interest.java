/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package calc;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author om
 */
@WebService(serviceName = "interest")
public class interest {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "simple")
    public float simple(@WebParam(name = "principal") float principal,@WebParam(name = "rate") float rate,@WebParam(name = "time") float time) {
        return principal + ((principal*rate*time)/100);
    }
    @WebMethod(operationName = "compound")
    public double compound(@WebParam(name = "principal") float principal,@WebParam(name = "rate") float rate,@WebParam(name = "time") float time,@WebParam(name="n") float n) {
        return principal * Math.pow((1 + (rate / (n * 100))), n * time);
    }
    @WebMethod(operationName = "factorial")
    public float factorial(@WebParam(name = "num") float num) {
        float fact = 1;
        for(;num>1;num--) fact = fact*num;
        return fact;
    }
}
