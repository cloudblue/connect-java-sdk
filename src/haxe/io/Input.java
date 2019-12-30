// Generated by Haxe 4.0.5
package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Input extends haxe.lang.HxObject
{
	public Input(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Input()
	{
		//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
		haxe.io.Input.__hx_ctor_haxe_io_Input(this);
	}
	
	
	protected static void __hx_ctor_haxe_io_Input(haxe.io.Input __hx_this)
	{
	}
	
	
	public boolean bigEndian;
	
	public java.nio.ByteBuffer helper;
	
	public int readByte()
	{
		//line 53 "/home/travis/haxe/std/haxe/io/Input.hx"
		throw haxe.lang.HaxeException.wrap("Not implemented");
	}
	
	
	public int readBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 64 "/home/travis/haxe/std/haxe/io/Input.hx"
		try 
		{
			//line 65 "/home/travis/haxe/std/haxe/io/Input.hx"
			int k = len;
			//line 66 "/home/travis/haxe/std/haxe/io/Input.hx"
			byte[] b = s.b;
			//line 67 "/home/travis/haxe/std/haxe/io/Input.hx"
			if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > s.length ) )) 
			{
				//line 68 "/home/travis/haxe/std/haxe/io/Input.hx"
				throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
			}
			
			//line 70 "/home/travis/haxe/std/haxe/io/Input.hx"
			try 
			{
				//line 70 "/home/travis/haxe/std/haxe/io/Input.hx"
				while (( k > 0 ))
				{
					//line 78 "/home/travis/haxe/std/haxe/io/Input.hx"
					b[pos] = ((byte) (this.readByte()) );
					//line 80 "/home/travis/haxe/std/haxe/io/Input.hx"
					 ++ pos;
					//line 81 "/home/travis/haxe/std/haxe/io/Input.hx"
					 -- k;
				}
				
			}
			catch (java.lang.Throwable catchallException)
			{
				//line 69 "/home/travis/haxe/std/haxe/io/Input.hx"
				haxe.lang.Exceptions.setException(catchallException);
				//line 83 "/home/travis/haxe/std/haxe/io/Input.hx"
				java.lang.Object realException = ( (haxe.root.Std.is(catchallException, haxe.lang.HaxeException.class)) ? (((haxe.lang.HaxeException) (catchallException) ).obj) : (catchallException) );
				//line 83 "/home/travis/haxe/std/haxe/io/Input.hx"
				if (( realException instanceof haxe.io.Eof )) 
				{
					//line 83 "/home/travis/haxe/std/haxe/io/Input.hx"
					haxe.io.Eof eof = ((haxe.io.Eof) (realException) );
				}
				else
				{
					//line 83 "/home/travis/haxe/std/haxe/io/Input.hx"
					throw catchallException;
				}
				
			}
			
			
			//line 84 "/home/travis/haxe/std/haxe/io/Input.hx"
			return ( len - k );
		}
		catch (java.lang.Throwable typedException)
		{
			//line 64 "/home/travis/haxe/std/haxe/io/Input.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	public void close()
	{
	}
	
	
	public boolean set_bigEndian(boolean b)
	{
		//line 95 "/home/travis/haxe/std/haxe/io/Input.hx"
		this.bigEndian = b;
		//line 96 "/home/travis/haxe/std/haxe/io/Input.hx"
		return b;
	}
	
	
	public haxe.io.Bytes readAll(java.lang.Object bufsize)
	{
		//line 106 "/home/travis/haxe/std/haxe/io/Input.hx"
		try 
		{
			//line 107 "/home/travis/haxe/std/haxe/io/Input.hx"
			if (haxe.lang.Runtime.eq(bufsize, null)) 
			{
				//line 111 "/home/travis/haxe/std/haxe/io/Input.hx"
				bufsize = 16384;
			}
			
			//line 114 "/home/travis/haxe/std/haxe/io/Input.hx"
			haxe.io.Bytes buf = haxe.io.Bytes.alloc(((int) (haxe.lang.Runtime.toInt(bufsize)) ));
			//line 115 "/home/travis/haxe/std/haxe/io/Input.hx"
			haxe.io.BytesBuffer total = new haxe.io.BytesBuffer();
			//line 117 "/home/travis/haxe/std/haxe/io/Input.hx"
			try 
			{
				//line 117 "/home/travis/haxe/std/haxe/io/Input.hx"
				while (true)
				{
					//line 118 "/home/travis/haxe/std/haxe/io/Input.hx"
					int len = this.readBytes(buf, 0, ((int) (haxe.lang.Runtime.toInt(bufsize)) ));
					//line 119 "/home/travis/haxe/std/haxe/io/Input.hx"
					if (( len == 0 )) 
					{
						//line 120 "/home/travis/haxe/std/haxe/io/Input.hx"
						throw haxe.lang.HaxeException.wrap(haxe.io.Error.Blocked);
					}
					
					//line 121 "/home/travis/haxe/std/haxe/io/Input.hx"
					{
						//line 121 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (( ( len < 0 ) || ( len > buf.length ) )) 
						{
							//line 121 "/home/travis/haxe/std/haxe/io/Input.hx"
							throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
						}
						
						//line 121 "/home/travis/haxe/std/haxe/io/Input.hx"
						total.b.write(((byte[]) (buf.b) ), ((int) (0) ), ((int) (len) ));
					}
					
				}
				
			}
			catch (java.lang.Throwable catchallException)
			{
				//line 116 "/home/travis/haxe/std/haxe/io/Input.hx"
				haxe.lang.Exceptions.setException(catchallException);
				//line 123 "/home/travis/haxe/std/haxe/io/Input.hx"
				java.lang.Object realException = ( (haxe.root.Std.is(catchallException, haxe.lang.HaxeException.class)) ? (((haxe.lang.HaxeException) (catchallException) ).obj) : (catchallException) );
				//line 123 "/home/travis/haxe/std/haxe/io/Input.hx"
				if (( realException instanceof haxe.io.Eof )) 
				{
					//line 123 "/home/travis/haxe/std/haxe/io/Input.hx"
					haxe.io.Eof e = ((haxe.io.Eof) (realException) );
				}
				else
				{
					//line 123 "/home/travis/haxe/std/haxe/io/Input.hx"
					throw catchallException;
				}
				
			}
			
			
			//line 124 "/home/travis/haxe/std/haxe/io/Input.hx"
			return total.getBytes();
		}
		catch (java.lang.Throwable typedException)
		{
			//line 106 "/home/travis/haxe/std/haxe/io/Input.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	public void readFullBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 133 "/home/travis/haxe/std/haxe/io/Input.hx"
		while (( len > 0 ))
		{
			//line 134 "/home/travis/haxe/std/haxe/io/Input.hx"
			int k = this.readBytes(s, pos, len);
			//line 135 "/home/travis/haxe/std/haxe/io/Input.hx"
			if (( k == 0 )) 
			{
				//line 136 "/home/travis/haxe/std/haxe/io/Input.hx"
				throw haxe.lang.HaxeException.wrap(haxe.io.Error.Blocked);
			}
			
			//line 137 "/home/travis/haxe/std/haxe/io/Input.hx"
			pos += k;
			//line 138 "/home/travis/haxe/std/haxe/io/Input.hx"
			len -= k;
		}
		
	}
	
	
	public haxe.io.Bytes read(int nbytes)
	{
		//line 146 "/home/travis/haxe/std/haxe/io/Input.hx"
		haxe.io.Bytes s = haxe.io.Bytes.alloc(nbytes);
		//line 147 "/home/travis/haxe/std/haxe/io/Input.hx"
		int p = 0;
		//line 148 "/home/travis/haxe/std/haxe/io/Input.hx"
		while (( nbytes > 0 ))
		{
			//line 149 "/home/travis/haxe/std/haxe/io/Input.hx"
			int k = this.readBytes(s, p, nbytes);
			//line 150 "/home/travis/haxe/std/haxe/io/Input.hx"
			if (( k == 0 )) 
			{
				//line 151 "/home/travis/haxe/std/haxe/io/Input.hx"
				throw haxe.lang.HaxeException.wrap(haxe.io.Error.Blocked);
			}
			
			//line 152 "/home/travis/haxe/std/haxe/io/Input.hx"
			p += k;
			//line 153 "/home/travis/haxe/std/haxe/io/Input.hx"
			nbytes -= k;
		}
		
		//line 155 "/home/travis/haxe/std/haxe/io/Input.hx"
		return s;
	}
	
	
	public java.lang.String readUntil(int end)
	{
		//line 163 "/home/travis/haxe/std/haxe/io/Input.hx"
		try 
		{
			//line 164 "/home/travis/haxe/std/haxe/io/Input.hx"
			haxe.io.BytesBuffer buf = new haxe.io.BytesBuffer();
			//line 165 "/home/travis/haxe/std/haxe/io/Input.hx"
			int last = 0;
			//line 166 "/home/travis/haxe/std/haxe/io/Input.hx"
			while (true)
			{
				//line 166 "/home/travis/haxe/std/haxe/io/Input.hx"
				last = this.readByte();
				//line 166 "/home/travis/haxe/std/haxe/io/Input.hx"
				if ( ! ((( last != end ))) ) 
				{
					//line 166 "/home/travis/haxe/std/haxe/io/Input.hx"
					break;
				}
				
				//line 167 "/home/travis/haxe/std/haxe/io/Input.hx"
				buf.b.write(((int) (last) ));
			}
			
			//line 168 "/home/travis/haxe/std/haxe/io/Input.hx"
			return buf.getBytes().toString();
		}
		catch (java.lang.Throwable typedException)
		{
			//line 163 "/home/travis/haxe/std/haxe/io/Input.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	public java.lang.String readLine()
	{
		//line 176 "/home/travis/haxe/std/haxe/io/Input.hx"
		try 
		{
			//line 177 "/home/travis/haxe/std/haxe/io/Input.hx"
			haxe.io.BytesBuffer buf = new haxe.io.BytesBuffer();
			//line 178 "/home/travis/haxe/std/haxe/io/Input.hx"
			int last = 0;
			//line 179 "/home/travis/haxe/std/haxe/io/Input.hx"
			java.lang.String s = null;
			//line 180 "/home/travis/haxe/std/haxe/io/Input.hx"
			try 
			{
				//line 181 "/home/travis/haxe/std/haxe/io/Input.hx"
				while (true)
				{
					//line 181 "/home/travis/haxe/std/haxe/io/Input.hx"
					last = this.readByte();
					//line 181 "/home/travis/haxe/std/haxe/io/Input.hx"
					if ( ! ((( last != 10 ))) ) 
					{
						//line 181 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					//line 182 "/home/travis/haxe/std/haxe/io/Input.hx"
					buf.b.write(((int) (last) ));
				}
				
				//line 183 "/home/travis/haxe/std/haxe/io/Input.hx"
				s = buf.getBytes().toString();
				//line 184 "/home/travis/haxe/std/haxe/io/Input.hx"
				if (haxe.lang.Runtime.eq(haxe.lang.StringExt.charCodeAt(s, ( s.length() - 1 )), 13)) 
				{
					//line 185 "/home/travis/haxe/std/haxe/io/Input.hx"
					s = haxe.lang.StringExt.substr(s, 0, -1);
				}
				
			}
			catch (java.lang.Throwable catchallException)
			{
				//line 180 "/home/travis/haxe/std/haxe/io/Input.hx"
				haxe.lang.Exceptions.setException(catchallException);
				//line 186 "/home/travis/haxe/std/haxe/io/Input.hx"
				java.lang.Object realException = ( (haxe.root.Std.is(catchallException, haxe.lang.HaxeException.class)) ? (((haxe.lang.HaxeException) (catchallException) ).obj) : (catchallException) );
				//line 186 "/home/travis/haxe/std/haxe/io/Input.hx"
				if (( realException instanceof haxe.io.Eof )) 
				{
					//line 186 "/home/travis/haxe/std/haxe/io/Input.hx"
					haxe.io.Eof e = ((haxe.io.Eof) (realException) );
					//line 186 "/home/travis/haxe/std/haxe/io/Input.hx"
					{
						//line 187 "/home/travis/haxe/std/haxe/io/Input.hx"
						s = buf.getBytes().toString();
						//line 188 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (( s.length() == 0 )) 
						{
							//line 189 "/home/travis/haxe/std/haxe/io/Input.hx"
							throw haxe.lang.HaxeException.wrap(e);
						}
						
					}
					
				}
				else
				{
					//line 186 "/home/travis/haxe/std/haxe/io/Input.hx"
					throw catchallException;
				}
				
			}
			
			
			//line 191 "/home/travis/haxe/std/haxe/io/Input.hx"
			return s;
		}
		catch (java.lang.Throwable typedException)
		{
			//line 176 "/home/travis/haxe/std/haxe/io/Input.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	public double readFloat()
	{
		//line 200 "/home/travis/haxe/std/haxe/io/Input.hx"
		return haxe.io.FPHelper.i32ToFloat(this.readInt32());
	}
	
	
	public double readDouble()
	{
		//line 209 "/home/travis/haxe/std/haxe/io/Input.hx"
		int i1 = this.readInt32();
		//line 210 "/home/travis/haxe/std/haxe/io/Input.hx"
		int i2 = this.readInt32();
		//line 211 "/home/travis/haxe/std/haxe/io/Input.hx"
		if (this.bigEndian) 
		{
			//line 211 "/home/travis/haxe/std/haxe/io/Input.hx"
			return haxe.io.FPHelper.i64ToDouble(i2, i1);
		}
		else
		{
			//line 211 "/home/travis/haxe/std/haxe/io/Input.hx"
			return haxe.io.FPHelper.i64ToDouble(i1, i2);
		}
		
	}
	
	
	public int readInt8()
	{
		//line 218 "/home/travis/haxe/std/haxe/io/Input.hx"
		int n = this.readByte();
		//line 219 "/home/travis/haxe/std/haxe/io/Input.hx"
		if (( n >= 128 )) 
		{
			//line 220 "/home/travis/haxe/std/haxe/io/Input.hx"
			return ( n - 256 );
		}
		
		//line 221 "/home/travis/haxe/std/haxe/io/Input.hx"
		return n;
	}
	
	
	public int readInt16()
	{
		//line 230 "/home/travis/haxe/std/haxe/io/Input.hx"
		int ch1 = this.readByte();
		//line 231 "/home/travis/haxe/std/haxe/io/Input.hx"
		int ch2 = this.readByte();
		//line 232 "/home/travis/haxe/std/haxe/io/Input.hx"
		int n = ( (this.bigEndian) ? (( ch2 | ( ch1 << 8 ) )) : (( ch1 | ( ch2 << 8 ) )) );
		//line 233 "/home/travis/haxe/std/haxe/io/Input.hx"
		if (( (( n & 32768 )) != 0 )) 
		{
			//line 234 "/home/travis/haxe/std/haxe/io/Input.hx"
			return ( n - 65536 );
		}
		
		//line 235 "/home/travis/haxe/std/haxe/io/Input.hx"
		return n;
	}
	
	
	public int readUInt16()
	{
		//line 244 "/home/travis/haxe/std/haxe/io/Input.hx"
		int ch1 = this.readByte();
		//line 245 "/home/travis/haxe/std/haxe/io/Input.hx"
		int ch2 = this.readByte();
		//line 246 "/home/travis/haxe/std/haxe/io/Input.hx"
		if (this.bigEndian) 
		{
			//line 246 "/home/travis/haxe/std/haxe/io/Input.hx"
			return ( ch2 | ( ch1 << 8 ) );
		}
		else
		{
			//line 246 "/home/travis/haxe/std/haxe/io/Input.hx"
			return ( ch1 | ( ch2 << 8 ) );
		}
		
	}
	
	
	public int readInt24()
	{
		//line 255 "/home/travis/haxe/std/haxe/io/Input.hx"
		int ch1 = this.readByte();
		//line 256 "/home/travis/haxe/std/haxe/io/Input.hx"
		int ch2 = this.readByte();
		//line 257 "/home/travis/haxe/std/haxe/io/Input.hx"
		int ch3 = this.readByte();
		//line 258 "/home/travis/haxe/std/haxe/io/Input.hx"
		int n = ( (this.bigEndian) ? (( ( ch3 | ( ch2 << 8 ) ) | ( ch1 << 16 ) )) : (( ( ch1 | ( ch2 << 8 ) ) | ( ch3 << 16 ) )) );
		//line 259 "/home/travis/haxe/std/haxe/io/Input.hx"
		if (( (( n & 8388608 )) != 0 )) 
		{
			//line 260 "/home/travis/haxe/std/haxe/io/Input.hx"
			return ( n - 16777216 );
		}
		
		//line 261 "/home/travis/haxe/std/haxe/io/Input.hx"
		return n;
	}
	
	
	public int readUInt24()
	{
		//line 270 "/home/travis/haxe/std/haxe/io/Input.hx"
		int ch1 = this.readByte();
		//line 271 "/home/travis/haxe/std/haxe/io/Input.hx"
		int ch2 = this.readByte();
		//line 272 "/home/travis/haxe/std/haxe/io/Input.hx"
		int ch3 = this.readByte();
		//line 273 "/home/travis/haxe/std/haxe/io/Input.hx"
		if (this.bigEndian) 
		{
			//line 273 "/home/travis/haxe/std/haxe/io/Input.hx"
			return ( ( ch3 | ( ch2 << 8 ) ) | ( ch1 << 16 ) );
		}
		else
		{
			//line 273 "/home/travis/haxe/std/haxe/io/Input.hx"
			return ( ( ch1 | ( ch2 << 8 ) ) | ( ch3 << 16 ) );
		}
		
	}
	
	
	public int readInt32()
	{
		//line 282 "/home/travis/haxe/std/haxe/io/Input.hx"
		int ch1 = this.readByte();
		//line 283 "/home/travis/haxe/std/haxe/io/Input.hx"
		int ch2 = this.readByte();
		//line 284 "/home/travis/haxe/std/haxe/io/Input.hx"
		int ch3 = this.readByte();
		//line 285 "/home/travis/haxe/std/haxe/io/Input.hx"
		int ch4 = this.readByte();
		//line 297 "/home/travis/haxe/std/haxe/io/Input.hx"
		if (this.bigEndian) 
		{
			//line 297 "/home/travis/haxe/std/haxe/io/Input.hx"
			return ( ( ( ch4 | ( ch3 << 8 ) ) | ( ch2 << 16 ) ) | ( ch1 << 24 ) );
		}
		else
		{
			//line 297 "/home/travis/haxe/std/haxe/io/Input.hx"
			return ( ( ( ch1 | ( ch2 << 8 ) ) | ( ch3 << 16 ) ) | ( ch4 << 24 ) );
		}
		
	}
	
	
	public java.lang.String readString(int len, haxe.io.Encoding encoding)
	{
		//line 305 "/home/travis/haxe/std/haxe/io/Input.hx"
		haxe.io.Bytes b = haxe.io.Bytes.alloc(len);
		//line 306 "/home/travis/haxe/std/haxe/io/Input.hx"
		this.readFullBytes(b, 0, len);
		//line 310 "/home/travis/haxe/std/haxe/io/Input.hx"
		return b.getString(0, len, encoding);
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
		{
			//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
			boolean __temp_executeDef1 = true;
			//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
			if (( field != null )) 
			{
				//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
				switch (field.hashCode())
				{
					case -1220931666:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("helper")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							this.helper = ((java.nio.ByteBuffer) (value) );
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return value;
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case 573260987:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("bigEndian")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							if (handleProperties) 
							{
								//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
								this.set_bigEndian(haxe.lang.Runtime.toBool(((java.lang.Boolean) (value) )));
								//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
								return value;
							}
							else
							{
								//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
								this.bigEndian = haxe.lang.Runtime.toBool(((java.lang.Boolean) (value) ));
								//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
								return value;
							}
							
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
			if (__temp_executeDef1) 
			{
				//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
		{
			//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
			boolean __temp_executeDef1 = true;
			//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
			if (( field != null )) 
			{
				//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
				switch (field.hashCode())
				{
					case -500196025:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readString")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readString")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case 573260987:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("bigEndian")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.bigEndian;
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -1133927784:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readInt32")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readInt32")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -1220931666:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("helper")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.helper;
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -482759630:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readUInt24")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readUInt24")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -868060226:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readByte")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readByte")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -1133927813:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readInt24")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readInt24")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -1140063115:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readBytes")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readBytes")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -482759659:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readUInt16")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readUInt16")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case 94756344:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("close")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "close")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -1133927842:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readInt16")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readInt16")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case 1862232350:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("set_bigEndian")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_bigEndian")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -867862305:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readInt8")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readInt8")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case 1080375339:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readAll")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readAll")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -934168313:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readDouble")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readDouble")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case 682499622:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readFullBytes")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readFullBytes")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -1136761242:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readFloat")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readFloat")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case 3496342:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("read")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "read")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -867777878:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readLine")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readLine")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -1122843800:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readUntil")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readUntil")) );
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
			if (__temp_executeDef1) 
			{
				//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
		{
			//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
			boolean __temp_executeDef1 = true;
			//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
			if (( field != null )) 
			{
				//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
				switch (field.hashCode())
				{
					case -500196025:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readString")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.readString(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ), ((haxe.io.Encoding) (( (( dynargs.length > 1 )) ? (dynargs[1]) : (null) )) ));
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -868060226:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readByte")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.readByte();
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -1133927784:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readInt32")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.readInt32();
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -1140063115:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readBytes")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.readBytes(((haxe.io.Bytes) (dynargs[0]) ), ((int) (haxe.lang.Runtime.toInt(dynargs[1])) ), ((int) (haxe.lang.Runtime.toInt(dynargs[2])) ));
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -482759630:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readUInt24")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.readUInt24();
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case 94756344:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("close")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							this.close();
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -1133927813:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readInt24")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.readInt24();
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case 1862232350:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("set_bigEndian")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.set_bigEndian(haxe.lang.Runtime.toBool(((java.lang.Boolean) (dynargs[0]) )));
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -482759659:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readUInt16")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.readUInt16();
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case 1080375339:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readAll")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.readAll(( (( dynargs.length > 0 )) ? (dynargs[0]) : (null) ));
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -1133927842:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readInt16")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.readInt16();
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case 682499622:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readFullBytes")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							this.readFullBytes(((haxe.io.Bytes) (dynargs[0]) ), ((int) (haxe.lang.Runtime.toInt(dynargs[1])) ), ((int) (haxe.lang.Runtime.toInt(dynargs[2])) ));
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -867862305:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readInt8")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.readInt8();
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case 3496342:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("read")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.read(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -934168313:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readDouble")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.readDouble();
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -1122843800:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readUntil")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.readUntil(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -1136761242:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readFloat")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.readFloat();
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
					case -867777878:
					{
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						if (field.equals("readLine")) 
						{
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							__temp_executeDef1 = false;
							//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
							return this.readLine();
						}
						
						//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
			if (__temp_executeDef1) 
			{
				//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
		baseArr.push("helper");
		//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
		baseArr.push("bigEndian");
		//line 32 "/home/travis/haxe/std/haxe/io/Input.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


