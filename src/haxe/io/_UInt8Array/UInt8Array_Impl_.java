// Generated by Haxe 4.0.5
package haxe.io._UInt8Array;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class UInt8Array_Impl_
{
	static
	{
		//line 28 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		haxe.io._UInt8Array.UInt8Array_Impl_.BYTES_PER_ELEMENT = 1;
	}
	
	public static int BYTES_PER_ELEMENT;
	
	
	
	
	
	public static haxe.io.ArrayBufferViewImpl _new(int elements)
	{
		//line 34 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		haxe.io.ArrayBufferViewImpl this1 = new haxe.io.ArrayBufferViewImpl(haxe.io.Bytes.alloc(elements), 0, elements);
		//line 33 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		haxe.io.ArrayBufferViewImpl this2 = ((haxe.io.ArrayBufferViewImpl) (this1) );
		//line 33 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		return ((haxe.io.ArrayBufferViewImpl) (this2) );
	}
	
	
	public static int get_length(haxe.io.ArrayBufferViewImpl this1)
	{
		//line 38 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		return this1.byteLength;
	}
	
	
	public static haxe.io.ArrayBufferViewImpl get_view(haxe.io.ArrayBufferViewImpl this1)
	{
		//line 42 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		return ((haxe.io.ArrayBufferViewImpl) (this1) );
	}
	
	
	public static int get(haxe.io.ArrayBufferViewImpl this1, int index)
	{
		//line 46 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		return ( this1.bytes.b[( index + this1.byteOffset )] & 255 );
	}
	
	
	public static int set(haxe.io.ArrayBufferViewImpl this1, int index, int value)
	{
		//line 50 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		if (( ( index >= 0 ) && ( index < ((haxe.io.ArrayBufferViewImpl) (this1) ).byteLength ) )) 
		{
			//line 51 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
			this1.bytes.b[( index + this1.byteOffset )] = ((byte) (value) );
			//line 52 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
			return value;
		}
		
		//line 54 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		return 0;
	}
	
	
	public static haxe.io.ArrayBufferViewImpl sub(haxe.io.ArrayBufferViewImpl this1, int begin, java.lang.Object length)
	{
		//line 58 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		return haxe.io._UInt8Array.UInt8Array_Impl_.fromData(this1.sub(begin, length));
	}
	
	
	public static haxe.io.ArrayBufferViewImpl subarray(haxe.io.ArrayBufferViewImpl this1, java.lang.Object begin, java.lang.Object end)
	{
		//line 62 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		return haxe.io._UInt8Array.UInt8Array_Impl_.fromData(this1.subarray(begin, end));
	}
	
	
	public static haxe.io.ArrayBufferViewImpl getData(haxe.io.ArrayBufferViewImpl this1)
	{
		//line 66 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		return this1;
	}
	
	
	public static haxe.io.ArrayBufferViewImpl fromData(haxe.io.ArrayBufferViewImpl d)
	{
		//line 70 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		return ((haxe.io.ArrayBufferViewImpl) (d) );
	}
	
	
	public static haxe.io.ArrayBufferViewImpl fromArray(haxe.root.Array<java.lang.Object> a, java.lang.Object pos, java.lang.Object length)
	{
		//line 73 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		int pos1 = ( (haxe.lang.Runtime.eq(pos, null)) ? (0) : (((int) (haxe.lang.Runtime.toInt(pos)) )) );
		//line 74 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		if (haxe.lang.Runtime.eq(length, null)) 
		{
			//line 75 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
			length = ( a.length - pos1 );
		}
		
		//line 76 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		if (( ( ( pos1 < 0 ) || ( ((int) (haxe.lang.Runtime.toInt(length)) ) < 0 ) ) || ( ((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.plus(pos1, length))) ) > a.length ) )) 
		{
			//line 77 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		//line 78 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		int elements = a.length;
		//line 78 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		haxe.io.ArrayBufferViewImpl this1 = new haxe.io.ArrayBufferViewImpl(haxe.io.Bytes.alloc(elements), 0, elements);
		//line 78 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		haxe.io.ArrayBufferViewImpl this2 = ((haxe.io.ArrayBufferViewImpl) (this1) );
		//line 78 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		haxe.io.ArrayBufferViewImpl i = ((haxe.io.ArrayBufferViewImpl) (this2) );
		//line 79 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		{
			//line 79 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
			int _g = 0;
			//line 79 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
			java.lang.Object _g1 = length;
			//line 79 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
			while (( _g < ((int) (haxe.lang.Runtime.toInt(_g1)) ) ))
			{
				//line 79 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
				int idx = _g++;
				//line 80 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
				{
					//line 80 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
					int value = ((int) (haxe.lang.Runtime.toInt(a.__get(( idx + pos1 )))) );
					//line 80 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
					if (( ( idx >= 0 ) && ( idx < ((haxe.io.ArrayBufferViewImpl) (i) ).byteLength ) )) 
					{
						//line 80 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
						((haxe.io.ArrayBufferViewImpl) (i) ).bytes.b[( idx + ((haxe.io.ArrayBufferViewImpl) (i) ).byteOffset )] = ((byte) (value) );
					}
					
				}
				
			}
			
		}
		
		//line 81 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		return i;
	}
	
	
	public static haxe.io.ArrayBufferViewImpl fromBytes(haxe.io.Bytes bytes, java.lang.Object bytePos, java.lang.Object length)
	{
		//line 85 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		int bytePos1 = ( (haxe.lang.Runtime.eq(bytePos, null)) ? (0) : (((int) (haxe.lang.Runtime.toInt(bytePos)) )) );
		//line 85 "/home/travis/haxe/std/haxe/io/UInt8Array.hx"
		return haxe.io._UInt8Array.UInt8Array_Impl_.fromData(((haxe.io.ArrayBufferViewImpl) (haxe.io._ArrayBufferView.ArrayBufferView_Impl_.fromBytes(bytes, bytePos1, length)) ));
	}
	
	
}


