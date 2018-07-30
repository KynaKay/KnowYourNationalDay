package sg.edu.rp.knowyournationalday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailsAdapter extends ArrayAdapter<Details> {

    private ArrayList<Details> details;
    private Context context;
    private TextView tvDetails;

    public DetailsAdapter(Context context, int resource, ArrayList<Details> objects) {
        super(context, resource, objects);

        details = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvDetails = (TextView) rowView.findViewById(R.id.tvDetails);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Details currentDetails = details.get(position);
        // Set the TextView to show the food

        tvDetails.setText(currentDetails.getDetails());
//        if (currentDetails.isStar()) {
//            ivStar.setImageResource(R.drawable.star);
//        } else {
//            ivStar.setImageResource(R.drawable.nostar);
//        }
        // Return the nicely done up View to the ListView
        return rowView;
    }
}
