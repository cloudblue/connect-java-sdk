// Generated by Haxe 4.0.5
package connect.logger;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Logger_setFilename_61__Fun extends haxe.lang.Function
{
	public Logger_setFilename_61__Fun(java.lang.String fullname)
	{
		//line 62 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
		super(2, 0);
		//line 62 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
		this.fullname = fullname;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 61 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
		boolean last = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toBool(((java.lang.Boolean) (((java.lang.Object) (__fn_float2) )) ))) : (haxe.lang.Runtime.toBool(((java.lang.Boolean) (__fn_dyn2) ))) );
		//line 61 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
		connect.logger.LoggerHandler o = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((connect.logger.LoggerHandler) (((java.lang.Object) (__fn_float1) )) )) : (((connect.logger.LoggerHandler) (__fn_dyn1) )) );
		//line 62 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
		if (last) 
		{
			//line 62 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
			return o.writer.setFilename(this.fullname);
		}
		else
		{
			//line 62 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
			return false;
		}
		
	}
	
	
	public java.lang.String fullname;
	
}


