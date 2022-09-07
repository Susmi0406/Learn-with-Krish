/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapModel;

import javax.jws.WebMethod;
import javax.jws.WebService;
import soapService.SoapBDFinderImpl;

/**
 *
 * @author Susmitha
 */
@WebService
public class SoapBDFinder {
    SoapBDFinderImpl bdfinderImpl = new SoapBDFinderImpl();
    
    @WebMethod
    public int calculateDays(int year, int month, int day){
        return bdfinderImpl.calculateDays(year, month, day);
    }
    
}
