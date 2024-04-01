package com.whatsapp.account.delete;

import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.C019208x;
import X.C02160Ac;
import X.C0U1;
import X.C0WL;
import X.C0We;
import X.C11300hW;
import X.InterfaceC11280hU;
import X.InterfaceC11290hV;
import X.ViewTreeObserver$OnPreDrawListenerC27071Lw;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.account.delete.DeleteAccountFeedback;
import com.whatsapp.registration.ChangeNumberOverview;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class DeleteAccountFeedback extends C0WL {
    public static final int[] A08 = {R.string.delete_account_reason_changed_device, R.string.delete_account_reason_change_phone_number, R.string.delete_account_reason_temporarily, R.string.delete_account_reason_missing_feature, R.string.delete_account_reason_not_working, R.string.delete_account_reason_other};
    public int A00;
    public View A02;
    public EditText A03;
    public ScrollView A04;
    public C11300hW A05;
    public DialogFragment A06;
    public int A01 = -1;
    public boolean A07 = false;

    public final void A1P() {
        if (this.A04.canScrollVertically(1)) {
            this.A02.setElevation(this.A00);
        } else {
            this.A02.setElevation(0.0f);
        }
    }

    public /* synthetic */ void lambda$onCreate$975$DeleteAccountFeedback(View view) {
        this.A03.clearFocus();
        if (getCurrentFocus() != null) {
            ((ActivityC02270An) this).A0F.A01(getCurrentFocus());
        }
        this.A07 = true;
        this.A05.A00();
    }

    public /* synthetic */ void lambda$onCreate$976$DeleteAccountFeedback(View view) {
        if (this.A03.getText().length() > 0 && this.A03.getText().length() < 5) {
            ((ActivityC02290Ap) this).A0A.A07(R.string.describe_problem_description_further, 0);
        } else if (this.A01 == 1) {
            String obj = this.A03.getText().toString();
            ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment = new ChangeNumberMessageDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("deleteReason", 1);
            bundle.putString("additionalComments", obj);
            changeNumberMessageDialogFragment.A0P(bundle);
            this.A06 = changeNumberMessageDialogFragment;
            changeNumberMessageDialogFragment.A14(A0N(), null);
        } else {
            Intent intent = new Intent(this, DeleteAccountConfirmation.class);
            intent.putExtra("deleteReason", this.A01);
            intent.putExtra("additionalComments", this.A03.getText().toString());
            startActivity(intent);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A04.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC27071Lw(this));
        }
    }

    @Override // X.C0WL, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.settings_delete_account);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
        }
        setContentView(R.layout.delete_account_feedback);
        this.A04 = (ScrollView) findViewById(R.id.scroll_view);
        this.A03 = (EditText) findViewById(R.id.delete_reason_additional_comments_edittext);
        this.A02 = findViewById(R.id.bottom_button_container);
        final TextView textView = (TextView) findViewById(R.id.select_delete_reason);
        textView.setBackground(new C0We(((ActivityC02310Ar) this).A01, C02160Ac.A03(this, R.drawable.abc_spinner_textfield_background_material)));
        this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
        if (bundle != null) {
            this.A01 = bundle.getInt("delete_reason_selected", -1);
            this.A07 = bundle.getBoolean("delete_reason_showing", false);
            EditText editText = this.A03;
            int i = this.A01;
            int i2 = R.string.delete_account_additional_comments_hint;
            if (i == 2) {
                i2 = R.string.delete_account_additional_comments_temporarily;
            }
            editText.setHint(getString(i2));
        }
        int i3 = this.A01;
        int[] iArr = A08;
        int length = iArr.length;
        if (i3 < length && i3 >= 0) {
            textView.setText(iArr[i3]);
        } else {
            textView.setText("");
        }
        this.A05 = new C11300hW(this, findViewById(R.id.delete_reason_prompt));
        for (int i4 = 0; i4 < length; i4++) {
            this.A05.A02.add(0, i4, 0, iArr[i4]);
        }
        C11300hW c11300hW = this.A05;
        c11300hW.A00 = new InterfaceC11280hU() { // from class: X.1jh
            {
                DeleteAccountFeedback.this = this;
            }

            @Override // X.InterfaceC11280hU
            public final void AJS(C11300hW c11300hW2) {
                DeleteAccountFeedback.this.A07 = false;
            }
        };
        c11300hW.A01 = new InterfaceC11290hV() { // from class: X.1jg
            {
                DeleteAccountFeedback.this = this;
            }

            @Override // X.InterfaceC11290hV
            public final boolean onMenuItemClick(MenuItem menuItem) {
                DeleteAccountFeedback deleteAccountFeedback = DeleteAccountFeedback.this;
                TextView textView2 = textView;
                deleteAccountFeedback.A01 = menuItem.getItemId();
                textView2.setText(menuItem.getTitle());
                EditText editText2 = deleteAccountFeedback.A03;
                int i5 = deleteAccountFeedback.A01;
                int i6 = R.string.delete_account_additional_comments_hint;
                if (i5 == 2) {
                    i6 = R.string.delete_account_additional_comments_temporarily;
                }
                editText2.setHint(deleteAccountFeedback.getString(i6));
                return false;
            }
        };
        textView.setOnClickListener(new View.OnClickListener() { // from class: X.1Ln
            {
                DeleteAccountFeedback.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteAccountFeedback.this.lambda$onCreate$975$DeleteAccountFeedback(view);
            }
        });
        findViewById(R.id.delete_account_submit).setOnClickListener(new View.OnClickListener() { // from class: X.1Lr
            {
                DeleteAccountFeedback.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteAccountFeedback.this.lambda$onCreate$976$DeleteAccountFeedback(view);
            }
        });
        ((ActivityC02290Ap) this).A04.post(new Runnable() { // from class: X.1Lq
            {
                DeleteAccountFeedback.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DeleteAccountFeedback deleteAccountFeedback = DeleteAccountFeedback.this;
                if (deleteAccountFeedback.A07) {
                    deleteAccountFeedback.A05.A00();
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00 = getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation);
            this.A04.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: X.1Ls
                {
                    DeleteAccountFeedback.this = this;
                }

                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    DeleteAccountFeedback.this.A1P();
                }
            });
            this.A04.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC27071Lw(this));
        }
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("delete_reason_selected", this.A01);
        bundle.putBoolean("delete_reason_showing", this.A07);
        super.onSaveInstanceState(bundle);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        C11300hW c11300hW = this.A05;
        if (c11300hW != null) {
            c11300hW.A00 = null;
            c11300hW.A03.A01();
        }
    }

    /* loaded from: classes.dex */
    public class ChangeNumberMessageDialogFragment extends Hilt_DeleteAccountFeedback_ChangeNumberMessageDialogFragment {
        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            final int i = A02().getInt("deleteReason", -1);
            final String string = A02().getString("additionalComments");
            C019208x c019208x = new C019208x(A09());
            c019208x.A01.A0E = A0G(R.string.delete_account_change_number_dialog_prompt, A0F(R.string.settings_change_number));
            c019208x.A06(R.string.settings_change_number, new DialogInterface.OnClickListener() { // from class: X.1Lp
                {
                    DeleteAccountFeedback.ChangeNumberMessageDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    DeleteAccountFeedback.ChangeNumberMessageDialogFragment.this.A18();
                }
            });
            c019208x.A04(R.string.settings_delete_account_short, new DialogInterface.OnClickListener() { // from class: X.1Lo
                {
                    DeleteAccountFeedback.ChangeNumberMessageDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    DeleteAccountFeedback.ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment = DeleteAccountFeedback.ChangeNumberMessageDialogFragment.this;
                    int i3 = i;
                    String str = string;
                    Intent intent = new Intent(changeNumberMessageDialogFragment.A09(), DeleteAccountConfirmation.class);
                    intent.putExtra("deleteReason", i3);
                    intent.putExtra("additionalComments", str);
                    changeNumberMessageDialogFragment.A0i(intent);
                }
            });
            return c019208x.A00();
        }

        public /* synthetic */ void A18() {
            Log.i("delete-account-feedback/changenumber");
            A0i(new Intent(A09(), ChangeNumberOverview.class));
        }
    }
}
