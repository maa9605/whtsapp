package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;

/* renamed from: X.2wC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61462wC {
    public C19230v5 A00;
    public C40851sy A01;
    public final View A02;
    public final WaImageView A03;

    public C61462wC(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.fresco_gif_search_item_view, (ViewGroup) null, false);
        this.A02 = inflate;
        View findViewById = inflate.findViewById(R.id.gif);
        if (findViewById == null) {
            throw null;
        }
        this.A03 = (WaImageView) findViewById;
    }
}
