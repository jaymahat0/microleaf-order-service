package com.microleaf.order_service.feignClient;

import com.microleaf.order_service.entity.PaymentOption;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("payment-service")
public interface PaymentInterserviceCommunication {

    @GetMapping("/payment")
    List<PaymentOption> getAllPaymentOptions();
}
