// Generated by Haxe 4.0.5
package connect.models;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Model extends connect.Base
{
	public Model(haxe.lang.EmptyObject empty)
	{
		//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Model()
	{
		//line 103 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.Model.__hx_ctor_connect_models_Model(this);
	}
	
	
	protected static void __hx_ctor_connect_models_Model(connect.models.Model __hx_this)
	{
	}
	
	
	public static <T> T parse(java.lang.Class modelClass, java.lang.String body)
	{
		//line 77 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		java.lang.Object obj = new haxe.format.JsonParser(haxe.lang.Runtime.toString(body)).doParse();
		//line 78 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		if (( obj instanceof haxe.root.Array )) 
		{
			//line 79 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			throw haxe.lang.HaxeException.wrap("Model.parse cannot parse a Json that contains an array.");
		}
		
		//line 81 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		return ((T) (connect.models.Model._parse(((java.lang.Class) (modelClass) ), ((java.lang.Object) (obj) ))) );
	}
	
	
	public static <T> connect.Collection<T> parseArray(java.lang.Class modelClass, java.lang.String body)
	{
		//line 87 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		haxe.root.Array array = ((haxe.root.Array) (new haxe.format.JsonParser(haxe.lang.Runtime.toString(body)).doParse()) );
		//line 88 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		if ( ! (haxe.root.Std.is(array, haxe.root.Array.class)) ) 
		{
			//line 89 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			throw haxe.lang.HaxeException.wrap("Model.parseArray can only parse a Json that contains an array.");
		}
		
		//line 91 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		return ((connect.Collection<T>) (((connect.Collection) (connect.models.Model._parseArray(((java.lang.Class) (modelClass) ), ((haxe.root.Array) (array) ))) )) );
	}
	
	
	public static <T> T _parse(java.lang.Class modelClass, java.lang.Object obj)
	{
		//line 110 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		T instance = ((T) (haxe.root.Type.createInstance(((java.lang.Class) (modelClass) ), ((haxe.root.Array) (new haxe.root.Array(new java.lang.Object[]{})) ))) );
		//line 111 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		connect.models.Model model = ((connect.models.Model) (((java.lang.Object) (instance) )) );
		//line 112 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		{
			//line 112 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			int _g = 0;
			//line 112 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			haxe.root.Array<java.lang.String> _g1 = haxe.root.Type.getInstanceFields(modelClass);
			//line 112 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			while (( _g < _g1.length ))
			{
				//line 112 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				java.lang.String field = _g1.__get(_g);
				//line 112 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				 ++ _g;
				//line 113 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				java.lang.String snakeField = connect.Inflection.toSnakeCase(field);
				//line 114 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				java.lang.String camelField = connect.Inflection.toCamelCase(field, true);
				//line 115 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				if (haxe.root.Reflect.hasField(obj, snakeField)) 
				{
					//line 116 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
					java.lang.Object val = haxe.root.Reflect.field(obj, snakeField);
					//line 118 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
					{
						//line 118 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						haxe.root.ValueType _g2 = haxe.root.Type.typeof(val);
						//line 118 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						switch (_g2.index)
						{
							case 4:
							{
								//line 127 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
								java.lang.String fieldClassName = model.getFieldClassName(field);
								//line 128 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
								java.lang.String className = ( (( fieldClassName == null )) ? (( "connect.models." + camelField )) : (fieldClassName) );
								//line 131 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
								java.lang.Class classObj = haxe.root.Type.resolveClass(className);
								//line 132 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
								if (( ((java.lang.Object) (classObj) ) != ((java.lang.Object) (null) ) )) 
								{
									//line 133 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
									if ( ! (haxe.lang.Runtime.valEq(className, "String")) ) 
									{
										//line 134 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
										haxe.root.Reflect.setProperty(model, field, ((java.lang.Object) (connect.models.Model._parse(((java.lang.Class) (classObj) ), ((java.lang.Object) (val) ))) ));
									}
									else
									{
										//line 136 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
										haxe.lang.Function replacer = null;
										//line 136 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
										java.lang.String space = null;
										//line 136 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
										haxe.root.Reflect.setProperty(model, field, haxe.format.JsonPrinter.print(val, replacer, space));
									}
									
								}
								else
								{
									//line 139 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
									throw haxe.lang.HaxeException.wrap(( ( "Cannot find class \"" + className ) + "\"" ));
								}
								
								//line 126 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
								break;
							}
							
							
							case 6:
							{
								//line 119 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
								{
									//line 119 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
									java.lang.Class __temp_switch1 = (((java.lang.Class) (_g2.params[0]) ));
									//line 119 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
									if (( ((java.lang.Object) (__temp_switch1) ) == ((java.lang.Object) (haxe.root.Array.class) ) )) 
									{
										//line 120 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
										java.lang.String fieldClassName1 = model.getFieldClassName(field);
										//line 121 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
										java.lang.String className1 = ( (( fieldClassName1 == null )) ? (connect.Inflection.toSingular(( "connect.models." + camelField ))) : (fieldClassName1) );
										//line 124 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
										java.lang.Class classObj1 = haxe.root.Type.resolveClass(className1);
										//line 125 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
										haxe.root.Reflect.setProperty(model, field, ((connect.Collection<java.lang.Object>) (connect.models.Model._parseArray(((java.lang.Class) (classObj1) ), ((haxe.root.Array) (val) ))) ));
									}
									else
									{
										//line 142 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
										java.lang.String fieldClassName2 = model.getFieldClassName(field);
										//line 143 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
										if (haxe.lang.Runtime.valEq(fieldClassName2, "DateTime")) 
										{
											//line 144 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
											haxe.root.Reflect.setProperty(model, field, connect.DateTime.fromString(haxe.lang.Runtime.toString(val)));
										}
										else
										{
											//line 147 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
											try 
											{
												//line 147 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
												haxe.root.Reflect.setProperty(model, field, val);
											}
											catch (java.lang.Throwable catchallException)
											{
												//line 146 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
												haxe.lang.Exceptions.setException(catchallException);
												//line 148 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
												java.lang.Object ex = ( (haxe.root.Std.is(catchallException, haxe.lang.HaxeException.class)) ? (((haxe.lang.HaxeException) (catchallException) ).obj) : (catchallException) );
											}
											
											
										}
										
									}
									
								}
								
								//line 119 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
								break;
							}
							
							
							default:
							{
								//line 142 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
								java.lang.String fieldClassName3 = model.getFieldClassName(field);
								//line 143 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
								if (haxe.lang.Runtime.valEq(fieldClassName3, "DateTime")) 
								{
									//line 144 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
									haxe.root.Reflect.setProperty(model, field, connect.DateTime.fromString(haxe.lang.Runtime.toString(val)));
								}
								else
								{
									//line 147 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
									try 
									{
										//line 147 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
										haxe.root.Reflect.setProperty(model, field, val);
									}
									catch (java.lang.Throwable catchallException1)
									{
										//line 146 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
										haxe.lang.Exceptions.setException(catchallException1);
										//line 148 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
										java.lang.Object ex1 = ( (haxe.root.Std.is(catchallException1, haxe.lang.HaxeException.class)) ? (((haxe.lang.HaxeException) (catchallException1) ).obj) : (catchallException1) );
									}
									
									
								}
								
								//line 141 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
								break;
							}
							
						}
						
					}
					
				}
				
			}
			
		}
		
		//line 156 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		return instance;
	}
	
	
	public static <T> connect.Collection<T> _parseArray(java.lang.Class modelClass, haxe.root.Array array)
	{
		//line 161 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		connect.Collection<T> result = new connect.Collection<T>();
		//line 162 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		{
			//line 162 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			int _g = 0;
			//line 162 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			while (( _g < array.length ))
			{
				//line 162 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				java.lang.Object obj = array.__get(_g);
				//line 162 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				 ++ _g;
				//line 163 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				if (( ((java.lang.Object) (modelClass) ) != ((java.lang.Object) (null) ) )) 
				{
					//line 164 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
					result.push(((T) (connect.models.Model._parse(((java.lang.Class) (modelClass) ), ((java.lang.Object) (obj) ))) ));
				}
				else
				{
					//line 166 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
					result.push(((T) (obj) ));
				}
				
			}
			
		}
		
		//line 169 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		return result;
	}
	
	
	public java.lang.Object toObject()
	{
		//line 18 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		java.lang.Object obj = new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{});
		//line 19 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		haxe.root.Array<java.lang.String> fields = haxe.root.Type.getInstanceFields(((java.lang.Class) (haxe.root.Type.getClass(((connect.models.Model) (this) ))) ));
		//line 20 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		{
			//line 20 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			int _g = 0;
			//line 20 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			while (( _g < fields.length ))
			{
				//line 20 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				java.lang.String field = fields.__get(_g);
				//line 20 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				 ++ _g;
				//line 21 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				java.lang.Object value = haxe.root.Reflect.field(this, field);
				//line 22 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				if ((  ! (haxe.lang.Runtime.valEq(field, "fieldClassNames"))  && ( ! (( value == null )) ) )) 
				{
					//line 23 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
					haxe.root.ValueType _g1 = haxe.root.Type.typeof(value);
					//line 23 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
					switch (_g1.index)
					{
						case 5:
						{
							//line 52 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							break;
						}
						
						
						case 6:
						{
							//line 28 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							java.lang.Class _g11 = ((java.lang.Class) (_g1.params[0]) );
							//line 28 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							{
								//line 28 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
								java.lang.Class __temp_switch1 = (_g11);
								//line 25 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
								if (( ((java.lang.Object) (__temp_switch1) ) == ((java.lang.Object) (java.lang.String.class) ) )) 
								{
									//line 25 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
									haxe.root.Reflect.setField(obj, connect.Inflection.toSnakeCase(field), haxe.root.Std.string(value));
								}
								else
								{
									//line 27 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
									if (( ((java.lang.Object) (__temp_switch1) ) == ((java.lang.Object) (connect.DateTime.class) ) )) 
									{
										//line 27 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
										haxe.root.Reflect.setField(obj, connect.Inflection.toSnakeCase(field), value.toString());
									}
									else
									{
										//line 28 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
										java.lang.Class class_ = _g11;
										//line 28 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
										{
											//line 29 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
											java.lang.String className = haxe.root.Type.getClassName(class_);
											//line 30 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
											if (( haxe.lang.StringExt.indexOf(className, "connect.Collection", null) == 0 )) 
											{
												//line 31 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
												connect.Collection col = ((connect.Collection) (value) );
												//line 32 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
												haxe.root.Array arr = new haxe.root.Array();
												//line 33 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
												{
													//line 33 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
													java.util.Iterator elem = col.iterator();
													//line 33 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
													while (elem.hasNext())
													{
														//line 33 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
														java.lang.Object elem1 = elem.next();
														//line 34 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
														java.lang.String elemClassName = haxe.root.Type.getClassName(((java.lang.Class) (haxe.root.Type.getClass(((java.lang.Object) (elem1) ))) ));
														//line 35 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
														if (( haxe.lang.StringExt.indexOf(elemClassName, "connect.models.", null) == 0 )) 
														{
															//line 36 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
															arr.push(((java.lang.Object) (haxe.lang.Runtime.callField(elem1, "toObject", null)) ));
														}
														else
														{
															//line 38 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
															arr.push(elem1);
														}
														
													}
													
												}
												
												//line 41 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
												if (( arr.length > 0 )) 
												{
													//line 42 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
													haxe.root.Reflect.setField(obj, connect.Inflection.toSnakeCase(field), arr);
												}
												
											}
											else
											{
												//line 44 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
												if (( haxe.lang.StringExt.indexOf(className, "connect.models.", null) == 0 )) 
												{
													//line 45 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
													java.lang.Object model = (((connect.models.Model) (value) )).toObject();
													//line 46 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
													if (( haxe.root.Reflect.fields(model).length != 0 )) 
													{
														//line 47 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
														haxe.root.Reflect.setField(obj, connect.Inflection.toSnakeCase(field), model);
													}
													
												}
												else
												{
													//line 50 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
													haxe.root.Reflect.setField(obj, connect.Inflection.toSnakeCase(field), value);
												}
												
											}
											
										}
										
									}
									
								}
								
							}
							
							//line 28 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							break;
						}
						
						
						default:
						{
							//line 55 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							haxe.root.Reflect.setField(obj, connect.Inflection.toSnakeCase(field), value);
							//line 55 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							break;
						}
						
					}
					
				}
				
			}
			
		}
		
		//line 59 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		return obj;
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 65 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		haxe.lang.Function replacer = null;
		//line 65 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		java.lang.String space = null;
		//line 65 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		return haxe.format.JsonPrinter.print(this.toObject(), replacer, space);
	}
	
	
	public void _setFieldClassNames(haxe.ds.StringMap<java.lang.String> map)
	{
		//line 97 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		if (( this.fieldClassNames == null )) 
		{
			//line 98 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			this.fieldClassNames = map;
		}
		
	}
	
	
	public haxe.ds.StringMap<java.lang.String> fieldClassNames;
	
	public java.lang.String getFieldClassName(java.lang.String field)
	{
		//line 174 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		if (( ( this.fieldClassNames != null ) && this.fieldClassNames.exists(field) )) 
		{
			//line 175 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			java.lang.String nameInField = haxe.lang.Runtime.toString(this.fieldClassNames.get(field));
			//line 176 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			haxe.root.Array<java.lang.String> exceptions = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"DateTime", "String"});
			//line 177 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			if (( exceptions.indexOf(nameInField, null) == -1 )) 
			{
				//line 178 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				return ( "connect.models." + nameInField );
			}
			else
			{
				//line 179 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				return nameInField;
			}
			
		}
		else
		{
			//line 181 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			return null;
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		{
			//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			if (( field != null )) 
			{
				//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				switch (field.hashCode())
				{
					case 1474917706:
					{
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						if (field.equals("fieldClassNames")) 
						{
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							__temp_executeDef1 = false;
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							this.fieldClassNames = ((haxe.ds.StringMap<java.lang.String>) (value) );
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							return value;
						}
						
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		{
			//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			if (( field != null )) 
			{
				//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				switch (field.hashCode())
				{
					case 2110841151:
					{
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						if (field.equals("getFieldClassName")) 
						{
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							__temp_executeDef1 = false;
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getFieldClassName")) );
						}
						
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						break;
					}
					
					
					case -1908304486:
					{
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						if (field.equals("toObject")) 
						{
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							__temp_executeDef1 = false;
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toObject")) );
						}
						
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						break;
					}
					
					
					case 1474917706:
					{
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						if (field.equals("fieldClassNames")) 
						{
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							__temp_executeDef1 = false;
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							return this.fieldClassNames;
						}
						
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						break;
					}
					
					
					case -1776922004:
					{
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						if (field.equals("toString")) 
						{
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							__temp_executeDef1 = false;
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
						}
						
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						break;
					}
					
					
					case -983816409:
					{
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						if (field.equals("_setFieldClassNames")) 
						{
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							__temp_executeDef1 = false;
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "_setFieldClassNames")) );
						}
						
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		{
			//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			if (( field != null )) 
			{
				//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				switch (field.hashCode())
				{
					case 2110841151:
					{
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						if (field.equals("getFieldClassName")) 
						{
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							__temp_executeDef1 = false;
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							return this.getFieldClassName(haxe.lang.Runtime.toString(dynargs[0]));
						}
						
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						break;
					}
					
					
					case -1908304486:
					{
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						if (field.equals("toObject")) 
						{
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							__temp_executeDef1 = false;
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							return this.toObject();
						}
						
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						break;
					}
					
					
					case -983816409:
					{
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						if (field.equals("_setFieldClassNames")) 
						{
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							__temp_executeDef1 = false;
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							this._setFieldClassNames(((haxe.ds.StringMap<java.lang.String>) (dynargs[0]) ));
						}
						
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						break;
					}
					
					
					case -1776922004:
					{
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						if (field.equals("toString")) 
						{
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							__temp_executeDef1 = false;
							//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
							return this.toString();
						}
						
						//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		baseArr.push("fieldClassNames");
		//line 15 "/home/travis/build/JaviCerveraIngram/connect-haxe-sdk/connect/models/Model.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


