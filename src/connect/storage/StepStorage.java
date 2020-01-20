// Generated by Haxe 4.0.5
package connect.storage;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StepStorage extends haxe.lang.HxObject
{
	public StepStorage(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StepStorage()
	{
		//line 20 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		connect.storage.StepStorage.__hx_ctor_connect_storage_StepStorage(this);
	}
	
	
	protected static void __hx_ctor_connect_storage_StepStorage(connect.storage.StepStorage __hx_this)
	{
	}
	
	
	public static connect.storage.StepData load(java.lang.String requestId, connect.models.Param param)
	{
		//line 22 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		connect.storage.StepData fileData = connect.storage.StepStorage.loadRequestFromFile(requestId);
		//line 23 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		connect.storage.StepData stepData = ( (( fileData != null )) ? (fileData) : (connect.storage.StepStorage.loadRequestFromParam(requestId, param)) );
		//line 26 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		if (( stepData != null )) 
		{
			//line 27 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			return stepData;
		}
		else
		{
			//line 28 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			return new connect.storage.StepData(0, new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{}), connect.storage.StorageType.FailedStorage);
		}
		
	}
	
	
	public static connect.storage.StorageType save(connect.models.IdModel request, connect.storage.StepData stepData, connect.models.Param param, java.lang.Object updateFunc)
	{
		//line 34 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		connect.storage.StepStorage.removeStepDataFromFile(request.id);
		//line 37 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		java.lang.Object paramObj = connect.storage.StepStorage.objWithRequestData(connect.storage.StepStorage.loadAllFromParam(param), request.id, stepData);
		//line 38 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		java.lang.Object fileObj = connect.storage.StepStorage.objWithRequestData(connect.storage.StepStorage.loadAllFromFile(), request.id, stepData);
		//line 39 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		if (connect.storage.StepStorage.saveInConnect(request, connect.storage.StepStorage.encodeData(paramObj), param, updateFunc)) 
		{
			//line 40 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			return connect.storage.StorageType.ConnectStorage;
		}
		else
		{
			//line 41 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			if (connect.storage.StepStorage.saveInFile(connect.storage.StepStorage.encodeData(fileObj))) 
			{
				//line 42 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
				return connect.storage.StorageType.LocalStorage;
			}
			else
			{
				//line 44 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
				return connect.storage.StorageType.FailedStorage;
			}
			
		}
		
	}
	
	
	public static boolean removeStepData(java.lang.String requestId, connect.models.Param param)
	{
		//line 50 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		connect.storage.StepStorage.removeStepDataFromFile(requestId);
		//line 52 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		java.lang.Object paramObj = connect.storage.StepStorage.loadAllFromParam(param);
		//line 53 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		if (( ( ! (( paramObj == null )) ) && haxe.root.Reflect.hasField(paramObj, requestId) )) 
		{
			//line 54 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			param.value = connect.storage.StepStorage.encodeData(connect.storage.StepStorage.objWithoutRequestData(paramObj, requestId));
			//line 55 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			return true;
		}
		
		//line 58 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		return false;
	}
	
	
	public static void removeStepDataFromFile(java.lang.String requestId)
	{
		//line 63 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		java.lang.Object fileObj = connect.storage.StepStorage.loadAllFromFile();
		//line 64 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		if (( ( ! (( fileObj == null )) ) && haxe.root.Reflect.hasField(fileObj, requestId) )) 
		{
			//line 65 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			java.lang.Object fileData = connect.storage.StepStorage.objWithoutRequestData(fileObj, requestId);
			//line 66 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			connect.storage.StepStorage.saveInFile(connect.storage.StepStorage.encodeData(fileData));
		}
		
	}
	
	
	public static java.lang.Object objWithRequestData(java.lang.Object obj, java.lang.String requestId, connect.storage.StepData stepData)
	{
		//line 73 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		java.lang.Object fixedObj = ( (( ! (( obj == null )) )) ? (obj) : (new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{})) );
		//line 74 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		java.lang.Object __temp_stmt2 = null;
		//line 74 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		{
			//line 76 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			java.lang.Object __temp_odecl1 = stepData.data.toObject();
			//line 74 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			__temp_stmt2 = new haxe.lang.DynamicObject(new java.lang.String[]{"data"}, new java.lang.Object[]{__temp_odecl1}, new java.lang.String[]{"current_step"}, new double[]{((double) (((double) (stepData.firstIndex) )) )});
		}
		
		//line 74 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		haxe.root.Reflect.setField(fixedObj, requestId, __temp_stmt2);
		//line 78 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		return fixedObj;
	}
	
	
	public static java.lang.Object objWithoutRequestData(java.lang.Object obj, java.lang.String requestId)
	{
		//line 83 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		java.lang.Object fixedObj = ( (( ! (( obj == null )) )) ? (obj) : (new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{})) );
		//line 84 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		if (haxe.root.Reflect.hasField(fixedObj, requestId)) 
		{
			//line 85 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			haxe.root.Reflect.deleteField(fixedObj, requestId);
		}
		
		//line 87 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		return fixedObj;
	}
	
	
	public static connect.storage.StepData loadRequestFromParam(java.lang.String requestId, connect.models.Param param)
	{
		//line 92 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		java.lang.Object dataObject = connect.storage.StepStorage.loadAllFromParam(param);
		//line 93 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		if (( ! (( dataObject == null )) )) 
		{
			//line 94 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			return connect.storage.StepStorage.getRequestField(dataObject, requestId, connect.storage.StorageType.ConnectStorage);
		}
		
		//line 96 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		return null;
	}
	
	
	public static connect.storage.StepData loadRequestFromFile(java.lang.String requestId)
	{
		//line 101 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		java.lang.Object dataObject = connect.storage.StepStorage.loadAllFromFile();
		//line 102 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		if (( ! (( dataObject == null )) )) 
		{
			//line 103 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			return connect.storage.StepStorage.getRequestField(dataObject, requestId, connect.storage.StorageType.LocalStorage);
		}
		
		//line 105 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		return null;
	}
	
	
	public static java.lang.Object loadAllFromParam(connect.models.Param param)
	{
		//line 111 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		if (( ( ( param != null ) && ( param.value != null ) ) &&  ! (haxe.lang.Runtime.valEq(param.value, ""))  )) 
		{
			//line 112 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			return connect.storage.StepStorage.decodeData(param.value);
		}
		
		//line 115 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		return null;
	}
	
	
	public static java.lang.Object loadAllFromFile()
	{
		//line 120 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		java.lang.String dataFilename = connect.storage.StepStorage.getDataFilename();
		//line 121 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		if (( sys.FileSystem.exists(dataFilename) &&  ! (sys.FileSystem.isDirectory(dataFilename))  )) 
		{
			//line 122 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			return connect.storage.StepStorage.decodeData(sys.io.File.getContent(dataFilename));
		}
		
		//line 124 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		return null;
	}
	
	
	public static boolean saveInConnect(connect.models.IdModel request, java.lang.String data, connect.models.Param param, java.lang.Object updateFunc)
	{
		//line 138 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		if (( param != null )) 
		{
			//line 139 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			param.value = data;
			//line 140 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			try 
			{
				//line 141 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
				haxe.root.Reflect.callMethod(request, updateFunc, new haxe.root.Array(new java.lang.Object[]{}));
				//line 142 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
				return true;
			}
			catch (java.lang.Throwable catchallException)
			{
				//line 140 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
				haxe.lang.Exceptions.setException(catchallException);
				//line 144 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
				{
					//line 144 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
					java.lang.Object ex = ( (haxe.root.Std.is(catchallException, haxe.lang.HaxeException.class)) ? (((haxe.lang.HaxeException) (catchallException) ).obj) : (catchallException) );
					//line 144 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
					connect.Env.getLogger().writeCodeBlock(connect.logger.Logger.LEVEL_ERROR, haxe.root.Std.string(ex), "");
				}
				
			}
			
			
		}
		
		//line 147 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		return false;
	}
	
	
	public static boolean saveInFile(java.lang.String data)
	{
		//line 157 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		java.lang.String dataFilename = connect.storage.StepStorage.getDataFilename();
		//line 158 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		try 
		{
			//line 159 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			sys.io.File.saveContent(dataFilename, data);
			//line 160 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			return true;
		}
		catch (java.lang.Throwable catchallException)
		{
			//line 158 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			haxe.lang.Exceptions.setException(catchallException);
			//line 162 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			java.lang.Object ex = ( (haxe.root.Std.is(catchallException, haxe.lang.HaxeException.class)) ? (((haxe.lang.HaxeException) (catchallException) ).obj) : (catchallException) );
			//line 162 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			return false;
		}
		
		
	}
	
	
	public static connect.storage.StepData getRequestField(java.lang.Object object, java.lang.String requestId, connect.storage.StorageType storage)
	{
		//line 168 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		if (haxe.root.Reflect.hasField(object, requestId)) 
		{
			//line 169 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			java.lang.Object stepData = haxe.root.Reflect.field(object, requestId);
			//line 170 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			return new connect.storage.StepData(((int) (haxe.lang.Runtime.getField_f(stepData, "current_step", true)) ), haxe.lang.Runtime.getField(stepData, "data", true), storage);
		}
		
		//line 172 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		return null;
	}
	
	
	public static java.lang.String getDataFilename()
	{
		//line 177 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		java.lang.String filename = "step.dat";
		//line 178 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		java.lang.String logPath = connect.Env.getLogger().getPath();
		//line 179 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		if (( logPath != null )) 
		{
			//line 180 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			return ( logPath + filename );
		}
		else
		{
			//line 181 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
			return filename;
		}
		
	}
	
	
	public static java.lang.String encodeData(java.lang.Object data)
	{
		//line 186 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		haxe.lang.Function replacer = null;
		//line 186 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		java.lang.String space = null;
		//line 186 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		haxe.io.Bytes bytes = haxe.io.Bytes.ofString(haxe.format.JsonPrinter.print(data, replacer, space), null);
		//line 190 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		haxe.io.Bytes compressed = haxe.zip.Compress.run(bytes, 9);
		//line 192 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		return haxe.crypto.Base64.encode(compressed, null);
	}
	
	
	public static java.lang.Object decodeData(java.lang.String data)
	{
		//line 197 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		haxe.io.Bytes decoded = haxe.crypto.Base64.decode(data, null);
		//line 201 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		haxe.io.Bytes decompressed = haxe.zip.Uncompress.run(decoded, null);
		//line 203 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/storage/StepStorage.hx"
		return new haxe.format.JsonParser(haxe.lang.Runtime.toString(decompressed.toString())).doParse();
	}
	
	
}

