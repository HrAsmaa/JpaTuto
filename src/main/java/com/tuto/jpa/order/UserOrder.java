package com.tuto.jpa.order;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class UserOrder {

    @EmbeddedId
    private OrderId orderId;

    private String orderInfo;

    @Embedded
    private Address address;
}
