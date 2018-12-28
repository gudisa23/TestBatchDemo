package com.processor;

import org.springframework.batch.item.ItemProcessor;

import com.model.CWOrderInstance;


public class PersonItenProcessor implements ItemProcessor<CWOrderInstance, CWOrderInstance>{

	@Override
	public CWOrderInstance process(CWOrderInstance person) throws Exception {
		return person;
	}
}