package fr.sohayb.quranreviser.base.util

import java.util.concurrent.atomic.AtomicBoolean

class OneTimeEvent<T>(private val data: T) {

    private val pending = AtomicBoolean(true)

    fun consume(): T? {
        if (pending.compareAndSet(true, false)) {
            return data
        }
        return null
    }

    fun peek(): T {
        return data
    }
}