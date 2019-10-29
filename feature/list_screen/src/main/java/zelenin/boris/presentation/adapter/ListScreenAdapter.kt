package zelenin.boris.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import zelenin.boris.common.model.CardModel
import zelenin.boris.list_screen.R
import zelenin.boris.presentation.adapter.holder.ListScreenHolder

class ListScreenAdapter : RecyclerView.Adapter<ListScreenHolder>() {
    var content = listOf<CardModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ListScreenHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_screen_holder, parent, false) as View)

    override fun getItemCount() = content.size

    override fun onBindViewHolder(holder: ListScreenHolder, position: Int) {
        holder.bind(content[position])
    }
}