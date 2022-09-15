package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_payments")
public class Payment {
    @Id
    private String id;
    @NotEmpty
    @NotNull
    private String ccv;
    @NotEmpty
    @NotNull
    @Column(name = "exp_date")
    private Date expDate;
    @NotEmpty
    @NotNull
    private String zip;
    @NotEmpty
    @NotNull
    private float balance;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;

}
