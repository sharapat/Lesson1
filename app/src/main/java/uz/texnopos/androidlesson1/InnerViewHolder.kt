package uz.texnopos.androidlesson1

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_inner.view.*

class InnerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun populateModel(user: User) {
        itemView.tvName.text = user.name
        itemView.tvLastName.text = user.lastName
    }
}