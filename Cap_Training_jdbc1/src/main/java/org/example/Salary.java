package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "salaries")
@SequenceGenerator(name = "salary_seq", sequenceName = "salary_sequence", allocationSize = 1)
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "salary_seq")
    private Long id;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "currency")
    private String currency;


    public Salary() {
    }

    public Salary(Double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
