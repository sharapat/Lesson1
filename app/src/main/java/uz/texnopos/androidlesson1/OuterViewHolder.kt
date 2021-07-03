package uz.texnopos.androidlesson1

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_out.view.*

class OuterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun populateModel(userGroup: UserGroup) {
        val innerAdapter = InnerAdapter()
        itemView.innerRecyclerView.adapter = innerAdapter
        innerAdapter.users = userGroup.userList
    }
}
