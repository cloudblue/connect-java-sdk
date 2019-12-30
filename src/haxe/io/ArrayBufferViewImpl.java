// Generated by Haxe 4.0.5
package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ArrayBufferViewImpl extends haxe.lang.HxObject
{
	public ArrayBufferViewImpl(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ArrayBufferViewImpl(haxe.io.Bytes bytes, int pos, int length)
	{
		//line 32 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		haxe.io.ArrayBufferViewImpl.__hx_ctor_haxe_io_ArrayBufferViewImpl(this, bytes, pos, length);
	}
	
	
	protected static void __hx_ctor_haxe_io_ArrayBufferViewImpl(haxe.io.ArrayBufferViewImpl __hx_this, haxe.io.Bytes bytes, int pos, int length)
	{
		//line 33 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		__hx_this.bytes = bytes;
		//line 34 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		__hx_this.byteOffset = pos;
		//line 35 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		__hx_this.byteLength = length;
	}
	
	
	public haxe.io.Bytes bytes;
	
	public int byteOffset;
	
	public int byteLength;
	
	public haxe.io.ArrayBufferViewImpl sub(int begin, java.lang.Object length)
	{
		//line 39 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		if (haxe.lang.Runtime.eq(length, null)) 
		{
			//line 40 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			length = ( this.byteLength - begin );
		}
		
		//line 41 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		if (( ( ( begin < 0 ) || ( ((int) (haxe.lang.Runtime.toInt(length)) ) < 0 ) ) || ( ((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.plus(begin, length))) ) > this.byteLength ) )) 
		{
			//line 42 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		//line 43 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		return new haxe.io.ArrayBufferViewImpl(this.bytes, ( this.byteOffset + begin ), ((int) (haxe.lang.Runtime.toInt(length)) ));
	}
	
	
	public haxe.io.ArrayBufferViewImpl subarray(java.lang.Object begin, java.lang.Object end)
	{
		//line 47 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		if (haxe.lang.Runtime.eq(begin, null)) 
		{
			//line 48 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			begin = 0;
		}
		
		//line 49 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		if (haxe.lang.Runtime.eq(end, null)) 
		{
			//line 50 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			end = ( ((int) (this.byteLength) ) - ((int) (haxe.lang.Runtime.toInt(begin)) ) );
		}
		
		//line 51 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		return this.sub(((int) (haxe.lang.Runtime.toInt(begin)) ), ( ((int) (haxe.lang.Runtime.toInt(end)) ) - ((int) (haxe.lang.Runtime.toInt(begin)) ) ));
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		{
			//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			if (( field != null )) 
			{
				//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
				switch (field.hashCode())
				{
					case 281453070:
					{
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						if (field.equals("byteLength")) 
						{
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							this.byteLength = ((int) (value) );
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							return value;
						}
						
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						break;
					}
					
					
					case 368036795:
					{
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						if (field.equals("byteOffset")) 
						{
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							this.byteOffset = ((int) (value) );
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							return value;
						}
						
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		{
			//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			if (( field != null )) 
			{
				//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
				switch (field.hashCode())
				{
					case 281453070:
					{
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						if (field.equals("byteLength")) 
						{
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							this.byteLength = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							return value;
						}
						
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						break;
					}
					
					
					case 94224491:
					{
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						if (field.equals("bytes")) 
						{
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							this.bytes = ((haxe.io.Bytes) (value) );
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							return value;
						}
						
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						break;
					}
					
					
					case 368036795:
					{
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						if (field.equals("byteOffset")) 
						{
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							this.byteOffset = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							return value;
						}
						
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		{
			//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			if (( field != null )) 
			{
				//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
				switch (field.hashCode())
				{
					case -2077778919:
					{
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						if (field.equals("subarray")) 
						{
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "subarray")) );
						}
						
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						break;
					}
					
					
					case 94224491:
					{
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						if (field.equals("bytes")) 
						{
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							return this.bytes;
						}
						
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						break;
					}
					
					
					case 114240:
					{
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						if (field.equals("sub")) 
						{
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "sub")) );
						}
						
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						break;
					}
					
					
					case 368036795:
					{
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						if (field.equals("byteOffset")) 
						{
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							return this.byteOffset;
						}
						
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						break;
					}
					
					
					case 281453070:
					{
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						if (field.equals("byteLength")) 
						{
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							return this.byteLength;
						}
						
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		{
			//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			if (( field != null )) 
			{
				//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
				switch (field.hashCode())
				{
					case 281453070:
					{
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						if (field.equals("byteLength")) 
						{
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							return ((double) (this.byteLength) );
						}
						
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						break;
					}
					
					
					case 368036795:
					{
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						if (field.equals("byteOffset")) 
						{
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							return ((double) (this.byteOffset) );
						}
						
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		{
			//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			if (( field != null )) 
			{
				//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
				switch (field.hashCode())
				{
					case -2077778919:
					{
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						if (field.equals("subarray")) 
						{
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							return this.subarray(( (( dynargs.length > 0 )) ? (dynargs[0]) : (null) ), ( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) ));
						}
						
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						break;
					}
					
					
					case 114240:
					{
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						if (field.equals("sub")) 
						{
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
							return this.sub(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) ));
						}
						
						//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		baseArr.push("byteLength");
		//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		baseArr.push("byteOffset");
		//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		baseArr.push("bytes");
		//line 27 "/home/travis/haxe/std/haxe/io/ArrayBufferView.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


