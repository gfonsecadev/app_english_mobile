package com.example.aprendeaingls.numeros;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.support.v4.media.session.MediaSessionCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.aprendeaingls.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NumerosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NumerosFragment extends Fragment implements View.OnClickListener {
    public ImageButton um,dois,tres,quatro,cinco,seis;
    public MediaPlayer mediaPlayer;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NumerosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NumerosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NumerosFragment newInstance(String param1, String param2) {
        NumerosFragment fragment = new NumerosFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_numeros, container, false);

        um= view.findViewById(R.id.um);
        dois= view.findViewById(R.id.dois);
        tres= view.findViewById(R.id.tres);
        quatro= view.findViewById(R.id.quatro);
        cinco= view.findViewById(R.id.cinco);
        seis= view.findViewById(R.id.seis);

        um.setOnClickListener(this);
        dois.setOnClickListener(this);
        tres.setOnClickListener(this);
        quatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.um:
                mediaPlayer= MediaPlayer.create(getActivity(),R.raw.one);
                tocar();
                break;

            case R.id.dois:
                mediaPlayer=MediaPlayer.create(getActivity(),R.raw.two);
                tocar();
                break;

            case R.id.tres:
                mediaPlayer=MediaPlayer.create(getActivity(),R.raw.three);
                tocar();
                break;

            case R.id.quatro:
                mediaPlayer=MediaPlayer.create(getActivity(),R.raw.four);
                tocar();
                break;

            case R.id.cinco:
                mediaPlayer=MediaPlayer.create(getActivity(),R.raw.five);
                tocar();
                break;

            case R.id.seis:
                mediaPlayer=MediaPlayer.create(getActivity(),R.raw.six);
                tocar();
                break;
        }



    }

    public void tocar(){
        if(mediaPlayer!=null){
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.release();

                }
            });
        }

    }
}