package com.dsm2018.playground_remastered.Connect

import android.app.*
import android.content.*
import android.widget.*
import com.dsm2018.playground_remastered.Activity.SignIn.SignInViewModel


/**
 * Created by root1 on 2017. 11. 23..
 */
object Util {

    fun showToast(context: Context, message: String) = Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

    fun showDialog(context: Context, title: String): AlertDialog.Builder = AlertDialog.Builder(context).setTitle(title)

    fun showCustomDialog(dialog: Dialog,type : Int){
        dialog.window.attributes.windowAnimations = type
        dialog.show()
    }

    private fun getPref(context: Context): SharedPreferences{
        val pref = context.getSharedPreferences("pref", Context.MODE_PRIVATE)
        return pref
    }

    fun saveToken(context: Context, token: String, isAccess: Boolean = true){
        val editor = getPref(context).edit()
        editor.putString(getKey(isAccess), token)
        editor.commit()
    }

    fun removeToken(context: SignInViewModel, isAccess: Boolean = true){
        val editor = getPref(context).edit()
        editor.remove(getKey(isAccess))
        editor.commit()
    }

    fun getToken(context: Context, isAccess: Boolean = true): String{
        return "JWT " + getPref(context).getString(getKey(isAccess), "")
    }

    private fun getKey(isAccess: Boolean): String = if (isAccess) "Access" else "Refresh"

    fun delayHandler(runnable: Runnable, delayTime: Long) {
        var handler = android.os.Handler()
        handler.postDelayed(runnable, delayTime)
    }
}