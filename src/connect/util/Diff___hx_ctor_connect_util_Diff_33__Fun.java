// Generated by Haxe 4.0.5
package connect.util;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Diff___hx_ctor_connect_util_Diff_33__Fun extends haxe.lang.Function
{
	public Diff___hx_ctor_connect_util_Diff_33__Fun(java.lang.Object second, java.lang.Object first, connect.util.Diff _gthis)
	{
		//line 33 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Diff.hx"
		super(1, 0);
		//line 33 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Diff.hx"
		this.second = second;
		//line 33 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Diff.hx"
		this.first = first;
		//line 33 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Diff.hx"
		this._gthis = _gthis;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 33 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Diff.hx"
		java.lang.String f5 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 34 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Diff.hx"
		java.lang.Object a = haxe.root.Reflect.field(this.first, f5);
		//line 35 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Diff.hx"
		java.lang.Object b = haxe.root.Reflect.field(this.second, f5);
		//line 36 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Diff.hx"
		if (( connect.util.Util.isStruct(a) && connect.util.Util.isStruct(b) )) 
		{
			//line 38 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Diff.hx"
			this._gthis.c.set(f5, new connect.util.Diff(a, b));
		}
		else
		{
			//line 39 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Diff.hx"
			if (( connect.util.Util.isArray(a) && connect.util.Util.isArray(b) )) 
			{
				//line 41 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Diff.hx"
				this._gthis.c.set(f5, connect.util.Diff.compareArrays(((haxe.root.Array) (a) ), ((haxe.root.Array) (b) )));
			}
			else
			{
				//line 44 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Diff.hx"
				this._gthis.c.set(f5, new haxe.root.Array(new java.lang.Object[]{a, b}));
			}
			
		}
		
		//line 33 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Diff.hx"
		return null;
	}
	
	
	public java.lang.Object second;
	
	public java.lang.Object first;
	
	public connect.util.Diff _gthis;
	
}


