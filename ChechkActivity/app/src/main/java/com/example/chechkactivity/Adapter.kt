import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chechkactivity.databinding.ItemproductsBinding
//import android.view.View
//import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.chechkactivity.MainActivity3
import com.example.chechkactivity.MainActivity7
import com.example.chechkactivity.R
import com.example.chechkactivity.WeekData

class Adapter (val context:Context): RecyclerView.Adapter<Adapter.ProductViewHolder>() {

    private val productList = ArrayList<WeekData>()

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
        holder.binding.weeks.text = item.week
        holder.binding.days.text = item.day.toString()

        holder.binding.cardViewv.setOnHoverListener { v, event ->
            when (event.action) {
                android.view.MotionEvent.ACTION_HOVER_ENTER -> {
                    val animation = AnimationUtils.loadAnimation(v.context, R.anim.scale)
                    v.startAnimation(animation)
                }
                android.view.MotionEvent.ACTION_HOVER_EXIT -> {

                }
            }
            true
        }

        holder.binding.cardViewv.setOnClickListener {
            val intent = Intent(context, MainActivity7::class.java)
            intent.putExtra("weekday", item.week)
            context.startActivity(intent)
        }
    }


    fun updateAdapter(list: List<WeekData>) {
        productList.clear()
        productList.addAll(list)
        notifyDataSetChanged()
    }
}
