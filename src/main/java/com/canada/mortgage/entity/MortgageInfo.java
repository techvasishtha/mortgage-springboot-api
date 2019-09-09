package com.canada.mortgage.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="mortgage_info")
@DynamicUpdate
public class MortgageInfo {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mortgage_info_id_generator")
    @SequenceGenerator(name="mortgage__info_id_generator", initialValue = 1, allocationSize = 1,sequenceName = "mortgage_info_id_seq")
    private Long id;



    @Column(name="user_id")
    private Long userId;


    @Column(name="employer_name")
    private String employerName;

    @Column(name="job_title")
    private String jobTitle;

    @Column(name="years_of_service")
    private String yearsOfService;

    @Column(name="salary")
    private Integer salary;

    @Column(name="address_line1")
    private String addressLine1;

    @Column(name="address_line2")
    private String addressLine2;

    @Column(name="city")
    private String city;

    @Column(name="province")
    private String province;

    @Column(name="country")
    private String country;

    @Column(name="purchase_price")
    private Integer purchasePrice;

    @Column(name="down_payment")
    private Integer downPayment;

    @Column(name="mortgage_amount")
    private Integer mortgageAmount;

    @Column(name="closing_date")
    private Date closingDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEMPLOYER_NAME(String employerName) {
        this.employerName = employerName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(String yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(Integer downPayment) {
        this.downPayment = downPayment;
    }

    public Integer getMortgageAmount() {
        return mortgageAmount;
    }

    public void setMortgageAmount(Integer mortgageAmount) {
        this.mortgageAmount = mortgageAmount;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public MortgageInfo(Long userId, String employerName, String jobTitle, String yearsOfService, Integer salary,
                        String addressLine1, String addressLine2, String city, String province,
                        String country,Integer purchasePrice, Integer downPayment, Integer mortgageAmount,
                        Date closingDate
                        ) {
        this.userId = userId;
        this.employerName = employerName;
        this.jobTitle = jobTitle;
        this.yearsOfService = yearsOfService;
        this.salary = salary;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.province = province;
        this.country = country;
        this.purchasePrice = purchasePrice;
        this.downPayment = downPayment;
        this.mortgageAmount = mortgageAmount;
        this.closingDate = closingDate;
    }

    public MortgageInfo() {
    }

    @Override
    public String toString() {

        return "MortgageInfo [Id=" + id
                + ", userId=" + userId
                + ", employerName=" + employerName
                + ", jobTitle=" + jobTitle + "]"
                + ", yearsOfService=" + yearsOfService + "]"
                + ", salary=" + salary + "]"
                + ", addressLine1" + addressLine1
                + ", addressLine2=" + addressLine2 + "]"
                + ", city=" + city + "]"
                + ", province=" + province + "]"
                + ", country=" + country
                + ", purchasePrice=" + purchasePrice + "]"
                + ", downPayment=" + downPayment + "]"
                + ", mortgageAmount=" + mortgageAmount + "]"
                + ", closingDate=" + closingDate;
    }



}
