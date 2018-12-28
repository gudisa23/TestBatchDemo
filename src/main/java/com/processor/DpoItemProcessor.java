package com.processor;

import org.springframework.batch.item.ItemProcessor;

import com.model.Dpo;

public class DpoItemProcessor implements ItemProcessor<Dpo,Dpo>{

	@Override
	public Dpo process(Dpo dpo) throws Exception {
		return dpo;
	}

}
