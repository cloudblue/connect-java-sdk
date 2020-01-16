// Generated by Haxe 4.0.5
package connect.models;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Account extends connect.models.IdModel
{
	public Account(haxe.lang.EmptyObject empty)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Account()
	{
		//line 103 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 103 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.Account.__hx_ctor_connect_models_Account(this);
	}
	
	
	protected static void __hx_ctor_connect_models_Account(connect.models.Account __hx_this)
	{
		//line 103 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.IdModel.__hx_ctor_connect_models_IdModel(__hx_this);
	}
	
	
	public static connect.Collection<connect.models.Account> list(connect.api.Query filters)
	{
		//line 47 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		java.lang.String accounts = connect.Env.getGeneralApi().listAccounts(filters);
		//line 48 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		return ((connect.Collection<connect.models.Account>) (((connect.Collection) (connect.models.Model.parseArray(((java.lang.Class) (connect.models.Account.class) ), haxe.lang.Runtime.toString(accounts))) )) );
	}
	
	
	public static connect.models.Account create()
	{
		//line 58 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		java.lang.String account = connect.Env.getGeneralApi().createAccount();
		//line 59 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		return ((connect.models.Account) (connect.models.Model.parse(((java.lang.Class) (connect.models.Account.class) ), haxe.lang.Runtime.toString(account))) );
	}
	
	
	public static connect.models.Account get(java.lang.String id)
	{
		//line 65 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		try 
		{
			//line 66 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			java.lang.String account = connect.Env.getGeneralApi().getAccount(id);
			//line 67 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			return ((connect.models.Account) (connect.models.Model.parse(((java.lang.Class) (connect.models.Account.class) ), haxe.lang.Runtime.toString(account))) );
		}
		catch (java.lang.Throwable catchallException)
		{
			//line 65 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			haxe.lang.Exceptions.setException(catchallException);
			//line 69 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			java.lang.Object ex = ( (haxe.root.Std.is(catchallException, haxe.lang.HaxeException.class)) ? (((haxe.lang.HaxeException) (catchallException) ).obj) : (catchallException) );
			//line 69 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			return null;
		}
		
		
	}
	
	
	public java.lang.String name;
	
	public java.lang.String type;
	
	public connect.models.Events events;
	
	public java.lang.String brand;
	
	public java.lang.String externalId;
	
	public boolean sourcing;
	
	public connect.Collection<connect.models.User> listUsers()
	{
		//line 76 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		java.lang.String users = connect.Env.getGeneralApi().listAccountUsers(this.id);
		//line 77 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		return ((connect.Collection<connect.models.User>) (((connect.Collection) (connect.models.Model.parseArray(((java.lang.Class) (connect.models.User.class) ), haxe.lang.Runtime.toString(users))) )) );
	}
	
	
	public connect.models.User getUser(java.lang.String userId)
	{
		//line 86 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		haxe.root.Array<connect.models.User> _this = this.listUsers().toArray();
		//line 86 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		haxe.root.Array<connect.models.User> ret = new haxe.root.Array<connect.models.User>(new connect.models.User[]{});
		//line 86 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		{
			//line 86 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			int _g = 0;
			//line 86 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			int _g1 = _this.length;
			//line 86 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			while (( _g < _g1 ))
			{
				//line 86 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
				int i = _g++;
				//line 86 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
				connect.models.User elt = _this.__get(i);
				//line 86 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
				if (haxe.lang.Runtime.valEq(elt.id, userId)) 
				{
					//line 86 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
					ret.push(elt);
				}
				
			}
			
		}
		
		//line 86 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		haxe.root.Array<connect.models.User> users = ret;
		//line 87 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		if (( users.length > 0 )) 
		{
			//line 88 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			return users.__get(0);
		}
		else
		{
			//line 90 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			return null;
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		{
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			if (( field != null )) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
				switch (field.hashCode())
				{
					case 1746332184:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						if (field.equals("sourcing")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							this.sourcing = haxe.lang.Runtime.toBool(((java.lang.Boolean) (value) ));
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						break;
					}
					
					
					case 3373707:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						if (field.equals("name")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							this.name = haxe.lang.Runtime.toString(value);
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						break;
					}
					
					
					case -1699764666:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						if (field.equals("externalId")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							this.externalId = haxe.lang.Runtime.toString(value);
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						break;
					}
					
					
					case 3575610:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						if (field.equals("type")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							this.type = haxe.lang.Runtime.toString(value);
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						break;
					}
					
					
					case 93997959:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						if (field.equals("brand")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							this.brand = haxe.lang.Runtime.toString(value);
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						break;
					}
					
					
					case -1291329255:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						if (field.equals("events")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							this.events = ((connect.models.Events) (value) );
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		{
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			if (( field != null )) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
				switch (field.hashCode())
				{
					case -75082687:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						if (field.equals("getUser")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getUser")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						break;
					}
					
					
					case 3373707:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						if (field.equals("name")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							return this.name;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						break;
					}
					
					
					case -1233346550:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						if (field.equals("listUsers")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "listUsers")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						break;
					}
					
					
					case 3575610:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						if (field.equals("type")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							return this.type;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						break;
					}
					
					
					case 1746332184:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						if (field.equals("sourcing")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							return this.sourcing;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						break;
					}
					
					
					case -1291329255:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						if (field.equals("events")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							return this.events;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						break;
					}
					
					
					case -1699764666:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						if (field.equals("externalId")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							return this.externalId;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						break;
					}
					
					
					case 93997959:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						if (field.equals("brand")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							return this.brand;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		{
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			if (( field != null )) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
				switch (field.hashCode())
				{
					case -75082687:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						if (field.equals("getUser")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							return this.getUser(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						break;
					}
					
					
					case -1233346550:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						if (field.equals("listUsers")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
							return this.listUsers();
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		baseArr.push("sourcing");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		baseArr.push("externalId");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		baseArr.push("brand");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		baseArr.push("events");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		baseArr.push("type");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		baseArr.push("name");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Account.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


