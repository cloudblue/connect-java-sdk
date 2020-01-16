// Generated by Haxe 4.0.5
package connect.models;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Agreement extends connect.models.IdModel
{
	public Agreement(haxe.lang.EmptyObject empty)
	{
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Agreement()
	{
		//line 84 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 84 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		connect.models.Agreement.__hx_ctor_connect_models_Agreement(this);
	}
	
	
	protected static void __hx_ctor_connect_models_Agreement(connect.models.Agreement __hx_this)
	{
		//line 84 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		connect.models.IdModel.__hx_ctor_connect_models_IdModel(__hx_this);
		//line 85 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		haxe.ds.StringMap<java.lang.String> _g = new haxe.ds.StringMap<java.lang.String>();
		//line 85 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		_g.set("created", "DateTime");
		//line 85 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		_g.set("updated", "DateTime");
		//line 85 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		_g.set("owner", "Account");
		//line 85 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		_g.set("stats", "AgreementStats");
		//line 85 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		_g.set("author", "User");
		//line 85 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		_g.set("versionCreated", "DateTime");
		//line 85 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		_g.set("parent", "Agreement");
		//line 85 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		__hx_this._setFieldClassNames(((haxe.ds.StringMap<java.lang.String>) (_g) ));
	}
	
	
	public java.lang.String type;
	
	public java.lang.String title;
	
	public java.lang.String description;
	
	public connect.DateTime created;
	
	public connect.DateTime updated;
	
	public connect.models.Account owner;
	
	public connect.models.AgreementStats stats;
	
	public connect.models.User author;
	
	public int version;
	
	public boolean active;
	
	public java.lang.String link;
	
	public connect.DateTime versionCreated;
	
	public int versionContracts;
	
	public connect.Collection<connect.models.Agreement> agreements;
	
	public connect.models.Agreement parent;
	
	public connect.models.Marketplace marketplace;
	
	public java.lang.String name;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		{
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
			if (( field != null )) 
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
				switch (field.hashCode())
				{
					case 887162793:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("versionContracts")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.versionContracts = ((int) (value) );
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 351608024:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("version")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.version = ((int) (value) );
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		{
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
			if (( field != null )) 
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
				switch (field.hashCode())
				{
					case 3373707:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("name")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.name = haxe.lang.Runtime.toString(value);
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 3575610:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("type")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.type = haxe.lang.Runtime.toString(value);
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 300911179:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("marketplace")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.marketplace = ((connect.models.Marketplace) (value) );
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 110371416:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("title")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.title = haxe.lang.Runtime.toString(value);
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case -995424086:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("parent")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.parent = ((connect.models.Agreement) (value) );
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case -1724546052:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("description")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.description = haxe.lang.Runtime.toString(value);
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 184610729:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("agreements")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.agreements = ((connect.Collection<connect.models.Agreement>) (value) );
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 1028554472:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("created")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.created = ((connect.DateTime) (value) );
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 887162793:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("versionContracts")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.versionContracts = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case -234430277:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("updated")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.updated = ((connect.DateTime) (value) );
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 1155028720:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("versionCreated")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.versionCreated = ((connect.DateTime) (value) );
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 106164915:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("owner")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.owner = ((connect.models.Account) (value) );
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 3321850:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("link")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.link = haxe.lang.Runtime.toString(value);
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 109757599:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("stats")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.stats = ((connect.models.AgreementStats) (value) );
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case -1422950650:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("active")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.active = haxe.lang.Runtime.toBool(((java.lang.Boolean) (value) ));
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case -1406328437:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("author")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.author = ((connect.models.User) (value) );
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 351608024:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("version")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							this.version = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return value;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		{
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
			if (( field != null )) 
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
				switch (field.hashCode())
				{
					case 3373707:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("name")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.name;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 3575610:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("type")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.type;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 300911179:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("marketplace")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.marketplace;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 110371416:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("title")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.title;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case -995424086:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("parent")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.parent;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case -1724546052:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("description")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.description;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 184610729:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("agreements")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.agreements;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 1028554472:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("created")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.created;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 887162793:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("versionContracts")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.versionContracts;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case -234430277:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("updated")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.updated;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 1155028720:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("versionCreated")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.versionCreated;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 106164915:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("owner")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.owner;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 3321850:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("link")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.link;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 109757599:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("stats")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.stats;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case -1422950650:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("active")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.active;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case -1406328437:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("author")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.author;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 351608024:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("version")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return this.version;
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		{
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
			if (( field != null )) 
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
				switch (field.hashCode())
				{
					case 887162793:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("versionContracts")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return ((double) (this.versionContracts) );
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
					case 351608024:
					{
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						if (field.equals("version")) 
						{
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
							return ((double) (this.version) );
						}
						
						//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("name");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("marketplace");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("parent");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("agreements");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("versionContracts");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("versionCreated");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("link");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("active");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("version");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("author");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("stats");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("owner");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("updated");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("created");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("description");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("title");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		baseArr.push("type");
		//line 8 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Agreement.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


