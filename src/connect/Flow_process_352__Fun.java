// Generated by Haxe 4.0.5
package connect;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Flow_process_352__Fun extends haxe.lang.Function
{
	public Flow_process_352__Fun(connect.storage.StepData stepData, connect.Flow _gthis)
	{
		//line 353 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Flow.hx"
		super(2, 0);
		//line 353 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Flow.hx"
		this.stepData = stepData;
		//line 353 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Flow.hx"
		this._gthis = _gthis;
	}
	
	
	@Override public java.lang.Object __hx_invoke2_o(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 352 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Flow.hx"
		java.lang.Object prev = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float2) )) : (((java.lang.Object) (__fn_dyn2) )) );
		//line 352 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Flow.hx"
		connect._Flow.Step step = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((connect._Flow.Step) (((java.lang.Object) (__fn_float1) )) )) : (((connect._Flow.Step) (__fn_dyn1) )) );
		//line 353 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Flow.hx"
		if (( ! (( prev == null )) )) 
		{
			//line 354 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Flow.hx"
			return this._gthis.processStep(step, ( this.stepData.firstIndex + ((int) (haxe.lang.Runtime.getField_f(prev, "nextIndex", true)) ) ), haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(prev, "lastRequestStr", true)), haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(prev, "lastDataStr", true)));
		}
		else
		{
			//line 356 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/Flow.hx"
			return null;
		}
		
	}
	
	
	public connect.storage.StepData stepData;
	
	public connect.Flow _gthis;
	
}


