package com.example.financeappprojectkotlin.Adapter

import android.content.Context
import android.icu.text.DecimalFormat
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.financeappprojectkotlin.Domain.ExpenseDomain
import com.example.financeappprojectkotlin.databinding.ViewholderItemsBinding

class ExpenseListAdapter( private  val items:MutableList<ExpenseDomain>):
    RecyclerView.Adapter<ExpenseListAdapter.Viewholder>() {



    class Viewholder (val binding:ViewholderItemsBinding):RecyclerView.ViewHolder(binding.root)

    private lateinit var context:Context
    var formatter:DecimalFormat? = null

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Viewholder {
      context=parent.context
        formatter=DecimalFormat("###,###,###.##")
        val binding=ViewholderItemsBinding.inflate(LayoutInflater.from(context),parent,false)
        return Viewholder(binding)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        val item= items[position]
        holder.binding.titleText.text=item.title
        holder.binding.timeText.text=item.time
        holder.binding.priceText.text="$"+formatter?.format(item.price)
        val drawableResourcesId=
            holder.itemView.resources.getIdentifier(item.pic,"drawable",context.packageName)
        Glide.with(context)
            .load(drawableResourcesId).
            into(holder.binding.pic)
    }

    override fun getItemCount(): Int= items.size
}