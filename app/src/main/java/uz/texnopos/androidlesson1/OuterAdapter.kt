package uz.texnopos.androidlesson1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class OuterAdapter : RecyclerView.Adapter<OuterViewHolder>() {
    var userGroupList: List<UserGroup> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OuterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_out, parent, false)
        return OuterViewHolder(view)
    }

    override fun onBindViewHolder(holder: OuterViewHolder, position: Int) {
        holder.populateModel(userGroupList[position])
    }

    override fun getItemCount() = userGroupList.size
}