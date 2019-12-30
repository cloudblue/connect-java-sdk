// Generated by Haxe 4.0.5
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class EReg extends haxe.lang.HxObject
{
	public EReg(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public EReg(java.lang.String r, java.lang.String opt)
	{
		//line 33 "/home/travis/haxe/std/java/_std/EReg.hx"
		haxe.root.EReg.__hx_ctor__EReg(this, r, opt);
	}
	
	
	protected static void __hx_ctor__EReg(haxe.root.EReg __hx_this, java.lang.String r, java.lang.String opt)
	{
		//line 34 "/home/travis/haxe/std/java/_std/EReg.hx"
		int flags = 0;
		//line 35 "/home/travis/haxe/std/java/_std/EReg.hx"
		{
			//line 35 "/home/travis/haxe/std/java/_std/EReg.hx"
			int _g = 0;
			//line 35 "/home/travis/haxe/std/java/_std/EReg.hx"
			int _g1 = opt.length();
			//line 35 "/home/travis/haxe/std/java/_std/EReg.hx"
			while (( _g < _g1 ))
			{
				//line 35 "/home/travis/haxe/std/java/_std/EReg.hx"
				int i = _g++;
				//line 36 "/home/travis/haxe/std/java/_std/EReg.hx"
				switch (( (( i < opt.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (opt) )) ).charAt(i)) )) : (-1) ))
				{
					case 103:
					{
						//line 44 "/home/travis/haxe/std/java/_std/EReg.hx"
						__hx_this.isGlobal = true;
						//line 44 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 105:
					{
						//line 38 "/home/travis/haxe/std/java/_std/EReg.hx"
						flags |= java.util.regex.Pattern.CASE_INSENSITIVE;
						//line 38 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 109:
					{
						//line 40 "/home/travis/haxe/std/java/_std/EReg.hx"
						flags |= java.util.regex.Pattern.MULTILINE;
						//line 40 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 115:
					{
						//line 42 "/home/travis/haxe/std/java/_std/EReg.hx"
						flags |= java.util.regex.Pattern.DOTALL;
						//line 42 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
				}
				
			}
			
		}
		
		//line 48 "/home/travis/haxe/std/java/_std/EReg.hx"
		flags |= java.util.regex.Pattern.UNICODE_CASE;
		//line 50 "/home/travis/haxe/std/java/_std/EReg.hx"
		flags |= java.util.regex.Pattern.UNICODE_CHARACTER_CLASS;
		//line 52 "/home/travis/haxe/std/java/_std/EReg.hx"
		__hx_this.matcher = java.util.regex.Pattern.compile(haxe.lang.Runtime.toString(haxe.root.EReg.convert(r)), ((int) (flags) )).matcher(((java.lang.CharSequence) ("") ));
		//line 53 "/home/travis/haxe/std/java/_std/EReg.hx"
		__hx_this.pattern = r;
	}
	
	
	public static java.lang.String convert(java.lang.String r)
	{
		//line 81 "/home/travis/haxe/std/java/_std/EReg.hx"
		return r;
	}
	
	
	public static java.lang.String escape(java.lang.String s)
	{
		//line 175 "/home/travis/haxe/std/java/_std/EReg.hx"
		return java.util.regex.Pattern.quote(haxe.lang.Runtime.toString(s));
	}
	
	
	public java.lang.String pattern;
	
	public java.util.regex.Matcher matcher;
	
	public java.lang.String cur;
	
	public boolean isGlobal;
	
	public boolean match(java.lang.String s)
	{
		//line 85 "/home/travis/haxe/std/java/_std/EReg.hx"
		this.cur = s;
		//line 86 "/home/travis/haxe/std/java/_std/EReg.hx"
		this.matcher = this.matcher.reset(((java.lang.CharSequence) (s) ));
		//line 87 "/home/travis/haxe/std/java/_std/EReg.hx"
		return this.matcher.find();
	}
	
	
	public java.lang.String matched(int n)
	{
		//line 91 "/home/travis/haxe/std/java/_std/EReg.hx"
		if (( n == 0 )) 
		{
			//line 92 "/home/travis/haxe/std/java/_std/EReg.hx"
			return this.matcher.group();
		}
		else
		{
			//line 94 "/home/travis/haxe/std/java/_std/EReg.hx"
			return this.matcher.group(((int) (n) ));
		}
		
	}
	
	
	public java.lang.String matchedLeft()
	{
		//line 98 "/home/travis/haxe/std/java/_std/EReg.hx"
		return haxe.lang.StringExt.substring(this.cur, 0, this.matcher.start());
	}
	
	
	public java.lang.String matchedRight()
	{
		//line 102 "/home/travis/haxe/std/java/_std/EReg.hx"
		return haxe.lang.StringExt.substring(this.cur, this.matcher.end(), this.cur.length());
	}
	
	
	public java.lang.Object matchedPos()
	{
		//line 106 "/home/travis/haxe/std/java/_std/EReg.hx"
		int start = this.matcher.start();
		//line 107 "/home/travis/haxe/std/java/_std/EReg.hx"
		{
			//line 107 "/home/travis/haxe/std/java/_std/EReg.hx"
			int __temp_odecl1 = ( this.matcher.end() - start );
			//line 107 "/home/travis/haxe/std/java/_std/EReg.hx"
			return new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{"len", "pos"}, new double[]{((double) (((double) (__temp_odecl1) )) ), ((double) (((double) (start) )) )});
		}
		
	}
	
	
	public boolean matchSub(java.lang.String s, int pos, java.lang.Object len)
	{
		//line 110 "/home/travis/haxe/std/java/_std/EReg.hx"
		int len1 = ( (haxe.lang.Runtime.eq(len, null)) ? (-1) : (((int) (haxe.lang.Runtime.toInt(len)) )) );
		//line 111 "/home/travis/haxe/std/java/_std/EReg.hx"
		this.matcher = this.matcher.reset(((java.lang.CharSequence) (( (( len1 < 0 )) ? (s) : (haxe.lang.StringExt.substr(s, 0, ( pos + len1 ))) )) ));
		//line 112 "/home/travis/haxe/std/java/_std/EReg.hx"
		this.cur = s;
		//line 113 "/home/travis/haxe/std/java/_std/EReg.hx"
		return this.matcher.find(((int) (pos) ));
	}
	
	
	public haxe.root.Array<java.lang.String> split(java.lang.String s)
	{
		//line 117 "/home/travis/haxe/std/java/_std/EReg.hx"
		if (this.isGlobal) 
		{
			//line 118 "/home/travis/haxe/std/java/_std/EReg.hx"
			haxe.root.Array<java.lang.String> ret = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
			//line 119 "/home/travis/haxe/std/java/_std/EReg.hx"
			while (this.match(s))
			{
				//line 120 "/home/travis/haxe/std/java/_std/EReg.hx"
				ret.push(this.matchedLeft());
				//line 121 "/home/travis/haxe/std/java/_std/EReg.hx"
				s = this.matchedRight();
			}
			
			//line 123 "/home/travis/haxe/std/java/_std/EReg.hx"
			ret.push(s);
			//line 124 "/home/travis/haxe/std/java/_std/EReg.hx"
			return ret;
		}
		else
		{
			//line 126 "/home/travis/haxe/std/java/_std/EReg.hx"
			java.util.regex.Matcher m = this.matcher;
			//line 127 "/home/travis/haxe/std/java/_std/EReg.hx"
			m.reset(((java.lang.CharSequence) (s) ));
			//line 128 "/home/travis/haxe/std/java/_std/EReg.hx"
			if (m.find()) 
			{
				//line 129 "/home/travis/haxe/std/java/_std/EReg.hx"
				return new haxe.root.Array<java.lang.String>(new java.lang.String[]{haxe.lang.StringExt.substring(s, 0, m.start()), haxe.lang.StringExt.substring(s, m.end(), s.length())});
			}
			else
			{
				//line 131 "/home/travis/haxe/std/java/_std/EReg.hx"
				return new haxe.root.Array<java.lang.String>(new java.lang.String[]{s});
			}
			
		}
		
	}
	
	
	public final int start(int group)
	{
		//line 137 "/home/travis/haxe/std/java/_std/EReg.hx"
		return this.matcher.start(((int) (group) ));
	}
	
	
	public final int len(int group)
	{
		//line 141 "/home/travis/haxe/std/java/_std/EReg.hx"
		return ( this.matcher.end(((int) (group) )) - this.matcher.start(((int) (group) )) );
	}
	
	
	public java.lang.String replace(java.lang.String s, java.lang.String by)
	{
		//line 145 "/home/travis/haxe/std/java/_std/EReg.hx"
		this.matcher.reset(((java.lang.CharSequence) (s) ));
		//line 146 "/home/travis/haxe/std/java/_std/EReg.hx"
		by = haxe.root.StringTools.replace(haxe.root.StringTools.replace(by, "\\", "\\\\"), "$$", "\\$");
		//line 147 "/home/travis/haxe/std/java/_std/EReg.hx"
		if (this.isGlobal) 
		{
			//line 147 "/home/travis/haxe/std/java/_std/EReg.hx"
			return this.matcher.replaceAll(haxe.lang.Runtime.toString(by));
		}
		else
		{
			//line 147 "/home/travis/haxe/std/java/_std/EReg.hx"
			return this.matcher.replaceFirst(haxe.lang.Runtime.toString(by));
		}
		
	}
	
	
	public java.lang.String map(java.lang.String s, haxe.lang.Function f)
	{
		//line 151 "/home/travis/haxe/std/java/_std/EReg.hx"
		int offset = 0;
		//line 152 "/home/travis/haxe/std/java/_std/EReg.hx"
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		//line 153 "/home/travis/haxe/std/java/_std/EReg.hx"
		while (true)
		{
			//line 154 "/home/travis/haxe/std/java/_std/EReg.hx"
			if (( offset >= s.length() )) 
			{
				//line 155 "/home/travis/haxe/std/java/_std/EReg.hx"
				break;
			}
			else
			{
				//line 156 "/home/travis/haxe/std/java/_std/EReg.hx"
				if ( ! (this.matchSub(s, offset, null)) ) 
				{
					//line 157 "/home/travis/haxe/std/java/_std/EReg.hx"
					buf.add(haxe.lang.Runtime.toString(haxe.lang.StringExt.substr(s, offset, null)));
					//line 157 "/home/travis/haxe/std/java/_std/EReg.hx"
					java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
					//line 158 "/home/travis/haxe/std/java/_std/EReg.hx"
					break;
				}
				
			}
			
			//line 160 "/home/travis/haxe/std/java/_std/EReg.hx"
			java.lang.Object p = this.matchedPos();
			//line 161 "/home/travis/haxe/std/java/_std/EReg.hx"
			buf.add(haxe.lang.Runtime.toString(haxe.lang.StringExt.substr(s, offset, ( ((int) (haxe.lang.Runtime.getField_f(p, "pos", true)) ) - ((int) (offset) ) ))));
			//line 161 "/home/travis/haxe/std/java/_std/EReg.hx"
			java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
			//line 162 "/home/travis/haxe/std/java/_std/EReg.hx"
			buf.add(haxe.lang.Runtime.toString(f.__hx_invoke1_o(0.0, this)));
			//line 162 "/home/travis/haxe/std/java/_std/EReg.hx"
			java.lang.Object __temp_expr3 = ((java.lang.Object) (null) );
			//line 163 "/home/travis/haxe/std/java/_std/EReg.hx"
			if (( ((int) (haxe.lang.Runtime.getField_f(p, "len", true)) ) == 0 )) 
			{
				//line 164 "/home/travis/haxe/std/java/_std/EReg.hx"
				buf.add(haxe.lang.Runtime.toString(haxe.lang.StringExt.substr(s, ((int) (haxe.lang.Runtime.getField_f(p, "pos", true)) ), 1)));
				//line 164 "/home/travis/haxe/std/java/_std/EReg.hx"
				java.lang.Object __temp_expr4 = ((java.lang.Object) (null) );
				//line 165 "/home/travis/haxe/std/java/_std/EReg.hx"
				offset = ( ((int) (haxe.lang.Runtime.getField_f(p, "pos", true)) ) + 1 );
			}
			else
			{
				//line 167 "/home/travis/haxe/std/java/_std/EReg.hx"
				offset = ( ((int) (haxe.lang.Runtime.getField_f(p, "pos", true)) ) + ((int) (haxe.lang.Runtime.getField_f(p, "len", true)) ) );
			}
			
			//line 153 "/home/travis/haxe/std/java/_std/EReg.hx"
			if ( ! (this.isGlobal) ) 
			{
				//line 153 "/home/travis/haxe/std/java/_std/EReg.hx"
				break;
			}
			
		}
		
		//line 169 "/home/travis/haxe/std/java/_std/EReg.hx"
		if (( (  ! (this.isGlobal)  && ( offset > 0 ) ) && ( offset < s.length() ) )) 
		{
			//line 170 "/home/travis/haxe/std/java/_std/EReg.hx"
			buf.add(haxe.lang.Runtime.toString(haxe.lang.StringExt.substr(s, offset, null)));
			//line 170 "/home/travis/haxe/std/java/_std/EReg.hx"
			java.lang.Object __temp_expr5 = ((java.lang.Object) (null) );
		}
		
		//line 171 "/home/travis/haxe/std/java/_std/EReg.hx"
		return buf.toString();
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
		{
			//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
			if (( field != null )) 
			{
				//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
				switch (field.hashCode())
				{
					case -568986259:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("isGlobal")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							this.isGlobal = haxe.lang.Runtime.toBool(((java.lang.Boolean) (value) ));
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return value;
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case -791090288:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("pattern")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							this.pattern = haxe.lang.Runtime.toString(value);
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return value;
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 98880:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("cur")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							this.cur = haxe.lang.Runtime.toString(value);
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return value;
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 840862002:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("matcher")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							this.matcher = ((java.util.regex.Matcher) (value) );
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return value;
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
		{
			//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
			if (( field != null )) 
			{
				//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
				switch (field.hashCode())
				{
					case 107868:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("map")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "map")) );
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case -791090288:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("pattern")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return this.pattern;
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 1094496948:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("replace")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "replace")) );
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 840862002:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("matcher")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return this.matcher;
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 107029:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("len")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "len")) );
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 98880:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("cur")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return this.cur;
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 109757538:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("start")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "start")) );
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case -568986259:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("isGlobal")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return this.isGlobal;
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 109648666:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("split")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "split")) );
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 103668165:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("match")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "match")) );
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 296901179:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("matchSub")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "matchSub")) );
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 840861988:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("matched")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "matched")) );
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 1870294672:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("matchedPos")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "matchedPos")) );
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 2144430923:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("matchedLeft")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "matchedLeft")) );
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 2058510168:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("matchedRight")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "matchedRight")) );
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
		{
			//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
			if (( field != null )) 
			{
				//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
				switch (field.hashCode())
				{
					case 107868:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("map")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return this.map(haxe.lang.Runtime.toString(dynargs[0]), ((haxe.lang.Function) (dynargs[1]) ));
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 103668165:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("match")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return this.match(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 1094496948:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("replace")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return this.replace(haxe.lang.Runtime.toString(dynargs[0]), haxe.lang.Runtime.toString(dynargs[1]));
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 840861988:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("matched")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return this.matched(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 107029:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("len")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return this.len(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 2144430923:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("matchedLeft")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return this.matchedLeft();
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 109757538:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("start")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return this.start(((int) (haxe.lang.Runtime.toInt(dynargs[0])) ));
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 2058510168:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("matchedRight")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return this.matchedRight();
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 109648666:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("split")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return this.split(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 1870294672:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("matchedPos")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return this.matchedPos();
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
					case 296901179:
					{
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						if (field.equals("matchSub")) 
						{
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							__temp_executeDef1 = false;
							//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
							return this.matchSub(haxe.lang.Runtime.toString(dynargs[0]), ((int) (haxe.lang.Runtime.toInt(dynargs[1])) ), ( (( dynargs.length > 2 )) ? (dynargs[2]) : (null) ));
						}
						
						//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
		baseArr.push("isGlobal");
		//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
		baseArr.push("cur");
		//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
		baseArr.push("matcher");
		//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
		baseArr.push("pattern");
		//line 27 "/home/travis/haxe/std/java/_std/EReg.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


