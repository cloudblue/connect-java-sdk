// Generated by Haxe 4.0.5
package connect.models;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class HubStats extends connect.models.Model
{
	public HubStats(haxe.lang.EmptyObject empty)
	{
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public HubStats()
	{
		//line 104 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 104 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.HubStats.__hx_ctor_connect_models_HubStats(this);
	}
	
	
	protected static void __hx_ctor_connect_models_HubStats(connect.models.HubStats __hx_this)
	{
		//line 104 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.Model.__hx_ctor_connect_models_Model(__hx_this);
	}
	
	
	public int connections;
	
	public int marketplaces;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
		{
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
			if (( field != null )) 
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
				switch (field.hashCode())
				{
					case 738312072:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
						if (field.equals("marketplaces")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							this.marketplaces = ((int) (value) );
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
						break;
					}
					
					
					case 1724603733:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
						if (field.equals("connections")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							this.connections = ((int) (value) );
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
		{
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
			if (( field != null )) 
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
				switch (field.hashCode())
				{
					case 738312072:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
						if (field.equals("marketplaces")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							this.marketplaces = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
						break;
					}
					
					
					case 1724603733:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
						if (field.equals("connections")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							this.connections = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
		{
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
			if (( field != null )) 
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
				switch (field.hashCode())
				{
					case 738312072:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
						if (field.equals("marketplaces")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							return this.marketplaces;
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
						break;
					}
					
					
					case 1724603733:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
						if (field.equals("connections")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							return this.connections;
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
		{
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
			if (( field != null )) 
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
				switch (field.hashCode())
				{
					case 738312072:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
						if (field.equals("marketplaces")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							return ((double) (this.marketplaces) );
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
						break;
					}
					
					
					case 1724603733:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
						if (field.equals("connections")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
							return ((double) (this.connections) );
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
		baseArr.push("marketplaces");
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
		baseArr.push("connections");
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/HubStats.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


