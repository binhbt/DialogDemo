package demo.com.customdialogdemo;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;

/**
 * Created by leobui on 10/18/2017.
 */

public class DialogCustom extends Dialog{
    private Button btnClose;
    public DialogCustom(@NonNull Context context) {
        super(context);
        setContentView(R.layout.dialog_custom);
        setTitle("Dialog Exampe");
        btnClose = (Button)findViewById(R.id.btn_close);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
    }
}
