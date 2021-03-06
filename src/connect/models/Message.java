// Generated by Haxe 4.0.5
package connect.models;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Message extends connect.models.IdModel
{
	public Message(haxe.lang.EmptyObject empty)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Message()
	{
		//line 30 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 30 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
		connect.models.Message.__hx_ctor_connect_models_Message(this);
	}
	
	
	protected static void __hx_ctor_connect_models_Message(connect.models.Message __hx_this)
	{
		//line 30 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
		connect.models.IdModel.__hx_ctor_connect_models_IdModel(__hx_this);
		//line 31 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
		haxe.ds.StringMap<java.lang.String> _g = new haxe.ds.StringMap<java.lang.String>();
		//line 31 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
		_g.set("created", "DateTime");
		//line 31 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
		_g.set("creator", "User");
		//line 31 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
		__hx_this._setFieldClassNames(((haxe.ds.StringMap<java.lang.String>) (_g) ));
	}
	
	
	public java.lang.String conversation;
	
	public connect.util.DateTime created;
	
	public connect.models.User creator;
	
	public java.lang.String text;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
		{
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
			if (( field != null )) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
				switch (field.hashCode())
				{
					case 3556653:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
						if (field.equals("text")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							this.text = haxe.lang.Runtime.toString(value);
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
						break;
					}
					
					
					case 740154499:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
						if (field.equals("conversation")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							this.conversation = haxe.lang.Runtime.toString(value);
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
						break;
					}
					
					
					case 1028554796:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
						if (field.equals("creator")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							this.creator = ((connect.models.User) (value) );
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
						break;
					}
					
					
					case 1028554472:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
						if (field.equals("created")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							this.created = ((connect.util.DateTime) (value) );
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
		{
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
			if (( field != null )) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
				switch (field.hashCode())
				{
					case 3556653:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
						if (field.equals("text")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							return this.text;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
						break;
					}
					
					
					case 740154499:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
						if (field.equals("conversation")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							return this.conversation;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
						break;
					}
					
					
					case 1028554796:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
						if (field.equals("creator")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							return this.creator;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
						break;
					}
					
					
					case 1028554472:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
						if (field.equals("created")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
							return this.created;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
		baseArr.push("text");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
		baseArr.push("creator");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
		baseArr.push("created");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
		baseArr.push("conversation");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Message.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


