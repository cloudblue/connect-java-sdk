// Generated by Haxe 4.0.5
package connect.models;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Activation extends connect.models.Model
{
	public Activation(haxe.lang.EmptyObject empty)
	{
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Activation()
	{
		//line 24 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 24 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
		connect.models.Activation.__hx_ctor_connect_models_Activation(this);
	}
	
	
	protected static void __hx_ctor_connect_models_Activation(connect.models.Activation __hx_this)
	{
		//line 24 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
		connect.models.Model.__hx_ctor_connect_models_Model(__hx_this);
		//line 25 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
		haxe.ds.StringMap<java.lang.String> _g = new haxe.ds.StringMap<java.lang.String>();
		//line 25 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
		_g.set("date", "DateTime");
		//line 25 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
		__hx_this._setFieldClassNames(((haxe.ds.StringMap<java.lang.String>) (_g) ));
	}
	
	
	public java.lang.String link;
	
	public java.lang.String message;
	
	public connect.DateTime date;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
		{
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
			if (( field != null )) 
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
				switch (field.hashCode())
				{
					case 3076014:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
						if (field.equals("date")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
							this.date = ((connect.DateTime) (value) );
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
						break;
					}
					
					
					case 3321850:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
						if (field.equals("link")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
							this.link = haxe.lang.Runtime.toString(value);
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
						break;
					}
					
					
					case 954925063:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
						if (field.equals("message")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
							this.message = haxe.lang.Runtime.toString(value);
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
		{
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
			if (( field != null )) 
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
				switch (field.hashCode())
				{
					case 3076014:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
						if (field.equals("date")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
							return this.date;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
						break;
					}
					
					
					case 3321850:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
						if (field.equals("link")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
							return this.link;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
						break;
					}
					
					
					case 954925063:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
						if (field.equals("message")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
							return this.message;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
		baseArr.push("date");
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
		baseArr.push("message");
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
		baseArr.push("link");
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Activation.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


