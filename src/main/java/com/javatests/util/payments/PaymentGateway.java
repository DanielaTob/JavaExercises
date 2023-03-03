package com.javatests.util.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
