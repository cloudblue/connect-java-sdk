// Generated by Haxe 4.0.5
package connect.models;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Contract extends connect.models.IdModel
{
	public Contract(haxe.lang.EmptyObject empty)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Contract()
	{
		//line 71 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 71 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		connect.models.Contract.__hx_ctor_connect_models_Contract(this);
	}
	
	
	protected static void __hx_ctor_connect_models_Contract(connect.models.Contract __hx_this)
	{
		//line 71 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		connect.models.IdModel.__hx_ctor_connect_models_IdModel(__hx_this);
		//line 72 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		haxe.ds.StringMap<java.lang.String> _g = new haxe.ds.StringMap<java.lang.String>();
		//line 72 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		_g.set("created", "DateTime");
		//line 72 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		_g.set("updated", "DateTime");
		//line 72 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		_g.set("enrolled", "DateTime");
		//line 72 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		_g.set("versionCreated", "DateTime");
		//line 72 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		_g.set("owner", "Account");
		//line 72 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		_g.set("creator", "User");
		//line 72 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		_g.set("signee", "User");
		//line 72 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		__hx_this._setFieldClassNames(((haxe.ds.StringMap<java.lang.String>) (_g) ));
	}
	
	
	public java.lang.String name;
	
	public int version;
	
	public java.lang.String type;
	
	public java.lang.String status;
	
	public connect.models.Agreement agreement;
	
	public connect.models.Marketplace marketplace;
	
	public connect.models.Account owner;
	
	public connect.models.User creator;
	
	public connect.util.DateTime created;
	
	public connect.util.DateTime updated;
	
	public connect.util.DateTime enrolled;
	
	public connect.util.DateTime versionCreated;
	
	public connect.models.Activation activation;
	
	public connect.models.User signee;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		{
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
			if (( field != null )) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
				switch (field.hashCode())
				{
					case 351608024:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("version")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							this.version = ((int) (value) );
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		{
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
			if (( field != null )) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
				switch (field.hashCode())
				{
					case -902467811:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("signee")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							this.signee = ((connect.models.User) (value) );
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 3373707:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("name")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							this.name = haxe.lang.Runtime.toString(value);
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 2041217302:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("activation")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							this.activation = ((connect.models.Activation) (value) );
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 351608024:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("version")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							this.version = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 1155028720:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("versionCreated")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							this.versionCreated = ((connect.util.DateTime) (value) );
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 3575610:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("type")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							this.type = haxe.lang.Runtime.toString(value);
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 2140900293:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("enrolled")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							this.enrolled = ((connect.util.DateTime) (value) );
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case -892481550:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("status")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							this.status = haxe.lang.Runtime.toString(value);
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case -234430277:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("updated")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							this.updated = ((connect.util.DateTime) (value) );
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 975786506:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("agreement")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							this.agreement = ((connect.models.Agreement) (value) );
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 1028554472:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("created")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							this.created = ((connect.util.DateTime) (value) );
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 300911179:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("marketplace")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							this.marketplace = ((connect.models.Marketplace) (value) );
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 1028554796:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("creator")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							this.creator = ((connect.models.User) (value) );
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 106164915:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("owner")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							this.owner = ((connect.models.Account) (value) );
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		{
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
			if (( field != null )) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
				switch (field.hashCode())
				{
					case -902467811:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("signee")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return this.signee;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 3373707:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("name")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return this.name;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 2041217302:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("activation")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return this.activation;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 351608024:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("version")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return this.version;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 1155028720:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("versionCreated")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return this.versionCreated;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 3575610:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("type")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return this.type;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 2140900293:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("enrolled")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return this.enrolled;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case -892481550:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("status")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return this.status;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case -234430277:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("updated")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return this.updated;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 975786506:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("agreement")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return this.agreement;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 1028554472:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("created")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return this.created;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 300911179:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("marketplace")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return this.marketplace;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 1028554796:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("creator")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return this.creator;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
					case 106164915:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("owner")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return this.owner;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		{
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
			if (( field != null )) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
				switch (field.hashCode())
				{
					case 351608024:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						if (field.equals("version")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
							return ((double) (this.version) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		baseArr.push("signee");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		baseArr.push("activation");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		baseArr.push("versionCreated");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		baseArr.push("enrolled");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		baseArr.push("updated");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		baseArr.push("created");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		baseArr.push("creator");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		baseArr.push("owner");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		baseArr.push("marketplace");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		baseArr.push("agreement");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		baseArr.push("status");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		baseArr.push("type");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		baseArr.push("version");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		baseArr.push("name");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Contract.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


