package mx.edu.utng.prototypeeduardo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by LALO on 08/09/2016.
 */
public class NarutoAdapter extends ArrayAdapter<Naruto> {
    public NarutoAdapter (Context context, ArrayList<Naruto>narutos){
        super(context,0,narutos);
    }
    public View getView(int position, View convertView, ViewGroup parent){

        Naruto naruto = getItem(position);
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.naruto_layout, parent, false);
        }
        TextView txvNaruto = (TextView) convertView.findViewById(R.id.txv_naruto);
        txvNaruto.setText(naruto.getNombre()+""+naruto.getSexo());
        return convertView;
    }



}
