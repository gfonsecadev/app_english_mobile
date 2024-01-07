package com.example.aprendeaingls.animais;

import android.bluetooth.le.ScanSettings;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Switch;

import com.example.aprendeaingls.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AnimaisFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AnimaisFragment extends Fragment implements View.OnClickListener {

    public ImageButton cao,gato,ovelha,macaco,leao,vaca;
    public MediaPlayer mediaPlayer;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AnimaisFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AnimaisFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AnimaisFragment newInstance(String param1, String param2) {
        AnimaisFragment fragment = new AnimaisFragment();
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
       View view= inflater.inflate(R.layout.fragment_animais, container, false);

        cao= view.findViewById(R.id.cao);
        gato= view.findViewById(R.id.gato);
        macaco= view.findViewById(R.id.macaco);
        ovelha= view.findViewById(R.id.ovelha);
        leao= view.findViewById(R.id.leao);
        vaca= view.findViewById(R.id.vaca);

        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        leao.setOnClickListener(this);
        vaca.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {

           switch (view.getId()){
               case R.id.cao:
                   mediaPlayer=MediaPlayer.create(getActivity(),R.raw.dog);
                   tocar();
                   break;

               case R.id.gato:
                   mediaPlayer=MediaPlayer.create(getActivity(),R.raw.cat);
                   tocar();
                   break;

               case R.id.ovelha:
                   mediaPlayer=MediaPlayer.create(getActivity(),R.raw.sheep);
                   tocar();
                   break;

               case R.id.leao:
                   mediaPlayer=MediaPlayer.create(getActivity(),R.raw.lion);
                   tocar();
                   break;

               case R.id.macaco:
                   mediaPlayer=MediaPlayer.create(getActivity(),R.raw.monkey);
                   tocar();
                   break;

               case R.id.vaca:
                   mediaPlayer=MediaPlayer.create(getActivity(),R.raw.cow);
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