package com.spartacoding.msa.payment.application;

import com.spartacoding.msa.payment.domain.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentApplicationService {

    Logger logger = LoggerFactory.getLogger(PaymentApplicationService.class);
    private final PaymentRepository paymentRepository;

    // TODO PG연동은 스킵. 주문생성에 대한 결제 완료처리, 결제완료에 대한 이벤트 발행
    public void completePayment() {
    }
}
