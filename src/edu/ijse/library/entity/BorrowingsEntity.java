/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.entity;

import edu.ijse.library.dto.MemberDto;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class BorrowingsEntity {
    
    private Integer book_id;
    private Integer member_id;
    private String borrow_date;
    private String due_date;
    private String return_date;
    private String fine;
    public ArrayList<MemberDto> get;

    public BorrowingsEntity() {
    }

    public BorrowingsEntity(Integer book_id, Integer member_id, String borrow_date, String due_date, String return_date, String fine) {
        this.book_id = book_id;
        this.member_id = member_id;
        this.borrow_date = borrow_date;
        this.due_date = due_date;
        this.return_date = return_date;
        this.fine = fine;
    }

    /**
     * @return the book_id
     */
    public Integer getBook_id() {
        return book_id;
    }

    /**
     * @param book_id the book_id to set
     */
    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    /**
     * @return the member_id
     */
    public Integer getMember_id() {
        return member_id;
    }

    /**
     * @param member_id the member_id to set
     */
    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    /**
     * @return the borrow_date
     */
    public String getBorrow_date() {
        return borrow_date;
    }

    /**
     * @param borrow_date the borrow_date to set
     */
    public void setBorrow_date(String borrow_date) {
        this.borrow_date = borrow_date;
    }

    /**
     * @return the due_date
     */
    public String getDue_date() {
        return due_date;
    }

    /**
     * @param due_date the due_date to set
     */
    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    /**
     * @return the return_date
     */
    public String getReturn_date() {
        return return_date;
    }

    /**
     * @param return_date the return_date to set
     */
    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    /**
     * @return the fine
     */
    public String getFine() {
        return fine;
    }

    /**
     * @param fine the fine to set
     */
    public void setFine(String fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "BorrowingsEntity{" + "book_id=" + book_id + ", member_id=" + member_id + ", borrow_date=" + borrow_date + ", due_date=" + due_date + ", return_date=" + return_date + ", fine=" + fine + '}';
    }
    
    
}
