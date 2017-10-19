package com.demo.dialogdemo;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by t430 on 10/19/2017.
 */

public class DialogComment extends Dialog{
    private EditText txtComment;
    private Button btnSend;

    public DialogComment(@NonNull final Context context) {
        super(context);
        setContentView(R.layout.dialog_comment);
        setTitle("Dialog example");
        txtComment = (EditText)findViewById(R.id.txt_comment);
        btnSend = (Button)findViewById(R.id.btn_send);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, txtComment.getText().toString() +"has sent", Toast.LENGTH_LONG).show();
                dismiss();
            }
        });
    }
}
