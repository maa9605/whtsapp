package X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.google.android.search.verification.client.R;
import com.whatsapp.notification.PopupNotification;

/* renamed from: X.3N4  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3N4 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ PopupNotification A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C3N4(PopupNotification popupNotification, String str) {
        this.A00 = popupNotification;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PopupNotification popupNotification = this.A00;
        String str = this.A01;
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            StringBuilder sb = new StringBuilder("http://");
            sb.append(str);
            parse = Uri.parse(sb.toString());
        }
        try {
            popupNotification.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException unused) {
            popupNotification.A0K.A07(R.string.activity_not_found, 0);
        }
    }
}
