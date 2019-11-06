package zelenin.boris.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.card_screen_fragment.view.*
import zelenin.boris.card_screen.R
import zelenin.boris.common.model.CardModel
import zelenin.boris.common.viewmodel.CommonViewModel

class CardScreenFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val mainView = inflater.inflate(R.layout.card_screen_fragment, container, false)

        val viewModel = ViewModelProvider(activity!!, ViewModelProvider.AndroidViewModelFactory(activity!!.application)).get(CommonViewModel::class.java)

        mainView.add_button.setOnClickListener {
            viewModel.putCard(CardModel( mainView.name.text.toString()))
            activity!!.supportFragmentManager.popBackStack()
        }

        return mainView
    }
}