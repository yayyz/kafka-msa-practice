package com.spartacoding.msa.payment.infrastructure.messaging;

import com.spartacoding.msa.payment.application.PaymentApplicationService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentConsumer {

    private final PaymentApplicationService paymentApplicationService;
    private final Logger logger = LoggerFactory.getLogger(PaymentConsumer.class);

    // TODO 주문 생성에 대한 이벤트 구독, 처리
}
