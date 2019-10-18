package com.nag.nagp.common.util;

public class AbsolutePath {
	private static String absPath = null;
	   
	/*
    * @author: Sachin Ahuja
    * @description: This method returns the absolute path of the project
    */
    public AbsolutePath(String ProjectName)
    {
       absPath = ProjectName;
       absPath = absPath.replace("/", "\\");
    }
    
    public static String Path()
    {
         return absPath;
    }
}
