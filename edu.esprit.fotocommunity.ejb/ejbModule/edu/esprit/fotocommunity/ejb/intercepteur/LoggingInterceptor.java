package edu.esprit.fotocommunity.ejb.intercepteur;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;


public class LoggingInterceptor {
	
	@PostConstruct
	public void init(InvocationContext inCtx) throws Exception {
        Logger logger= Logger.getLogger(inCtx.getTarget().getClass().getName());
		
		logger.info("=====================> Allocating  ["+ inCtx.getTarget().getClass().getName()+ "]");
		
	}
	
	@AroundInvoke    //permet cette methode d'intercepter l
	public Object processLogin(InvocationContext invCtx ) throws Exception {
		
		Logger logger= Logger.getLogger(invCtx.getMethod().getDeclaringClass().getName());
		
		logger.info("=====================> Starting processing method ["+invCtx.getMethod().getName() +"]");
		Object obj=invCtx.proceed();
		logger.info("\n \n=====================> Ending processing method ["+invCtx.getMethod().getName() +"]");
		
		
		
		return null;
	}
	

}
