package com.ghostapps.placapp.viewModel


import androidx.databinding.Observable
import androidx.databinding.Observable.OnPropertyChangedCallback
import androidx.databinding.PropertyChangeRegistry
import androidx.lifecycle.ViewModel

abstract class BaseViewModel: ViewModel(), Observable {
    @Transient
    private var mCallbacks: PropertyChangeRegistry? = null

    override fun addOnPropertyChangedCallback(callback: OnPropertyChangedCallback) {
        if (mCallbacks != null) {
            mCallbacks!!.add(callback)
        }
    }

    override fun removeOnPropertyChangedCallback(callback: OnPropertyChangedCallback) {
        if (mCallbacks != null) {
            mCallbacks!!.remove(callback)
        }
    }

    /**
     * Notifies listeners that all properties of this instance have changed.
     */
    fun notifyChange() {
        if (mCallbacks != null) {
            mCallbacks!!.notifyCallbacks(this, 0, null)
        }
    }
}