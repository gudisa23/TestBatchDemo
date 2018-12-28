package com.processor;

import org.springframework.batch.item.ItemProcessor;

import com.model.Validerrors;

public class ValiderrorsItemProcessor implements ItemProcessor<Validerrors, Validerrors>{

	@Override
	public Validerrors process(Validerrors validerrors) throws Exception {
		return validerrors;
	}

}
