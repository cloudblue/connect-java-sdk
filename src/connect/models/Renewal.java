// Generated by Haxe 4.0.5
package connect.models;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Renewal extends connect.models.Model
{
	public Renewal(haxe.lang.EmptyObject empty)
	{
		//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Renewal()
	{
		//line 31 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 31 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		connect.models.Renewal.__hx_ctor_connect_models_Renewal(this);
	}
	
	
	protected static void __hx_ctor_connect_models_Renewal(connect.models.Renewal __hx_this)
	{
		//line 31 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		connect.models.Model.__hx_ctor_connect_models_Model(__hx_this);
		//line 32 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		haxe.ds.StringMap<java.lang.String> _g = new haxe.ds.StringMap<java.lang.String>();
		//line 32 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		_g.set("from", "DateTime");
		//line 32 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		_g.set("to", "DateTime");
		//line 32 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		__hx_this._setFieldClassNames(((haxe.ds.StringMap<java.lang.String>) (_g) ));
	}
	
	
	public connect.util.DateTime from;
	
	public connect.util.DateTime to;
	
	public int periodDelta;
	
	public java.lang.String periodUom;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		{
			//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
			if (( field != null )) 
			{
				//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
				switch (field.hashCode())
				{
					case -985479561:
					{
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						if (field.equals("periodDelta")) 
						{
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							this.periodDelta = ((int) (value) );
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		{
			//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
			if (( field != null )) 
			{
				//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
				switch (field.hashCode())
				{
					case 566588306:
					{
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						if (field.equals("periodUom")) 
						{
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							this.periodUom = haxe.lang.Runtime.toString(value);
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						break;
					}
					
					
					case 3151786:
					{
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						if (field.equals("from")) 
						{
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							this.from = ((connect.util.DateTime) (value) );
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						break;
					}
					
					
					case -985479561:
					{
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						if (field.equals("periodDelta")) 
						{
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							this.periodDelta = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						break;
					}
					
					
					case 3707:
					{
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						if (field.equals("to")) 
						{
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							this.to = ((connect.util.DateTime) (value) );
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		{
			//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
			if (( field != null )) 
			{
				//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
				switch (field.hashCode())
				{
					case 566588306:
					{
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						if (field.equals("periodUom")) 
						{
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							return this.periodUom;
						}
						
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						break;
					}
					
					
					case 3151786:
					{
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						if (field.equals("from")) 
						{
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							return this.from;
						}
						
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						break;
					}
					
					
					case -985479561:
					{
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						if (field.equals("periodDelta")) 
						{
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							return this.periodDelta;
						}
						
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						break;
					}
					
					
					case 3707:
					{
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						if (field.equals("to")) 
						{
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							return this.to;
						}
						
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		{
			//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
			if (( field != null )) 
			{
				//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
				switch (field.hashCode())
				{
					case -985479561:
					{
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						if (field.equals("periodDelta")) 
						{
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
							return ((double) (this.periodDelta) );
						}
						
						//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		baseArr.push("periodUom");
		//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		baseArr.push("periodDelta");
		//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		baseArr.push("to");
		//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		baseArr.push("from");
		//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Renewal.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


