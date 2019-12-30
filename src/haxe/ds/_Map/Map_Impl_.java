// Generated by Haxe 4.0.5
package haxe.ds._Map;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Map_Impl_
{
	public static <K, V> void set(haxe.IMap<K, V> this1, K key, V value)
	{
		//line 75 "/home/travis/haxe/std/haxe/ds/Map.hx"
		this1.set(key, value);
	}
	
	
	public static <K, V> java.lang.Object get(haxe.IMap<K, V> this1, K key)
	{
		//line 93 "/home/travis/haxe/std/haxe/ds/Map.hx"
		return this1.get(key);
	}
	
	
	public static <K, V> boolean exists(haxe.IMap<K, V> this1, K key)
	{
		//line 101 "/home/travis/haxe/std/haxe/ds/Map.hx"
		return this1.exists(key);
	}
	
	
	public static <K, V> boolean remove(haxe.IMap<K, V> this1, K key)
	{
		//line 110 "/home/travis/haxe/std/haxe/ds/Map.hx"
		return this1.remove(key);
	}
	
	
	public static <K, V> java.lang.Object keys(haxe.IMap<K, V> this1)
	{
		//line 118 "/home/travis/haxe/std/haxe/ds/Map.hx"
		return this1.keys();
	}
	
	
	public static <K, V> java.lang.Object iterator(haxe.IMap<K, V> this1)
	{
		//line 127 "/home/travis/haxe/std/haxe/ds/Map.hx"
		return this1.iterator();
	}
	
	
	public static <K, V> java.lang.Object keyValueIterator(haxe.IMap<K, V> this1)
	{
		//line 136 "/home/travis/haxe/std/haxe/ds/Map.hx"
		return this1.keyValueIterator();
	}
	
	
	public static <K, V> haxe.IMap<K, V> copy(haxe.IMap<K, V> this1)
	{
		//line 145 "/home/travis/haxe/std/haxe/ds/Map.hx"
		return ((haxe.IMap<K, V>) (this1.copy()) );
	}
	
	
	public static <K, V> java.lang.String toString(haxe.IMap<K, V> this1)
	{
		//line 154 "/home/travis/haxe/std/haxe/ds/Map.hx"
		return this1.toString();
	}
	
	
	public static <K, V> void clear(haxe.IMap<K, V> this1)
	{
		//line 161 "/home/travis/haxe/std/haxe/ds/Map.hx"
		this1.clear();
	}
	
	
	public static <K, V> V arrayWrite(haxe.IMap<K, V> this1, K k, V v)
	{
		//line 165 "/home/travis/haxe/std/haxe/ds/Map.hx"
		this1.set(k, v);
		//line 166 "/home/travis/haxe/std/haxe/ds/Map.hx"
		return v;
	}
	
	
	public static <K, V> haxe.ds.StringMap<V> toStringMap(haxe.IMap<K, V> t)
	{
		//line 170 "/home/travis/haxe/std/haxe/ds/Map.hx"
		return new haxe.ds.StringMap<V>();
	}
	
	
	public static <K, V> haxe.ds.IntMap<V> toIntMap(haxe.IMap<K, V> t)
	{
		//line 174 "/home/travis/haxe/std/haxe/ds/Map.hx"
		return new haxe.ds.IntMap<V>();
	}
	
	
	public static <K, V> haxe.ds.EnumValueMap<K, V> toEnumValueMapMap(haxe.IMap<K, V> t)
	{
		//line 178 "/home/travis/haxe/std/haxe/ds/Map.hx"
		return new haxe.ds.EnumValueMap<K, V>();
	}
	
	
	public static <K, V> haxe.ds.ObjectMap<K, V> toObjectMap(haxe.IMap<K, V> t)
	{
		//line 182 "/home/travis/haxe/std/haxe/ds/Map.hx"
		return new haxe.ds.ObjectMap<K, V>();
	}
	
	
	public static <V> haxe.ds.StringMap<V> fromStringMap(haxe.ds.StringMap<V> map)
	{
		//line 186 "/home/travis/haxe/std/haxe/ds/Map.hx"
		return ((haxe.ds.StringMap<V>) (map) );
	}
	
	
	public static <V> haxe.ds.IntMap<V> fromIntMap(haxe.ds.IntMap<V> map)
	{
		//line 190 "/home/travis/haxe/std/haxe/ds/Map.hx"
		return ((haxe.ds.IntMap<V>) (map) );
	}
	
	
	public static <K, V> haxe.ds.ObjectMap<K, V> fromObjectMap(haxe.ds.ObjectMap<K, V> map)
	{
		//line 194 "/home/travis/haxe/std/haxe/ds/Map.hx"
		return ((haxe.ds.ObjectMap<K, V>) (map) );
	}
	
	
}


