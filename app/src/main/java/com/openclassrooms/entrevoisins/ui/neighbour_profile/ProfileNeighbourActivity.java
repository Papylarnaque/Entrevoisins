package com.openclassrooms.entrevoisins.ui.neighbour_profile;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;


public class ProfileNeighbourActivity extends AppCompatActivity {

    private Neighbour currentNeighbour;

    /**
     * User interface variables
     */
    private ImageView mNeighbourPicture;
    private TextView mNeighbourName;
    private TextView mNeighbourName_description;
    private TextView mNeighbourPlace;
    private TextView mNeighbourUrlWebsite;
    private TextView mNeighbourPhoneNumber;
    private TextView mNeighbourDescription;
    private ImageView favoriteButton;
    private ImageView mBackArrow;

    /**
     * Method to check emptiness of getters in Neighbour
     */
    public static boolean check_string(String str) {
        return (str == null || str.isEmpty());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Instantiate the variables
        mNeighbourPicture = findViewById(R.id.neighbour_picture);
        mNeighbourName = findViewById(R.id.Neighbour_name_onpicture);
        mNeighbourName_description = findViewById(R.id.Neighbour_name_description);
        mNeighbourPlace = findViewById(R.id.Neighbour_place);
        mNeighbourPhoneNumber = findViewById(R.id.Neighbour_phone_number);
        mNeighbourUrlWebsite = findViewById(R.id.Neighbour_Url_Website);
        mNeighbourDescription = findViewById(R.id.Neighbour_Description);
        mBackArrow = findViewById(R.id.backarrow);
        favoriteButton = findViewById(R.id.add_to_favorites_button);

        // Get the extended constructor information on the Neighbour we just clicked on from the Neighbour list
        NeighbourApiService mApiService = DI.getNeighbourApiService();
        Long neighbourId = getIntent().getExtras().getLong("current_id");
        currentNeighbour = mApiService.getNeighbour(neighbourId);



        // Context in order to call resources strings
        Context context = getApplicationContext();

        // Send the Neighbour AVATAR PICTURE to the profile
        Glide.with(getApplicationContext())
                .asBitmap()
                .load(currentNeighbour.getAvatarUrl())
                .into(mNeighbourPicture);

        // Send the Neighbour NAME
        mNeighbourName.setText(currentNeighbour.getName());
        mNeighbourName_description.setText(currentNeighbour.getName());

        // Send the Neighbour LOCALIZATION + default sentence if not known
        if (check_string(currentNeighbour.getAddress())) {
            mNeighbourPlace.setText(context.getString(R.string.no_data, currentNeighbour.getName()));
        } else {
            mNeighbourPlace.setText(currentNeighbour.getAddress());
        }

        // Send the Neighbour PHONE NUMBER + default sentence if not known
        if (check_string(currentNeighbour.getPhoneNumber())) {
            mNeighbourPhoneNumber.setText(context.getString(R.string.no_data, currentNeighbour.getName()));
        } else {
            mNeighbourPhoneNumber.setText(currentNeighbour.getPhoneNumber());
        }

        // Send the Neighbour WEBSITE URL + default sentence if not known
        mNeighbourUrlWebsite.setText(context.getString(R.string.facebook_url, currentNeighbour.getName().toLowerCase()));

        // Send the Neighbour description text + default sentence if not known
        if (check_string(currentNeighbour.getAboutMe())) {
            mNeighbourDescription.setText(context.getString(R.string.no_data, currentNeighbour.getName()));
        } else {
            mNeighbourDescription.setText(currentNeighbour.getAboutMe());
        }

        // Display favorites button update
        displayFavorite();

        // OnBackPressed feature
        Back_to_former_page();

        // Call method for favorite button clicked
        favoriteButtonClick();
    }

    private void displayFavorite() {
        if ( currentNeighbour.isFavorite()){
            favoriteButton.setImageResource(R.drawable.ic_star_yellorange);
        }else{
            favoriteButton.setImageResource(R.drawable.ic_star_border_yellorange);
        }
    }

    /**
     * Calls back former page
     */
    public void Back_to_former_page() {
        mBackArrow.setOnClickListener(v -> onBackPressed());
    }

    /**
     * Add / Remove current neighbour into/from favorites
     */
    private void favoriteButtonClick() {
        favoriteButton.setOnClickListener(view -> {
            if (currentNeighbour.isFavorite()){
                currentNeighbour.setFavorite(false);
            }
            else {
                currentNeighbour.setFavorite(true);
            }
            displayFavorite();
        });
    }


}
