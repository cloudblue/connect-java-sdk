// Generated by Haxe 4.0.5
package connect._Flow;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Step extends haxe.lang.HxObject
{
	public Step(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Step(java.lang.String description, java.util.function.Consumer<connect.Flow> func)
	{
		//line 647 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
		connect._Flow.Step.__hx_ctor_connect__Flow_Step(this, description, func);
	}
	
	
	protected static void __hx_ctor_connect__Flow_Step(connect._Flow.Step __hx_this, java.lang.String description, java.util.function.Consumer<connect.Flow> func)
	{
		//line 648 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
		__hx_this.description = description;
		//line 649 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
		__hx_this.func = func;
	}
	
	
	public java.lang.String description;
	
	public java.util.function.Consumer<connect.Flow> func;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
		{
			//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
			boolean __temp_executeDef1 = true;
			//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
			if (( field != null )) 
			{
				//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
				switch (field.hashCode())
				{
					case 3154628:
					{
						//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
						if (field.equals("func")) 
						{
							//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
							__temp_executeDef1 = false;
							//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
							this.func = ((java.util.function.Consumer<connect.Flow>) (value) );
							//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
							return value;
						}
						
						//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
						break;
					}
					
					
					case -1724546052:
					{
						//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
						if (field.equals("description")) 
						{
							//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
							__temp_executeDef1 = false;
							//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
							this.description = haxe.lang.Runtime.toString(value);
							//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
							return value;
						}
						
						//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
			if (__temp_executeDef1) 
			{
				//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
		{
			//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
			boolean __temp_executeDef1 = true;
			//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
			if (( field != null )) 
			{
				//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
				switch (field.hashCode())
				{
					case 3154628:
					{
						//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
						if (field.equals("func")) 
						{
							//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
							__temp_executeDef1 = false;
							//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
							return this.func;
						}
						
						//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
						break;
					}
					
					
					case -1724546052:
					{
						//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
						if (field.equals("description")) 
						{
							//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
							__temp_executeDef1 = false;
							//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
							return this.description;
						}
						
						//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
			if (__temp_executeDef1) 
			{
				//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
		baseArr.push("func");
		//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
		baseArr.push("description");
		//line 643 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Flow.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


