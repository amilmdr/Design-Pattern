/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GRAPS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Amil
 */
public class Payment
{
    private double totalFeePayment;
    void findtotalfeeCollection(Date d){
        ArrayList<Date> dlist=new ArrayList();
    }
    public static void main(String[] args) throws ParseException {
        Payment p =new Payment();
          String sDate1="31/12/1998";  
    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
        p.findtotalfeeCollection(date1);
    }
}
