// Generated by Haxe 4.0.5
package connect.logger._Logger;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class LoggerSection extends haxe.lang.HxObject
{
	public LoggerSection(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public LoggerSection(java.lang.String name)
	{
		//line 274 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
		connect.logger._Logger.LoggerSection.__hx_ctor_connect_logger__Logger_LoggerSection(this, name);
	}
	
	
	protected static void __hx_ctor_connect_logger__Logger_LoggerSection(connect.logger._Logger.LoggerSection __hx_this, java.lang.String name)
	{
		//line 275 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
		__hx_this.name = name;
		//line 276 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
		__hx_this.written = false;
	}
	
	
	public java.lang.String name;
	
	public boolean written;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
		{
			//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
			boolean __temp_executeDef1 = true;
			//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
			if (( field != null )) 
			{
				//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
				switch (field.hashCode())
				{
					case 1603019031:
					{
						//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
						if (field.equals("written")) 
						{
							//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
							__temp_executeDef1 = false;
							//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
							this.written = haxe.lang.Runtime.toBool(((java.lang.Boolean) (value) ));
							//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
							return value;
						}
						
						//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
						break;
					}
					
					
					case 3373707:
					{
						//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
						if (field.equals("name")) 
						{
							//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
							__temp_executeDef1 = false;
							//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
							this.name = haxe.lang.Runtime.toString(value);
							//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
							return value;
						}
						
						//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
			if (__temp_executeDef1) 
			{
				//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
		{
			//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
			boolean __temp_executeDef1 = true;
			//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
			if (( field != null )) 
			{
				//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
				switch (field.hashCode())
				{
					case 1603019031:
					{
						//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
						if (field.equals("written")) 
						{
							//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
							__temp_executeDef1 = false;
							//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
							return this.written;
						}
						
						//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
						break;
					}
					
					
					case 3373707:
					{
						//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
						if (field.equals("name")) 
						{
							//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
							__temp_executeDef1 = false;
							//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
							return this.name;
						}
						
						//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
			if (__temp_executeDef1) 
			{
				//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
		baseArr.push("written");
		//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
		baseArr.push("name");
		//line 270 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/logger/Logger.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


