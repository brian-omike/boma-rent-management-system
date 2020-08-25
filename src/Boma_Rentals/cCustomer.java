/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boma_Rentals;

/**
 *
 * @author brian
 */
public class cCustomer {
    
    //Data Members
    private String customerID;
    private String Firstname;
    private String Surname;
    private String Address;
    private String Postcode;
    private String Town;
    private String ProofofID;
    private Double Deposit;
    private Double DownPayment;
    
    
    //Accessor Function
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String Town) {
        this.Town = Town;
    }

    public String getProofofID() {
        return ProofofID;
    }

    public void setProofofID(String ProofofID) {
        this.ProofofID = ProofofID;
    }

    public Double getDeposit() {
        return Deposit;
    }

    public void setDeposit(Double Deposit) {
        this.Deposit = Deposit;
    }

    public Double getDownPayment() {
        return DownPayment;
    }

    public void setDownPayment(Double DownPayment) {
        this.DownPayment = DownPayment;
    }
    
}
