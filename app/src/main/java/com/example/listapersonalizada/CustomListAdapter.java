package com.example.listapersonalizada;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sanjeev k Saroj on 28/2/17.
 */

public class CustomListAdapter extends BaseAdapter {

    Activity activity;
    ArrayList<DtoFrame>customListDataModelArrayList = new ArrayList<>();
    LayoutInflater layoutInflater = null;

    public CustomListAdapter(Activity activity, ArrayList customListDataModelArray){
        this.activity=activity;
        this.customListDataModelArrayList = customListDataModelArray;
        layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return customListDataModelArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return customListDataModelArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    private static class ViewHolder{
        ImageView photo;
        TextView textDescription, textDateCreating;

    }
    ViewHolder viewHolder = null;


    // this method  is called each time for arraylist data size.
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View vi=view;
        final int pos = position;
        if(vi == null){

            // create  viewholder object for list_rowcell View.
            viewHolder = new ViewHolder();
            // inflate list_rowcell for each row
            vi = layoutInflater.inflate(R.layout.layout_listmeme,null);
            viewHolder.photo = (ImageView) vi.findViewById(R.id.photo);
            viewHolder.textDescription = (TextView) vi.findViewById(R.id.textDescription);
            viewHolder.textDateCreating = (TextView) vi.findViewById(R.id.textDateCreating);
            /*We can use setTag() and getTag() to set and get custom objects as per our requirement.
            The setTag() method takes an argument of type Object, and getTag() returns an Object.*/
            vi.setTag(viewHolder);
        }else {

            /* We recycle a View that already exists */
            viewHolder= (ViewHolder) vi.getTag();
        }

        viewHolder.photo.setImageResource(customListDataModelArrayList.get(pos).getImageMeme());
        viewHolder.textDescription.setText(customListDataModelArrayList.get(pos).getDescription());
        viewHolder.textDateCreating.setText(customListDataModelArrayList.get(pos).getDateCreating());


        return vi;
    }
}
