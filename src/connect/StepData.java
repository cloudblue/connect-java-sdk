// Generated by Haxe 4.0.5
package connect;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StepData extends haxe.lang.HxObject
{
	public StepData(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StepData(int firstIndex, java.lang.Object data, connect.StorageType storage)
	{
		//line 24 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
		connect.StepData.__hx_ctor_connect_StepData(this, firstIndex, data, storage);
	}
	
	
	protected static void __hx_ctor_connect_StepData(connect.StepData __hx_this, int firstIndex, java.lang.Object data, connect.StorageType storage)
	{
		//line 25 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
		__hx_this.firstIndex = firstIndex;
		//line 26 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
		__hx_this.data = new connect.Dictionary();
		//line 27 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
		__hx_this.storage = storage;
		//line 28 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
		if (( data instanceof connect.Dictionary )) 
		{
			//line 30 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			java.lang.Object key = (((connect.Dictionary) (data) )).keys();
			//line 30 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(key, "hasNext", null)) )))
			{
				//line 30 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				java.lang.String key1 = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(key, "next", null));
				//line 31 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				java.lang.Object value = ((java.lang.Object) (haxe.lang.Runtime.callField(data, "get", new java.lang.Object[]{key1})) );
				//line 32 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				java.lang.String className = ( (( value instanceof connect.models.Model )) ? (haxe.root.Type.getClassName(((java.lang.Class) (haxe.root.Type.getClass(((java.lang.Object) (value) ))) ))) : ("") );
				//line 35 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				__hx_this.data.set(( ( ( "" + key1 ) + "::" ) + className ), value);
			}
			
		}
		else
		{
			//line 39 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			int _g = 0;
			//line 39 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			haxe.root.Array<java.lang.String> _g1 = haxe.root.Reflect.fields(data);
			//line 39 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			while (( _g < _g1.length ))
			{
				//line 39 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				java.lang.String field = _g1.__get(_g);
				//line 39 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				 ++ _g;
				//line 40 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				haxe.root.Array<java.lang.String> fieldSplit = haxe.lang.StringExt.split(field, "::");
				//line 41 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				java.lang.String fieldName = fieldSplit.slice(0, -1).join("::");
				//line 42 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				java.lang.String fieldClass = fieldSplit.slice(-1, null).__get(0);
				//line 43 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				haxe.lang.Function replacer = null;
				//line 43 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				java.lang.String space = null;
				//line 43 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				java.lang.String value1 = haxe.format.JsonPrinter.print(haxe.root.Reflect.field(data, field), replacer, space);
				//line 44 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				java.lang.String parsedValue = ( ( ! (haxe.lang.Runtime.valEq(fieldClass, "")) ) ? (haxe.lang.Runtime.toString(connect.models.Model.parse(((java.lang.Class) (haxe.root.Type.resolveClass(fieldClass)) ), haxe.lang.Runtime.toString(value1)))) : (value1) );
				//line 47 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				__hx_this.data.set(fieldName, parsedValue);
			}
			
		}
		
	}
	
	
	public int firstIndex;
	
	public connect.Dictionary data;
	
	public connect.StorageType storage;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
		{
			//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			if (( field != null )) 
			{
				//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				switch (field.hashCode())
				{
					case -181300222:
					{
						//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
						if (field.equals("firstIndex")) 
						{
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							__temp_executeDef1 = false;
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							this.firstIndex = ((int) (value) );
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							return value;
						}
						
						//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
		{
			//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			if (( field != null )) 
			{
				//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				switch (field.hashCode())
				{
					case -1884274053:
					{
						//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
						if (field.equals("storage")) 
						{
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							__temp_executeDef1 = false;
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							this.storage = ((connect.StorageType) (value) );
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							return value;
						}
						
						//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
						break;
					}
					
					
					case -181300222:
					{
						//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
						if (field.equals("firstIndex")) 
						{
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							__temp_executeDef1 = false;
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							this.firstIndex = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							return value;
						}
						
						//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
						break;
					}
					
					
					case 3076010:
					{
						//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
						if (field.equals("data")) 
						{
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							__temp_executeDef1 = false;
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							this.data = ((connect.Dictionary) (value) );
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							return value;
						}
						
						//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
		{
			//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			if (( field != null )) 
			{
				//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				switch (field.hashCode())
				{
					case -1884274053:
					{
						//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
						if (field.equals("storage")) 
						{
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							__temp_executeDef1 = false;
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							return this.storage;
						}
						
						//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
						break;
					}
					
					
					case -181300222:
					{
						//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
						if (field.equals("firstIndex")) 
						{
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							__temp_executeDef1 = false;
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							return this.firstIndex;
						}
						
						//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
						break;
					}
					
					
					case 3076010:
					{
						//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
						if (field.equals("data")) 
						{
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							__temp_executeDef1 = false;
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							return this.data;
						}
						
						//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
		{
			//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			if (( field != null )) 
			{
				//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				switch (field.hashCode())
				{
					case -181300222:
					{
						//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
						if (field.equals("firstIndex")) 
						{
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							__temp_executeDef1 = false;
							//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
							return ((double) (this.firstIndex) );
						}
						
						//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
		baseArr.push("storage");
		//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
		baseArr.push("data");
		//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
		baseArr.push("firstIndex");
		//line 19 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


