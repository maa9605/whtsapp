package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.util.Linkify;
import com.google.android.search.verification.client.R;

/* renamed from: X.2OW  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2OW {
    public static volatile C2OW A02;
    public final C018308n A00;
    public final C001200o A01;

    public C2OW(C001200o c001200o, C018308n c018308n) {
        this.A01 = c001200o;
        this.A00 = c018308n;
    }

    public static String A00(String str) {
        int length = str.length();
        if (length <= 96) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 64));
        sb.append("…");
        sb.append(str.substring(length - 32));
        return sb.toString();
    }

    public void A01(final Context context, final Uri uri) {
        SpannableString spannableString = new SpannableString(this.A01.A00.getString(R.string.link_taking_to, A00(uri.toString())));
        Linkify.addLinks(spannableString, 1);
        C019208x c019208x = new C019208x(context, R.style.AlertDialogExternalLink);
        c019208x.A01.A0E = spannableString;
        c019208x.A04(R.string.cancel, null);
        c019208x.A06(R.string.btn_continue, new DialogInterface.OnClickListener() { // from class: X.3Zs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C2OW c2ow = C2OW.this;
                c2ow.A00.A06(context, new Intent("android.intent.action.VIEW", uri));
            }
        });
        c019208x.A01();
    }
}
