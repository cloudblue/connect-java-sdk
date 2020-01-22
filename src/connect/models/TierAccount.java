// Generated by Haxe 4.0.5
package connect.models;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TierAccount extends connect.models.IdModel
{
	public TierAccount(haxe.lang.EmptyObject empty)
	{
		//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public TierAccount()
	{
		//line 104 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 104 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.TierAccount.__hx_ctor_connect_models_TierAccount(this);
	}
	
	
	protected static void __hx_ctor_connect_models_TierAccount(connect.models.TierAccount __hx_this)
	{
		//line 104 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.IdModel.__hx_ctor_connect_models_IdModel(__hx_this);
	}
	
	
	public static connect.util.Collection<connect.models.TierAccount> list(connect.api.Query filters)
	{
		//line 66 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
		java.lang.String accounts = connect.Env.getTierApi().listTierAccounts(filters);
		//line 67 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
		return ((connect.util.Collection<connect.models.TierAccount>) (((connect.util.Collection) (connect.models.Model.parseArray(((java.lang.Class) (connect.models.TierAccount.class) ), haxe.lang.Runtime.toString(accounts))) )) );
	}
	
	
	public static connect.models.TierAccount get(java.lang.String id)
	{
		//line 73 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
		try 
		{
			//line 74 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
			java.lang.String account = connect.Env.getTierApi().getTierAccount(id);
			//line 75 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
			return ((connect.models.TierAccount) (connect.models.Model.parse(((java.lang.Class) (connect.models.TierAccount.class) ), haxe.lang.Runtime.toString(account))) );
		}
		catch (java.lang.Throwable catchallException)
		{
			//line 73 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
			haxe.lang.Exceptions.setException(catchallException);
			//line 77 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
			java.lang.Object ex = ( (haxe.root.Std.is(catchallException, haxe.lang.HaxeException.class)) ? (((haxe.lang.HaxeException) (catchallException) ).obj) : (catchallException) );
			//line 77 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
			return null;
		}
		
		
	}
	
	
	public java.lang.String externalId;
	
	public java.lang.String name;
	
	public java.lang.String environment;
	
	public connect.util.Collection<java.lang.String> scopes;
	
	public connect.models.ContactInfo contactInfo;
	
	public connect.models.Marketplace marketplace;
	
	public connect.models.Hub hub;
	
	public java.lang.String externalUid;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
		{
			//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
			if (( field != null )) 
			{
				//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
				switch (field.hashCode())
				{
					case -1153085307:
					{
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						if (field.equals("externalUid")) 
						{
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							__temp_executeDef1 = false;
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							this.externalUid = haxe.lang.Runtime.toString(value);
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							return value;
						}
						
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						break;
					}
					
					
					case -1699764666:
					{
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						if (field.equals("externalId")) 
						{
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							__temp_executeDef1 = false;
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							this.externalId = haxe.lang.Runtime.toString(value);
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							return value;
						}
						
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						break;
					}
					
					
					case 103669:
					{
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						if (field.equals("hub")) 
						{
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							__temp_executeDef1 = false;
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							this.hub = ((connect.models.Hub) (value) );
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							return value;
						}
						
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						break;
					}
					
					
					case 3373707:
					{
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						if (field.equals("name")) 
						{
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							__temp_executeDef1 = false;
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							this.name = haxe.lang.Runtime.toString(value);
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							return value;
						}
						
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						break;
					}
					
					
					case 300911179:
					{
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						if (field.equals("marketplace")) 
						{
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							__temp_executeDef1 = false;
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							this.marketplace = ((connect.models.Marketplace) (value) );
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							return value;
						}
						
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						break;
					}
					
					
					case -85904877:
					{
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						if (field.equals("environment")) 
						{
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							__temp_executeDef1 = false;
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							this.environment = haxe.lang.Runtime.toString(value);
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							return value;
						}
						
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						break;
					}
					
					
					case 40561902:
					{
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						if (field.equals("contactInfo")) 
						{
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							__temp_executeDef1 = false;
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							this.contactInfo = ((connect.models.ContactInfo) (value) );
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							return value;
						}
						
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						break;
					}
					
					
					case -907768673:
					{
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						if (field.equals("scopes")) 
						{
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							__temp_executeDef1 = false;
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							this.scopes = ((connect.util.Collection<java.lang.String>) (value) );
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							return value;
						}
						
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
		{
			//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
			if (( field != null )) 
			{
				//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
				switch (field.hashCode())
				{
					case -1153085307:
					{
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						if (field.equals("externalUid")) 
						{
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							__temp_executeDef1 = false;
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							return this.externalUid;
						}
						
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						break;
					}
					
					
					case -1699764666:
					{
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						if (field.equals("externalId")) 
						{
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							__temp_executeDef1 = false;
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							return this.externalId;
						}
						
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						break;
					}
					
					
					case 103669:
					{
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						if (field.equals("hub")) 
						{
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							__temp_executeDef1 = false;
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							return this.hub;
						}
						
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						break;
					}
					
					
					case 3373707:
					{
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						if (field.equals("name")) 
						{
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							__temp_executeDef1 = false;
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							return this.name;
						}
						
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						break;
					}
					
					
					case 300911179:
					{
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						if (field.equals("marketplace")) 
						{
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							__temp_executeDef1 = false;
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							return this.marketplace;
						}
						
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						break;
					}
					
					
					case -85904877:
					{
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						if (field.equals("environment")) 
						{
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							__temp_executeDef1 = false;
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							return this.environment;
						}
						
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						break;
					}
					
					
					case 40561902:
					{
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						if (field.equals("contactInfo")) 
						{
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							__temp_executeDef1 = false;
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							return this.contactInfo;
						}
						
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						break;
					}
					
					
					case -907768673:
					{
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						if (field.equals("scopes")) 
						{
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							__temp_executeDef1 = false;
							//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
							return this.scopes;
						}
						
						//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
		baseArr.push("externalUid");
		//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
		baseArr.push("hub");
		//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
		baseArr.push("marketplace");
		//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
		baseArr.push("contactInfo");
		//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
		baseArr.push("scopes");
		//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
		baseArr.push("environment");
		//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
		baseArr.push("name");
		//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
		baseArr.push("externalId");
		//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/TierAccount.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


