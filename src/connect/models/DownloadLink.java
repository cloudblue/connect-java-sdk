// Generated by Haxe 4.0.5
package connect.models;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class DownloadLink extends connect.models.Model
{
	public DownloadLink(haxe.lang.EmptyObject empty)
	{
		//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public DownloadLink()
	{
		//line 103 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Model.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 103 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.DownloadLink.__hx_ctor_connect_models_DownloadLink(this);
	}
	
	
	protected static void __hx_ctor_connect_models_DownloadLink(connect.models.DownloadLink __hx_this)
	{
		//line 103 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.Model.__hx_ctor_connect_models_Model(__hx_this);
	}
	
	
	public java.lang.String title;
	
	public java.lang.String url;
	
	public java.lang.String visibleFor;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
		{
			//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
			if (( field != null )) 
			{
				//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
				switch (field.hashCode())
				{
					case 1943860983:
					{
						//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
						if (field.equals("visibleFor")) 
						{
							//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
							__temp_executeDef1 = false;
							//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
							this.visibleFor = haxe.lang.Runtime.toString(value);
							//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
							return value;
						}
						
						//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
						break;
					}
					
					
					case 110371416:
					{
						//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
						if (field.equals("title")) 
						{
							//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
							__temp_executeDef1 = false;
							//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
							this.title = haxe.lang.Runtime.toString(value);
							//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
							return value;
						}
						
						//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
						break;
					}
					
					
					case 116079:
					{
						//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
						if (field.equals("url")) 
						{
							//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
							__temp_executeDef1 = false;
							//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
							this.url = haxe.lang.Runtime.toString(value);
							//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
							return value;
						}
						
						//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
		{
			//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
			if (( field != null )) 
			{
				//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
				switch (field.hashCode())
				{
					case 1943860983:
					{
						//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
						if (field.equals("visibleFor")) 
						{
							//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
							__temp_executeDef1 = false;
							//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
							return this.visibleFor;
						}
						
						//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
						break;
					}
					
					
					case 110371416:
					{
						//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
						if (field.equals("title")) 
						{
							//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
							__temp_executeDef1 = false;
							//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
							return this.title;
						}
						
						//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
						break;
					}
					
					
					case 116079:
					{
						//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
						if (field.equals("url")) 
						{
							//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
							__temp_executeDef1 = false;
							//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
							return this.url;
						}
						
						//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
		baseArr.push("visibleFor");
		//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
		baseArr.push("url");
		//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
		baseArr.push("title");
		//line 7 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/models/DownloadLink.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


