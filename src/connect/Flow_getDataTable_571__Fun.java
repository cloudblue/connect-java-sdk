// Generated by Haxe 4.0.5
package connect;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Flow_getDataTable_571__Fun extends haxe.lang.Function
{
	public Flow_getDataTable_571__Fun(connect.Collection<connect.Collection<java.lang.String>> dataCol, connect.Dictionary data)
	{
		//line 572 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Flow.hx"
		super(1, 0);
		//line 572 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Flow.hx"
		this.dataCol = dataCol;
		//line 572 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Flow.hx"
		this.data = data;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 571 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Flow.hx"
		java.lang.String key2 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 573 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Flow.hx"
		connect.Collection<java.lang.String> tmp = new connect.Collection<java.lang.String>().push(key2).push(haxe.lang.Runtime.toString(this.data.get(key2)));
		//line 572 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Flow.hx"
		this.dataCol.push(tmp);
		//line 572 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Flow.hx"
		return null;
	}
	
	
	public connect.Collection<connect.Collection<java.lang.String>> dataCol;
	
	public connect.Dictionary data;
	
}


