// Generated by Haxe 4.0.5
package connect;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StorageType extends haxe.lang.Enum
{
	public StorageType(int index)
	{
		//line 219 "/home/travis/haxe/std/java/internal/HxObject.hx"
		super(index);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"ConnectStorage", "LocalStorage", "FailedStorage"};
	
	public static final connect.StorageType ConnectStorage = new connect.StorageType(0);
	
	public static final connect.StorageType LocalStorage = new connect.StorageType(1);
	
	public static final connect.StorageType FailedStorage = new connect.StorageType(2);
	
	@Override public java.lang.String getTag()
	{
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/StepData.hx"
		return connect.StorageType.__hx_constructs[this.index];
	}
	
	
}


