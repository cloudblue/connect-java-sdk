// Generated by Haxe 4.0.5
package connect.util;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Collection<T> extends connect.Base implements java.lang.Iterable<T>
{
	public Collection(haxe.lang.EmptyObject empty)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Collection()
	{
		//line 20 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		connect.util.Collection.__hx_ctor_connect_util_Collection(((connect.util.Collection<T>) (this) ));
		//line 20 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
	}
	
	
	protected static <T_c> void __hx_ctor_connect_util_Collection(connect.util.Collection<T_c> __hx_this)
	{
		//line 21 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		__hx_this._array = new haxe.root.Array<T_c>();
	}
	
	
	public static <T1> connect.util.Collection<T1> _fromArray(haxe.root.Array<T1> array)
	{
		//line 320 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		connect.util.Collection<T1> col = new connect.util.Collection<T1>();
		//line 321 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		col._array = array.copy();
		//line 322 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return col;
	}
	
	
	public int length()
	{
		//line 29 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return this._array.length;
	}
	
	
	public T get(int index)
	{
		//line 37 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return this._array.__get(index);
	}
	
	
	public connect.util.Collection<T> set(int index, T x)
	{
		//line 45 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		this._array.__set(index, x);
		//line 46 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return this;
	}
	
	
	public haxe.root.Array<T> toArray()
	{
		//line 59 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return this._array.copy();
	}
	
	
	public connect.util.Collection<T> concat(connect.util.Collection<T> c)
	{
		//line 77 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return ((connect.util.Collection<T>) (connect.util.Collection._fromArray(((haxe.root.Array<T>) (this._array.concat(c._array)) ))) );
	}
	
	
	public connect.util.Collection<T> copy()
	{
		//line 89 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return ((connect.util.Collection<T>) (connect.util.Collection._fromArray(((haxe.root.Array<T>) (this._array.copy()) ))) );
	}
	
	
	public int indexOf(T x, java.lang.Object fromIndex)
	{
		//line 105 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return this._array.indexOf(x, fromIndex);
	}
	
	
	public void insert(int pos, T x)
	{
		//line 123 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		this._array.insert(pos, x);
	}
	
	
	public java.util.Iterator<T> iterator()
	{
		//line 133 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return new connect._native.JavaIterator<T>(((haxe.root.Array<T>) (this._array) ));
	}
	
	
	public java.lang.String join(java.lang.String sep)
	{
		//line 151 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return this._array.join(sep);
	}
	
	
	public int lastIndexOf(T x, java.lang.Object fromIndex)
	{
		//line 169 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return this._array.lastIndexOf(x, fromIndex);
	}
	
	
	public T pop()
	{
		//line 182 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return ((T) (this._array.pop()) );
	}
	
	
	public connect.util.Collection<T> push(T x)
	{
		//line 197 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		this._array.push(x);
		//line 198 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return this;
	}
	
	
	public boolean remove(T x)
	{
		//line 214 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return this._array.remove(x);
	}
	
	
	public void reverse()
	{
		//line 226 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		this._array.reverse();
	}
	
	
	public T shift()
	{
		//line 241 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return ((T) (this._array.shift()) );
	}
	
	
	public connect.util.Collection<T> slice(int pos, java.lang.Object end)
	{
		//line 264 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return ((connect.util.Collection<T>) (connect.util.Collection._fromArray(((haxe.root.Array<T>) (this._array.slice(pos, end)) ))) );
	}
	
	
	public connect.util.Collection<T> splice(int pos, int len)
	{
		//line 290 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return ((connect.util.Collection<T>) (connect.util.Collection._fromArray(((haxe.root.Array<T>) (this._array.splice(pos, len)) ))) );
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 301 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return this._array.toString();
	}
	
	
	public connect.util.Collection<T> unshift(T x)
	{
		//line 313 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		this._array.unshift(x);
		//line 314 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return this;
	}
	
	
	public haxe.root.Array<T> _array;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		{
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
			if (( field != null )) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
				switch (field.hashCode())
				{
					case -1482107558:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("_array")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							this._array = ((haxe.root.Array<T>) (value) );
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return value;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		{
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
			if (( field != null )) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
				switch (field.hashCode())
				{
					case -1482107558:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("_array")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this._array;
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -1106363674:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("length")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "length")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -277637751:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("unshift")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "unshift")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 102230:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("get")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -1776922004:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("toString")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 113762:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("set")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -895859076:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("splice")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "splice")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -1182381922:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("toArray")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toArray")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 109526418:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("slice")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "slice")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -1354795244:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("concat")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "concat")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 109407362:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("shift")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "shift")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 3059573:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("copy")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "copy")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 1099846370:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("reverse")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "reverse")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 1943291465:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("indexOf")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "indexOf")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -934610812:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("remove")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "remove")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -1183792455:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("insert")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "insert")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 3452698:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("push")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "push")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 1182533742:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("iterator")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "iterator")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 111185:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("pop")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "pop")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 3267882:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("join")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "join")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -467511597:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("lastIndexOf")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "lastIndexOf")) );
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		{
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
			if (( field != null )) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
				switch (field.hashCode())
				{
					case -277637751:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("unshift")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.unshift(((T) (dynargs[0]) ));
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -1106363674:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("length")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.length();
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -1776922004:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("toString")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.toString();
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 102230:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("get")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.get(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -895859076:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("splice")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.splice(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((int) (haxe.lang.Runtime.toInt(dynargs[1])) ));
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 113762:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("set")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.set(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((T) (dynargs[1]) ));
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 109526418:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("slice")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.slice(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) ));
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -1182381922:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("toArray")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.toArray();
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 109407362:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("shift")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.shift();
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -1354795244:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("concat")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.concat(((connect.util.Collection<T>) (dynargs[0]) ));
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 1099846370:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("reverse")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							this.reverse();
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 3059573:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("copy")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.copy();
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -934610812:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("remove")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.remove(((T) (dynargs[0]) ));
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 1943291465:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("indexOf")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.indexOf(((T) (dynargs[0]) ), ( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) ));
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 3452698:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("push")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.push(((T) (dynargs[0]) ));
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -1183792455:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("insert")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							this.insert(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((T) (dynargs[1]) ));
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 111185:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("pop")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.pop();
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 1182533742:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("iterator")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.iterator();
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case -467511597:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("lastIndexOf")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.lastIndexOf(((T) (dynargs[0]) ), ( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) ));
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
					case 3267882:
					{
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						if (field.equals("join")) 
						{
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							__temp_executeDef1 = false;
							//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
							return this.join(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		baseArr.push("_array");
		//line 13 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/util/Collection.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


