package edu.esprit.fotocommunity.ejb.intercepteur;

import java.lang.reflect.Field;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import org.jboss.logging.Logger;

public class TransactionInterceptor {
	
	
	@AroundInvoke
	public Object processTransaction(InvocationContext inCtx) throws Exception {
		
		Logger logger=Logger.getLogger(inCtx.getMethod().getDeclaringClass().getName());
		//Field field=inCtx
		return inCtx;
		
	}

}
