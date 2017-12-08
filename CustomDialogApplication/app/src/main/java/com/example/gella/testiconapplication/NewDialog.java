package com.example.gella.testiconapplication;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by gella on 12/8/17.
 */

public class NewDialog extends Dialog {
    public NewDialog(@NonNull Context context) {
        super(context);
    }

    public NewDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected NewDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_dialog_layout);
    }
}
