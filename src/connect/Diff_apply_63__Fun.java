// Generated by Haxe 4.0.5
package connect;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Diff_apply_63__Fun extends haxe.lang.Function
{
	public Diff_apply_63__Fun(java.lang.Object out, connect.Diff _gthis)
	{
		//line 63 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
		super(1, 0);
		//line 63 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
		this.out = out;
		//line 63 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
		this._gthis = _gthis;
	}
	
	
	@Override public java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		//line 63 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
		java.lang.String k8 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 64 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
		java.lang.Object change = this._gthis.c.get(k8);
		//line 65 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
		if (( change instanceof haxe.root.Array )) 
		{
			//line 66 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
			if (haxe.lang.Runtime.eq(haxe.lang.Runtime.getField(change, "length", true), 2)) 
			{
				//line 68 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
				haxe.root.Reflect.setField(this.out, k8, ((java.lang.Object) (haxe.lang.Runtime.callField(change, "__get", new java.lang.Object[]{1})) ));
			}
			else
			{
				//line 71 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
				haxe.root.Array field = ((haxe.root.Array) (haxe.root.Reflect.field(this.out, k8)) );
				//line 72 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
				haxe.root.Array original = ( (( field != null )) ? (field) : (new haxe.root.Array(new java.lang.Object[]{})) );
				//line 73 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
				haxe.root.Array tmp1 = connect.Diff.applyArray(original, ((haxe.root.Array<haxe.root.Array>) (change) ));
				//line 73 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
				haxe.root.Reflect.setField(this.out, k8, tmp1);
			}
			
		}
		else
		{
			//line 77 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
			java.lang.Object field1 = haxe.root.Reflect.field(this.out, k8);
			//line 78 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
			java.lang.Object original1 = ( (( ! (( field1 == null )) )) ? (field1) : (new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{})) );
			//line 79 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
			java.lang.Object tmp2 = ((java.lang.Object) (haxe.lang.Runtime.callField(change, "apply", new java.lang.Object[]{original1})) );
			//line 79 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
			haxe.root.Reflect.setField(this.out, k8, tmp2);
		}
		
		//line 63 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Diff.hx"
		return null;
	}
	
	
	public java.lang.Object out;
	
	public connect.Diff _gthis;
	
}


