// Generated by Haxe 4.0.5
package haxe.ds._StringMap;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class StringMapValueIterator<T> extends haxe.lang.HxObject
{
	public StringMapValueIterator(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringMapValueIterator(haxe.ds.StringMap<T> m)
	{
		//line 514 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		haxe.ds._StringMap.StringMapValueIterator.__hx_ctor_haxe_ds__StringMap_StringMapValueIterator(((haxe.ds._StringMap.StringMapValueIterator<T>) (this) ), ((haxe.ds.StringMap<T>) (m) ));
		//line 514 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
	}
	
	
	public static <T_c> void __hx_ctor_haxe_ds__StringMap_StringMapValueIterator(haxe.ds._StringMap.StringMapValueIterator<T_c> __hx_this, haxe.ds.StringMap<T_c> m)
	{
		//line 515 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		__hx_this.m = m;
		//line 516 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		__hx_this.i = 0;
		//line 517 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		__hx_this.len = m.nBuckets;
	}
	
	
	public haxe.ds.StringMap<T> m;
	
	public int i;
	
	public int len;
	
	public final boolean hasNext()
	{
		//line 521 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 521 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int _g = this.i;
			//line 521 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			int _g1 = this.len;
			//line 521 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			while (( _g < _g1 ))
			{
				//line 521 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				int j = _g++;
				//line 522 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				if (( (( this.m.hashes[j] & -2 )) != 0 )) 
				{
					//line 523 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
					this.i = j;
					//line 524 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
					return true;
				}
				
			}
			
		}
		
		//line 527 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		return false;
	}
	
	
	public final T next()
	{
		//line 531 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		return this.m.vals[this.i++];
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			boolean __temp_executeDef1 = true;
			//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( field != null )) 
			{
				//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				switch (field.hashCode())
				{
					case 107029:
					{
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("len")) 
						{
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							this.len = ((int) (value) );
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return value;
						}
						
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 105:
					{
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("i")) 
						{
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							this.i = ((int) (value) );
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return value;
						}
						
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (__temp_executeDef1) 
			{
				//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			boolean __temp_executeDef1 = true;
			//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( field != null )) 
			{
				//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				switch (field.hashCode())
				{
					case 107029:
					{
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("len")) 
						{
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							this.len = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return value;
						}
						
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 109:
					{
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("m")) 
						{
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							this.m = ((haxe.ds.StringMap<T>) (value) );
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return value;
						}
						
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 105:
					{
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("i")) 
						{
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							this.i = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return value;
						}
						
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (__temp_executeDef1) 
			{
				//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			boolean __temp_executeDef1 = true;
			//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( field != null )) 
			{
				//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				switch (field.hashCode())
				{
					case 3377907:
					{
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("next")) 
						{
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "next")) );
						}
						
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 109:
					{
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("m")) 
						{
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return this.m;
						}
						
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 696759469:
					{
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("hasNext")) 
						{
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasNext")) );
						}
						
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 105:
					{
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("i")) 
						{
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return this.i;
						}
						
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 107029:
					{
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("len")) 
						{
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return this.len;
						}
						
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (__temp_executeDef1) 
			{
				//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			boolean __temp_executeDef1 = true;
			//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( field != null )) 
			{
				//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				switch (field.hashCode())
				{
					case 107029:
					{
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("len")) 
						{
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return ((double) (this.len) );
						}
						
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 105:
					{
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("i")) 
						{
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return ((double) (this.i) );
						}
						
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (__temp_executeDef1) 
			{
				//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		{
			//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			boolean __temp_executeDef1 = true;
			//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (( field != null )) 
			{
				//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				switch (field.hashCode())
				{
					case 3377907:
					{
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("next")) 
						{
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return this.next();
						}
						
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
					case 696759469:
					{
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						if (field.equals("hasNext")) 
						{
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							__temp_executeDef1 = false;
							//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
							return this.hasNext();
						}
						
						//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
			if (__temp_executeDef1) 
			{
				//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("len");
		//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("i");
		//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		baseArr.push("m");
		//line 509 "/home/travis/haxe/std/java/_std/haxe/ds/StringMap.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


