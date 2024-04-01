package com.whatsapp.backup.google;

import X.C0O6;
import android.content.Context;

/* loaded from: classes2.dex */
public class PromptDialogFragment extends Hilt_PromptDialogFragment {
    public C0O6 A00;

    @Override // com.whatsapp.backup.google.Hilt_PromptDialogFragment, com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        try {
            this.A00 = (C0O6) context;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement PromptDialogClickListener");
            throw new ClassCastException(sb.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r4.getBoolean("cancelable") != false) goto L25;
     */
    @Override // androidx.fragment.app.DialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Dialog A0z(android.os.Bundle r7) {
        /*
            r6 = this;
            android.os.Bundle r4 = r6.A06
            java.lang.String r1 = "dialog_id"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L98
            int r5 = r4.getInt(r1)
            X.0At r0 = r6.A09()
            X.08x r3 = new X.08x
            r3.<init>(r0)
            java.lang.String r1 = "title"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L27
            java.lang.String r1 = r4.getString(r1)
            X.08y r0 = r3.A01
            r0.A0I = r1
        L27:
            java.lang.String r1 = "message"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L37
            java.lang.String r1 = r4.getString(r1)
            X.08y r0 = r3.A01
            r0.A0E = r1
        L37:
            java.lang.String r1 = "neutral_button"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L4e
            java.lang.String r2 = r4.getString(r1)
            X.2lk r1 = new X.2lk
            r1.<init>()
            X.08y r0 = r3.A01
            r0.A0G = r2
            r0.A04 = r1
        L4e:
            java.lang.String r1 = "positive_button"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L62
            java.lang.String r1 = r4.getString(r1)
            X.2ll r0 = new X.2ll
            r0.<init>()
            r3.A08(r1, r0)
        L62:
            java.lang.String r1 = "negative_button"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L79
            java.lang.String r2 = r4.getString(r1)
            X.2lj r1 = new X.2lj
            r1.<init>()
            X.08y r0 = r3.A01
            r0.A0F = r2
            r0.A03 = r1
        L79:
            java.lang.String r1 = "cancelable"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L88
            boolean r0 = r4.getBoolean(r1)
            r1 = 0
            if (r0 == 0) goto L89
        L88:
            r1 = 1
        L89:
            X.08y r0 = r3.A01
            r0.A0J = r1
            r6.A15(r1)
            X.08z r0 = r3.A00()
            r0.setCanceledOnTouchOutside(r1)
            return r0
        L98:
            java.lang.String r1 = "dialog_id should be provided."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.PromptDialogFragment.A0z(android.os.Bundle):android.app.Dialog");
    }
}
