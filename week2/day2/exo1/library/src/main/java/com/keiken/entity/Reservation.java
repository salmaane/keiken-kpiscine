package com.keiken.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    private String transactionId;
    private Date issueDate;
    private Date returnDate;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Book book;

}