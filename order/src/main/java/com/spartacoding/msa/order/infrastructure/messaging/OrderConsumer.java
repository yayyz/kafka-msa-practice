package com.spartacoding.msa.order.infrastructure.messaging;

import com.spartacoding.msa.order.application.OrderApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderConsumer {

    private final OrderApplicationService orderApplicationService;

    // TODO order-msa가 구독하는 이벤트를 처리하는 로직을 개발해주세요
}
