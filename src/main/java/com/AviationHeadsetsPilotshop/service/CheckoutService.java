package com.AviationHeadsetsPilotshop.service;

import com.AviationHeadsetsPilotshop.dto.Purchase;
import com.AviationHeadsetsPilotshop.dto.PurchaseResponse;
import org.springframework.stereotype.Service;

@Service
public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
