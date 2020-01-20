// Generated by Haxe 4.0.5
package connect.api;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ConnectHelper extends haxe.lang.HxObject
{
	public ConnectHelper(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ConnectHelper()
	{
		//line 13 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		connect.api.ConnectHelper.__hx_ctor_connect_api_ConnectHelper(this);
	}
	
	
	protected static void __hx_ctor_connect_api_ConnectHelper(connect.api.ConnectHelper __hx_this)
	{
	}
	
	
	public static java.lang.String get(java.lang.String resource, java.lang.String id, java.lang.String suffix, connect.api.Query params, java.lang.Object rqlParams)
	{
		//line 26 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		boolean rqlParams1 = ( (haxe.lang.Runtime.eq(rqlParams, null)) ? (false) : (haxe.lang.Runtime.toBool(((java.lang.Boolean) (rqlParams) ))) );
		//line 26 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		return connect.api.ConnectHelper.checkResponse(connect.api.ConnectHelper.connectSyncRequest("GET", connect.api.ConnectHelper.parsePath(resource, id, suffix), connect.api.ConnectHelper.getHeaders(null), params, rqlParams1, null, null, null, null));
	}
	
	
	public static java.lang.String put(java.lang.String resource, java.lang.String id, java.lang.String body)
	{
		//line 41 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		return connect.api.ConnectHelper.checkResponse(connect.api.ConnectHelper.connectSyncRequest("PUT", connect.api.ConnectHelper.parsePath(resource, id, null), connect.api.ConnectHelper.getHeaders(null), null, null, body, null, null, null));
	}
	
	
	public static java.lang.String post(java.lang.String resource, java.lang.String id, java.lang.String suffix, java.lang.String body)
	{
		//line 57 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		return connect.api.ConnectHelper.checkResponse(connect.api.ConnectHelper.connectSyncRequest("POST", connect.api.ConnectHelper.parsePath(resource, id, suffix), connect.api.ConnectHelper.getHeaders(null), null, null, body, null, null, null));
	}
	
	
	public static java.lang.Object postFile(java.lang.String resource, java.lang.String id, java.lang.String suffix, java.lang.String fileArg, java.lang.String fileName, connect.util.Blob fileContents)
	{
		//line 76 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		return connect.api.ConnectHelper.checkResponse(connect.api.ConnectHelper.connectSyncRequest("POST", connect.api.ConnectHelper.parsePath(resource, id, suffix), connect.api.ConnectHelper.getHeaders("multipart/form-data"), null, false, fileArg, fileName, null, fileContents));
	}
	
	
	public static java.lang.String delete(java.lang.String resource, java.lang.String id, java.lang.String suffix)
	{
		//line 91 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		return connect.api.ConnectHelper.checkResponse(connect.api.ConnectHelper.connectSyncRequest("DELETE", connect.api.ConnectHelper.parsePath(resource, id, suffix), connect.api.ConnectHelper.getHeaders(null), null, null, null, null, null, null));
	}
	
	
	public static connect.api.Response connectSyncRequest(java.lang.String method, java.lang.String path, connect.util.Dictionary headers, connect.api.Query params, java.lang.Object rqlParams, java.lang.String data, java.lang.String fileArg, java.lang.String fileName, connect.util.Blob fileContent)
	{
		//line 97 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		boolean rqlParams1 = ( (haxe.lang.Runtime.eq(rqlParams, null)) ? (false) : (haxe.lang.Runtime.toBool(((java.lang.Boolean) (rqlParams) ))) );
		//line 98 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		java.lang.String paramsStr = ( (( params != null )) ? (( (rqlParams1) ? (params.toString()) : (params.toPlain()) )) : ("") );
		//line 101 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		java.lang.String url = ( ( connect.Env.getConfig().getApiUrl() + path ) + paramsStr );
		//line 102 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		return connect.Env.getApiClient().syncRequest(method, url, headers, data, fileArg, fileName, fileContent);
	}
	
	
	public static java.lang.String parsePath(java.lang.String resource, java.lang.String id, java.lang.String suffix)
	{
		//line 107 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		return ( ( resource + (( (( id != null )) ? (( "/" + id )) : ("") )) ) + (( (( suffix != null )) ? (( "/" + suffix )) : ("") )) );
	}
	
	
	public static connect.util.Dictionary getHeaders(java.lang.String contentType)
	{
		//line 113 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		if (( contentType == null )) 
		{
			//line 113 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
			contentType = "application/json";
		}
		
		//line 114 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		connect.util.Dictionary headers = new connect.util.Dictionary();
		//line 115 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		headers.set("Authorization", connect.Env.getConfig().getApiKey());
		//line 116 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		headers.set("Content-Type", contentType);
		//line 117 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		return headers;
	}
	
	
	public static java.lang.String checkResponse(connect.api.Response response)
	{
		//line 122 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
		if (( response.status < 400 )) 
		{
			//line 123 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
			return response.text;
		}
		else
		{
			//line 125 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/ConnectHelper.hx"
			throw haxe.lang.HaxeException.wrap(response.text);
		}
		
	}
	
	
}


