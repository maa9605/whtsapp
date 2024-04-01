package com.whatsapp.backup.encryptedbackup;

import X.AbstractView$OnClickListenerC49532Ky;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.encryptedbackup.CreatePasswordFragment;
import com.whatsapp.backup.encryptedbackup.PasswordInputFragment;

/* loaded from: classes.dex */
public class CreatePasswordFragment extends Hilt_CreatePasswordFragment {
    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment, X.C0BA
    public void A0w(View view, Bundle bundle) {
        super.A0w(view, bundle);
        int i = ((PasswordInputFragment) this).A00;
        if (i == 1) {
            ((PasswordInputFragment) this).A04.setText(A0E(R.string.encrypted_backup_create_password_title_enable));
        } else if (i == 4) {
            ((PasswordInputFragment) this).A04.setText(A0E(R.string.encrypted_backup_create_password_title_change_password));
        }
        ((PasswordInputFragment) this).A03.setText(A0E(R.string.encrypted_backup_create_password_instruction));
        ((PasswordInputFragment) this).A05.setHint(A0E(R.string.encrypted_backup_create_password_input_hint));
        ((PasswordInputFragment) this).A07.setText(A0E(R.string.encrypted_backup_create_password_action));
        ((PasswordInputFragment) this).A07.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1kK
            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view2) {
                CreatePasswordFragment createPasswordFragment = CreatePasswordFragment.this;
                if (((PasswordInputFragment) createPasswordFragment).A05.getText() != null) {
                    C36281kX c36281kX = ((PasswordInputFragment) createPasswordFragment).A06;
                    c36281kX.A02.A0B(((PasswordInputFragment) createPasswordFragment).A05.getText().toString());
                    ((PasswordInputFragment) createPasswordFragment).A06.A06(400);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
        if (r10 != 0) goto L17;
     */
    @Override // com.whatsapp.backup.encryptedbackup.PasswordInputFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0y() {
        /*
            r12 = this;
            com.whatsapp.CodeInputField r0 = r12.A05
            android.text.Editable r0 = r0.getText()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            r6 = 4
            r5 = 3
            r4 = 2
            r9 = 6
            r11 = 0
            r3 = 1
            if (r0 == 0) goto La4
            r10 = 0
        L19:
            com.whatsapp.components.Button r1 = r12.A07
            r0 = 0
            if (r10 != r3) goto L1f
            r0 = 1
        L1f:
            r1.setEnabled(r0)
            if (r10 == 0) goto L7b
            if (r10 == r3) goto L7b
            if (r10 == r4) goto L62
            if (r10 == r5) goto L49
            if (r10 != r6) goto L9b
            android.widget.TextView r1 = r12.A02
            r0 = 2131887267(0x7f1204a3, float:1.9409136E38)
            java.lang.CharSequence r0 = r12.A0E(r0)
            r1.setText(r0)
        L38:
            android.widget.TextView r2 = r12.A02
            android.content.res.Resources r1 = r12.A01()
            r0 = 2131100485(0x7f060345, float:1.7813353E38)
            int r0 = r1.getColor(r0)
            r2.setTextColor(r0)
            return
        L49:
            android.widget.TextView r5 = r12.A02
            android.content.res.Resources r4 = r12.A01()
            r2 = 2131755042(0x7f100022, float:1.9140952E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1[r11] = r0
            java.lang.String r0 = r4.getQuantityString(r2, r3, r1)
            r5.setText(r0)
            goto L38
        L62:
            android.widget.TextView r5 = r12.A02
            android.content.res.Resources r4 = r12.A01()
            r2 = 2131755043(0x7f100023, float:1.9140954E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1[r11] = r0
            java.lang.String r0 = r4.getQuantityString(r2, r9, r1)
            r5.setText(r0)
            goto L38
        L7b:
            android.widget.TextView r8 = r12.A02
            android.content.res.Resources r7 = r12.A01()
            r2 = 2131755041(0x7f100021, float:1.914095E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1[r3] = r0
            java.lang.String r0 = r7.getQuantityString(r2, r3, r1)
            r8.setText(r0)
            if (r10 == 0) goto Lc8
        L9b:
            if (r10 == r3) goto Lc8
            if (r10 == r4) goto L38
            if (r10 == r5) goto L38
            if (r10 == r6) goto L38
            return
        La4:
            int r0 = r1.length()
            if (r0 >= r9) goto Lad
            r10 = 2
            goto L19
        Lad:
            java.lang.String r0 = ".*[a-zA-Z]+.*"
            boolean r0 = r1.matches(r0)
            if (r0 != 0) goto Lb8
            r10 = 3
            goto L19
        Lb8:
            java.lang.String[] r0 = X.C1N3.A00
            java.util.List r0 = java.util.Arrays.asList(r0)
            boolean r0 = r0.contains(r1)
            r10 = 1
            if (r0 == 0) goto L19
            r10 = 4
            goto L19
        Lc8:
            android.widget.TextView r2 = r12.A02
            android.content.res.Resources r1 = r12.A01()
            r0 = 2131099754(0x7f06006a, float:1.781187E38)
            int r0 = r1.getColor(r0)
            r2.setTextColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.CreatePasswordFragment.A0y():void");
    }
}
