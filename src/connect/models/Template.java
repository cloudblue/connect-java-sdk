// Generated by Haxe 4.0.5
package connect.models;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Template extends connect.models.IdModel
{
	public Template(haxe.lang.EmptyObject empty)
	{
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Template()
	{
		//line 103 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Model.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 103 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.Template.__hx_ctor_connect_models_Template(this);
	}
	
	
	protected static void __hx_ctor_connect_models_Template(connect.models.Template __hx_this)
	{
		//line 103 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.IdModel.__hx_ctor_connect_models_IdModel(__hx_this);
	}
	
	
	public java.lang.String title;
	
	public java.lang.String body;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
		{
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
			if (( field != null )) 
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
				switch (field.hashCode())
				{
					case 3029410:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
						if (field.equals("body")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
							this.body = haxe.lang.Runtime.toString(value);
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
						break;
					}
					
					
					case 110371416:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
						if (field.equals("title")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
							this.title = haxe.lang.Runtime.toString(value);
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
		{
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
			if (( field != null )) 
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
				switch (field.hashCode())
				{
					case 3029410:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
						if (field.equals("body")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
							return this.body;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
						break;
					}
					
					
					case 110371416:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
						if (field.equals("title")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
							return this.title;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
		baseArr.push("body");
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
		baseArr.push("title");
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Template.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


