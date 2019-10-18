package com.nag.nagp.customAssertion;

import java.util.List;

import org.apache.log4j.Logger;
import org.testng.asserts.Assertion;
import org.testng.asserts.IAssert;
import org.testng.collections.Lists;


public class CustomAssertion extends Assertion {
	  
	  private List<String> assert_messages = Lists.newArrayList();
	  public static final Logger LOGGER = Logger.getLogger(CustomAssertion.class);
	    @Override
	    public void onAssertFailure(IAssert<?> assertCommand, AssertionError ex) {
	    	LOGGER.error(assertCommand.getMessage());
	    	assert_messages.add("OnlyOnAssertFailure:" + assertCommand.getMessage());
	      
	    }
	/*
	 * @Override public void onAssertSuccess(IAssert<?> assertCommand) { String
	 * str=assertCommand.getMessage().replace("doesn't","");
	 * ReportLogger.error(str); assert_messages.add("OnlyOnAssertSuccess:" + str); }
	 */
	    
	    
	    
	}