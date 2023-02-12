package com.developers.rest.Model;
import javax.persistence.*;

/** La entidad cuenta, esta clase va a mapear los atributos como campos en la base de datos **/

@Entity
@Table(schema = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;    //Nombre del cliente
    private String accountNumber;   //Número de cuenta
    private Double balance;  //Saldo de la cuenta
    private Boolean status;  //Estado de la cuenta

    public Account(){

    }

    public Account(String accountNumber, String customerName, Double balance, Boolean status) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountName){
        this.accountNumber = accountNumber;
    }

    public Double getBalance(){
        return balance;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

    public Boolean getStatus(){
        return status;
    }

    public void setStatus(Boolean status){
        this.status = status;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
