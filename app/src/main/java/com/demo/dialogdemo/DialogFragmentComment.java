package com.demo.dialogdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by t430 on 10/19/2017.
 */

public class DialogFragmentComment extends DialogFragment{
    private EditText txtComment;
    private Button btnSend;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_comment, container);
        txtComment = (EditText)view.findViewById(R.id.txt_comment);
        btnSend = (Button) view.findViewById(R.id.btn_send);
        getDialog().setTitle("Dialog Fragment");
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), txtComment.getText().toString() +"has sent", Toast.LENGTH_LONG).show();
                dismiss();
            }
        });
        return  view;
    }
}
