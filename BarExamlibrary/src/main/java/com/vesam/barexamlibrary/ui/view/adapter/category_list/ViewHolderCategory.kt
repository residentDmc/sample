package com.vesam.barexamlibrary.ui.view.adapter.category_list

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.RecyclerView
import com.vesam.barexamlibrary.R

class ViewHolderCategory(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val txtTitle = itemView.findViewById(R.id.txtTitle) as TextView
    val lnParent = itemView.findViewById(R.id.lnParent) as LinearLayout
}