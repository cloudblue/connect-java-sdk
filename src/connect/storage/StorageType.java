// Generated by Haxe 4.0.5
package connect.storage;

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
	
	public static final connect.storage.StorageType ConnectStorage = new connect.storage.StorageType(0);
	
	public static final connect.storage.StorageType LocalStorage = new connect.storage.StorageType(1);
	
	public static final connect.storage.StorageType FailedStorage = new connect.storage.StorageType(2);
	
	@Override public java.lang.String getTag()
	{
		//line 12 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/storage/StepData.hx"
		return connect.storage.StorageType.__hx_constructs[this.index];
	}
	
	
}


