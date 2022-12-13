package com.reid.mainlistingapp.ui.latestListings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.reid.mainlistingapp.Adaptor.ListingAdapter
import com.reid.mainlistingapp.Models.Listing
import com.reid.mainlistingapp.R
import com.reid.mainlistingapp.databinding.FragmentLatestListingsBinding
import com.reid.mainlistingapp.TradeMeService.TradeMeService

class ListingsFragment : Fragment() {

    private var _binding: FragmentLatestListingsBinding? = null
    private lateinit var ListingRecyleView: RecyclerView
    private lateinit var adapter: ListingAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLatestListingsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        ListingRecyleView = root.findViewById(R.id.listingRecyclerView)
        adapter = ListingAdapter(root.context)
        TradeMeService.updateListings(adapter)
        val listings: List<Listing> = TradeMeService.getListings()
        adapter.listingList = listings
        ListingRecyleView.adapter = adapter
        ListingRecyleView.layoutManager = LinearLayoutManager(context)
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}