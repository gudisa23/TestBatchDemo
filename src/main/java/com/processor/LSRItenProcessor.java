package com.processor;

import org.springframework.batch.item.ItemProcessor;

import com.model.LSR;


public class LSRItenProcessor implements ItemProcessor<LSR, LSR>{

	@Override
	public LSR process(LSR lsr) throws Exception {
		return lsr;
	}

}
