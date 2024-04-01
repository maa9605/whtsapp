package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3rJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C82933rJ extends C0TS {
    public final View A00;
    public final View A01;
    public final ImageView A02;

    public C82933rJ(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.sticker_pack_preview, viewGroup, false));
        View view = this.A0H;
        this.A02 = (ImageView) view.findViewById(R.id.icon);
        this.A00 = view.findViewById(R.id.badge);
        this.A01 = view.findViewById(R.id.sel_marker);
    }
}
