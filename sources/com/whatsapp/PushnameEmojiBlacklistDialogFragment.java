package com.whatsapp;

import X.C002301c;
import X.C002701i;
import X.C019208x;
import X.C40071rX;
import X.C40081rY;
import X.C52652b6;
import X.DialogInterfaceC019408z;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class PushnameEmojiBlacklistDialogFragment extends Hilt_PushnameEmojiBlacklistDialogFragment {
    public C002301c A00;
    public C40081rY A01;
    public C40071rX A02;

    public static PushnameEmojiBlacklistDialogFragment A00(String str) {
        PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment = new PushnameEmojiBlacklistDialogFragment();
        Bundle bundle = new Bundle();
        String[] strArr = C52652b6.A01;
        ArrayList<String> arrayList = new ArrayList<>(strArr.length);
        for (String str2 : strArr) {
            if (str.contains(str2)) {
                arrayList.add(str2);
            }
        }
        bundle.putStringArrayList("invalid_emojis", arrayList);
        pushnameEmojiBlacklistDialogFragment.A0P(bundle);
        return pushnameEmojiBlacklistDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(A09());
        ArrayList<String> stringArrayList = A02().getStringArrayList("invalid_emojis");
        if (stringArrayList != null) {
            final String obj = this.A02.A03("general", "26000056", null).toString();
            c019208x.A01.A0E = C002701i.A0g(this.A00.A0A(R.plurals.pushname_blacklisted_emoji_error, stringArrayList.size(), TextUtils.join(" ", stringArrayList)), A09().getApplicationContext(), this.A01);
            c019208x.A05(R.string.learn_more, new DialogInterface.OnClickListener() { // from class: X.1I9
                {
                    PushnameEmojiBlacklistDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PushnameEmojiBlacklistDialogFragment.this.A0i(new Intent("android.intent.action.VIEW", Uri.parse(obj)));
                }
            });
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.1I8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            DialogInterfaceC019408z A00 = c019208x.A00();
            A00.setCanceledOnTouchOutside(true);
            return A00;
        }
        throw null;
    }
}
