package mx.edu.utng.prototypeartista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by LALO on 13/09/2016.
 */
public class BrunoAdapter extends ArrayAdapter<Bruno>{
    public BrunoAdapter (Context context, ArrayList<Bruno> brunos){
        super(context,0,brunos);
    }
    public View getView(int position, View convertView, ViewGroup parent){

       Bruno bruno = getItem(position);
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.bruno_layout, parent, false);
        }
        TextView txvBruno = (TextView) convertView.findViewById(R.id.txv_bruno);
        txvBruno.setText(bruno.getNombre()+""+bruno.getCancion());
        return convertView;
    }
}
