// Generated by Haxe 4.0.5
package connect.api.impl;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TierApiImpl extends connect.Base implements connect.api.ITierApi
{
	static
	{
		//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		connect.api.impl.TierApiImpl.TCR_PATH = "tier/config-requests";
		//line 10 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		connect.api.impl.TierApiImpl.TA_PATH = "tier/accounts";
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		connect.api.impl.TierApiImpl.TC_PATH = "tier/configs";
	}
	
	public TierApiImpl(haxe.lang.EmptyObject empty)
	{
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public TierApiImpl()
	{
		//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		connect.api.impl.TierApiImpl.__hx_ctor_connect_api_impl_TierApiImpl(this);
	}
	
	
	protected static void __hx_ctor_connect_api_impl_TierApiImpl(connect.api.impl.TierApiImpl __hx_this)
	{
	}
	
	
	public static java.lang.String TCR_PATH;
	
	public static java.lang.String TA_PATH;
	
	public static java.lang.String TC_PATH;
	
	public java.lang.String listTierConfigRequests(connect.api.Query filters)
	{
		//line 17 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		return connect.api.ConnectHelper.get(connect.api.impl.TierApiImpl.TCR_PATH, null, null, filters, null);
	}
	
	
	public java.lang.String createTierConfigRequest(java.lang.String body)
	{
		//line 22 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		return connect.api.ConnectHelper.post(connect.api.impl.TierApiImpl.TCR_PATH, null, null, body);
	}
	
	
	public java.lang.String getTierConfigRequest(java.lang.String id)
	{
		//line 27 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		return connect.api.ConnectHelper.get(connect.api.impl.TierApiImpl.TCR_PATH, id, null, null, null);
	}
	
	
	public java.lang.String updateTierConfigRequest(java.lang.String id, java.lang.String tcr)
	{
		//line 32 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		return connect.api.ConnectHelper.put(connect.api.impl.TierApiImpl.TCR_PATH, id, tcr);
	}
	
	
	public java.lang.String pendTierConfigRequest(java.lang.String id)
	{
		//line 37 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		return connect.api.ConnectHelper.post(connect.api.impl.TierApiImpl.TCR_PATH, id, "pend", null);
	}
	
	
	public java.lang.String inquireTierConfigRequest(java.lang.String id)
	{
		//line 42 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		return connect.api.ConnectHelper.post(connect.api.impl.TierApiImpl.TCR_PATH, id, "inquire", null);
	}
	
	
	public java.lang.String approveTierConfigRequest(java.lang.String id, java.lang.String data)
	{
		//line 47 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		return connect.api.ConnectHelper.post(connect.api.impl.TierApiImpl.TCR_PATH, id, "approve", data);
	}
	
	
	public java.lang.String failTierConfigRequest(java.lang.String id, java.lang.String data)
	{
		//line 52 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		return connect.api.ConnectHelper.post(connect.api.impl.TierApiImpl.TCR_PATH, id, "fail", data);
	}
	
	
	public java.lang.String assignTierConfigRequest(java.lang.String id)
	{
		//line 57 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		return connect.api.ConnectHelper.post(connect.api.impl.TierApiImpl.TCR_PATH, id, "assign", null);
	}
	
	
	public java.lang.String unassignTierConfigRequest(java.lang.String id)
	{
		//line 62 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		return connect.api.ConnectHelper.post(connect.api.impl.TierApiImpl.TCR_PATH, id, "unassign", null);
	}
	
	
	public java.lang.String listTierAccounts(connect.api.Query filters)
	{
		//line 67 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		return connect.api.ConnectHelper.get(connect.api.impl.TierApiImpl.TA_PATH, null, null, filters, null);
	}
	
	
	public java.lang.String getTierAccount(java.lang.String id)
	{
		//line 72 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		return connect.api.ConnectHelper.get(connect.api.impl.TierApiImpl.TA_PATH, id, null, null, null);
	}
	
	
	public java.lang.String listTierConfigs(connect.api.Query filters)
	{
		//line 77 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		return connect.api.ConnectHelper.get(connect.api.impl.TierApiImpl.TC_PATH, null, null, filters, true);
	}
	
	
	public java.lang.String getTierConfig(java.lang.String id)
	{
		//line 82 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		return connect.api.ConnectHelper.get(connect.api.impl.TierApiImpl.TC_PATH, id, null, null, null);
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		{
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
			if (( field != null )) 
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
				switch (field.hashCode())
				{
					case 1922762682:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("getTierConfig")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getTierConfig")) );
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case -1321414426:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("listTierConfigRequests")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "listTierConfigRequests")) );
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case -1740852815:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("listTierConfigs")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "listTierConfigs")) );
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case 1796861071:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("createTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createTierConfigRequest")) );
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case 1642632373:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("getTierAccount")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getTierAccount")) );
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case -1084146315:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("getTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getTierConfigRequest")) );
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case 311130022:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("listTierAccounts")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "listTierAccounts")) );
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case -1997387678:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("updateTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "updateTierConfigRequest")) );
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case 1960912451:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("unassignTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "unassignTierConfigRequest")) );
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case 1692944128:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("pendTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "pendTierConfigRequest")) );
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case -1037922052:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("assignTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "assignTierConfigRequest")) );
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case -593319752:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("inquireTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "inquireTierConfigRequest")) );
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case 1755479725:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("failTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "failTierConfigRequest")) );
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case -1994566050:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("approveTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "approveTierConfigRequest")) );
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
		{
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
			if (( field != null )) 
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
				switch (field.hashCode())
				{
					case 1922762682:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("getTierConfig")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return this.getTierConfig(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case -1321414426:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("listTierConfigRequests")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return this.listTierConfigRequests(((connect.api.Query) (dynargs[0]) ));
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case -1740852815:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("listTierConfigs")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return this.listTierConfigs(((connect.api.Query) (dynargs[0]) ));
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case 1796861071:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("createTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return this.createTierConfigRequest(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case 1642632373:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("getTierAccount")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return this.getTierAccount(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case -1084146315:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("getTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return this.getTierConfigRequest(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case 311130022:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("listTierAccounts")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return this.listTierAccounts(((connect.api.Query) (dynargs[0]) ));
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case -1997387678:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("updateTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return this.updateTierConfigRequest(haxe.lang.Runtime.toString(dynargs[0]), haxe.lang.Runtime.toString(dynargs[1]));
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case 1960912451:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("unassignTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return this.unassignTierConfigRequest(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case 1692944128:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("pendTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return this.pendTierConfigRequest(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case -1037922052:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("assignTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return this.assignTierConfigRequest(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case -593319752:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("inquireTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return this.inquireTierConfigRequest(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case 1755479725:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("failTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return this.failTierConfigRequest(haxe.lang.Runtime.toString(dynargs[0]), haxe.lang.Runtime.toString(dynargs[1]));
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
					case -1994566050:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						if (field.equals("approveTierConfigRequest")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
							return this.approveTierConfigRequest(haxe.lang.Runtime.toString(dynargs[0]), haxe.lang.Runtime.toString(dynargs[1]));
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/TierApiImpl.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


