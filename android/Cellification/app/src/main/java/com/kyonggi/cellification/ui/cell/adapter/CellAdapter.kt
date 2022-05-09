package com.kyonggi.cellification.ui.cell.adapter

import android.annotation.SuppressLint
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.kyonggi.cellification.R
import com.kyonggi.cellification.data.model.cell.ResponseCell
import com.kyonggi.cellification.data.model.cell.ResponseSpecificUserCell
import com.kyonggi.cellification.databinding.ItemListBinding
import com.kyonggi.cellification.utils.APIResponse
import com.kyonggi.cellification.utils.GlideApp

class CellAdapter(
    var cellList: MutableList<ResponseCell>,
    val res: Resources,
) : RecyclerView.Adapter<CellAdapter.CellViewHolder>() {

    private lateinit var myItemClickListener: ItemClickListener
    fun setItemOnClickListener(listener: ItemClickListener) {
        myItemClickListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CellViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CellViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CellViewHolder, position: Int) {
        holder.bind(cellList.get(position))
    }

    override fun getItemCount(): Int {
        return cellList.size
    }

    inner class CellViewHolder(private val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                myItemClickListener.onItemClick(adapterPosition)
            }
            binding.root.setOnLongClickListener {
                myItemClickListener.onLongClick(adapterPosition)
                return@setOnLongClickListener true
            }
        }

        private val cellCnt = binding.cellCountText
        private val cellViability = binding.cellViabilityText
        private val cellImage = binding.cellImage
        fun bind(cell: ResponseCell) {
            // cell 데이터와 바인드
            cellCnt.text = res.getString(R.string.total_count, cell.totalCell)
            cellViability.text = res.getString(R.string.recycler_percent, cell.viability)
            GlideApp.with(itemView.context)
                .load("https://capstone-taekang-bucket.s3.ap-northeast-2.amazonaws.com/166443.jpg")
                .placeholder(R.drawable.ic_baseline_settings_24)
                .error(R.drawable.ic_baseline_settings_24)
                .fallback(R.drawable.ic_baseline_settings_24)
                .into(cellImage)
        }
    }
}