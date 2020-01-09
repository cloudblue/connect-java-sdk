// Generated by Haxe 4.0.5
package connect.api.impl;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class UsageApiImpl extends connect.Base implements connect.api.IUsageApi
{
	static
	{
		//line 9 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		connect.api.impl.UsageApiImpl.USAGE_FILES_PATH = "usage/files";
		//line 10 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		connect.api.impl.UsageApiImpl.USAGE_PRODUCTS_PATH = "usage/products";
		//line 11 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		connect.api.impl.UsageApiImpl.USAGE_RECORDS_PATH = "usage/records";
	}
	
	public UsageApiImpl(haxe.lang.EmptyObject empty)
	{
		//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public UsageApiImpl()
	{
		//line 14 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		connect.api.impl.UsageApiImpl.__hx_ctor_connect_api_impl_UsageApiImpl(this);
	}
	
	
	protected static void __hx_ctor_connect_api_impl_UsageApiImpl(connect.api.impl.UsageApiImpl __hx_this)
	{
	}
	
	
	public static java.lang.String USAGE_FILES_PATH;
	
	public static java.lang.String USAGE_PRODUCTS_PATH;
	
	public static java.lang.String USAGE_RECORDS_PATH;
	
	public java.lang.String listUsageFiles(connect.api.Query filters)
	{
		//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return connect.api.ConnectHelper.get(connect.api.impl.UsageApiImpl.USAGE_FILES_PATH, null, null, filters, null);
	}
	
	
	public java.lang.String createUsageFile(java.lang.String body)
	{
		//line 23 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return connect.api.ConnectHelper.post(connect.api.impl.UsageApiImpl.USAGE_FILES_PATH, null, null, body);
	}
	
	
	public java.lang.String getUsageFile(java.lang.String id)
	{
		//line 28 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return connect.api.ConnectHelper.get(connect.api.impl.UsageApiImpl.USAGE_FILES_PATH, id, null, null, null);
	}
	
	
	public java.lang.String updateUsageFile(java.lang.String id, java.lang.String body)
	{
		//line 33 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return connect.api.ConnectHelper.put(connect.api.impl.UsageApiImpl.USAGE_FILES_PATH, id, body);
	}
	
	
	public void deleteUsageFile(java.lang.String id)
	{
		//line 38 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		connect.api.ConnectHelper.post(connect.api.impl.UsageApiImpl.USAGE_FILES_PATH, id, "delete", null);
	}
	
	
	public java.lang.String uploadUsageFile(java.lang.String id, connect.Blob file)
	{
		//line 43 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return haxe.lang.Runtime.toString(connect.api.ConnectHelper.postFile(connect.api.impl.UsageApiImpl.USAGE_FILES_PATH, id, "upload", "usage_file", "usage_file.xlsx", file));
	}
	
	
	public java.lang.String submitUsageFileAction(java.lang.String id)
	{
		//line 55 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return connect.api.ConnectHelper.post(connect.api.impl.UsageApiImpl.USAGE_FILES_PATH, id, "submit", null);
	}
	
	
	public java.lang.String acceptUsageFileAction(java.lang.String id, java.lang.String note)
	{
		//line 61 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		haxe.lang.Function replacer = null;
		//line 61 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		java.lang.String space = null;
		//line 60 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return connect.api.ConnectHelper.post(connect.api.impl.UsageApiImpl.USAGE_FILES_PATH, id, "accept", haxe.format.JsonPrinter.print(((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"acceptance_note"}, new java.lang.Object[]{note}, new java.lang.String[]{}, new double[]{})) ), replacer, space));
	}
	
	
	public java.lang.String rejectUsageFileAction(java.lang.String id, java.lang.String note)
	{
		//line 67 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		haxe.lang.Function replacer = null;
		//line 67 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		java.lang.String space = null;
		//line 66 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return connect.api.ConnectHelper.post(connect.api.impl.UsageApiImpl.USAGE_FILES_PATH, id, "reject", haxe.format.JsonPrinter.print(((java.lang.Object) (new haxe.lang.DynamicObject(new java.lang.String[]{"rejection_note"}, new java.lang.Object[]{note}, new java.lang.String[]{}, new double[]{})) ), replacer, space));
	}
	
	
	public java.lang.String closeUsageFileAction(java.lang.String id)
	{
		//line 72 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return connect.api.ConnectHelper.post(connect.api.impl.UsageApiImpl.USAGE_FILES_PATH, id, "close", null);
	}
	
	
	public java.lang.String getProductSpecificUsageFileTemplate(java.lang.String productId)
	{
		//line 77 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return connect.api.ConnectHelper.get(connect.api.impl.UsageApiImpl.USAGE_PRODUCTS_PATH, productId, "template", null, null);
	}
	
	
	public java.lang.String uploadReconciliationFileFromProvider(java.lang.String id, connect.Blob file)
	{
		//line 82 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return haxe.lang.Runtime.toString(connect.api.ConnectHelper.postFile(connect.api.impl.UsageApiImpl.USAGE_FILES_PATH, id, "reconciliation", "reconciliation_file", "reconciliation_file.xlsx", file));
	}
	
	
	public java.lang.String reprocessProcessedFile(java.lang.String id)
	{
		//line 94 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return connect.api.ConnectHelper.post(connect.api.impl.UsageApiImpl.USAGE_FILES_PATH, id, "reprocess", null);
	}
	
	
	public java.lang.String listUsageRecords(connect.api.Query filters)
	{
		//line 99 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return connect.api.ConnectHelper.get(connect.api.impl.UsageApiImpl.USAGE_RECORDS_PATH, null, null, filters, null);
	}
	
	
	public java.lang.String getUsageRecord(java.lang.String id)
	{
		//line 104 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return connect.api.ConnectHelper.get(connect.api.impl.UsageApiImpl.USAGE_RECORDS_PATH, id, null, null, null);
	}
	
	
	public java.lang.String updateUsageRecord(java.lang.String id, java.lang.String record)
	{
		//line 109 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return connect.api.ConnectHelper.put(connect.api.impl.UsageApiImpl.USAGE_RECORDS_PATH, id, record);
	}
	
	
	public java.lang.String closeUsageRecord(java.lang.String id, java.lang.String record)
	{
		//line 114 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return connect.api.ConnectHelper.post(connect.api.impl.UsageApiImpl.USAGE_RECORDS_PATH, id, "close", record);
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		{
			//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
			if (( field != null )) 
			{
				//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
				switch (field.hashCode())
				{
					case -670353350:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("closeUsageRecord")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "closeUsageRecord")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 372672660:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("listUsageFiles")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "listUsageFiles")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case -274947895:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("updateUsageRecord")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "updateUsageRecord")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case -691402463:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("createUsageFile")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createUsageFile")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 224501788:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("getUsageRecord")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getUsageRecord")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 764125191:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("getUsageFile")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getUsageFile")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case -701245153:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("listUsageRecords")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "listUsageRecords")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 1979246580:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("updateUsageFile")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "updateUsageFile")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case -1468951954:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("reprocessProcessedFile")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "reprocessProcessedFile")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 1555954002:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("deleteUsageFile")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "deleteUsageFile")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case -1558381893:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("uploadReconciliationFileFromProvider")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "uploadReconciliationFileFromProvider")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 1418031548:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("uploadUsageFile")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "uploadUsageFile")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case -1338024820:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("getProductSpecificUsageFileTemplate")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getProductSpecificUsageFileTemplate")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case -2077418469:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("submitUsageFileAction")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "submitUsageFileAction")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 318243387:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("closeUsageFileAction")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "closeUsageFileAction")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 902506795:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("acceptUsageFileAction")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "acceptUsageFileAction")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 1648331188:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("rejectUsageFileAction")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "rejectUsageFileAction")) );
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		{
			//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
			if (( field != null )) 
			{
				//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
				switch (field.hashCode())
				{
					case -670353350:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("closeUsageRecord")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return this.closeUsageRecord(haxe.lang.Runtime.toString(dynargs[0]), haxe.lang.Runtime.toString(dynargs[1]));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 372672660:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("listUsageFiles")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return this.listUsageFiles(((connect.api.Query) (dynargs[0]) ));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case -274947895:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("updateUsageRecord")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return this.updateUsageRecord(haxe.lang.Runtime.toString(dynargs[0]), haxe.lang.Runtime.toString(dynargs[1]));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case -691402463:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("createUsageFile")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return this.createUsageFile(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 224501788:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("getUsageRecord")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return this.getUsageRecord(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 764125191:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("getUsageFile")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return this.getUsageFile(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case -701245153:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("listUsageRecords")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return this.listUsageRecords(((connect.api.Query) (dynargs[0]) ));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 1979246580:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("updateUsageFile")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return this.updateUsageFile(haxe.lang.Runtime.toString(dynargs[0]), haxe.lang.Runtime.toString(dynargs[1]));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case -1468951954:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("reprocessProcessedFile")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return this.reprocessProcessedFile(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 1555954002:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("deleteUsageFile")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							this.deleteUsageFile(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case -1558381893:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("uploadReconciliationFileFromProvider")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return this.uploadReconciliationFileFromProvider(haxe.lang.Runtime.toString(dynargs[0]), ((connect.Blob) (dynargs[1]) ));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 1418031548:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("uploadUsageFile")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return this.uploadUsageFile(haxe.lang.Runtime.toString(dynargs[0]), ((connect.Blob) (dynargs[1]) ));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case -1338024820:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("getProductSpecificUsageFileTemplate")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return this.getProductSpecificUsageFileTemplate(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case -2077418469:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("submitUsageFileAction")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return this.submitUsageFileAction(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 318243387:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("closeUsageFileAction")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return this.closeUsageFileAction(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 902506795:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("acceptUsageFileAction")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return this.acceptUsageFileAction(haxe.lang.Runtime.toString(dynargs[0]), haxe.lang.Runtime.toString(dynargs[1]));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
					case 1648331188:
					{
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						if (field.equals("rejectUsageFileAction")) 
						{
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							__temp_executeDef1 = false;
							//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
							return this.rejectUsageFileAction(haxe.lang.Runtime.toString(dynargs[0]), haxe.lang.Runtime.toString(dynargs[1]));
						}
						
						//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 8 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/api/impl/UsageApiImpl.hx"
		return null;
	}
	
	
}


