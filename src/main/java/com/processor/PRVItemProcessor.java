package com.processor;

import org.springframework.batch.item.ItemProcessor;

import com.model.PRV;

public class PRVItemProcessor implements ItemProcessor<PRV,PRV>{

	@Override
	public PRV process(PRV prv) throws Exception {
		return prv;
	}

}
