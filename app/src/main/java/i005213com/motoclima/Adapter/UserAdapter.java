package i005213com.motoclima.Adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import i005213com.motoclima.Models.User;
import i005213com.motoclima.R;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    List<User> myUser = new Arraylist<>();
    Context context;

    public UserAdapter(Context context, List<User>myUser){
        this.myUser = myUser;
        this.context = context;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // holder.myText.setText(myPost.get(position).getTitle());

        holder.id_txv_username_card.setText(myUser.get(position).getUsername());
        holder.Phone.setText(myUser.get(position).getPhone());

    }

    @Override
    public int getItemCount() {
        return myUser.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView id_imv_image_card;
        TextView id_txv_username_card;
        TextView Phone;

        // Constructor
        public ViewHolder(View item)  {
            super(item);

            id_imv_image_card = (ImageView) item.findViewById(R.id.id_imv_image_card);
            id_txv_username_card = (TextView) item.findViewById(R.id.id_txv_username_card);
            Phone = (TextView) item.findViewById(R.id.phone);

        }
    }



}
