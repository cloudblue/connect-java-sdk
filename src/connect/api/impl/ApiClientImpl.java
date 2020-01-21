// Generated by Haxe 4.0.5
package connect.api.impl;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ApiClientImpl extends connect.Base implements connect.api.IApiClient
{
	public ApiClientImpl(haxe.lang.EmptyObject empty)
	{
		//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public ApiClientImpl()
	{
		//line 44 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		connect.api.impl.ApiClientImpl.__hx_ctor_connect_api_impl_ApiClientImpl(this);
	}
	
	
	protected static void __hx_ctor_connect_api_impl_ApiClientImpl(connect.api.impl.ApiClientImpl __hx_this)
	{
	}
	
	
	public static void logRequest(int level, java.lang.String method, java.lang.String url, connect.util.Dictionary headers, java.lang.String body, connect.api.Response response)
	{
		//line 191 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		java.lang.String firstMessage = ( ( ( "Http " + method.toUpperCase() ) + " request to " ) + url );
		//line 192 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		{
			//line 192 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			java.util.Iterator<connect.logger.LoggerHandler> output = connect.Env.getLogger().getOutputs().iterator();
			//line 192 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			while (output.hasNext())
			{
				//line 192 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				connect.logger.LoggerHandler output1 = output.next();
				//line 193 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				connect.logger.ILoggerFormatter fmt = output1.formatter;
				//line 194 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				connect.util.Collection<java.lang.String> requestList = new connect.util.Collection<java.lang.String>();
				//line 195 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				if (( headers != null )) 
				{
					//line 196 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
					requestList.push(( "Headers:" + connect.api.impl.ApiClientImpl.getHeadersTable(headers, fmt) ));
				}
				
				//line 198 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				if (( body != null )) 
				{
					//line 199 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
					requestList.push(connect.api.impl.ApiClientImpl.getFormattedData(body, "Body", fmt));
				}
				
				//line 201 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				if (( response.status != -1 )) 
				{
					//line 202 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
					requestList.push(( "Status: " + response.status ));
					//line 203 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
					requestList.push(connect.api.impl.ApiClientImpl.getFormattedData(response.text, "Response", fmt));
				}
				
				//line 205 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				connect.Env.getLogger()._writeToHandler(level, fmt.formatBlock(( ( "" + firstMessage ) + fmt.formatList(requestList) )), output1);
			}
			
		}
		
	}
	
	
	public static java.lang.String getHeadersTable(connect.util.Dictionary headers, connect.logger.ILoggerFormatter fmt)
	{
		//line 214 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		connect.util.Dictionary fixedHeaders = ( (( connect.Env.getLogger().getLevel() == connect.logger.Logger.LEVEL_DEBUG )) ? (headers) : (connect.api.impl.ApiClientImpl.maskHeaders(headers)) );
		//line 217 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		haxe.root.Array<java.lang.String> _g = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
		//line 217 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		{
			//line 217 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			java.lang.Object key = fixedHeaders.keys();
			//line 217 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(key, "hasNext", null)) )))
			{
				//line 217 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				java.lang.String key1 = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(key, "next", null));
				//line 217 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				_g.push(key1);
			}
			
		}
		
		//line 217 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		haxe.root.Array<java.lang.String> headerKeys = _g;
		//line 218 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		connect.util.Collection<connect.util.Collection<java.lang.String>> headersCol = new connect.util.Collection<connect.util.Collection<java.lang.String>>().push(new connect.util.Collection<java.lang.String>().push("Name").push("Value"));
		//line 220 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		haxe.root.Lambda.iter(((java.lang.Object) (headerKeys) ), ((haxe.lang.Function) (new connect.api.impl.ApiClientImpl_getHeadersTable_220__Fun(headersCol, fixedHeaders)) ));
		//line 220 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
		//line 227 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		return fmt.formatTable(headersCol);
	}
	
	
	public static connect.util.Dictionary maskHeaders(connect.util.Dictionary headers)
	{
		//line 232 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		connect.util.Dictionary masked = new connect.util.Dictionary();
		//line 233 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		{
			//line 233 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			java.lang.Object key = headers.keys();
			//line 233 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(key, "hasNext", null)) )))
			{
				//line 233 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				java.lang.String key1 = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(key, "next", null));
				//line 234 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				if (haxe.lang.Runtime.valEq(key1, "Authorization")) 
				{
					//line 235 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
					java.lang.String auth = haxe.root.Std.string(headers.get("Authorization"));
					//line 236 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
					haxe.root.Array<java.lang.String> parts = haxe.lang.StringExt.split(auth, ":");
					//line 237 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
					java.lang.String join = ( (( parts.length > 1 )) ? (parts.slice(1, null).join(":")) : ("") );
					//line 238 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
					java.lang.String maskedAuth = ( (((java.lang.String) (((java.lang.Object) (auth) )) ).startsWith(haxe.lang.Runtime.toString("ApiKey "))) ? (( (( parts.length > 1 )) ? (( ( parts.__get(0) + ":" ) + haxe.root.StringTools.lpad(haxe.lang.StringExt.substr(join, ( join.length() - 4 ), null), "*", join.length()) )) : (( "ApiKey " + haxe.root.StringTools.lpad(haxe.lang.StringExt.substr(auth, ( auth.length() - 4 ), null), "*", ( auth.length() - 7 )) )) )) : (haxe.root.StringTools.lpad(haxe.lang.StringExt.substr(auth, ( auth.length() - 4 ), null), "*", auth.length())) );
					//line 243 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
					masked.set("Authorization", maskedAuth);
				}
				else
				{
					//line 245 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
					masked.set(key1, headers.get(key1));
				}
				
			}
			
		}
		
		//line 248 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		return masked;
	}
	
	
	public static java.lang.String getFormattedData(java.lang.String data, java.lang.String title, connect.logger.ILoggerFormatter fmt)
	{
		//line 254 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		if (connect.util.Util.isJson(data)) 
		{
			//line 255 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			boolean compact = ( connect.Env.getLogger().getLevel() != connect.logger.Logger.LEVEL_DEBUG );
			//line 256 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			java.lang.String prefix = ( (compact) ? (( ( "" + title ) + " (compact):" )) : (( ( "" + title ) + ":" )) );
			//line 257 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			java.lang.String block = fmt.formatCodeBlock(connect.util.Util.beautify(data, compact), "json");
			//line 258 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			return ( ( ( "" + prefix ) + " " ) + block );
		}
		else
		{
			//line 260 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			java.lang.String fixedBody = haxe.root.StringTools.lpad(haxe.lang.StringExt.substr(data, ( data.length() - 4 ), null), "*", data.length());
			//line 261 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			return ( ( ( "" + title ) + ": " ) + fixedBody );
		}
		
	}
	
	
	public connect.api.Response syncRequest(java.lang.String method, java.lang.String url, connect.util.Dictionary headers, java.lang.String body, java.lang.String fileArg, java.lang.String fileName, connect.util.Blob fileContent)
	{
		//line 28 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		connect.api.Response response = this.syncRequestStd(method, url, headers, body, fileArg, fileName, fileContent);
		//line 31 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		int level = ( (( ( response.status >= 400 ) || ( response.status == -1 ) )) ? (connect.logger.Logger.LEVEL_ERROR) : (connect.logger.Logger.LEVEL_INFO) );
		//line 34 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		connect.api.impl.ApiClientImpl.logRequest(level, method, url, headers, body, response);
		//line 36 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		if (( response.status != -1 )) 
		{
			//line 37 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			return response;
		}
		else
		{
			//line 39 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			throw haxe.lang.HaxeException.wrap(response.text);
		}
		
	}
	
	
	public connect.api.Response syncRequestStd(java.lang.String method, java.lang.String url, connect.util.Dictionary headers, java.lang.String body, java.lang.String fileArg, java.lang.String fileName, connect.util.Blob fileContent)
	{
		//line 149 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		java.lang.Object[] status = new java.lang.Object[]{null};
		//line 150 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		haxe.io.BytesOutput responseBytes = new haxe.io.BytesOutput();
		//line 152 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		sys.Http http = new sys.Http(haxe.lang.Runtime.toString(url));
		//line 153 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		http.cnxTimeout = ((double) (300) );
		//line 155 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		if (( headers != null )) 
		{
			//line 156 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			java.lang.Object key = headers.keys();
			//line 156 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(key, "hasNext", null)) )))
			{
				//line 156 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				java.lang.String key1 = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(key, "next", null));
				//line 157 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				http.setHeader(key1, haxe.lang.Runtime.toString(headers.get(key1)));
			}
			
		}
		
		//line 161 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		if (( body != null )) 
		{
			//line 162 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			http.setPostData(body);
		}
		
		//line 165 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		if (( ( ( fileArg != null ) && ( fileName != null ) ) && ( fileContent != null ) )) 
		{
			//line 166 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			http.fileTransfer(fileArg, fileName, new haxe.io.BytesInput(fileContent._getBytes(), null, null), fileContent.length(), "multipart/form-data");
		}
		
		//line 175 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		http.onStatus = new connect.api.impl.ApiClientImpl_syncRequestStd_175__Fun(status);
		//line 176 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		http.onError = new connect.api.impl.ApiClientImpl_syncRequestStd_176__Fun(status, responseBytes);
		//line 180 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		java.lang.String tmp = method.toUpperCase();
		//line 180 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		http.customRequest(false, responseBytes, null, tmp);
		//line 182 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		while (haxe.lang.Runtime.eq(status[0], null))
		{
		}
		
		//line 183 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		haxe.io.Bytes bytes = responseBytes.getBytes();
		//line 184 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		return new connect.api.Response(((int) (haxe.lang.Runtime.toInt(status[0])) ), bytes.toString(), connect.util.Blob._fromBytes(bytes));
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		{
			//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			boolean __temp_executeDef1 = true;
			//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			if (( field != null )) 
			{
				//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				switch (field.hashCode())
				{
					case -1906457073:
					{
						//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
						if (field.equals("syncRequestStd")) 
						{
							//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
							__temp_executeDef1 = false;
							//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "syncRequestStd")) );
						}
						
						//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
						break;
					}
					
					
					case -545891468:
					{
						//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
						if (field.equals("syncRequest")) 
						{
							//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
							__temp_executeDef1 = false;
							//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "syncRequest")) );
						}
						
						//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			if (__temp_executeDef1) 
			{
				//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		{
			//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			boolean __temp_executeDef1 = true;
			//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			if (( field != null )) 
			{
				//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				switch (field.hashCode())
				{
					case -1906457073:
					{
						//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
						if (field.equals("syncRequestStd")) 
						{
							//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
							__temp_executeDef1 = false;
							//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
							return this.syncRequestStd(haxe.lang.Runtime.toString(dynargs[0]), haxe.lang.Runtime.toString(dynargs[1]), ((connect.util.Dictionary) (dynargs[2]) ), haxe.lang.Runtime.toString(dynargs[3]), haxe.lang.Runtime.toString(dynargs[4]), haxe.lang.Runtime.toString(dynargs[5]), ((connect.util.Blob) (dynargs[6]) ));
						}
						
						//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
						break;
					}
					
					
					case -545891468:
					{
						//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
						if (field.equals("syncRequest")) 
						{
							//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
							__temp_executeDef1 = false;
							//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
							return this.syncRequest(haxe.lang.Runtime.toString(dynargs[0]), haxe.lang.Runtime.toString(dynargs[1]), ((connect.util.Dictionary) (dynargs[2]) ), haxe.lang.Runtime.toString(dynargs[3]), haxe.lang.Runtime.toString(dynargs[4]), haxe.lang.Runtime.toString(dynargs[5]), ((connect.util.Blob) (dynargs[6]) ));
						}
						
						//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
			if (__temp_executeDef1) 
			{
				//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


