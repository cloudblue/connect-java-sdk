// Generated by Haxe 4.0.5
package connect.models;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Contact extends connect.models.Model
{
	public Contact(haxe.lang.EmptyObject empty)
	{
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Contact()
	{
		//line 104 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Model.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 104 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.Contact.__hx_ctor_connect_models_Contact(this);
	}
	
	
	protected static void __hx_ctor_connect_models_Contact(connect.models.Contact __hx_this)
	{
		//line 104 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.Model.__hx_ctor_connect_models_Model(__hx_this);
	}
	
	
	public java.lang.String firstName;
	
	public java.lang.String lastName;
	
	public java.lang.String email;
	
	public connect.models.PhoneNumber phoneNumber;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
		{
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
			if (( field != null )) 
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
				switch (field.hashCode())
				{
					case -1192969641:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
						if (field.equals("phoneNumber")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							this.phoneNumber = ((connect.models.PhoneNumber) (value) );
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
						break;
					}
					
					
					case 132835675:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
						if (field.equals("firstName")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							this.firstName = haxe.lang.Runtime.toString(value);
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
						break;
					}
					
					
					case 96619420:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
						if (field.equals("email")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							this.email = haxe.lang.Runtime.toString(value);
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
						break;
					}
					
					
					case -1459599807:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
						if (field.equals("lastName")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							this.lastName = haxe.lang.Runtime.toString(value);
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							return value;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
		{
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
			if (( field != null )) 
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
				switch (field.hashCode())
				{
					case -1192969641:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
						if (field.equals("phoneNumber")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							return this.phoneNumber;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
						break;
					}
					
					
					case 132835675:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
						if (field.equals("firstName")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							return this.firstName;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
						break;
					}
					
					
					case 96619420:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
						if (field.equals("email")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							return this.email;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
						break;
					}
					
					
					case -1459599807:
					{
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
						if (field.equals("lastName")) 
						{
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							__temp_executeDef1 = false;
							//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
							return this.lastName;
						}
						
						//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
		baseArr.push("phoneNumber");
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
		baseArr.push("email");
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
		baseArr.push("lastName");
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
		baseArr.push("firstName");
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Contact.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


