package com.umgi.common.util;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class TestMuleMsg implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(eventContext.getMessage().getPayload());
		
		return null;
	}

}
