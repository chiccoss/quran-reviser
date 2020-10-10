package fr.sohayb.quranreviser.base.domain

interface ReducerType <State : StateType> {

    fun reduce(result: ResultType, state: State): State
}