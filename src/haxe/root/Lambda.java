// Generated by Haxe 4.0.5
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Lambda extends haxe.lang.HxObject
{
	public Lambda(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Lambda()
	{
		//line 39 "/home/travis/haxe/std/Lambda.hx"
		haxe.root.Lambda.__hx_ctor__Lambda(this);
	}
	
	
	protected static void __hx_ctor__Lambda(haxe.root.Lambda __hx_this)
	{
	}
	
	
	public static <A> haxe.root.Array<A> array(java.lang.Object it)
	{
		//line 46 "/home/travis/haxe/std/Lambda.hx"
		haxe.root.Array<A> a = new haxe.root.Array<A>();
		//line 47 "/home/travis/haxe/std/Lambda.hx"
		{
			//line 47 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object i = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 47 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(i, "hasNext", null)) )))
			{
				//line 47 "/home/travis/haxe/std/Lambda.hx"
				A i1 = ((A) (haxe.lang.Runtime.callField(i, "next", null)) );
				//line 48 "/home/travis/haxe/std/Lambda.hx"
				a.push(i1);
			}
			
		}
		
		//line 49 "/home/travis/haxe/std/Lambda.hx"
		return a;
	}
	
	
	public static <A> haxe.ds.List<A> list(java.lang.Object it)
	{
		//line 58 "/home/travis/haxe/std/Lambda.hx"
		haxe.ds.List<A> l = new haxe.ds.List<A>();
		//line 59 "/home/travis/haxe/std/Lambda.hx"
		{
			//line 59 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object i = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 59 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(i, "hasNext", null)) )))
			{
				//line 59 "/home/travis/haxe/std/Lambda.hx"
				A i1 = ((A) (haxe.lang.Runtime.callField(i, "next", null)) );
				//line 60 "/home/travis/haxe/std/Lambda.hx"
				l.add(i1);
			}
			
		}
		
		//line 61 "/home/travis/haxe/std/Lambda.hx"
		return l;
	}
	
	
	public static <A, B> haxe.root.Array<B> map(java.lang.Object it, haxe.lang.Function f)
	{
		//line 70 "/home/travis/haxe/std/Lambda.hx"
		haxe.root.Array<B> _g = new haxe.root.Array<B>(( (B[]) (new java.lang.Object[] {}) ));
		//line 70 "/home/travis/haxe/std/Lambda.hx"
		{
			//line 70 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object x = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 70 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(x, "hasNext", null)) )))
			{
				//line 70 "/home/travis/haxe/std/Lambda.hx"
				A x1 = ((A) (haxe.lang.Runtime.callField(x, "next", null)) );
				//line 70 "/home/travis/haxe/std/Lambda.hx"
				_g.push(((B) (f.__hx_invoke1_o(0.0, x1)) ));
			}
			
		}
		
		//line 70 "/home/travis/haxe/std/Lambda.hx"
		return _g;
	}
	
	
	public static <A, B> haxe.root.Array<B> mapi(java.lang.Object it, haxe.lang.Function f)
	{
		//line 79 "/home/travis/haxe/std/Lambda.hx"
		int i = 0;
		//line 80 "/home/travis/haxe/std/Lambda.hx"
		haxe.root.Array<B> _g = new haxe.root.Array<B>(( (B[]) (new java.lang.Object[] {}) ));
		//line 80 "/home/travis/haxe/std/Lambda.hx"
		{
			//line 80 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object x = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 80 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(x, "hasNext", null)) )))
			{
				//line 80 "/home/travis/haxe/std/Lambda.hx"
				A x1 = ((A) (haxe.lang.Runtime.callField(x, "next", null)) );
				//line 80 "/home/travis/haxe/std/Lambda.hx"
				_g.push(((B) (f.__hx_invoke2_o(((double) (i++) ), haxe.lang.Runtime.undefined, 0.0, x1)) ));
			}
			
		}
		
		//line 80 "/home/travis/haxe/std/Lambda.hx"
		return _g;
	}
	
	
	public static <A> haxe.root.Array<A> flatten(java.lang.Object it)
	{
		//line 88 "/home/travis/haxe/std/Lambda.hx"
		haxe.root.Array<A> _g = new haxe.root.Array<A>(( (A[]) (new java.lang.Object[] {}) ));
		//line 88 "/home/travis/haxe/std/Lambda.hx"
		{
			//line 88 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object e = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 88 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(e, "hasNext", null)) )))
			{
				//line 88 "/home/travis/haxe/std/Lambda.hx"
				java.lang.Object e1 = ((java.lang.Object) (haxe.lang.Runtime.callField(e, "next", null)) );
				//line 88 "/home/travis/haxe/std/Lambda.hx"
				{
					//line 88 "/home/travis/haxe/std/Lambda.hx"
					java.lang.Object x = ((java.lang.Object) (haxe.lang.Runtime.callField(e1, "iterator", null)) );
					//line 88 "/home/travis/haxe/std/Lambda.hx"
					while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(x, "hasNext", null)) )))
					{
						//line 88 "/home/travis/haxe/std/Lambda.hx"
						A x1 = ((A) (haxe.lang.Runtime.callField(x, "next", null)) );
						//line 88 "/home/travis/haxe/std/Lambda.hx"
						_g.push(x1);
					}
					
				}
				
			}
			
		}
		
		//line 88 "/home/travis/haxe/std/Lambda.hx"
		return _g;
	}
	
	
	public static <A, B> haxe.root.Array<B> flatMap(java.lang.Object it, haxe.lang.Function f)
	{
		//line 97 "/home/travis/haxe/std/Lambda.hx"
		haxe.root.Array<java.lang.Object> _g = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{});
		//line 97 "/home/travis/haxe/std/Lambda.hx"
		{
			//line 97 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object x = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 97 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(x, "hasNext", null)) )))
			{
				//line 97 "/home/travis/haxe/std/Lambda.hx"
				A x1 = ((A) (haxe.lang.Runtime.callField(x, "next", null)) );
				//line 97 "/home/travis/haxe/std/Lambda.hx"
				_g.push(((java.lang.Object) (f.__hx_invoke1_o(0.0, x1)) ));
			}
			
		}
		
		//line 97 "/home/travis/haxe/std/Lambda.hx"
		haxe.root.Array<B> _g1 = new haxe.root.Array<B>(( (B[]) (new java.lang.Object[] {}) ));
		//line 97 "/home/travis/haxe/std/Lambda.hx"
		{
			//line 97 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object e = ((java.lang.Object) (haxe.lang.Runtime.callField(((java.lang.Object) (_g) ), "iterator", null)) );
			//line 97 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(e, "hasNext", null)) )))
			{
				//line 97 "/home/travis/haxe/std/Lambda.hx"
				java.lang.Object e1 = ((java.lang.Object) (haxe.lang.Runtime.callField(e, "next", null)) );
				//line 97 "/home/travis/haxe/std/Lambda.hx"
				{
					//line 97 "/home/travis/haxe/std/Lambda.hx"
					java.lang.Object x2 = ((java.lang.Object) (haxe.lang.Runtime.callField(e1, "iterator", null)) );
					//line 97 "/home/travis/haxe/std/Lambda.hx"
					while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(x2, "hasNext", null)) )))
					{
						//line 97 "/home/travis/haxe/std/Lambda.hx"
						B x3 = ((B) (haxe.lang.Runtime.callField(x2, "next", null)) );
						//line 97 "/home/travis/haxe/std/Lambda.hx"
						_g1.push(x3);
					}
					
				}
				
			}
			
		}
		
		//line 97 "/home/travis/haxe/std/Lambda.hx"
		return _g1;
	}
	
	
	public static <A> boolean has(java.lang.Object it, A elt)
	{
		//line 109 "/home/travis/haxe/std/Lambda.hx"
		{
			//line 109 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object x = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 109 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(x, "hasNext", null)) )))
			{
				//line 109 "/home/travis/haxe/std/Lambda.hx"
				A x1 = ((A) (haxe.lang.Runtime.callField(x, "next", null)) );
				//line 110 "/home/travis/haxe/std/Lambda.hx"
				if (haxe.lang.Runtime.eq(x1, elt)) 
				{
					//line 111 "/home/travis/haxe/std/Lambda.hx"
					return true;
				}
				
			}
			
		}
		
		//line 112 "/home/travis/haxe/std/Lambda.hx"
		return false;
	}
	
	
	public static <A> boolean exists(java.lang.Object it, haxe.lang.Function f)
	{
		//line 126 "/home/travis/haxe/std/Lambda.hx"
		{
			//line 126 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object x = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 126 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(x, "hasNext", null)) )))
			{
				//line 126 "/home/travis/haxe/std/Lambda.hx"
				A x1 = ((A) (haxe.lang.Runtime.callField(x, "next", null)) );
				//line 127 "/home/travis/haxe/std/Lambda.hx"
				if (haxe.lang.Runtime.toBool(((java.lang.Boolean) (f.__hx_invoke1_o(0.0, x1)) ))) 
				{
					//line 128 "/home/travis/haxe/std/Lambda.hx"
					return true;
				}
				
			}
			
		}
		
		//line 129 "/home/travis/haxe/std/Lambda.hx"
		return false;
	}
	
	
	public static <A> boolean foreach(java.lang.Object it, haxe.lang.Function f)
	{
		//line 145 "/home/travis/haxe/std/Lambda.hx"
		{
			//line 145 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object x = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 145 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(x, "hasNext", null)) )))
			{
				//line 145 "/home/travis/haxe/std/Lambda.hx"
				A x1 = ((A) (haxe.lang.Runtime.callField(x, "next", null)) );
				//line 146 "/home/travis/haxe/std/Lambda.hx"
				if ( ! (haxe.lang.Runtime.toBool(((java.lang.Boolean) (f.__hx_invoke1_o(0.0, x1)) ))) ) 
				{
					//line 147 "/home/travis/haxe/std/Lambda.hx"
					return false;
				}
				
			}
			
		}
		
		//line 148 "/home/travis/haxe/std/Lambda.hx"
		return true;
	}
	
	
	public static <A> void iter(java.lang.Object it, haxe.lang.Function f)
	{
		//line 157 "/home/travis/haxe/std/Lambda.hx"
		java.lang.Object x = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
		//line 157 "/home/travis/haxe/std/Lambda.hx"
		while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(x, "hasNext", null)) )))
		{
			//line 157 "/home/travis/haxe/std/Lambda.hx"
			A x1 = ((A) (haxe.lang.Runtime.callField(x, "next", null)) );
			//line 158 "/home/travis/haxe/std/Lambda.hx"
			f.__hx_invoke1_o(0.0, x1);
		}
		
	}
	
	
	public static <A> haxe.root.Array<A> filter(java.lang.Object it, haxe.lang.Function f)
	{
		//line 168 "/home/travis/haxe/std/Lambda.hx"
		haxe.root.Array<A> _g = new haxe.root.Array<A>(( (A[]) (new java.lang.Object[] {}) ));
		//line 168 "/home/travis/haxe/std/Lambda.hx"
		{
			//line 168 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object x = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 168 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(x, "hasNext", null)) )))
			{
				//line 168 "/home/travis/haxe/std/Lambda.hx"
				A x1 = ((A) (haxe.lang.Runtime.callField(x, "next", null)) );
				//line 168 "/home/travis/haxe/std/Lambda.hx"
				if (haxe.lang.Runtime.toBool(((java.lang.Boolean) (f.__hx_invoke1_o(0.0, x1)) ))) 
				{
					//line 168 "/home/travis/haxe/std/Lambda.hx"
					_g.push(x1);
				}
				
			}
			
		}
		
		//line 168 "/home/travis/haxe/std/Lambda.hx"
		return _g;
	}
	
	
	public static <A, B> B fold(java.lang.Object it, haxe.lang.Function f, B first)
	{
		//line 184 "/home/travis/haxe/std/Lambda.hx"
		{
			//line 184 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object x = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 184 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(x, "hasNext", null)) )))
			{
				//line 184 "/home/travis/haxe/std/Lambda.hx"
				A x1 = ((A) (haxe.lang.Runtime.callField(x, "next", null)) );
				//line 185 "/home/travis/haxe/std/Lambda.hx"
				first = ((B) (f.__hx_invoke2_o(0.0, x1, 0.0, first)) );
			}
			
		}
		
		//line 186 "/home/travis/haxe/std/Lambda.hx"
		return first;
	}
	
	
	public static <A> int count(java.lang.Object it, haxe.lang.Function pred)
	{
		//line 196 "/home/travis/haxe/std/Lambda.hx"
		int n = 0;
		//line 197 "/home/travis/haxe/std/Lambda.hx"
		if (( pred == null )) 
		{
			//line 198 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object _1 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 198 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(_1, "hasNext", null)) )))
			{
				//line 198 "/home/travis/haxe/std/Lambda.hx"
				A _2 = ((A) (haxe.lang.Runtime.callField(_1, "next", null)) );
				//line 199 "/home/travis/haxe/std/Lambda.hx"
				 ++ n;
			}
			
		}
		else
		{
			//line 201 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object x = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 201 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(x, "hasNext", null)) )))
			{
				//line 201 "/home/travis/haxe/std/Lambda.hx"
				A x1 = ((A) (haxe.lang.Runtime.callField(x, "next", null)) );
				//line 202 "/home/travis/haxe/std/Lambda.hx"
				if (haxe.lang.Runtime.toBool(((java.lang.Boolean) (((haxe.lang.Function) (pred) ).__hx_invoke1_o(0.0, x1)) ))) 
				{
					//line 203 "/home/travis/haxe/std/Lambda.hx"
					 ++ n;
				}
				
			}
			
		}
		
		//line 204 "/home/travis/haxe/std/Lambda.hx"
		return n;
	}
	
	
	public static <T> boolean empty(java.lang.Object it)
	{
		//line 211 "/home/travis/haxe/std/Lambda.hx"
		return  ! (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) ), "hasNext", null)) ))) ;
	}
	
	
	public static <T> int indexOf(java.lang.Object it, T v)
	{
		//line 222 "/home/travis/haxe/std/Lambda.hx"
		int i = 0;
		//line 223 "/home/travis/haxe/std/Lambda.hx"
		{
			//line 223 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object v2 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 223 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(v2, "hasNext", null)) )))
			{
				//line 223 "/home/travis/haxe/std/Lambda.hx"
				T v21 = ((T) (haxe.lang.Runtime.callField(v2, "next", null)) );
				//line 224 "/home/travis/haxe/std/Lambda.hx"
				if (haxe.lang.Runtime.eq(v, v21)) 
				{
					//line 225 "/home/travis/haxe/std/Lambda.hx"
					return i;
				}
				
				//line 226 "/home/travis/haxe/std/Lambda.hx"
				 ++ i;
			}
			
		}
		
		//line 228 "/home/travis/haxe/std/Lambda.hx"
		return -1;
	}
	
	
	public static <T> java.lang.Object find(java.lang.Object it, haxe.lang.Function f)
	{
		//line 242 "/home/travis/haxe/std/Lambda.hx"
		{
			//line 242 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object v = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			//line 242 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(v, "hasNext", null)) )))
			{
				//line 242 "/home/travis/haxe/std/Lambda.hx"
				T v1 = ((T) (haxe.lang.Runtime.callField(v, "next", null)) );
				//line 243 "/home/travis/haxe/std/Lambda.hx"
				if (haxe.lang.Runtime.toBool(((java.lang.Boolean) (f.__hx_invoke1_o(0.0, v1)) ))) 
				{
					//line 244 "/home/travis/haxe/std/Lambda.hx"
					return v1;
				}
				
			}
			
		}
		
		//line 246 "/home/travis/haxe/std/Lambda.hx"
		return null;
	}
	
	
	public static <T> haxe.root.Array<T> concat(java.lang.Object a, java.lang.Object b)
	{
		//line 256 "/home/travis/haxe/std/Lambda.hx"
		haxe.root.Array<T> l = new haxe.root.Array<T>();
		//line 257 "/home/travis/haxe/std/Lambda.hx"
		{
			//line 257 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object x = ((java.lang.Object) (haxe.lang.Runtime.callField(a, "iterator", null)) );
			//line 257 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(x, "hasNext", null)) )))
			{
				//line 257 "/home/travis/haxe/std/Lambda.hx"
				T x1 = ((T) (haxe.lang.Runtime.callField(x, "next", null)) );
				//line 258 "/home/travis/haxe/std/Lambda.hx"
				l.push(x1);
			}
			
		}
		
		//line 259 "/home/travis/haxe/std/Lambda.hx"
		{
			//line 259 "/home/travis/haxe/std/Lambda.hx"
			java.lang.Object x2 = ((java.lang.Object) (haxe.lang.Runtime.callField(b, "iterator", null)) );
			//line 259 "/home/travis/haxe/std/Lambda.hx"
			while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(x2, "hasNext", null)) )))
			{
				//line 259 "/home/travis/haxe/std/Lambda.hx"
				T x3 = ((T) (haxe.lang.Runtime.callField(x2, "next", null)) );
				//line 260 "/home/travis/haxe/std/Lambda.hx"
				l.push(x3);
			}
			
		}
		
		//line 261 "/home/travis/haxe/std/Lambda.hx"
		return l;
	}
	
	
}


