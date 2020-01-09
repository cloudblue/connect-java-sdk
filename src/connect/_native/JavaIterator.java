// Generated by Haxe 4.0.5
package connect._native;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class JavaIterator<T> extends haxe.lang.HxObject implements java.util.Iterator<T>
{
	public JavaIterator(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public JavaIterator(haxe.root.Array<T> array)
	{
		//line 10 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
		connect._native.JavaIterator.__hx_ctor_connect_native_JavaIterator(((connect._native.JavaIterator<T>) (this) ), ((haxe.root.Array<T>) (array) ));
		//line 10 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
	}
	
	
	protected static <T_c> void __hx_ctor_connect_native_JavaIterator(connect._native.JavaIterator<T_c> __hx_this, haxe.root.Array<T_c> array)
	{
		//line 11 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
		__hx_this.array = array;
		//line 12 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
		__hx_this.index = 0;
	}
	
	
	public boolean hasNext()
	{
		//line 16 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
		return ( this.index < this.array.length );
	}
	
	
	public T next()
	{
		//line 21 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
		return this.array.__get(this.index++);
	}
	
	
	public void remove()
	{
	}
	
	
	public haxe.root.Array<T> array;
	
	public int index;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
		{
			//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
			if (( field != null )) 
			{
				//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
				switch (field.hashCode())
				{
					case 100346066:
					{
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						if (field.equals("index")) 
						{
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							__temp_executeDef1 = false;
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							this.index = ((int) (value) );
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							return value;
						}
						
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
		{
			//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
			if (( field != null )) 
			{
				//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
				switch (field.hashCode())
				{
					case 100346066:
					{
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						if (field.equals("index")) 
						{
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							__temp_executeDef1 = false;
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							this.index = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							return value;
						}
						
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						break;
					}
					
					
					case 93090393:
					{
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						if (field.equals("array")) 
						{
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							__temp_executeDef1 = false;
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							this.array = ((haxe.root.Array<T>) (value) );
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							return value;
						}
						
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
		{
			//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
			if (( field != null )) 
			{
				//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
				switch (field.hashCode())
				{
					case 100346066:
					{
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						if (field.equals("index")) 
						{
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							__temp_executeDef1 = false;
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							return this.index;
						}
						
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						break;
					}
					
					
					case 696759469:
					{
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						if (field.equals("hasNext")) 
						{
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							__temp_executeDef1 = false;
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasNext")) );
						}
						
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						break;
					}
					
					
					case 93090393:
					{
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						if (field.equals("array")) 
						{
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							__temp_executeDef1 = false;
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							return this.array;
						}
						
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						break;
					}
					
					
					case 3377907:
					{
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						if (field.equals("next")) 
						{
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							__temp_executeDef1 = false;
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "next")) );
						}
						
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						break;
					}
					
					
					case -934610812:
					{
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						if (field.equals("remove")) 
						{
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							__temp_executeDef1 = false;
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "remove")) );
						}
						
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
		{
			//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
			if (( field != null )) 
			{
				//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
				switch (field.hashCode())
				{
					case 100346066:
					{
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						if (field.equals("index")) 
						{
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							__temp_executeDef1 = false;
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							return ((double) (this.index) );
						}
						
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
		{
			//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
			if (( field != null )) 
			{
				//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
				switch (field.hashCode())
				{
					case -934610812:
					{
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						if (field.equals("remove")) 
						{
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							__temp_executeDef1 = false;
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							this.remove();
						}
						
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						break;
					}
					
					
					case 696759469:
					{
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						if (field.equals("hasNext")) 
						{
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							__temp_executeDef1 = false;
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							return this.hasNext();
						}
						
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						break;
					}
					
					
					case 3377907:
					{
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						if (field.equals("next")) 
						{
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							__temp_executeDef1 = false;
							//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
							return this.next();
						}
						
						//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
		baseArr.push("index");
		//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
		baseArr.push("array");
		//line 9 "/home/travis/build/cloudblue/connect-haxe-sdk/connect/native/JavaIterator.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


