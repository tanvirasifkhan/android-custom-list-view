package com.example.asifkhan.customlistview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asifkhan.customlistview.R;
import com.example.asifkhan.customlistview.models.UserInfo;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    private ArrayList<UserInfo> userInfos;
    private Context context;

    public CustomListAdapter(ArrayList<UserInfo> userInfos, Context context) {
        this.userInfos = userInfos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return userInfos.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=layoutInflater.inflate(R.layout.custom_list_view_layout,null);
        ImageView photo;
        if(view==null){
            photo=new ImageView(context);
        }
        UserInfo userInfo=userInfos.get(i);
        photo=(ImageView)view.findViewById(R.id.photo);
        TextView name=(TextView)view.findViewById(R.id.name);
        TextView profession=(TextView)view.findViewById(R.id.profession);
        photo.setImageResource(userInfo.getPhoto());
        name.setText(userInfo.getName());
        profession.setText(userInfo.getProfession());
        return view;
    }
}
