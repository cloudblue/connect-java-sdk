// Generated by Haxe 4.0.5
package connect.api;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Query_toObject_323__Fun extends haxe.lang.Function
{
	public Query_toObject_323__Fun(java.lang.Object obj)
	{
		//line 323 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/Query.hx"
		super(1, 0);
		//line 323 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/Query.hx"
		this.obj = obj;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 323 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/Query.hx"
		java.lang.String field = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 324 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/Query.hx"
		java.lang.Object value = haxe.root.Reflect.field(this.obj, field);
		//line 325 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/Query.hx"
		switch (haxe.root.Type.typeof(value).index)
		{
			case 0:
			{
				//line 327 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/Query.hx"
				return false;
			}
			
			
			case 4:
			{
				//line 329 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/Query.hx"
				return ( haxe.root.Reflect.fields(value).length > 0 );
			}
			
			
			default:
			{
				//line 331 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/Query.hx"
				return true;
			}
			
		}
		
	}
	
	
	public java.lang.Object obj;
	
}

