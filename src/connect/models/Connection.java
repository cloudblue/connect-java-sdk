// Generated by Haxe 4.0.5
package connect.models;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Connection extends connect.models.IdModel
{
	public Connection(haxe.lang.EmptyObject empty)
	{
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Connection()
	{
		//line 47 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 47 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		connect.models.Connection.__hx_ctor_connect_models_Connection(this);
	}
	
	
	protected static void __hx_ctor_connect_models_Connection(connect.models.Connection __hx_this)
	{
		//line 47 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		connect.models.IdModel.__hx_ctor_connect_models_IdModel(__hx_this);
		//line 48 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		haxe.ds.StringMap<java.lang.String> _g = new haxe.ds.StringMap<java.lang.String>();
		//line 48 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		_g.set("provider", "Account");
		//line 48 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		_g.set("vendor", "Account");
		//line 48 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		_g.set("createdAt", "DateTime");
		//line 48 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		__hx_this._setFieldClassNames(((haxe.ds.StringMap<java.lang.String>) (_g) ));
	}
	
	
	public java.lang.String type;
	
	public connect.models.Account provider;
	
	public connect.models.Account vendor;
	
	public connect.models.Product product;
	
	public connect.models.Hub hub;
	
	public java.lang.String status;
	
	public connect.util.DateTime createdAt;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		{
			//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
			if (( field != null )) 
			{
				//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
				switch (field.hashCode())
				{
					case 598371643:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						if (field.equals("createdAt")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							this.createdAt = ((connect.util.DateTime) (value) );
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							return value;
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						break;
					}
					
					
					case 3575610:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						if (field.equals("type")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							this.type = haxe.lang.Runtime.toString(value);
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							return value;
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						break;
					}
					
					
					case -892481550:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						if (field.equals("status")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							this.status = haxe.lang.Runtime.toString(value);
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							return value;
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						break;
					}
					
					
					case -987494927:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						if (field.equals("provider")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							this.provider = ((connect.models.Account) (value) );
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							return value;
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						break;
					}
					
					
					case 103669:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						if (field.equals("hub")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							this.hub = ((connect.models.Hub) (value) );
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							return value;
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						break;
					}
					
					
					case -820075192:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						if (field.equals("vendor")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							this.vendor = ((connect.models.Account) (value) );
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							return value;
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						break;
					}
					
					
					case -309474065:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						if (field.equals("product")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							this.product = ((connect.models.Product) (value) );
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							return value;
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		{
			//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
			if (( field != null )) 
			{
				//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
				switch (field.hashCode())
				{
					case 598371643:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						if (field.equals("createdAt")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							return this.createdAt;
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						break;
					}
					
					
					case 3575610:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						if (field.equals("type")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							return this.type;
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						break;
					}
					
					
					case -892481550:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						if (field.equals("status")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							return this.status;
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						break;
					}
					
					
					case -987494927:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						if (field.equals("provider")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							return this.provider;
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						break;
					}
					
					
					case 103669:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						if (field.equals("hub")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							return this.hub;
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						break;
					}
					
					
					case -820075192:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						if (field.equals("vendor")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							return this.vendor;
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						break;
					}
					
					
					case -309474065:
					{
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						if (field.equals("product")) 
						{
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							__temp_executeDef1 = false;
							//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
							return this.product;
						}
						
						//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		baseArr.push("createdAt");
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		baseArr.push("status");
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		baseArr.push("hub");
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		baseArr.push("product");
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		baseArr.push("vendor");
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		baseArr.push("provider");
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		baseArr.push("type");
		//line 16 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Connection.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


