// Generated by Haxe 4.0.5
package connect.models;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Constraints extends connect.models.Model
{
	public Constraints(haxe.lang.EmptyObject empty)
	{
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Constraints()
	{
		//line 103 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 103 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.Constraints.__hx_ctor_connect_models_Constraints(this);
	}
	
	
	protected static void __hx_ctor_connect_models_Constraints(connect.models.Constraints __hx_this)
	{
		//line 103 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.Model.__hx_ctor_connect_models_Model(__hx_this);
	}
	
	
	public boolean hidden;
	
	public boolean required;
	
	public connect.Collection<connect.models.Choice> choices;
	
	public boolean unique;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
		{
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
			if (( field != null )) 
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
				switch (field.hashCode())
				{
					case -840528943:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
						if (field.equals("unique")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							this.unique = haxe.lang.Runtime.toBool(((java.lang.Boolean) (value) ));
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
						break;
					}
					
					
					case -1217487446:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
						if (field.equals("hidden")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							this.hidden = haxe.lang.Runtime.toBool(((java.lang.Boolean) (value) ));
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
						break;
					}
					
					
					case 751720178:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
						if (field.equals("choices")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							this.choices = ((connect.Collection<connect.models.Choice>) (value) );
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
						break;
					}
					
					
					case -393139297:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
						if (field.equals("required")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							this.required = haxe.lang.Runtime.toBool(((java.lang.Boolean) (value) ));
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
		{
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
			if (( field != null )) 
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
				switch (field.hashCode())
				{
					case -840528943:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
						if (field.equals("unique")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							return this.unique;
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
						break;
					}
					
					
					case -1217487446:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
						if (field.equals("hidden")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							return this.hidden;
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
						break;
					}
					
					
					case 751720178:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
						if (field.equals("choices")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							return this.choices;
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
						break;
					}
					
					
					case -393139297:
					{
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
						if (field.equals("required")) 
						{
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
							return this.required;
						}
						
						//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
		baseArr.push("unique");
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
		baseArr.push("choices");
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
		baseArr.push("required");
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
		baseArr.push("hidden");
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Constraints.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


