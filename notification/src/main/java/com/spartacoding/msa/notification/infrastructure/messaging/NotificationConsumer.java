package com.spartacoding.msa.notification.infrastructure.messaging;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotificationConsumer {

    private final Logger logger = LoggerFactory.getLogger(NotificationConsumer.class);

    // TODO 주문완료에 대한 이벤트를 구독, 처리. 주문 완료에 대한 알림 메세지는 로그로 출력.
}
