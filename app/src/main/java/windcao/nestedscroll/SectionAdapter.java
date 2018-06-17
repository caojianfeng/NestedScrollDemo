package windcao.nestedscroll;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 曹建峰(windcao@hotmail.com) on 2018/6/17.
 */

public class SectionAdapter extends RecyclerView.Adapter<SectionAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        return new ViewHolder(inflater.inflate(R.layout.item, parent, false));

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TextView textView = holder.itemView.findViewById(R.id.text);
        textView.setText(String.format("Item %03d", position));
    }

    @Override
    public int getItemCount() {
        return 103;
    }


}
