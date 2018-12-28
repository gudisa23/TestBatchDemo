package com.processor;

import org.springframework.batch.item.ItemProcessor;

import com.model.OrderHistory;

public class OrderHistoryItemProcessor implements ItemProcessor<OrderHistory,OrderHistory>{

	@Override
	public OrderHistory process(OrderHistory orderHistory) throws Exception {
		return orderHistory;
	}

}
