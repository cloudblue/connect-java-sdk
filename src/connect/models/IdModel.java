// Generated by Haxe 4.0.5
package connect.models;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class IdModel extends connect.models.Model
{
	public IdModel(haxe.lang.EmptyObject empty)
	{
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public IdModel()
	{
		//line 104 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 104 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.IdModel.__hx_ctor_connect_models_IdModel(this);
	}
	
	
	protected static void __hx_ctor_connect_models_IdModel(connect.models.IdModel __hx_this)
	{
		//line 104 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.Model.__hx_ctor_connect_models_Model(__hx_this);
	}
	
	
	public java.lang.String id;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
		{
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
			if (( field != null )) 
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
				switch (field.hashCode())
				{
					case 3355:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
						if (field.equals("id")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
							this.id = haxe.lang.Runtime.toString(value);
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
		{
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
			if (( field != null )) 
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
				switch (field.hashCode())
				{
					case 3355:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
						if (field.equals("id")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
							return this.id;
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
		baseArr.push("id");
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/IdModel.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


