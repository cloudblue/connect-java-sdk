// Generated by Haxe 4.0.5
package connect.util;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Diff_applyArray_137__Fun extends haxe.lang.Function
{
	public Diff_applyArray_137__Fun(haxe.root.Array out)
	{
		//line 137 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/util/Diff.hx"
		super(1, 0);
		//line 137 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/util/Diff.hx"
		this.out = out;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 137 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/util/Diff.hx"
		haxe.root.Array change = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.root.Array) (__fn_dyn1) )) );
		//line 138 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/util/Diff.hx"
		int i = ((int) (haxe.lang.Runtime.toInt(change.__get(0))) );
		//line 139 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/util/Diff.hx"
		haxe.root.Array originalArray = ( (( this.out.length > i )) ? (((haxe.root.Array) (this.out.__get(i)) )) : (new haxe.root.Array(new java.lang.Object[]{})) );
		//line 140 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/util/Diff.hx"
		java.lang.Object originalObject = ( (( this.out.length > i )) ? (this.out.__get(i)) : (new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{})) );
		//line 141 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/util/Diff.hx"
		java.lang.Object tmp = ( (( change.length == 3 )) ? (change.__get(2)) : (( (( change.__get(1) instanceof haxe.root.Array )) ? (connect.util.Diff.applyArray(originalArray, ((haxe.root.Array<haxe.root.Array>) (change.__get(1)) ))) : (((java.lang.Object) (haxe.lang.Runtime.callField(change.__get(1), "apply", new java.lang.Object[]{originalObject})) )) )) );
		//line 141 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/util/Diff.hx"
		this.out.__set(i, tmp);
		//line 137 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/util/Diff.hx"
		return null;
	}
	
	
	public haxe.root.Array out;
	
}

