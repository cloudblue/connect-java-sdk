// Generated by Haxe 4.0.5
package connect.util;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Diff_parse_174__Fun extends haxe.lang.Function
{
	public Diff_parse_174__Fun(java.lang.Object obj, haxe.ds.StringMap additions)
	{
		//line 174 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/util/Diff.hx"
		super(1, 0);
		//line 174 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/util/Diff.hx"
		this.obj = obj;
		//line 174 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/util/Diff.hx"
		this.additions = additions;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 174 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/util/Diff.hx"
		java.lang.String f = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 174 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/util/Diff.hx"
		java.lang.Object tmp = haxe.root.Reflect.field(haxe.lang.Runtime.getField(this.obj, "a", true), f);
		//line 174 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/util/Diff.hx"
		this.additions.set(f, tmp);
		//line 174 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/util/Diff.hx"
		return null;
	}
	
	
	public java.lang.Object obj;
	
	public haxe.ds.StringMap additions;
	
}

