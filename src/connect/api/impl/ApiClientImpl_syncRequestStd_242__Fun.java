// Generated by Haxe 4.0.5
package connect.api.impl;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ApiClientImpl_syncRequestStd_242__Fun extends haxe.lang.Function
{
	public ApiClientImpl_syncRequestStd_242__Fun(java.lang.Object[] status, haxe.io.BytesOutput responseBytes)
	{
		//line 242 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		super(1, 0);
		//line 242 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		this.status = status;
		//line 242 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		this.responseBytes = responseBytes;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 242 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		java.lang.String msg = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 243 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		this.status[0] = -1;
		//line 244 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		this.responseBytes.writeString(msg, null);
		//line 242 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/api/impl/ApiClientImpl.hx"
		return null;
	}
	
	
	public java.lang.Object[] status;
	
	public haxe.io.BytesOutput responseBytes;
	
}


