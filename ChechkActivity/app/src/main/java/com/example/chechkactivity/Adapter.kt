import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chechkactivity.databinding.ItemproductsBinding
//import android.view.View
//import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.chechkactivity.R

class Adapter : RecyclerView.Adapter<Adapter.ProductViewHolder>() {

    private val productList = ArrayList<String>()

    inner class ProductViewHolder(val binding: ItemproductsBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnHoverListener { v, event ->
                when (event.action) {
                    android.view.MotionEvent.ACTION_HOVER_ENTER -> {

                        val animation = AnimationUtils.loadAnimation(binding.root.context, R.anim.scale_up)
                        binding.root.startAnimation(animation)
                    }
                    android.view.MotionEvent.ACTION_HOVER_EXIT -> {
                        // Bu işlemi tersine çevirme (örneğin, öğeyi küçültme)
                    }
                }
                true
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val layout = ItemproductsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val item = productList[position]
        holder.binding.weeks.text = item
    }

    fun updateAdapter(list: List<String>) {
        productList.clear()
        productList.addAll(list)
        notifyDataSetChanged()
    }
}
