// Generated by Haxe 4.0.5
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Std
{
	public Std()
	{
	}
	
	
	public static boolean is(java.lang.Object v, java.lang.Object t)
	{
		//line 29 "/home/travis/haxe/std/java/_std/Std.hx"
		if (( v == null )) 
		{
			//line 30 "/home/travis/haxe/std/java/_std/Std.hx"
			return false;
		}
		
		//line 31 "/home/travis/haxe/std/java/_std/Std.hx"
		if (( t == null )) 
		{
			//line 32 "/home/travis/haxe/std/java/_std/Std.hx"
			return false;
		}
		
		//line 33 "/home/travis/haxe/std/java/_std/Std.hx"
		java.lang.Class clt = ((java.lang.Class) (t) );
		//line 34 "/home/travis/haxe/std/java/_std/Std.hx"
		if (( ((java.lang.Object) (clt) ) == ((java.lang.Object) (null) ) )) 
		{
			//line 35 "/home/travis/haxe/std/java/_std/Std.hx"
			return false;
		}
		
		//line 36 "/home/travis/haxe/std/java/_std/Std.hx"
		java.lang.String name = clt.getName();
		//line 38 "/home/travis/haxe/std/java/_std/Std.hx"
		{
			//line 38 "/home/travis/haxe/std/java/_std/Std.hx"
			java.lang.String __temp_svar1 = (name);
			//line 38 "/home/travis/haxe/std/java/_std/Std.hx"
			int __temp_hash3 = __temp_svar1.hashCode();
			//line 38 "/home/travis/haxe/std/java/_std/Std.hx"
			if (( __temp_svar1 != null )) 
			{
				//line 38 "/home/travis/haxe/std/java/_std/Std.hx"
				switch (__temp_hash3)
				{
					case 344809556:
					case 64711720:
					{
						//line 44 "/home/travis/haxe/std/java/_std/Std.hx"
						if (( (( ( __temp_hash3 == 344809556 ) && __temp_svar1.equals("java.lang.Boolean") )) || __temp_svar1.equals("boolean") )) 
						{
							//line 44 "/home/travis/haxe/std/java/_std/Std.hx"
							return v instanceof java.lang.Boolean;
						}
						
						//line 44 "/home/travis/haxe/std/java/_std/Std.hx"
						break;
					}
					
					
					case 1063877011:
					{
						//line 46 "/home/travis/haxe/std/java/_std/Std.hx"
						if (__temp_svar1.equals("java.lang.Object")) 
						{
							//line 46 "/home/travis/haxe/std/java/_std/Std.hx"
							return true;
						}
						
						//line 46 "/home/travis/haxe/std/java/_std/Std.hx"
						break;
					}
					
					
					case 761287205:
					case -1325958191:
					{
						//line 40 "/home/travis/haxe/std/java/_std/Std.hx"
						if (( (( ( __temp_hash3 == 761287205 ) && __temp_svar1.equals("java.lang.Double") )) || __temp_svar1.equals("double") )) 
						{
							//line 40 "/home/travis/haxe/std/java/_std/Std.hx"
							return haxe.lang.Runtime.isDouble(v);
						}
						
						//line 40 "/home/travis/haxe/std/java/_std/Std.hx"
						break;
					}
					
					
					case -2056817302:
					case 104431:
					{
						//line 42 "/home/travis/haxe/std/java/_std/Std.hx"
						if (( (( ( __temp_hash3 == -2056817302 ) && __temp_svar1.equals("java.lang.Integer") )) || __temp_svar1.equals("int") )) 
						{
							//line 42 "/home/travis/haxe/std/java/_std/Std.hx"
							return haxe.lang.Runtime.isInt(v);
						}
						
						//line 42 "/home/travis/haxe/std/java/_std/Std.hx"
						break;
					}
					
					
				}
				
			}
			
		}
		
		//line 49 "/home/travis/haxe/std/java/_std/Std.hx"
		java.lang.Class clv = v.getClass();
		//line 51 "/home/travis/haxe/std/java/_std/Std.hx"
		return clt.isAssignableFrom(((java.lang.Class) (clv) ));
	}
	
	
	public static java.lang.String string(java.lang.Object s)
	{
		//line 55 "/home/travis/haxe/std/java/_std/Std.hx"
		return ( haxe.lang.Runtime.toString(s) + "" );
	}
	
	
	public static int _int(double x)
	{
		//line 59 "/home/travis/haxe/std/java/_std/Std.hx"
		return ((int) (x) );
	}
	
	
	public static java.lang.Object parseInt(java.lang.String x)
	{
		//line 62 "/home/travis/haxe/std/java/_std/Std.hx"
		try 
		{
			//line 63 "/home/travis/haxe/std/java/_std/Std.hx"
			if (( x == null )) 
			{
				//line 64 "/home/travis/haxe/std/java/_std/Std.hx"
				return null;
			}
			
			//line 66 "/home/travis/haxe/std/java/_std/Std.hx"
			int base = 10;
			//line 67 "/home/travis/haxe/std/java/_std/Std.hx"
			int len = x.length();
			//line 68 "/home/travis/haxe/std/java/_std/Std.hx"
			int foundCount = 0;
			//line 69 "/home/travis/haxe/std/java/_std/Std.hx"
			int sign = 0;
			//line 70 "/home/travis/haxe/std/java/_std/Std.hx"
			int firstDigitIndex = 0;
			//line 71 "/home/travis/haxe/std/java/_std/Std.hx"
			int lastDigitIndex = -1;
			//line 72 "/home/travis/haxe/std/java/_std/Std.hx"
			int previous = 0;
			//line 74 "/home/travis/haxe/std/java/_std/Std.hx"
			{
				//line 74 "/home/travis/haxe/std/java/_std/Std.hx"
				int _g = 0;
				//line 74 "/home/travis/haxe/std/java/_std/Std.hx"
				int _g1 = len;
				//line 74 "/home/travis/haxe/std/java/_std/Std.hx"
				label1:
				while (( _g < _g1 ))
				{
					//line 74 "/home/travis/haxe/std/java/_std/Std.hx"
					int i = _g++;
					//line 75 "/home/travis/haxe/std/java/_std/Std.hx"
					int c = ( (( i < x.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (x) )) ).charAt(i)) )) : (-1) );
					//line 76 "/home/travis/haxe/std/java/_std/Std.hx"
					if (( ( ( c > 8 ) && ( c < 14 ) ) || ( c == 32 ) )) 
					{
						//line 78 "/home/travis/haxe/std/java/_std/Std.hx"
						if (( foundCount > 0 )) 
						{
							//line 79 "/home/travis/haxe/std/java/_std/Std.hx"
							return null;
						}
						
						//line 81 "/home/travis/haxe/std/java/_std/Std.hx"
						continue;
					}
					else
					{
						//line 76 "/home/travis/haxe/std/java/_std/Std.hx"
						switch (c)
						{
							case 43:
							{
								//line 84 "/home/travis/haxe/std/java/_std/Std.hx"
								if (( foundCount == 0 )) 
								{
									//line 85 "/home/travis/haxe/std/java/_std/Std.hx"
									sign = 1;
								}
								else
								{
									//line 89 "/home/travis/haxe/std/java/_std/Std.hx"
									if ( ! ((( ( 48 <= c ) && ( c <= 57 ) ))) ) 
									{
										//line 90 "/home/travis/haxe/std/java/_std/Std.hx"
										if ( ! ((( ( base == 16 ) && (( ( ( 97 <= c ) && ( c <= 122 ) ) || ( ( 65 <= c ) && ( c <= 90 ) ) )) ))) ) 
										{
											//line 92 "/home/travis/haxe/std/java/_std/Std.hx"
											break label1;
										}
										
									}
									
								}
								
								//line 84 "/home/travis/haxe/std/java/_std/Std.hx"
								break;
							}
							
							
							case 45:
							{
								//line 82 "/home/travis/haxe/std/java/_std/Std.hx"
								if (( foundCount == 0 )) 
								{
									//line 83 "/home/travis/haxe/std/java/_std/Std.hx"
									sign = -1;
								}
								else
								{
									//line 89 "/home/travis/haxe/std/java/_std/Std.hx"
									if ( ! ((( ( 48 <= c ) && ( c <= 57 ) ))) ) 
									{
										//line 90 "/home/travis/haxe/std/java/_std/Std.hx"
										if ( ! ((( ( base == 16 ) && (( ( ( 97 <= c ) && ( c <= 122 ) ) || ( ( 65 <= c ) && ( c <= 90 ) ) )) ))) ) 
										{
											//line 92 "/home/travis/haxe/std/java/_std/Std.hx"
											break label1;
										}
										
									}
									
								}
								
								//line 82 "/home/travis/haxe/std/java/_std/Std.hx"
								break;
							}
							
							
							case 48:
							{
								//line 86 "/home/travis/haxe/std/java/_std/Std.hx"
								if ( ! ((( ( foundCount == 0 ) || ( ( foundCount == 1 ) && ( sign != 0 ) ) ))) ) 
								{
									//line 89 "/home/travis/haxe/std/java/_std/Std.hx"
									if ( ! ((( ( 48 <= c ) && ( c <= 57 ) ))) ) 
									{
										//line 90 "/home/travis/haxe/std/java/_std/Std.hx"
										if ( ! ((( ( base == 16 ) && (( ( ( 97 <= c ) && ( c <= 122 ) ) || ( ( 65 <= c ) && ( c <= 90 ) ) )) ))) ) 
										{
											//line 92 "/home/travis/haxe/std/java/_std/Std.hx"
											break label1;
										}
										
									}
									
								}
								
								//line 86 "/home/travis/haxe/std/java/_std/Std.hx"
								break;
							}
							
							
							case 88:
							case 120:
							{
								//line 87 "/home/travis/haxe/std/java/_std/Std.hx"
								if (( ( previous == 48 ) && (( ( ( foundCount == 1 ) && ( sign == 0 ) ) || ( ( foundCount == 2 ) && ( sign != 0 ) ) )) )) 
								{
									//line 88 "/home/travis/haxe/std/java/_std/Std.hx"
									base = 16;
								}
								else
								{
									//line 89 "/home/travis/haxe/std/java/_std/Std.hx"
									if ( ! ((( ( 48 <= c ) && ( c <= 57 ) ))) ) 
									{
										//line 90 "/home/travis/haxe/std/java/_std/Std.hx"
										if ( ! ((( ( base == 16 ) && (( ( ( 97 <= c ) && ( c <= 122 ) ) || ( ( 65 <= c ) && ( c <= 90 ) ) )) ))) ) 
										{
											//line 92 "/home/travis/haxe/std/java/_std/Std.hx"
											break label1;
										}
										
									}
									
								}
								
								//line 87 "/home/travis/haxe/std/java/_std/Std.hx"
								break;
							}
							
							
							default:
							{
								//line 89 "/home/travis/haxe/std/java/_std/Std.hx"
								if ( ! ((( ( 48 <= c ) && ( c <= 57 ) ))) ) 
								{
									//line 90 "/home/travis/haxe/std/java/_std/Std.hx"
									if ( ! ((( ( base == 16 ) && (( ( ( 97 <= c ) && ( c <= 122 ) ) || ( ( 65 <= c ) && ( c <= 90 ) ) )) ))) ) 
									{
										//line 92 "/home/travis/haxe/std/java/_std/Std.hx"
										break label1;
									}
									
								}
								
								//line 89 "/home/travis/haxe/std/java/_std/Std.hx"
								break;
							}
							
						}
						
					}
					
					//line 94 "/home/travis/haxe/std/java/_std/Std.hx"
					if (( ( ( foundCount == 0 ) && ( sign == 0 ) ) || ( ( foundCount == 1 ) && ( sign != 0 ) ) )) 
					{
						//line 95 "/home/travis/haxe/std/java/_std/Std.hx"
						firstDigitIndex = i;
					}
					
					//line 97 "/home/travis/haxe/std/java/_std/Std.hx"
					 ++ foundCount;
					//line 98 "/home/travis/haxe/std/java/_std/Std.hx"
					lastDigitIndex = i;
					//line 99 "/home/travis/haxe/std/java/_std/Std.hx"
					previous = c;
				}
				;
			}
			
			//line 101 "/home/travis/haxe/std/java/_std/Std.hx"
			if (( firstDigitIndex <= lastDigitIndex )) 
			{
				//line 102 "/home/travis/haxe/std/java/_std/Std.hx"
				java.lang.String digits = haxe.lang.StringExt.substring(x, ( firstDigitIndex + (( (( base == 16 )) ? (2) : (0) )) ), ( lastDigitIndex + 1 ));
				//line 104 "/home/travis/haxe/std/java/_std/Std.hx"
				try 
				{
					//line 104 "/home/travis/haxe/std/java/_std/Std.hx"
					return ( (( (( sign == -1 )) ? (-1) : (1) )) * java.lang.Integer.parseInt(haxe.lang.Runtime.toString(digits), ((int) (base) )) );
				}
				catch (java.lang.NumberFormatException e)
				{
					//line 106 "/home/travis/haxe/std/java/_std/Std.hx"
					haxe.lang.Exceptions.setException(e);
					//line 106 "/home/travis/haxe/std/java/_std/Std.hx"
					return null;
				}
				
				
			}
			
			//line 109 "/home/travis/haxe/std/java/_std/Std.hx"
			return null;
		}
		catch (java.lang.Throwable typedException)
		{
			//line 62 "/home/travis/haxe/std/java/_std/Std.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	public static double parseFloat(java.lang.String x)
	{
		//line 113 "/home/travis/haxe/std/java/_std/Std.hx"
		if (( x == null )) 
		{
			//line 114 "/home/travis/haxe/std/java/_std/Std.hx"
			return java.lang.Double.NaN;
		}
		
		//line 115 "/home/travis/haxe/std/java/_std/Std.hx"
		x = haxe.root.StringTools.ltrim(x);
		//line 116 "/home/travis/haxe/std/java/_std/Std.hx"
		boolean found = false;
		//line 116 "/home/travis/haxe/std/java/_std/Std.hx"
		boolean hasDot = false;
		//line 116 "/home/travis/haxe/std/java/_std/Std.hx"
		boolean hasSign = false;
		//line 116 "/home/travis/haxe/std/java/_std/Std.hx"
		boolean hasE = false;
		//line 116 "/home/travis/haxe/std/java/_std/Std.hx"
		boolean hasESign = false;
		//line 116 "/home/travis/haxe/std/java/_std/Std.hx"
		boolean hasEData = false;
		//line 122 "/home/travis/haxe/std/java/_std/Std.hx"
		int i = -1;
		//line 126 "/home/travis/haxe/std/java/_std/Std.hx"
		label1:
		while ((  ++ i < x.length() ))
		{
			//line 127 "/home/travis/haxe/std/java/_std/Std.hx"
			int chr = ((int) (((char) (x.charAt(i)) )) );
			//line 128 "/home/travis/haxe/std/java/_std/Std.hx"
			if (( ( chr >= 48 ) && ( chr <= 57 ) )) 
			{
				//line 129 "/home/travis/haxe/std/java/_std/Std.hx"
				if (hasE) 
				{
					//line 130 "/home/travis/haxe/std/java/_std/Std.hx"
					hasEData = true;
				}
				
				//line 132 "/home/travis/haxe/std/java/_std/Std.hx"
				found = true;
			}
			else
			{
				//line 134 "/home/travis/haxe/std/java/_std/Std.hx"
				switch (chr)
				{
					case 43:
					case 45:
					{
						//line 139 "/home/travis/haxe/std/java/_std/Std.hx"
						if ((  ! (found)  &&  ! (hasSign)  )) 
						{
							//line 140 "/home/travis/haxe/std/java/_std/Std.hx"
							hasSign = true;
						}
						else
						{
							//line 141 "/home/travis/haxe/std/java/_std/Std.hx"
							if (( ( ( found &&  ! (hasESign)  ) && hasE ) &&  ! (hasEData)  )) 
							{
								//line 142 "/home/travis/haxe/std/java/_std/Std.hx"
								hasESign = true;
							}
							else
							{
								//line 144 "/home/travis/haxe/std/java/_std/Std.hx"
								break label1;
							}
							
						}
						
						//line 139 "/home/travis/haxe/std/java/_std/Std.hx"
						break;
					}
					
					
					case 46:
					{
						//line 137 "/home/travis/haxe/std/java/_std/Std.hx"
						if ( ! (hasDot) ) 
						{
							//line 138 "/home/travis/haxe/std/java/_std/Std.hx"
							hasDot = true;
						}
						else
						{
							//line 144 "/home/travis/haxe/std/java/_std/Std.hx"
							break label1;
						}
						
						//line 137 "/home/travis/haxe/std/java/_std/Std.hx"
						break;
					}
					
					
					case 69:
					case 101:
					{
						//line 135 "/home/travis/haxe/std/java/_std/Std.hx"
						if ( ! (hasE) ) 
						{
							//line 136 "/home/travis/haxe/std/java/_std/Std.hx"
							hasE = true;
						}
						else
						{
							//line 144 "/home/travis/haxe/std/java/_std/Std.hx"
							break label1;
						}
						
						//line 135 "/home/travis/haxe/std/java/_std/Std.hx"
						break;
					}
					
					
					default:
					{
						//line 144 "/home/travis/haxe/std/java/_std/Std.hx"
						break label1;
					}
					
				}
				
			}
			
		}
		;
		//line 147 "/home/travis/haxe/std/java/_std/Std.hx"
		if (( hasE &&  ! (hasEData)  )) 
		{
			//line 148 "/home/travis/haxe/std/java/_std/Std.hx"
			 -- i;
			//line 149 "/home/travis/haxe/std/java/_std/Std.hx"
			if (hasESign) 
			{
				//line 150 "/home/travis/haxe/std/java/_std/Std.hx"
				 -- i;
			}
			
		}
		
		//line 153 "/home/travis/haxe/std/java/_std/Std.hx"
		if (( i != x.length() )) 
		{
			//line 154 "/home/travis/haxe/std/java/_std/Std.hx"
			x = haxe.lang.StringExt.substr(x, 0, i);
		}
		
		//line 156 "/home/travis/haxe/std/java/_std/Std.hx"
		try 
		{
			//line 156 "/home/travis/haxe/std/java/_std/Std.hx"
			return java.lang.Double.parseDouble(haxe.lang.Runtime.toString(x));
		}
		catch (java.lang.Throwable catchallException)
		{
			//line 156 "/home/travis/haxe/std/java/_std/Std.hx"
			haxe.lang.Exceptions.setException(catchallException);
			//line 156 "/home/travis/haxe/std/java/_std/Std.hx"
			java.lang.Object e = ( (haxe.root.Std.is(catchallException, haxe.lang.HaxeException.class)) ? (((haxe.lang.HaxeException) (catchallException) ).obj) : (catchallException) );
			//line 156 "/home/travis/haxe/std/java/_std/Std.hx"
			return java.lang.Double.NaN;
		}
		
		
	}
	
	
	public static <T, S> S downcast(T value, java.lang.Class c)
	{
		//line 160 "/home/travis/haxe/std/java/_std/Std.hx"
		if (haxe.root.Std.is(value, c)) 
		{
			//line 160 "/home/travis/haxe/std/java/_std/Std.hx"
			return ((S) (((java.lang.Object) (value) )) );
		}
		else
		{
			//line 160 "/home/travis/haxe/std/java/_std/Std.hx"
			return null;
		}
		
	}
	
	
	public static <T, S> S instance(T value, java.lang.Class c)
	{
		//line 165 "/home/travis/haxe/std/java/_std/Std.hx"
		return ((S) (( (haxe.root.Std.is(value, c)) ? (((S) (((java.lang.Object) (value) )) )) : (null) )) );
	}
	
	
	public static int random(int x)
	{
		//line 169 "/home/travis/haxe/std/java/_std/Std.hx"
		if (( x <= 0 )) 
		{
			//line 170 "/home/travis/haxe/std/java/_std/Std.hx"
			return 0;
		}
		
		//line 171 "/home/travis/haxe/std/java/_std/Std.hx"
		return ((int) (( java.lang.Math.random() * x )) );
	}
	
	
}


