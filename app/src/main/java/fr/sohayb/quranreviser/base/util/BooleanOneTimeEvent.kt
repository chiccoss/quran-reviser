package fr.sohayb.quranreviser.base.util

class BooleanOneTimeEvent(value: Boolean = true) : OneTimeEvent<Boolean>(value) {

    override fun consume(): Boolean {
        return super.consume() ?: false
    }

}