// Generated by Haxe 4.0.5
package connect;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Diff_parse_178__Fun extends haxe.lang.Function
{
	public Diff_parse_178__Fun(java.lang.Object obj, haxe.ds.StringMap deletions)
	{
		//line 178 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Diff.hx"
		super(1, 0);
		//line 178 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Diff.hx"
		this.obj = obj;
		//line 178 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Diff.hx"
		this.deletions = deletions;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 178 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Diff.hx"
		java.lang.String f1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 178 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Diff.hx"
		java.lang.Object tmp1 = haxe.root.Reflect.field(haxe.lang.Runtime.getField(this.obj, "d", true), f1);
		//line 178 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Diff.hx"
		this.deletions.set(f1, tmp1);
		//line 178 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/Diff.hx"
		return null;
	}
	
	
	public java.lang.Object obj;
	
	public haxe.ds.StringMap deletions;
	
}


