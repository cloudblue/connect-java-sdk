// Generated by Haxe 4.0.5
package sys.net;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Host extends haxe.lang.HxObject
{
	public Host(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Host(java.lang.String name)
	{
		//line 33 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		sys.net.Host.__hx_ctor_sys_net_Host(this, name);
	}
	
	
	protected static void __hx_ctor_sys_net_Host(sys.net.Host __hx_this, java.lang.String name)
	{
		//line 34 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		__hx_this.host = name;
		//line 36 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		try 
		{
			//line 36 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			__hx_this.wrapped = java.net.InetAddress.getByName(haxe.lang.Runtime.toString(name));
		}
		catch (java.lang.Throwable catchallException)
		{
			//line 35 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			haxe.lang.Exceptions.setException(catchallException);
			//line 38 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			java.lang.Object e = ( (haxe.root.Std.is(catchallException, haxe.lang.HaxeException.class)) ? (((haxe.lang.HaxeException) (catchallException) ).obj) : (catchallException) );
			//line 38 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			throw haxe.lang.HaxeException.wrap(e);
		}
		
		
		//line 39 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		byte[] rawIp = __hx_this.wrapped.getAddress();
		//line 41 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		__hx_this.ip = ( ( ( ((int) (rawIp[3]) ) | ( ((int) (rawIp[2]) ) << 8 ) ) | ( ((int) (rawIp[1]) ) << 16 ) ) | ( ((int) (rawIp[0]) ) << 24 ) );
	}
	
	
	public static java.lang.String localhost()
	{
		//line 54 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		try 
		{
			//line 54 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			return java.net.InetAddress.getLocalHost().getHostName();
		}
		catch (java.lang.Throwable catchallException)
		{
			//line 53 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			haxe.lang.Exceptions.setException(catchallException);
			//line 56 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			java.lang.Object e = ( (haxe.root.Std.is(catchallException, haxe.lang.HaxeException.class)) ? (((haxe.lang.HaxeException) (catchallException) ).obj) : (catchallException) );
			//line 56 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			throw haxe.lang.HaxeException.wrap(e);
		}
		
		
	}
	
	
	public java.lang.String host;
	
	public int ip;
	
	public java.net.InetAddress wrapped;
	
	@Override public java.lang.String toString()
	{
		//line 45 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		return this.wrapped.getHostAddress();
	}
	
	
	public java.lang.String reverse()
	{
		//line 49 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		return this.wrapped.getHostName();
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		{
			//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			if (( field != null )) 
			{
				//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
				switch (field.hashCode())
				{
					case 3367:
					{
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						if (field.equals("ip")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							this.ip = ((int) (value) );
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							return value;
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		{
			//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			if (( field != null )) 
			{
				//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
				switch (field.hashCode())
				{
					case 1595507845:
					{
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						if (field.equals("wrapped")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							this.wrapped = ((java.net.InetAddress) (value) );
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							return value;
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						break;
					}
					
					
					case 3208616:
					{
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						if (field.equals("host")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							this.host = haxe.lang.Runtime.toString(value);
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							return value;
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						break;
					}
					
					
					case 3367:
					{
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						if (field.equals("ip")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							this.ip = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							return value;
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		{
			//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			if (( field != null )) 
			{
				//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
				switch (field.hashCode())
				{
					case 1099846370:
					{
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						if (field.equals("reverse")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "reverse")) );
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						break;
					}
					
					
					case 3208616:
					{
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						if (field.equals("host")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							return this.host;
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						break;
					}
					
					
					case -1776922004:
					{
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						if (field.equals("toString")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						break;
					}
					
					
					case 3367:
					{
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						if (field.equals("ip")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							return this.ip;
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						break;
					}
					
					
					case 1595507845:
					{
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						if (field.equals("wrapped")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							return this.wrapped;
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		{
			//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			if (( field != null )) 
			{
				//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
				switch (field.hashCode())
				{
					case 3367:
					{
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						if (field.equals("ip")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							return ((double) (this.ip) );
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		{
			//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			if (( field != null )) 
			{
				//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
				switch (field.hashCode())
				{
					case 1099846370:
					{
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						if (field.equals("reverse")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							return this.reverse();
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						break;
					}
					
					
					case -1776922004:
					{
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						if (field.equals("toString")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
							return this.toString();
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		baseArr.push("wrapped");
		//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		baseArr.push("ip");
		//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		baseArr.push("host");
		//line 27 "/home/travis/haxe/std/java/_std/sys/net/Host.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


