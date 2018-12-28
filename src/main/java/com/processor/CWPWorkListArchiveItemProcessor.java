package com.processor;

import org.springframework.batch.item.ItemProcessor;

import com.model.CWPWorkListArchive;

public class CWPWorkListArchiveItemProcessor implements ItemProcessor<CWPWorkListArchive,CWPWorkListArchive> {

	@Override
	public CWPWorkListArchive process(CWPWorkListArchive cWPWorkListArchive) throws Exception {
		return cWPWorkListArchive;
	}

}
