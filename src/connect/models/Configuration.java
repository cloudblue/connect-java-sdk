// Generated by Haxe 4.0.5
package connect.models;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Configuration extends connect.models.Model
{
	public Configuration(haxe.lang.EmptyObject empty)
	{
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Configuration()
	{
		//line 103 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 103 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.Configuration.__hx_ctor_connect_models_Configuration(this);
	}
	
	
	protected static void __hx_ctor_connect_models_Configuration(connect.models.Configuration __hx_this)
	{
		//line 103 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.Model.__hx_ctor_connect_models_Model(__hx_this);
	}
	
	
	public connect.Collection<connect.models.Param> params;
	
	public connect.models.Param getParamById(java.lang.String paramId)
	{
		//line 23 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
		haxe.root.Array<connect.models.Param> _this = this.params.toArray();
		//line 23 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
		haxe.root.Array<connect.models.Param> ret = new haxe.root.Array<connect.models.Param>(new connect.models.Param[]{});
		//line 23 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
		{
			//line 23 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
			int _g = 0;
			//line 23 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
			int _g1 = _this.length;
			//line 23 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
			while (( _g < _g1 ))
			{
				//line 23 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
				int i = _g++;
				//line 23 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
				connect.models.Param elt = _this.__get(i);
				//line 23 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
				if (haxe.lang.Runtime.valEq(elt.id, paramId)) 
				{
					//line 23 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
					ret.push(elt);
				}
				
			}
			
		}
		
		//line 23 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
		haxe.root.Array<connect.models.Param> params = ret;
		//line 26 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
		if (( params.length > 0 )) 
		{
			//line 26 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
			return params.__get(0);
		}
		else
		{
			//line 26 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
			return null;
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
		{
			//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
			if (( field != null )) 
			{
				//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
				switch (field.hashCode())
				{
					case -995427962:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
						if (field.equals("params")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
							this.params = ((connect.Collection<connect.models.Param>) (value) );
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
							return value;
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
		{
			//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
			if (( field != null )) 
			{
				//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
				switch (field.hashCode())
				{
					case 1943817033:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
						if (field.equals("getParamById")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getParamById")) );
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
						break;
					}
					
					
					case -995427962:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
						if (field.equals("params")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
							return this.params;
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
		{
			//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
			if (( field != null )) 
			{
				//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
				switch (field.hashCode())
				{
					case 1943817033:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
						if (field.equals("getParamById")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
							return this.getParamById(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
		baseArr.push("params");
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Configuration.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


