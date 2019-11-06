package zelenin.boris.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_screen_fragment.view.*
import zelenin.boris.common.model.CardModel
import zelenin.boris.list_screen.R
import zelenin.boris.presentation.adapter.ListScreenAdapter
import zelenin.boris.common.viewmodel.CommonViewModel
import java.util.*

class ListScreenFragment : Fragment() {
    companion object {
        private const val LIST_SCREEN_AMOUNT_ID = "LIST_SCREEN_AMOUNT"

        fun newInstanse(amount: Int) = ListScreenFragment().apply {
            this.arguments = Bundle().apply {
                putInt(LIST_SCREEN_AMOUNT_ID, amount)
            }
        }
    }

    private lateinit var recyclerView: RecyclerView
    private val adapter = ListScreenAdapter()

    private lateinit var viewModel: CommonViewModel

    private fun getLayoutRes() = R.layout.list_screen_fragment

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val mainView = inflater.inflate(getLayoutRes(), container, false)
        viewModel = ViewModelProvider(activity!!, ViewModelProvider.AndroidViewModelFactory(activity!!.application)).get(CommonViewModel::class.java)

        recyclerView = mainView.recycler_view
        recyclerView.adapter = adapter

        viewModel.getCards().observe(this, Observer {
            adapter.content = it
        })

        mainView.add_card.setOnClickListener {
            activity!!
                    .supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.container_layout_id, CardScreenFragment())
                    .addToBackStack(null)
                    .commit()
        }

        return mainView
    }
}