package com.processor;

import org.springframework.batch.item.ItemProcessor;

import com.model.CWPWorkList;

public class CWPWorkListItemProcessor implements ItemProcessor<CWPWorkList,CWPWorkList>{

	@Override
	public CWPWorkList process(CWPWorkList cWPWorkList) throws Exception {
		return cWPWorkList;
	}

}
