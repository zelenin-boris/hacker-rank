package zelenin.boris.common.algorithms

import java.util.*
import kotlin.collections.HashMap

class LruCache<K, V>(var maxSize: Int) {
    val hashMap: HashMap<K, V> = hashMapOf()
    val linkedList: LinkedList<V> = LinkedList()

    fun resize(maxSize: Int) {
        throw RuntimeException("Stub!")
    }

    operator fun get(key: K): V {
        throw RuntimeException("Stub!")
    }

    fun put(key: K, value: V): V {
        throw RuntimeException("Stub!")
    }

    fun trimToSize(maxSize: Int) {
        throw RuntimeException("Stub!")
    }

    fun remove(key: K): V {
        throw RuntimeException("Stub!")
    }

    protected fun entryRemoved(evicted: Boolean, key: K, oldValue: V, newValue: V) {
        throw RuntimeException("Stub!")
    }

    protected fun create(key: K): V {
        throw RuntimeException("Stub!")
    }

    protected fun sizeOf(key: K, value: V): Int {
        throw RuntimeException("Stub!")
    }

    fun evictAll() {
        throw RuntimeException("Stub!")
    }

    @Synchronized
    fun size(): Int {
        throw RuntimeException("Stub!")
    }

    @Synchronized
    fun maxSize(): Int {
        throw RuntimeException("Stub!")
    }

    @Synchronized
    fun hitCount(): Int {
        throw RuntimeException("Stub!")
    }

    @Synchronized
    fun missCount(): Int {
        throw RuntimeException("Stub!")
    }

    @Synchronized
    fun createCount(): Int {
        throw RuntimeException("Stub!")
    }

    @Synchronized
    fun putCount(): Int {
        throw RuntimeException("Stub!")
    }

    @Synchronized
    fun evictionCount(): Int {
        throw RuntimeException("Stub!")
    }

    @Synchronized
    fun snapshot(): Map<K, V> {
        throw RuntimeException("Stub!")
    }

    @Synchronized
    override fun toString(): String {
        throw RuntimeException("Stub!")
    }
}