package com.nag.nagp.customException;

import org.apache.log4j.Logger;

import com.nag.nagp.common.util.Utilities;

/* Class Decription - Class define Framework's own custom exception which can be thrown when File extension is not matched.    
 * Created by - Sachin Ahuja
 * Created on - 15th March
 * Modified by
 * Modified on
 * */
@SuppressWarnings("serial")
public class ZipCreationException extends Exception { 
	
	public static final Logger LOGGER = Logger.getLogger(Utilities.class);
    public ZipCreationException(String errorMessage) {
        super("\nError while creating ZIP file for folder :  "+errorMessage);
        LOGGER.error("Error while creating ZIP file for folder : "+errorMessage);
    }
}