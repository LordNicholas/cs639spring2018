package com.example.lordnicholas.animalhomework;

import android.app.Fragment;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by kachi on 1/31/18.
 */

public class AnimalDisplayFragment extends Fragment {

    ImageView birdImage;
    ImageView dogImage;
    ImageView catImage;

    TextView dogText;
    TextView catText;
    TextView birdText;

    RadioButton red;
    RadioButton orange;
    RadioButton blue;
    RadioButton green;
    RadioButton pink;


    int selectedAnimal = -1;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.animal_display, container, false);


        birdImage = view.findViewById(R.id.birdImage);
        dogImage = view.findViewById(R.id.dogImage);
        catImage= view.findViewById(R.id.cat_Image);

        dogText = view.findViewById(R.id.dogText);
        catText = view.findViewById(R.id.catText);
        birdText= view.findViewById(R.id.birdText);

        pink = view.findViewById(R.id.pink);
        green = view.findViewById(R.id.green);
        orange = view.findViewById(R.id.orange);
        red = view.findViewById(R.id.red);
        blue = view.findViewById(R.id.blue);



        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        birdImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedAnimal = 1;
                updateTextStatus();
            }
        });

        dogImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedAnimal = 2;
                updateTextStatus();
            }
        });

        catImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedAnimal = 3;
                updateTextStatus();
            }
        });



       green.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                updateImageColorStatus(ContextCompat.getColor(getActivity(),R.color.green));
           }
       });

       blue.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               updateImageColorStatus(ContextCompat.getColor(getActivity(),R.color.blue));
           }
       });
       pink.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               updateImageColorStatus(ContextCompat.getColor(getActivity(),R.color.pink));
           }
       });

       orange.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               updateImageColorStatus(ContextCompat.getColor(getActivity(),R.color.orange));
           }
       });
       red.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               updateImageColorStatus(ContextCompat.getColor(getActivity(),R.color.red));
           }
       });
    }

    private void updateImageColorStatus(int color) {
        if(selectedAnimal == 1){
            birdImage.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        }else  if(selectedAnimal == 2){
            dogImage.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        } if(selectedAnimal == 3){
            catImage.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        }
    }


    private void updateTextStatus() {

        if(selectedAnimal == 1){

            birdText.setVisibility(View.VISIBLE);
            dogText.setVisibility(View.GONE);
            catText.setVisibility(View.GONE);

        }else if (selectedAnimal == 2){

            dogText.setVisibility(View.VISIBLE);
            birdText.setVisibility(View.GONE);
            catText.setVisibility(View.GONE);




        }else if(selectedAnimal == 3){

            dogText.setVisibility(View.GONE);
            birdText.setVisibility(View.GONE);
            catText.setVisibility(View.VISIBLE);

        }


    }
}
