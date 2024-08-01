/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service;

import edu.ijse.library.service.custom.impl.BookServiceImpl;
import edu.ijse.library.service.custom.impl.BorrowingsServiceImpl;
import edu.ijse.library.service.custom.impl.CategoryServiceImpl;
import edu.ijse.library.service.custom.impl.MemberServiceImpl;

/**
 *
 * @author HP
 */
public class ServiceFactory {
   private static ServiceFactory serviceFactory;
   
   private ServiceFactory(){}
   
   public static ServiceFactory getInstance(){
       if(serviceFactory == null){
           serviceFactory = new ServiceFactory();
       }
       return serviceFactory;
   }
   
   public SuperService getService(ServiceType serviceType){
       switch (serviceType) {
           case CATEGORY:
               return new CategoryServiceImpl();
               case MEMBER:
               return new MemberServiceImpl();
               case BORROWINGS:
               return new BorrowingsServiceImpl();
               case BOOK:
               return new BookServiceImpl();
           default:
              return null;
       }
   }
   
   public enum ServiceType{
      CATEGORY, MEMBER, BORROWINGS,BOOK 
   }
}
