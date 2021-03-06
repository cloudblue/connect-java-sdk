// Generated by Haxe 4.0.5
package haxe.ds._HashMap;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class HashMap_Impl_
{
	public static <K, V> haxe.ds._HashMap.HashMapData<K, V> _new()
	{
		//line 36 "/home/travis/haxe/std/haxe/ds/HashMap.hx"
		haxe.ds._HashMap.HashMapData<K, V> this1 = new haxe.ds._HashMap.HashMapData<K, V>();
		//line 36 "/home/travis/haxe/std/haxe/ds/HashMap.hx"
		return ((haxe.ds._HashMap.HashMapData<K, V>) (this1) );
	}
	
	
	public static <K, V> void set(haxe.ds._HashMap.HashMapData<K, V> this1, K k, V v)
	{
		//line 44 "/home/travis/haxe/std/haxe/ds/HashMap.hx"
		this1.keys.set(((int) (((java.lang.Object) (k) ).hashCode()) ), ((K) (k) ));
		//line 45 "/home/travis/haxe/std/haxe/ds/HashMap.hx"
		this1.values.set(((int) (((java.lang.Object) (k) ).hashCode()) ), ((V) (v) ));
	}
	
	
	public static <K, V> java.lang.Object get(haxe.ds._HashMap.HashMapData<K, V> this1, K k)
	{
		//line 52 "/home/travis/haxe/std/haxe/ds/HashMap.hx"
		return this1.values.get(((int) (((java.lang.Object) (k) ).hashCode()) ));
	}
	
	
	public static <K, V> boolean exists(haxe.ds._HashMap.HashMapData<K, V> this1, K k)
	{
		//line 59 "/home/travis/haxe/std/haxe/ds/HashMap.hx"
		return this1.values.exists(((int) (((java.lang.Object) (k) ).hashCode()) ));
	}
	
	
	public static <K, V> boolean remove(haxe.ds._HashMap.HashMapData<K, V> this1, K k)
	{
		//line 66 "/home/travis/haxe/std/haxe/ds/HashMap.hx"
		this1.values.remove(((int) (((java.lang.Object) (k) ).hashCode()) ));
		//line 67 "/home/travis/haxe/std/haxe/ds/HashMap.hx"
		return this1.keys.remove(((int) (((java.lang.Object) (k) ).hashCode()) ));
	}
	
	
	public static <K, V> java.lang.Object keys(haxe.ds._HashMap.HashMapData<K, V> this1)
	{
		//line 74 "/home/travis/haxe/std/haxe/ds/HashMap.hx"
		return new haxe.ds._IntMap.IntMapValueIterator<K>(((haxe.ds.IntMap<K>) (this1.keys) ));
	}
	
	
	public static <K, V> haxe.ds._HashMap.HashMapData<K, V> copy(haxe.ds._HashMap.HashMapData<K, V> this1)
	{
		//line 81 "/home/travis/haxe/std/haxe/ds/HashMap.hx"
		haxe.ds._HashMap.HashMapData<K, V> copied = new haxe.ds._HashMap.HashMapData<K, V>();
		//line 82 "/home/travis/haxe/std/haxe/ds/HashMap.hx"
		copied.keys = this1.keys.copy();
		//line 83 "/home/travis/haxe/std/haxe/ds/HashMap.hx"
		copied.values = this1.values.copy();
		//line 84 "/home/travis/haxe/std/haxe/ds/HashMap.hx"
		return ((haxe.ds._HashMap.HashMapData<K, V>) (copied) );
	}
	
	
	public static <K, V> java.lang.Object iterator(haxe.ds._HashMap.HashMapData<K, V> this1)
	{
		//line 91 "/home/travis/haxe/std/haxe/ds/HashMap.hx"
		return new haxe.ds._IntMap.IntMapValueIterator<V>(((haxe.ds.IntMap<V>) (this1.values) ));
	}
	
	
	public static <K, V> void clear(haxe.ds._HashMap.HashMapData<K, V> this1)
	{
		//line 98 "/home/travis/haxe/std/haxe/ds/HashMap.hx"
		this1.keys.clear();
		//line 99 "/home/travis/haxe/std/haxe/ds/HashMap.hx"
		this1.values.clear();
	}
	
	
}


