package com.dinar.communicatingfragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.detail_fragment, container, false);

        MovieModel movie = getArguments().getParcelable(MainActivity.class.getSimpleName());

        TextView tvJudul = view.findViewById(R.id.tvJudul);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView tvGenre = view.findViewById(R.id.tvGenre);
        TextView tvRating = view.findViewById(R.id.tvRating);
        TextView tvConten = view.findViewById(R.id.tvConten);


        tvJudul.setText(movie.judul);
        imageView.setImageResource(movie.poster);
        tvGenre.setText(movie.genre);
        tvRating.setText(movie.ratingScore);
        tvConten.setText(movie.sinopsis);
        return view;
    }
}
