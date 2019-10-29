package zelenin.boris.presentation.adapter.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_screen_holder.view.*
import zelenin.boris.common.model.CardModel

class ListScreenHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val name = itemView.name

    fun bind(cardModel: CardModel) {
        name.text = cardModel.name
    }
}