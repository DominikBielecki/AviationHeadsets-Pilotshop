package com.AviationHeadsetsPilotshop.dto;

import com.AviationHeadsetsPilotshop.entity.Address;
import com.AviationHeadsetsPilotshop.entity.Customer;
import com.AviationHeadsetsPilotshop.entity.Order;
import com.AviationHeadsetsPilotshop.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
